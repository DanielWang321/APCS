package apcs.unit03;

import java.util.Scanner;

public class BaseConvert2 {
    public static void main(String[] args) {
        int originalNumber;
        int newBase;
        String Goagain;
        Scanner sc = new Scanner(System.in);
        do {
            do {
                System.out.print("Enter base 10 number: ");
                try {
                    originalNumber = sc.nextInt();
                    if (originalNumber < 0) {
                        System.out.println("Invalid");
                    }
                } catch (Exception e) {
                    originalNumber = -10000;
                    sc.nextLine();
                }

            } while (originalNumber < 0);
            do {
                System.out.print("Enter desired base: ");
                try {
                    newBase = sc.nextInt();
                    if (newBase < 2 || newBase > 36) {
                        System.out.println("Invalid");
                    }
                } catch (Exception e) {
                    newBase = -10000;
                    sc.nextLine();

                }

            } while (newBase < 2 || newBase > 36);

            System.out.println(originalNumber + " in base " + newBase + " is " + convertBase(newBase, originalNumber));
            do {
                System.out.print("Would you like to perform another calculation (y/n):");
                Goagain = sc.next();

            } while (!(Goagain.equals("y") || Goagain.equals("n")));
        } while (Goagain.equals("y"));
    }

    public static int findHighestPower(int base, int number) {
        int highestPower = 0;
        while (Math.pow(base, highestPower) <= number) {
            highestPower++;
        }
        highestPower--;
        return highestPower;
    }

    public static String convertBase(int base, int number) {
        String result = "";
        int highestPower = findHighestPower(base, number);
        int powerValueInt;
        int digitValue;
        for (int power = highestPower; power >= 0; power--) {
            powerValueInt = (int) Math.pow(base, power);
            digitValue = number / powerValueInt;
            number = number - (digitValue * powerValueInt);
            if (digitValue < 10) {
                result = result + digitValue;
            } else {
                char digitChar = (char) (65 + digitValue - 10);
                result = result + digitChar;
            }
        }
        return result;
    }
}
