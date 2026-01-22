package apcs.unit05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Sales {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("projects\\miniProj\\data\\sales.txt");
        File outputFile = new File("projects\\miniProj\\data\\salesData.txt");
        Scanner fScan = new Scanner(inputFile);
        PrintWriter pw = new PrintWriter(outputFile);
        DecimalFormat df = new DecimalFormat("$#,###.00");

        pw.println("Month\t\t\tTotalSales");
        pw.println();
        double tempTotal = 0;
        double maxNumber = 0;
        String maxMonth = "";
        String tempMonth;
        while (fScan.hasNext()) {
            if (fScan.hasNextDouble() == false) {
                tempMonth = fScan.next();
                while (fScan.hasNextDouble() == true) {
                    tempTotal += fScan.nextDouble();
                    if (tempTotal > maxNumber) {
                        maxNumber = tempTotal;
                        maxMonth = tempMonth;
                    }
                }
                if (tempMonth.length() < 4) {
                    pw.println(tempMonth + "\t\t\t\t" + df.format(tempTotal));
                } else if (tempMonth.length() < 8) {
                    pw.println(tempMonth + "\t\t\t" + df.format(tempTotal));
                } else {
                    pw.println(tempMonth + "\t\t" + df.format(tempTotal));
                }
                tempTotal = 0;
            }
        }
        pw.println();
        pw.println(maxMonth + " had the highest sales with a total of " + df.format(maxNumber));
        pw.close();
        fScan.close();
    }
}
