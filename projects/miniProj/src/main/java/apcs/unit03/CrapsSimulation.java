package apcs.unit03;

import java.util.Scanner;

public class CrapsSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String playAgain; // declare varibale to see if user wants to go again
        int random1, random2, point, sum;
        System.out.print("Welcome to APCS Casino\nPlease enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + " Let's play! ");

        do {// runs until user enters n
            random1 = (int) (Math.random() * 6) + 1;
            random2 = (int) (Math.random() * 6) + 1;
            point = 0;
            sum = random1 + random2; // random number
            System.out.println("You have rolled " + random1 + "+" + random2 + "=" + sum);
            if (sum == 2 || sum == 3 || sum == 12) { // checks if lost immediately
                System.out.println("You lose");
            } else if (sum == 7 || sum == 11) {// checks if won immediately
                System.out.println("You win");
            } else {
                point = sum; // sets the roll to a point
                System.out.println(sum + " is now the point!");
                do {// until rolls 7 or point
                    random1 = (int) (Math.random() * 6) + 1;
                    random2 = (int) (Math.random() * 6) + 1;
                    sum = random1 + random2;
                    if (sum == 7) {
                        System.out.println("You have rolled a " + random1 + "+" + random2 + "=" + sum);
                        System.out.println("You lose");
                    } else if (sum == point) {
                        System.out.println("You have rolled a " + random1 + "+" + random2 + "=" + sum + ", you win!");
                    } else {
                        System.out.println(
                                "You have rolled a " + random1 + "+" + random2 + "=" + sum + ", keep rolling.");
                    }
                } while (sum != 7 && sum != point);
            }

            do {
                System.out.print("Would you like to play again? (y/n) ");
                playAgain = sc.nextLine().toLowerCase();
            } while (!playAgain.equals("y") && !playAgain.equals("n"));

        } while (playAgain.equals("y"));
        System.out.println("Goodbye " + name + "!");
    }

}
