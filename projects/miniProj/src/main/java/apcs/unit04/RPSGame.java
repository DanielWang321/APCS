package apcs.unit04;

import java.util.Scanner;

public class RPSGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean playAgain = false;
        System.out.println("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = sc.nextLine();

        // create objects
        Player human = new Player(firstName, lastName);
        Player computer = new Player();

        // ask for buy in
        System.out.println("How much do you want to buy in?");
        double buyIn;
        while (true) {
            try {
                buyIn = sc.nextDouble();
                if (buyIn > 0)
                    break;
            } catch (Exception e) {
                sc.next(); // get rid of invalid input

            }
            System.out.println("Invalid input. How much do you want to buy in?");
        }
        human.setBalance(buyIn);
        computer.setBalance(buyIn);

        do {
            // ask for bet
            double bet;
            System.out.println("How much do you want to bet: ");
            while (true) {
                try {
                    bet = sc.nextDouble();
                    if ((isValidBet(bet, human.getBalance()) && isValidBet(bet, computer.getBalance()))) {
                        break;
                    }
                } catch (Exception e) {
                    sc.next(); // get rid of invalid input
                    bet = 0; // set bet to an invalid value to continue the loop
                }
                System.out.println("Invalid\nHow much do you want to bet: ");
            }
            human.setBetAmount(bet);
            computer.setBetAmount(bet);

            // ask for choice
            System.out.println("Rock, Paper, or Scissors");
            String humanChoice = sc.next();
            while (!isValidChoice(humanChoice)) {
                System.out.println("Invalid\nRock, Paper, or Scissors");
                humanChoice = sc.next();
            }

            human.setWeapon(humanChoice);
            computer.setWeapon();
            determineWinner(human, computer, bet);

            System.out.println(human);
            System.out.println(computer);
            sc.nextLine(); // get rid of newline
            while (computer.getBalance() > 0 && human.getBalance() > 0) { // skip if someone has 0 balance
                System.out.println("Do you want to play again? (y/n)");
                String playAgainInput = sc.nextLine();
                if (playAgainInput.toLowerCase().equals("y")) {
                    playAgain = true;
                    break;
                } else if (playAgainInput.toLowerCase().equals("n")) {
                    playAgain = false;
                    break;
                } else {
                    System.out.println("Invalid");
                }
            }
        } while (playAgain && computer.getBalance() > 0 && human.getBalance() > 0);
        System.out.println(firstName + " " + lastName + " net winnings: " + (human.getBalance() - buyIn));
        System.out.println("Computer net winnings: " + (computer.getBalance() - buyIn));
    }

    public static Player determineWinner(Player human, Player computer, double bet) {
        System.out.println("\nHuman chose: " + human.getWeapon());
        System.out.println("Computer chose: " + computer.getWeapon());
        if (human.getWeapon().equals(computer.getWeapon())) {
            System.out.println("\nTie");
            return null;
        } else if ((human.getWeapon().equals("Rock") && computer.getWeapon().equals("Scissors")) ||
                (human.getWeapon().equals("Paper") && computer.getWeapon().equals("Rock")) ||
                (human.getWeapon().equals("Scissors") && computer.getWeapon().equals("Paper"))) {
            System.out.println("\nHuman wins!");
            human.win();
            computer.lose();
            return human;
        } else {
            System.out.println("\nComputer wins!");
            human.lose();
            computer.win();
            return computer;
        }
    }

    public static boolean isValidChoice(String choice) {
        return choice.equals("Rock") || choice.equals("Paper") || choice.equals("Scissors");
    }

    public static boolean isValidBet(double bet, double balance) {
        return bet > 0 && bet <= balance;
    }

}
