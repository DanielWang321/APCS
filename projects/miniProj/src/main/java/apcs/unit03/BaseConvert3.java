package apcs.unit03;

import java.util.Scanner;

public class BaseConvert3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, desiredBase;
        String again;
        do {
            System.out.println("Enter base 10 number");
            try {
                base = sc.nextInt();
                if (base < 0) {
                    System.out.println("Invalid");
                }
            } catch (Exception e) {
                base = -100;
                sc.nextLine();
            }
            while (base < 0)
                ;
            do {
                System.out.println("Enter your desired base");
                try {
                    desiredBase = sc.nextInt();
                    if (desiredBase < 2 || desiredBase > 36) {
                        System.out.println("Invalid");
                    }
                } catch (Exception e) {
                    desiredBase = -100;
                }
            } while (desiredBase < 2 || desiredBase > 36);
            System.out.println(convertBase(desiredBase, base));
            System.out.println("Would you like to perform another calculation (y/n):");
            again = sc.next();

        } while (again.equals("y") || again.equals("Y"));
    }

    public static int findHighestPower(int base, int number) {
        int highestPower = 0;
        while (Math.pow(base, highestPower) < number) {
            highestPower += 1;
        }
        return (highestPower - 1);
    }

    public static String findDigit(int digit) {
        if (digit >= 0 && digit <= 9) {
            return digit + "";
        } else {
            char value = (char) (digit + 55);
            return value + "";
        }

    }

    public static String convertBase(int base, int number) {
        String result = "";
        int highestPower = findHighestPower(base, number); // get highest power
        int powerValue;
        int digitValue;
        for (int power = highestPower; power >= 0; power--) {
            powerValue = (int) Math.pow(base, power); // calculate base^power
            digitValue = number / powerValue; // integer division
            number = number - (digitValue * powerValue); // reduce number
            if (digitValue < 10) {
                result = result + digitValue;
            } else {
                char digitChar = (char) ('A' + digitValue - 10); // convert to char
                result = result + digitChar;
            }
        }
        return result;
    }
}
