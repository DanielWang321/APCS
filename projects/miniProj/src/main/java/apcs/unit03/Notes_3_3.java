package apcs.unit03;

import java.util.Scanner;

/*
The String Class
https://apstudents.collegeboard.org/ap/pdf/ap-computer-science-a-java-quick-reference_0.pdf

char charAt(int) - returns a char at the index of the int passed; you must pass
			a valid index
			
int indexOf(char) - returns the index of the first occurrence of the character in the 
					String, -1 if the character doesnt occur in the String
int indexOf(String)

int compareTo(String) - returns an int; a negative number if the calling object (this)
				is considered "less than" the argument passed, 0 if the two are considered
				to be equal, and a positive number if the calling object is considered
				"greater than" the argument passed
				exercise: "rank" the following Strings in order from "least" to "greatest"
				orange, apple, Banana, banana, Watermelon, grapes, grape

                apple < Banana < banana < grapes < grape < orange < Watermelon
				
String substring(int) - returns the substring from the index of the int parameter to 
				the end of the String
				
String substring(int, int) - returns the substring from the index of the 
				first parameter (INCLUSIVE) to the index of the second parameter (EXCLUSIVE)
				
int length() - returns an int that is the number of characters in the String

*/
public class Notes_3_3 {
    public static void main(String[] args) {
        String greeting = "what's up";

        int l = greeting.length();
        System.out.println(l); //

        // print each character in the greeting string, one character per line

        System.out.println(greeting.charAt(0)); // w
        System.out.println(greeting.charAt(greeting.length())); // error
        System.out.println(greeting.charAt(greeting.length() - 1)); // p

        int index = greeting.indexOf('a');
        System.out.println(index); // 2
        int index2 = greeting.indexOf("at");
        System.out.println(index2); // 2
        int index3 = greeting.indexOf("ta");
        System.out.println(index3); // -1

        String sub1 = greeting.substring(3);// t
        System.out.println(sub1);
        String sub2 = greeting.substring(2, 5);
        System.out.println(sub2); // at'

        String sub3 = greeting.substring(3, greeting.length()); //

        String animal1 = "Dog", animal2 = "Giraffe";
        System.out.println(animal1.compareTo(animal2)); //
        System.out.println(animal2.compareTo(animal1)); //
        System.out.println(animal1.compareTo("Dog")); //

        Scanner sc = new Scanner(System.in);

        String a = "monkey";
        String aa = "monkeys";
        String b = "Tiger";
        String B = "tiger";
        String c = "elephant";

        int length = a.length();
        System.out.println(length); // 6

        sub1 = a.substring(3);
        sub2 = b.substring(2, 5);

        System.out.println(sub1); // key
        System.out.println(sub2); // ger

        sub1 = a.substring(a.length()); // nothing

        System.out.println(sub1 + "grape"); // grape

        sub1 = a.substring(a.length() + 1); // error
        sub2 = a.substring(3, a.length() + 1); // error

        sub1 = a.substring(3, 3); // nothing
        System.out.println(sub1 + "grape");// grape

        boolean truth;
        String first = "Hello";
        String second = "Hello";
        String third = new String("Hello");
        String fourth = sc.next(); // assume the user enters "Hello"

        truth = first == second;
        System.out.println(truth); // true

        truth = first == third;
        System.out.println(truth); // false

        truth = second == third;
        System.out.println(truth); // false

        truth = first == fourth;
        System.out.println(truth); // false

        char firstLetter = a.charAt(0); // M
        char lastLetter = a.charAt(a.length() - 1); // y
        char doesThisWork = a.charAt(a.length()); // error

        /*
         * String a = "monkey";
         * String aa = "monkeys";
         * String b = "Tiger";
         * String B = "tiger";
         * String c = "elephant";
         */
        System.out.println(a.compareTo(a)); // 0
        System.out.println(a.compareTo(b)); // positive
        System.out.println(b.compareTo(a)); // negative
        System.out.println(a.compareTo(c)); // positive
        System.out.println(b.compareTo(c)); // negative
        System.out.println(b.compareTo(B)); // negative
        System.out.println(aa.compareTo(a));// positive
    }
}
