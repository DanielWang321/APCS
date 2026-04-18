package apcs.unit09.FantasyFootball;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "projects\\miniProj\\src\\main\\java\\apcs\\unit09\\FantasyFootball\\data.txt";
        File f = new File(fileName);
        Scanner fScan;
        Scanner sc = new Scanner(System.in);

        try {
            fScan = new Scanner(f);
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException();
        }

        ArrayList<String> firstNameList = new ArrayList<>();
        ArrayList<String> lastNameList = new ArrayList<>();
        ArrayList<String> positionList = new ArrayList<>();

        fScan.nextLine(); // skip header line
        while (fScan.hasNextLine()) {
            String firstName = fScan.next();
            String lastName = fScan.next();
            String position = fScan.next();
            firstNameList.add(firstName);
            lastNameList.add(lastName);
            positionList.add(position);
            fScan.nextLine();

            // move to the next line
        }

        int playersPerTeam;
        System.out.println("How many players per team? ");
        playersPerTeam = sc.nextInt();
        ArrayList<FantasyFootballPlayer> player1Team = new ArrayList<>();
        ArrayList<FantasyFootballPlayer> player2Team = new ArrayList<>();

        int choice;
        while (player1Team.size() < playersPerTeam) {
            System.out.println("Player1: \n(1) add player\n(2) view players\n(3) view current team");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter first name: ");
                String firstName = sc.next();
                System.out.println("Enter last name: ");
                String lastName = sc.next();
                System.out.println("Enter position (QB, RB, WR): ");
                String position = sc.next();
                if (checkValidPlayer(fileName, firstName, lastName, position)) {
                    if (position.equals("QB")) {
                        player1Team.add(new Quarterback(firstName + " " + lastName));
                    } else if (position.equals("RB")) {
                        player1Team.add(new RunningBack(firstName + " " + lastName));
                    } else if (position.equals("WR")) {
                        player1Team.add(new WideReceiver(firstName + " " + lastName));
                    } else {
                        System.out.println("invalid position");
                    }
                } else {
                    System.out.println("invalid player");
                }
            } else if (choice == 2) {
                printPlayers(sc, firstNameList, lastNameList, positionList);
            } else if (choice == 3) {
                System.out.println("Current team:");
                for (FantasyFootballPlayer p : player1Team) {
                    System.out.println(p.getName() + " " + p.getPositionName());
                }
            } else {
                System.out.println("invalid choice");
            }
        }

        while (player2Team.size() < playersPerTeam) {
            System.out.println("\nPlayer2: \n(1) add player\n(2) view players \n(3) view current team");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter first name: ");
                String firstName = sc.next();
                System.out.println("Enter last name: ");
                String lastName = sc.next();
                System.out.println("Enter position (QB, RB, WR): ");
                String position = sc.next();
                if (checkValidPlayer(fileName, firstName, lastName, position)) {
                    if (position.equals("QB")) {
                        player2Team.add(new Quarterback(firstName + " " + lastName));
                    } else if (position.equals("RB")) {
                        player2Team.add(new RunningBack(firstName + " " + lastName));
                    } else if (position.equals("WR")) {
                        player2Team.add(new WideReceiver(firstName + " " + lastName));
                    } else {
                        System.out.println("invalid position");
                    }
                } else {
                    System.out.println("invalid player");
                }
            } else if (choice == 2) {
                printPlayers(sc, firstNameList, lastNameList, positionList);
            } else if (choice == 3) {
                System.out.println("Current team:");
                for (FantasyFootballPlayer p : player2Team) {
                    System.out.println(p.getName() + " " + p.getPositionName());
                }
            } else {
                System.out.println("invalid choice");
            }
        }
        System.out.println("Player 1 team:");
        for (FantasyFootballPlayer p : player1Team) {
            extractInfo(fileName, p);
        }
        System.out.println("\nPlayer 2 team:");
        for (FantasyFootballPlayer p : player2Team) {
            extractInfo(fileName, p);
        }

        if (determineWinner(player1Team, player2Team) == -1) {
            System.out.println("player 1 wins, " + getTeamScore(player1Team) + "-" + getTeamScore(player2Team));
        } else if (determineWinner(player1Team, player2Team) == 1) {
            System.out.println("player 2 wins, " + getTeamScore(player2Team) + "-" + getTeamScore(player1Team));
        } else {
            System.out.println(
                    "player 1: " + getTeamScore(player1Team) + "\nplayer 2: " + getTeamScore(player2Team) + "\ntie");
        }
    }

    // returns -1 if team 1 wins, 1 if team 2 wins, 0 if tie
    public static int determineWinner(ArrayList<FantasyFootballPlayer> p1, ArrayList<FantasyFootballPlayer> p2) {

        int score1 = getTeamScore(p1);
        int score2 = getTeamScore(p2);
        if (score1 > score2)
            return -1;
        else if (score2 > score1)
            return 1;
        else
            return 0;
    }

    public static int getTeamScore(ArrayList<FantasyFootballPlayer> team) {
        int totalScore = 0;
        for (FantasyFootballPlayer f : team)
            totalScore += f.getCurrentScore();
        return totalScore;
    }

    public static void printPlayers(Scanner sc, ArrayList<String> firstNameList, ArrayList<String> lastNameList,
            ArrayList<String> positionList) {
        System.out.println(
                "How do you want your players to be displayed? \n(1) all players\n(2) only quarterbacks\n(3) only running backs\n(4) only wide receivers");
        int choice = sc.nextInt();
        if (choice == 1) {
            for (int i = 0; i < firstNameList.size(); i++) {
                System.out.println(firstNameList.get(i) + " " + lastNameList.get(i) + " " + positionList.get(i));
            }
        } else if (choice == 2) {
            printPlayersFilter(firstNameList, lastNameList, positionList, "QB");
        } else if (choice == 3) {
            printPlayersFilter(firstNameList, lastNameList, positionList, "RB");
        } else if (choice == 4) {
            printPlayersFilter(firstNameList, lastNameList, positionList, "WR");
        } else {
            System.out.println("invalid choice");
        }
    }

    public static void printPlayersFilter(ArrayList<String> firstNameList, ArrayList<String> lastNameList,
            ArrayList<String> positionList, String filterPosition) {
        for (int j = 0; j < positionList.size(); j++) {
            if (positionList.get(j).equals(filterPosition)) {
                System.out.println(firstNameList.get(j) + " " + lastNameList.get(j));
            }
        }
    }

    public static boolean extractInfo(String fileName, FantasyFootballPlayer player) throws FileNotFoundException {
        Scanner fScan = new Scanner(new File(fileName));
        fScan.nextLine();
        String currentPlayerFirstName = player.getName().substring(0, player.getName().indexOf(" "));
        String currentPlayerLastName = player.getName().substring(player.getName().indexOf(" ") + 1);
        int yards;
        int TDs;
        String scannedFirstName;
        String scannedLastName;
        while (fScan.hasNextLine()) {
            scannedFirstName = fScan.next();
            scannedLastName = fScan.next();
            if (scannedFirstName.equals(currentPlayerFirstName) && scannedLastName.equals(currentPlayerLastName)) {
                fScan.next();
                yards = Integer.parseInt(fScan.next());
                TDs = Integer.parseInt(fScan.next());
                player.addGameStats(yards, TDs);
                System.out.println(player.getName() + " stats this week: " + yards + " yards, " + TDs + " touchdowns, " + player.getCurrentScore() + " points");
                return true;
            } else {
                fScan.nextLine();
            }
        }
        System.out.println("not found");
        return false;
    }

    public static boolean checkValidPlayer(String fileName, String firstName, String lastName, String position)
            throws FileNotFoundException {
        Scanner fScan = new Scanner(new File(fileName));
        fScan.nextLine();
        String scannedFirstName;
        String scannedLastName;
        String scannedPosition;
        while (fScan.hasNextLine()) {
            scannedFirstName = fScan.next();
            scannedLastName = fScan.next();
            scannedPosition = fScan.next();
            if (scannedFirstName.equals(firstName) && scannedLastName.equals(lastName)
                    && scannedPosition.equals(position)) {
                return true;
            } else {
                fScan.nextLine();
            }
        }
        return false;
    }
}
