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
        //CONVERTING NUMERICAL TO BINARY
        boolean highestBinaryDigitFound = false;
        int n = 0;
        int digit = 0;
        while(highestBinaryDigitFound == false){
            digit = (int)Math.pow(2,n);
            
            n++;
            if ((sum/digit)!=0){
                highestBinaryDigitFound = false;
            }else if((sum/digit)==0){
                highestBinaryDigitFound = true;
            }
            
            System.out.println(highestBinaryDigitFound);
        }
        int numOfBinaryDigits = n-1;
        boolean finishedConverting = false;
        ArrayList <String> binaryList = new ArrayList<>();

        n=n-1;
        while(finishedConverting = false){
            if (sum%2 == 1){
                binaryList.add("1");
            }else{
                binaryList.add("0");
            }
        }
        System.out.println(binaryList);
    }
}