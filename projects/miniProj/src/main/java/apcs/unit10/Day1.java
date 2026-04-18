package apcs.unit10;

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list of words. Terminate your list with a period");
        // stackWords(sc);
        drawTriangle(3);
    }

    public static void stackWords(Scanner sc) {
        String temp = sc.next();
        if (temp.equals(".")) {
            return;
        } else {
            stackWords(sc);
            System.out.println(temp);
        }
    }

    public static void drawTriangle(int n) {
        if (n <= 0) {
            System.out.println("thats all folks");
            return;
        }
        printNAsterisks(n);
        drawTriangle(n - 1);

    }

    public static void printNAsterisks(int n) {
        if (n <= 0) {
            System.out.println();
        } else {
            System.out.print("* ");
            printNAsterisks(n - 1);
        }
    }

    public static int summationOne(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * n + summationOne(n - 1));
        }
    }

    public static int summationTwo(int n) {
        if (n == 1) {
            return 4;
        } else {
            return (2 + 2 * n + summationTwo(n - 1));
        }
    }
}
