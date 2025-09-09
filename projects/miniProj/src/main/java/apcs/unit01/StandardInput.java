package apcs.unit01;

/*
Terms to know: constructor, return type, instance, object
1. construct a Scanner
2. use a Scanner to read in different types of input
3. common errors when getting input
4. dog years program
//ask the user for their age
//calculate their age in dog years
//sample input - age of 36 would be 5.14 in dog years
//output result
5. band name program
//ask the user for the name of the street they grew up on
//the name of your first pet
//their rock star name will be the pet name plus the street name
//no matter what they enter, your program should work properly
//AND only output two words for their band name/rock star name
*/
import java.util.Scanner; //import only scanner class from util package
import java.util.*; //imports all classses in util package. 

public class StandardInput {
    public static void main(String[] args) {
        /*
         * Scanner sc = new Scanner(System.in);
         * // called a scanner class constructor to allocate memory for/instantiate a
         * // scanner object
         * // constructor: spcial type of function that allocates memory for a reference
         * // type
         * int nextInt() - reads in and returns an int
         * double nextDouble() - reads in and returns one token/word
         * String next() - reads in and returns one token/word
         * ^^will skip leading whitespace and stop when it reaches whitespace
         * String nextLine() - reads in and returns the whole line of input
         * 
         * // int age;
         * // System.out.print("Enter age: ");
         * // age = sc.nextInt();
         * // System.out.println("you will turn 21 in " + (21 - age) + " years");
         * // System.out.println("Enter your height in inches: ");
         * // double heightInInches = sc.nextDouble();
         * // sc.nextLine(); //use nextLine to clear input stream
         * // System.out.println("Enter fav movie: ");
         * // String favMovie = sc.nextLine();
         * System.out.println(favMovie + "sj");
         */
        /*
         * Scanner sc = new Scanner(System.in);
         * double DOGAGEFACTOR = 7.0;
         * double dogAge;
         * System.out.println("Enter your age in yrs: ");
         * int humanAge = sc.nextInt();
         * dogAge = humanAge / DOGAGEFACTOR;
         * double cleanedDogAge = ((int)(dogAge*100))/100.0;
         * System.out.println("You are " + cleanedDogAge + " years old in dog years");
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("What is street: ");
        String streetName = sc.next();
        sc.nextLine();
        System.out.println("What is pet: ");
        String petName = sc.next();
        String bandName = streetName + " " + petName;
        System.out.println(bandName);
        sc.close();
    }
}
