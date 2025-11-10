package apcs.unit03;

import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {
        int decimalNumber;
        int desiredBase;
        String again;
        Scanner sc = new Scanner(System.in);
        do {
            do {
                System.out.print("Enter base 10 number: ");
                try {
                    decimalNumber = sc.nextInt();
                } catch (Exception e) {
                    decimalNumber = -1;
                    sc.nextLine();
                }
            } while (!errorCatchNumber(decimalNumber));
            do {
                System.out.print("Enter desired base: ");
                try {
                    desiredBase = sc.nextInt();
                } catch (Exception e) {
                    desiredBase = -1;
                    sc.nextLine();
                }
            } while (!errorCatchBase(desiredBase));

            System.out.println(decimalNumber+" in base " + desiredBase + " is "+convertBase(desiredBase, decimalNumber));
            System.out.println(decimalNumber+" in base " + desiredBase + " is "+convertBase2(desiredBase, decimalNumber));
            do{
            System.out.print("Would you like to perform another calculation (y/n):");
            again = sc.next();

            }while(!(again.equals("y")||again.equals("n")||again.equals("Y")||again.equals("N")));
        } while (again.equals("y"));
    }

    public static boolean errorCatchBase(int base) {
        boolean validBase = true;
        if (base < 2 || base > 36) {
            System.out.println("Invalid");
            validBase = false;
        }
        return (validBase);
    }

    public static boolean errorCatchNumber(int num) {
        boolean validNum = true;
        if (num < 0) {
            System.out.println("Invalid");
            validNum = false;
        }
        return (validNum);
    }

    public static int findHighestPower(int base, int number) {
        int highestPower = 0;
        while (Math.pow(base, highestPower) <= number) {
            highestPower += 1;
        } // will set highestPower as one too high
        return (highestPower - 1);
    }

    public static String findCharDigit(int digit) {
        if (digit >= 0 && digit <= 9) {
            return Integer.toString(digit);
        } else {
            return Character.toString((char) ('A' + (digit - 10)));
        }
    }

    public static String convertBase(int desiredBase, int decimalNumber) {
        String result = "";
        int highestPower = findHighestPower(desiredBase, decimalNumber);
        int subtractedValue;
        if (decimalNumber == 0) {
            return "0";
        }
        do{
            subtractedValue = (int) (Math.pow(desiredBase, highestPower)
                    * (decimalNumber / (int) (Math.pow(desiredBase, (highestPower)))));
            result = result + findCharDigit(decimalNumber / (int) (Math.pow(desiredBase, highestPower)));
            decimalNumber = decimalNumber - subtractedValue;
            highestPower -= 1;
        }while (highestPower >= 0); 
        return result;
    }
    public static String convertBase2(int desiredBase, int decimalNumber) {
        String result = "";
        int highestPower = findHighestPower(desiredBase, decimalNumber);
        while(highestPower >=0 ){
            int highestPowerNumber = (int)Math.pow(desiredBase, highestPower);
            int digitValue = decimalNumber / highestPowerNumber;
            decimalNumber = decimalNumber % highestPowerNumber;
            result = result + findCharDigit(digitValue);
            highestPower--;
        }
        return result;
}
}
