package apcs.unit03;

import java.util.*;

public class Notes_3_2 {
    public static void main(String[] args) {

        /*
         * -for loop - used when the number of iterations is known
         * (in either literal or variable form)
         * for(initialization; booleanStatement; update)
         * {
         * 
         * }
         */

        /*
         * TRACING EXAMPLES
         * //example 1 - what is the exact output of the following
         * for(int i = 0; i < 10; i++)
         * System.out.println(i);
         * 0
         * ...
         * 9
         * 
         * //example 2 - describe the output of the following: hello world 5 times
         * for(int i = 1; i <= 5; i++)
         * System.out.println("Hello World");
         * 
         * //example 3 0,2,4,6,8,10
         * for(int i = 0; i <= 10; i += 2)
         * System.out.println(i);
         * 
         * //example 4 0 infinite
         * for(int i = 0; i <= 100; i *= 2)
         * System.out.println(i);
         * 
         * //example 5 1,2,4,8,16,32,64
         * for(int i = 1; i <= 100; i *= 2)
         * System.out.println(i);
         * 
         * //example 6 Hello infinite times
         * for (int i = 1; i <= 10; i--)
         * System.out.println("Hello");
         * 
         * 
         * PROGRAMMING EXAMPLES
         * Define: local, scope, accumulator, counter
         * 1. calculate n!
         * 2. calculate the summation of the series...
         * 3. add all the odd numbers from 0 to n together
         * 4. display the multiplication table of a given integer
         * 
         */

        // local: a variable is considering LOCAL to the block of code
        // in which its declared, meaning it can only be used
        // in that block

        // example: here, the scope of i is LOCAL to the for loop
        int n = 11, sum = 1,k=1;
        for (int i = 1; i <= n; i = i + 1) {
            for(k = 1; k<=n;k++){
                System.out.print(k*i+"\t");
            }
            System.out.println();
            

        }

    }
}