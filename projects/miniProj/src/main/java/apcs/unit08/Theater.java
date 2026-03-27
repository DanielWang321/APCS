package apcs.unit08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Theater {
    private final int ROWS = 15, COLS = 30;
    private boolean[][] seats = new boolean[ROWS][COLS]; // false: open, true: taken
    private double[] rowCosts = new double[ROWS];

    public Theater(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner fScan = new Scanner(file);
        for (int i = 0; i < ROWS; i++) {
            rowCosts[i] = fScan.nextDouble();
        }
    }

    public void buySeat(int r, int c) {
        this.seats[r][c] = true;
    }

    public int getRows() {
        return ROWS;
    }
    public int getCols() {
        return COLS;
    }

    public int getNumSeatsTaken(){
        int count = 0;
        for (int r = 0; r < ROWS; r++) {
            count += getNumSeatsTakenInRow(r);
        }
        return count;
    }

    public double getTotalSold(){
        double total = 0;
        for(int r = 0; r < ROWS; r++){
            total += rowCosts[r] * getNumSeatsTakenInRow(r);
        }
        return total;
    }

    public int getNumSeatsTakenInRow(int r){
        int total = 0;
        for(int c = 0; c < COLS; c++){
            if (seats[r][c]) {
                total += 1;
            }
        }
        return total;

    }

    public boolean isTaken (int r, int c){
        return seats[r][c];
    }

    public String toString() {
        String builder = "";
        // build the top row
        builder += " \t";
        for (int c = 0; c < COLS; c++) {
            if (c + 65 < 91) {
                builder += (char) (c + 65) + " ";
            } else if (c + 65 >= 91) {
                builder += (char) (c + 71) + " ";
            }
        }
        builder += "\n";
        for (int r = 0; r < ROWS; r++) {
            builder += (r + 1) + "\t";
            for (int c = 0; c < COLS; c++) {
                if (seats[r][c]) {
                    builder += "- ";
                } else {
                    builder += "O ";
                }
            }
            builder += "\n";
        }
        return builder;
    }
    
}
