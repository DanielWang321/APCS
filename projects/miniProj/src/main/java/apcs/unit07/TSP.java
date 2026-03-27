package apcs.unit07;

import java.util.ArrayList;
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
        N = fScan.nextInt();
        points = new Point[N];
        marked = new boolean[N];
        for (int i = 0; i < N; i++) {
            int x = fScan.nextInt();
            int y = fScan.nextInt();
            points[i] = new Point(x, y);
        }
    }

    // Compute the distance between points i and j.
    // i and j represent INDEXES
    public double distance(int i, int j) {
        return points[i].distance(points[j]);
    }

    // Find the unmarked point that is closest to point j.
    // j represents an INDEX
    public int findUnmarkedPointClosestToPoint(int j) {
        double minDistance = Double.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < N; i++) {
            if (distance(i, j) < minDistance && !marked[i]) {
                minDistance = distance(i, j);
                minIndex = i;
            }
        }
        return minIndex;

    }

    // Determine and print the cycle and cycle length using the Double Neighbor
    // Heuristic Algorithm
    public void applyDoubleNeighborHeuristic() {
        int pointA = 0;
        int pointB = findUnmarkedPointClosestToPoint(0);
        marked[pointA] = true;
        marked[pointB] = true;
        double length_of_cycle = distance(pointA, pointB);
        ArrayList<Integer> cycle = new ArrayList<>();
        int p1;
        int p2;
        double s; // distance from point A to p1.
        double t; // distance from point B to p2.
        cycle.add(pointA);
        while (findUnmarkedPointClosestToPoint(N - 1) != -1) {
            p1 = findUnmarkedPointClosestToPoint(pointA);
            p2 = findUnmarkedPointClosestToPoint(pointB);
            s = distance(pointA, p1);
            t = distance(pointB, p2);

            if (s < t) {
                pointA = p1;
                cycle.add(0, pointA);
                length_of_cycle += s;
                marked[pointA] = true;
            } else {
                pointB = p2;
                cycle.add(pointB);
                length_of_cycle += t;
                marked[pointB] = true;
            }
        }
        length_of_cycle += distance(pointA, pointB);
        System.out.println(output(cycle,length_of_cycle));
    }

    public String output(ArrayList<Integer> cycle, double length_of_cycle) {
        String builder = "";
        builder += "+++++++++++++++++++++++++++++\n+ Double Neighbor Heuristic +\n+++++++++++++++++++++++++++++";
        builder += "\n\nN = " + N + " points\n\n";
        builder += "Index\t|\t Point\n";
        for (int i = 0; i < N; i++) {
            builder += i + "\t|\t" + points[i] + "\n";
            builder += "--------|-----------------------\n";
        }
        builder+="\n\n+++++++++++++++\n+ Cycle Found +\n+++++++++++++++\n\n";
        for (int i =0; i<cycle.size()-1;i++){
            builder+= points[cycle.get(i)] + " ->- " + Math.round(distance(cycle.get(i), cycle.get(i+1))*100)/100.0 + " ->- \n";
        }
        builder += points[cycle.get(N-1)] + " ->- " + Math.round(distance(cycle.get(N-1), cycle.get(0))*100)/100.0 + " ->- " + points[cycle.get(0)];
        builder +="\n\n++++++++++++++++++++++\n+ Total Cycle Length +\n++++++++++++++++++++++\n\n";
        builder += length_of_cycle;
        return builder;
    }

}
