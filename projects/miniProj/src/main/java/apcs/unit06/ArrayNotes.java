package apcs.unit06;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

/*
terms to know
array - a homogeneous (data is all of the same type) and contiguous (elements are
stored sequentially)
list with a defined length
base type - the data type being stored in an array
array element - a single data point in an array (can be any datatype)
length - the number of elements in the array
index/subscript - what you can use to identify a particular array element
valid indexes range from 0 to length-1
ArrayIndexOutOfBoundsException - the run time error that occurs when a programmer
tries to
access an element that doesn't exist (via an invalid index)
for each loop (enhanced for loop). Can be used if:
1. you don't need to modify array elements (using =)
2. you don't need to refer to the index of an element for any reason
*/
public class ArrayNotes {
    public static void main(String[] args) throws FileNotFoundException {
        /*
         * int[] nums = new int[6]; //declares and initializes an int array with length
         * 6
         * //all elements default to 0
         * char[] letterGrades = {'A', 'B', 'C', 'D','E'}; //declares and initializes a
         * char array of length 5
         * //specified values for each element
         * //accessing inditividual array elements:
         * System.out.println(letterGrades[2]);//this prints C
         * 
         * nums[5] = 42;
         * //nums[6] = 2; //cause ArrayIndexOutOfBoundsException
         * System.out.println(nums.length);//6
         * System.out.println(letterGrades.length);//5
         * 
         * System.out.println(nums[nums.length-1]);
         * System.out.println(Arrays.toString(nums));
         * 
         * //print each array element in newlines
         * for (int i=0;i<nums.length;i++){
         * System.out.println(nums[i]);
         * }
         * //print each array element of letterGrades, one per line using for each loop
         * for (char temp : letterGrades) {
         * System.out.println(temp);
         * }
         */
        int[] nums = getArrayFromFile("projects/miniProj/data/nums.txt", 49);
        System.out.println(Arrays.toString(nums));
        System.out.println(countEvens(nums));
        System.out.println(findMinElement(nums));
        //squareContents(nums);
        System.out.println(Arrays.toString(nums));

        double[] decs = { 1.1, 2.2, 3.3, 4, 5, 6.7, 7 };
        System.out.println(Arrays.toString(decs));
        swap(decs, 0, 1);
        System.out.println(Arrays.toString(decs));
        double a = 42, b = 24;
        System.out.println("a is " + a + " b is " + b);
        swap(a, b);
        System.out.println("a is " + a + " b is " + b);
        System.out.println(getRange(nums));
        System.out.println(getMaxJump(nums));
    }

    // precondition: fileName is a .txt file that contains exactly n integers
    // returns intArray containing all numbers in fileName in the same order
    public static int[] getArrayFromFile(String fileName, int n) throws FileNotFoundException {
        int[] fileNums = new int[n];
        File f = new File(fileName);
        Scanner fScan = new Scanner(f);

        for (int i = 0; i < fileNums.length; i++) {
            fileNums[i] = fScan.nextInt();
        }
        return fileNums;

    }

    // pre: arr is unchanged
    // returns number of even numbers in arr
    public static int countEvens(int[] arr) {
        int count = 0;
        for (int temp : arr) {
            if (temp % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }

    // pre: arr.length > 0
    // post: arr is unchanged
    // returns value of minimum element in arr
    public static int findMinElement(int[] arr) {
        int minElement = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < minElement) {
                minElement = i;
            }
        }

        return minElement;
    }

    // pre: arr.length >0
    // post: arr is unchanged
    // returns index of the first occurrence of the min element in arr
    public static int findMinIndex(int[] arr) {
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    // post: every element in arr has been squared
    public static void squareContents(int[] arr) {
        for (int i = 0; i < arr.length; i += 1) {
            arr[i] = arr[i] * arr[i];
        }

    }

    // precondition: i and j are in bounds
    // post: arr[i] and arr[j] have been swapped
    public static void swap(double[] arr, int i, int j) {
        double temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void swap(double x, double y) {
        System.out.println("x is " + x + " y is " + y);
        double temp = y;
        y = x;
        x = temp;
        System.out.println("x is " + x + " y is " + y);

    }

    // post: ar is unchanged
    // returns sum
    public static double getSum(double[] arr) {
        double sum = 0;
        for (double d : arr) {
            sum += d;
        }
        return sum;
    }

    public static double getSum2(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double getAverage(double[] arr) {
        double avg = getSum(arr) / arr.length;
        return (avg);
    }

    public static int getIndexOfFirstElement(double[] arr, double element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    // returns a deep copy of ar
    public static double[] getDeepCopy(double[] ar) {
        double[] newAr = new double[ar.length];
        for (int i = 0; i < ar.length; i++) {
            newAr[i] = ar[i];
        }
        return newAr;
    }

    // ar not changed
    public static int[] getReverseArray(int[] ar) {
        int[] newAr = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            newAr[ar.length - i - 1] = ar[i];
        }
        return newAr;
    }

    public static boolean isAscending(double[] ar){
        for(int i = 0; i< ar.length-1; i++){
            if (ar[i]>=ar[i+1]){
                return false;  
            }
        }
        return true;
    }
    //post: ar unchanged
    //returns difference between max and min elements in ar
    public static int getRange(int[] ar){
        int max = ar[0];
        int min = ar[0];
        for (int k : ar) {
            if (k>max){
                max = k;
            }
            if (k<min){
                min = k;
            }
        }
        return max-min;
    }
    //post: ar unchanged
    //returns magnitude of the largest difference between consecutive elements
    public static int getMaxJump(int[] ar){
        int maxJump = -1;
        for (int i = 0; i<ar.length-1;i++)
            if(Math.abs(ar[i+1]-ar[i])>maxJump)
                maxJump = Math.abs(ar[i+1]-ar[i]);
        return maxJump;

    }
}

/*
 * EXAMPLES
 * 1. write a function that returns an array filled with numbers from a file
 * 2: count the number of even numbers that exist in an array of type int
 * 3: public static int findMinElement(int[] arr)
 * 4: public static int findMinIndex(int[] arr)
 * 5: public static void squareContents(int[] arr)
 * 6: public static void swap(int[] arr, int i, int j)
 * 7: return the sum of a double array
 * 8. return the average of an int array
 * 9. find the index of the first occurrence of an element (return -1 if DNE)
 * 10. create a deep copy of an array
 * 11. reverse an array of type int
 * 12. print common elements between two arrays
 * 13. return true if an array is in ascending order, false otherwise
 * 14. return the difference between the largest and smallest values in an int
 * array
 */
