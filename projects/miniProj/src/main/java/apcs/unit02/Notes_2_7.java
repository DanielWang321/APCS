package apcs.unit02;

import java.util.Scanner;

public class Notes_2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "hi";
        String s2 = sc.next();// assume user enters the String "hi"
        String s3 = new String("hi");
        String s4 = "hi";
        String s5 = s1;
        String s6 = s2;
        String s7 = s3;
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s3);//false
        System.out.println(s1 == s4);//true
        System.out.println(s5 == s1);//true
        System.out.println(s6 == s2);//true
        System.out.println(s7 == s3);//true
        System.out.println();
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//true
    }
}
/*
 * primitive vs. reference types
 * comparing reference types - using .equals()
 * how does == behave for reference types?
 * how does == behave for Strings?
 * how are Strings stored?
 * Strings are immutable objects - there are no mutator functions defined in the
 * String class
 * mutator - a function that allows us to change the data associated with an
 * object
 * accessor - a function that allows us to access info about the data associated
 * with an object
 * when is new memory allocated for a String?
 */
