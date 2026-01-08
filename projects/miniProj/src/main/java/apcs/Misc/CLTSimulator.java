package apcs.Misc;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Arrays;
//histogram of the results of a simulation of the central limit theorem
public class CLTSimulator {
    public static void main(String[] args) {
        
        Map<String, Integer> simulationResults = new LinkedHashMap<>();
        int[] simulationArray = new int[20];
        double[] ArrayIndexes = new double[20];
        for (int repititions = 0; repititions < 1000; repititions++) {
            int successfulGuesses = 0;
            for (int trials = 0; trials < 30; trials++) {
                if ((int) (Math.random() * 3) == 0) {
                    successfulGuesses += 1;
                }
            }
            System.out.println(successfulGuesses);
            double proportion = successfulGuesses / 30.0;
            simulationArray[(int)(proportion/0.05)] = simulationArray[(int)(proportion/0.05)] +1;
            System.out.println("added one to " + (int)(proportion/0.05));
            
        }
        for (int i = 0; i < 20; i++) {
            ArrayIndexes[i] = Math.round(i * 0.05 * 100)/100.0;
        }
        System.out.println(Arrays.toString(simulationArray));
        System.out.println(Arrays.toString(ArrayIndexes));

        for(int i=0;i<simulationArray.length;i++){
            simulationResults.put(ArrayIndexes[i] + "-" + Math.round(((int)((ArrayIndexes[i]+0.05)*100)))/100.0,simulationArray[i]);
        }
        System.out.println(simulationResults);
        for (Map.Entry<String, Integer> entry : simulationResults.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}