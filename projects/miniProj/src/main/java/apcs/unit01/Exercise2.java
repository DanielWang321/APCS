package apcs.unit01;
import java.util.Scanner;
import java.util.ArrayList;


public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two binary num");
        int numericalNum1 = 0; // numerical value of first num
        int numericalNum2 = 0; // numerical value of sec num
        String binaryNum1 = sc.next();
        String binaryNum2 = sc.next();
        char[] charNum1 = binaryNum1.toCharArray();
        char[] charNum2 = binaryNum2.toCharArray();
        //CONVERT NUMERICAL TO BINARY
        for (int i = 0; i < charNum1.length; i++) {
            double singleBinaryValue = 0; // the numerical value of one single binary digit
            int reversedIndex = charNum1.length - i;
            if (charNum1[reversedIndex - 1] == '1') {// checks if binary number has 1 or 0
                singleBinaryValue = Math.pow(2.0, i); // finds numerical value of one binary digit
                singleBinaryValue = (int) singleBinaryValue;
            }
            numericalNum1 += singleBinaryValue; // adds the value of one digit to the entire numerical number
        }
        System.out.println("num 1: " + numericalNum1);
        for (int k = 0; k < charNum2.length; k++) {
            double singleBinaryValue2 = 0;
            int reversedIndex2 = charNum2.length - k;
            if (charNum2[reversedIndex2 - 1] == '1') {
                singleBinaryValue2 = Math.pow(2.0, k);
                singleBinaryValue2 = (int) singleBinaryValue2;
            }
            numericalNum2 += singleBinaryValue2;
        }
        int sum = numericalNum2 + numericalNum1;
        System.out.println("num 2: " + numericalNum2);
        System.out.println("Result" + sum);
        // Convert sum to binary string
        String binaryResult;
        if (sum == 0) {
            binaryResult = "0";
        } else {
            StringBuilder sb = new StringBuilder();
            int value = sum;
            while (value > 0) {
                sb.append(value % 2);
                value /= 2;
            }
            binaryResult = sb.reverse().toString();
        }
        System.out.println("Binary Result: " + binaryResult);
        sc.close();
    }
}
