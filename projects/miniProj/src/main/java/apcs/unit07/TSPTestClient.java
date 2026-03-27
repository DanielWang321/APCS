package apcs.unit07;

import java.io.FileNotFoundException;

public class TSPTestClient {
    public static void main (String[] args) throws FileNotFoundException{
        TSP path = new TSP("projects\\miniProj\\data\\TSPData.txt");
        path.applyDoubleNeighborHeuristic();
        
    }
}
