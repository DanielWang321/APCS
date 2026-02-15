package apcs.unit07;

import java.io.FileNotFoundException;

public class TSPTestClient {
    public static void main (String[] args) throws FileNotFoundException{
        TSP arr = new TSP("projects\\miniProj\\data\\TSPdata.txt");
        System.out.println(arr);
    }
}
