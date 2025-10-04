package apcs.unit02;

import java.util.Scanner;

public class Unit2Project3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input Number: ");
        int number = sc.nextInt();
        String day = "";
        if (number == 1) {
            day = "Monday";
        } else if (number == 2) {
            day = "Tuesday";
        } else if (number == 3) {
            day = "Wednesday";
        } else if (number == 4) {
            day = "Thursday";
        } else if (number == 5) {
            day = "Friday";
        } else if (number == 6) {
            day = "Saturday";
        } else if (number == 7) {
            day = "Sunday";
        } else {
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        System.out.println("Day " + number + "is" + day);
        sc.close();
    }
}
