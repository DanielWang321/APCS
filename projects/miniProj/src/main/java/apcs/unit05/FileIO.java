package apcs.unit05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {

    // pre: filename is the name of .txt file that contains only numbers and at
    // least one number
    // if precondition not satisfied, IllegalArgumentException thrown
    // return average of the numbers in fileName
    public static double getAverage(String fileName) {
        // connect Scanner to file
        File f = new File(fileName);
        Scanner fScan;
        int count = 0;
        double total = 0;
        try {
            fScan = new Scanner(f);
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(); // could have handled this many ways
            // typically, if using a try catch, this would be inside of a loop that
            // prompts for a new file name, but thats not appropriate to do inside a
            // function like this
        }

        while (fScan.hasNextDouble()) {
            total += fScan.nextDouble();
            count++;
            // add to a total
            // count
        }
        fScan.close();
        if (count == 0) {
            throw new IllegalArgumentException(); // file did not contain any numbers
        }
        // assertion: fScan is successfully connected to the file
        return total / count;
    }
    public static void main(String[] args) throws FileNotFoundException {
        writeNeat("data/messy.txt", "data/neat.txt");
    }

    public static void writeNeat(String inputFile, String outputFile) throws FileNotFoundException{
        // read data from inputFile
        // write data to outputFile in neat format
        Scanner fScan = new Scanner(new File(inputFile));
        PrintWriter pw = new PrintWriter(outputFile);
        String line, part1,part2;
        //while there are more lines, 
            //read a line
            //grab all characters before the , and trim
            //grab all characters after the , and trim
            //write new neat strings to output file
        while(fScan.hasNextLine()){
            line = fScan.nextLine();
            part1 = line.substring(0,line.indexOf(',')).trim();
            part2 = line.substring(line.indexOf(',')+1).trim();
            pw.println(part1 + "," + part2);
            
        }
        fScan.close();
        pw.close();
        System.out.println("Data written to " + outputFile);
    }

}
/*
 * Example 1: Find the average of the numbers in a file
 * 
 * Example 2: For a file that contains data in the format:
 * 
 * some word or words , some more words
 * Write the data to an output file in the format:
 * some word or words,some more words
 ** see messy.txt
 * 
 * Example 3: see the input file sales.txt
 * process the data in such a way that produces the
 * output file salesData.txt
 * This is a partner activity
 */