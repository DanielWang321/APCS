package apcs.unit06;

public class WeeklyTemperatures {
    private int[] temps;
    private static final String[] DAYS = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public WeeklyTemperatures(int[] ar) {
        if (ar.length != 7){
            throw new IllegalArgumentException();
        }
        //creates deep copy
        temps = new int[ar.length];
        for(int i = 0; i<ar.length; i++){
            temps[i] = ar[i];
        }
    }
    public double getAverage(){
        double sum=0;
        for (int temp : temps) {
            sum+= temp;
        }
        return (sum/temps.length);
    }

    public int getMax(){
        int maxValue = Integer.MIN_VALUE;
        for (int temp : temps) {
            if (temp>maxValue){
                maxValue = temp;
            }
        }
        return maxValue;       
    }

    public String getDayNameOfMax(){
        int maxIndex = 0;
        for(int i = 0; i<temps.length;i++){
            if(temps[i] > temps[maxIndex]){
                maxIndex = i;
            }
        }
        return DAYS[maxIndex];
    }

    public int countAbove(int threshold){
        int count = 0;
        for (int temp : temps) {
            if (temp>threshold){
                count+=1;
            }
        }
        return count;
    }
    public String toString(){
        String builder = "";
        for(int i = 0;i<temps.length;i++){
            builder += DAYS[i] + ": " + temps[i] +" ";
        }
        return builder;
    }
}

