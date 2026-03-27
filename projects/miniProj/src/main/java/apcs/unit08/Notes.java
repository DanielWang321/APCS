package apcs.unit08;

import java.util.Arrays;

/*
 * In main:
 * 1. Declare and instantiate on a single line a two-dimensional array called
 * intArr that holds int
 * values and has 5 rows and 8 columns.
 * 2. Fill in each cell of the intArr array from the previous question with the
 * result of multiplying
 * that cell's column index by its row index
 * 
 * Programming Examples
 * Example 1: Find the sum of all elements in a matrix (2-d array) mat
 * Example 2: Add 10 to each element in row n of a matrix mat
 * Example 3: Write a method that returns a int which is equal to the sum of the
 * major left to right diagonal of a matrix
 * precondition: matrix is a square matrix
 * Example 4: Write a method that returns an array which holds the values of the
 * sum of each row of a matrix
 * Example 5: Write a method that returns an array which holds the values of the
 * sum
 * of each column in a matrix
 * Example 6: write a function that returns the sum of two matrices of the same
 * size
 * Example 7: write a function that returns the sum of a specified (by
 * parameter) row of a 2d array
 * Example 8: write a function that returns the sum of a specified (by
 * parameter) column of a 2d array
 * Example 9: swap all elements in the Ath and Bth row of a 2d array
 * Example 10: Given a 2-d array, re-order the rows such that the row with the
 * highest row sum is
 * the first row
 * Example 11: Write a function called largestColumnFirst(). This function takes
 * a two-dimensional
 * array of integers, finds the column with the largest sum, and switches it
 * with the first
 * column in the matrix
 * Example 12: write the function transpose(). This function takes a two-d array
 * of
 * integers, representing a square n × n matrix, and swaps the row and column of
 * each
 * element (i.e. reflects the contents over the main diagonal).
 * 
 * For example:
 * 6 7 8 0 6 3 1 2
 * 3 2 4 5 ⇒ 7 2 5 0
 * 1 5 8 2 8 4 8 9
 * 2 0 9 3 0 5 2 3
 */

public class Notes {
    public static void main(String[] args) {
        double[][] decs = new double[3][4]; // 3 rows, 2 columns
        final int ROWS = 5, COLS = 6;
        boolean[][] truths = new boolean[ROWS][COLS];
        String[][] words = { { "a", "b", "c" }, { "d", "e", "f" } }; // 2 rows, 3 columns

        int[][] nums = new int[ROWS][COLS]; // 5 rows, 6 cols
        print2d(nums);

        // row major order: processing one full row of data at a time
        for (int r = 0; r < nums.length; r++) { // iterates row number of times; 1 iteration means one row has been
                                                // processed
            for (int c = 0; c < nums[r].length; c++) {
                nums[r][c] = r * c;
            }
        }
        System.out.println();
        print2d(nums);

        System.out.println();
        System.out.println(Arrays.toString(getColSums(nums)));
        System.out.println(sumRow(nums,1));
        swapRows(nums,2,3);
        print2d(nums);

    }

    public static void print2d(int[][] ar) {

        for (int[] row : ar) {
            System.out.println(Arrays.toString(row));
        }
    }

    // post: ar is unchanged
    // returns the sum of elecments in ar
    public static int sum2d(int[][] ar) {
        int sum = 0;
        for (int r = 0; r < ar.length; r++) {
            for (int c = 0; c < ar[r].length; c++) {
                sum += ar[r][c];
            }
        }
        return sum;
    }

    // pre: 0 < r < ar.length
    // post: every element in ar[r] has been increased by n
    public static void addNToRow(int[][] ar, int r, int n) {
        for (int c = 0; c < ar[r].length; c++) {
            ar[r][c] += n;
        }
    }

    // pre: ar is square
    // post: ar is unchanged
    // returns the sum of the major left to right diagonal of ar
    public static int getSumOfDiagonal(int[][] ar) {
        int sum = 0;
        for (int r = 0, c = 0; r < ar.length; r++, c++) {
            sum += ar[r][c];
        }
        return sum;
    }

    // post: ar is unchanged
    // returns an array where array[i] is the sum of the values in ar[i]
    public static int[] getRowSums(int[][] ar) {
        int[] result = new int[ar.length];
        for (int r = 0; r < ar.length; r++) {
            for (int c = 0; c < ar[r].length; c++) {
                result[r] += ar[r][c];
            }
        }
        return result;
    }

    //pre: ar has at least one element
    //post: ar is unchanged
    //returns an array where each element contains the sum of column of ar
    public static int[] getColSums(int[][] ar){
        int[] result = new int[ar[0].length];
        for(int c = 0; c<ar[0].length;c++){
            for(int r = 0; r< ar.length;r++){
                result[c] += ar[r][c];
            }
        }
        return result;
    }

    //pre: a and b have same dimensions
    //post: a and b are unchanged
    //returns a 2d array where array[i][j] = a[i][j] + b[i][j]
    public static int[][] sumMatrices(int[][] a, int[][] b){
        int[][] result = new int[a.length][a[0].length];
        for(int r = 0; r<a.length;r++){
            for(int c = 0; c<a[r].length;c++){
                result[r][c] = a[r][c] + b[r][c];
            }
        }
        return result;
    }

    //pre: 0<=r<ar.length
    //post: ar is unchanged
    //returns sum of ar[r]
    public static int sumRow(int[][] ar, int r){
        int sum =0;
        for (int i : ar[r]) {
            sum+=i;
        }
        return sum;
    }
    //pre: 0<=c<ar[0].length, ar has at least 1 element
    //post: ar is unchanged
    //returns sum of column c in ar
    public static int sumCol(int[][] ar, int c){
        int sum = 0;
        for(int r = 0; r<ar.length;r++){
            sum += ar[r][c];
        }
        return sum;
    }
    
    //pre: 0<= a < ar.length, 0<=b<ar.length
    //post: ar[a] and ar[b] swapped
    public static void swapRows(int[][] ar, int a, int b){
        int[] temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
    }
}