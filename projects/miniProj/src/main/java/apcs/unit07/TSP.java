package apcs.unit07;

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class TSP {
    private int N; // number of points
    private Point[] points; // coordinates of points indexed 0, 1, … , N-1
    private boolean[] marked; // indicates whether or not a point is included in the solution
                              // true means point is marked

    public TSP(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner fScan = new Scanner(file);
        int numOfPoints = fScan.nextInt();
        points = new Point[numOfPoints];

        for(int i = 0; i< numOfPoints; i++){
            int x = fScan.nextInt();
            int y = fScan.nextInt();
            points[i] = new Point(x,y);
        }
    }

    public String toString(){
        return(Arrays.toString(points));
    }

}
