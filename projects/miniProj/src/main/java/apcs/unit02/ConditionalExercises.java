package apcs.unit02;

import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class ConditionalExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // exercise 1
        double num;
        System.out.println("Enter a number");
        num = sc.nextDouble();
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        // exercise 2
        double num1, num2, num3;
        double greatestNum = Double.NaN;
        System.out.println("Enter a number 1");
        num1 = sc.nextDouble();
        System.out.println("Enter a number 2");
        num2 = sc.nextDouble();
        System.out.println("Enter a number 3");
        num3 = sc.nextDouble();
        if (num1 > num2 && num1 > num3) {
            greatestNum = num1;
        } else if (num2 > num1 && num2 > num3) {
            greatestNum = num2;
        } else if (num3 > num1 && num3 > num2) {
            greatestNum = num3;
        } else {
            System.out.println("equal");

        }
        if (!Double.isNaN(greatestNum)) {
            System.out.println("Greatest Number: " + greatestNum);
        }
        // challenge
        String input;
        System.out.println("Enter letter");
        input = sc.next();
        if (input.length() > 1) {
            System.out.println("Please enter 1 character");
            return;
        }
        input = input.toUpperCase();
        char inputCharacter = input.charAt(0);
        if (!Character.isLetter(inputCharacter)) {
            System.out.println("Not a letter");
            return;
        }
        if (inputCharacter == 'A' || inputCharacter == 'E' || inputCharacter == 'I' || inputCharacter == 'O'
                || inputCharacter == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}