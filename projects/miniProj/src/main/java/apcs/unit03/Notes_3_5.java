package apcs.unit03;
import java.rmi.server.SocketSecurityException;
import java.util.Scanner;
public class Notes_3_5 {
    public static void main(String[] args) {
        /*
         * Two d (nested) iteration:
         * TRACING EXAMPLES
         * //example 1 - How many times does the following code print a *? 20
         * for(int i = 3; i < 8; i++)
         * {
         * for(int y = 1; y < 5; y++)
         * {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         * 
         * //example 2 - How many stars are printed out by the following loops? 50
         * How many times do the loops run? 
         * for(int row = 0; row < 5; row++)  //5 times
         * {
         * for(int col = 0; col < 10; col++) /10 times
         * {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         * //example 3 - describe what the code below prints (what does it LOOK like) a rectangle with height 6 and width 5
         * for (int i = 2; i < 8; i++)
         * {
         * for (int y = 1; y <= 5; y++)
         * {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         * */

         /*
         * PROGRAMMING EXAMPLES
         * 1. Draw a rectangle with user defined row and column numbers
         * 2. Draw an isosceles right triangle with user defined base
         * 3. challenge triangle
         * 4. Diamond
         * Test Data
         * Input number of rows (half of the diamond) : 7
         * Expected Output :
         */
        /*
         * *
         * ***
         * *****
         * *******
         * *********
         * ***********
         * *************
         * ***********
         * *********
         * *******
         * *****
         * ***
         * *
         * 
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base");
        int base = sc.nextInt();
        for (int i=0; i<base;i++){
            for (int j=0;j<(base-(i+1));j++){
                System.out.print("  ");
                
            }
            for(int k = 0;k<(i+1);k++){
                    System.out.print(" *");
                }
            System.out.println();
        }
    }
}
