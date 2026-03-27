package apcs.unit08;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class TheaterClient {

    public static void main(String[] args) throws FileNotFoundException {
        DecimalFormat df = new DecimalFormat("$0.00");
        Theater t = new Theater(
                "C:\\Users\\techadmin\\Documents\\GithubProj\\APCS\\projects\\miniProj\\data\\seats.txt");
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 7) {
            choice = Menu();
            if (choice == 1) {
                purchaseTicket(t);
            } else if (choice == 2) {
                System.out.println("Total dollar value of all tickets sold: " + df.format(t.getTotalSold()));
            } else if (choice == 3) {
                System.out.println("Total number of tickets sold: " + t.getNumSeatsTaken());
            } else if (choice == 4) {
                for (int r = 0; r < t.getRows(); r++) {
                    System.out.println(
                            "Row " + (r + 1) + ": " + (t.getCols() - t.getNumSeatsTakenInRow(r)) + " seats available");
                }
            } else if (choice == 5) {
                System.out.println(
                        "Total number of tickets available: " + (t.getRows() * t.getCols() - t.getNumSeatsTaken()));
            } else if (choice == 6) {
                System.out.println(t);
            }
        }

    }

    public static int Menu() {
        System.out.println("\n" +
                "(1)  Purchase tickets\n" +
                "(2)  Display the total dollar value of all tickets sold\n" +
                "(3)  Display the total number of tickets sold\n" +
                "(4)  Display the number of seats available in each row\n" +
                "(5)  Display the number of seats available in the entire auditorium\n" +
                "(6)  Display the current seating chart\n" +
                "(7)  Exit the system");
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            try {
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
                sc.next();
                choice = -1;
            }
        } while (choice < 1 || choice > 7);
        return choice;
    }

    public static void purchaseTicket(Theater t) {
        DecimalFormat df = new DecimalFormat("$0.00");
        Scanner sc = new Scanner(System.in);
        int r;
        String c = "";
        int colNum = -1;
        while (true) {
            do {
                try {
                    System.out.print("Enter row: ");
                    r = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Invalid input.");
                    sc.next();
                    r = -2;
                }
                if (r == -1) {
                    System.out.println("Total sold: " + df.format(t.getTotalSold()));
                    return;
                }
                r -= 1;
            } while (r >= t.getRows() || r < 0);
            do {
                try {
                    System.out.print("Enter column: ");
                    c = sc.next();
                    if (c.length() != 1) {
                        colNum = -1;
                    } else if (c.charAt(0) >= 65 && c.charAt(0) <= 90) {
                        colNum = c.charAt(0) - 65;
                    } else if (c.charAt(0) >= 97 && c.charAt(0) <= t.getCols() + 70) {
                        colNum = c.charAt(0) - 71;
                    } else {
                        colNum = -1;
                    }

                } catch (Exception e) {
                    System.out.println("Invalid input");
                    sc.next();
                }

            } while (colNum == -1);

            if (t.isTaken(r, colNum)) {
                System.out.println("Seat is already taken.");
            } else {
                t.buySeat(r, colNum);
                System.out.println("Seat purchased");
            }
        }
    }

}
