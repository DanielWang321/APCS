package apcs.unit06;
public class WeekTempTester
{
    public static void main(String[] args)
    {
        int[] week = {72, 68, 75, 70, 77, 80, 78};
        WeeklyTemperatures w = new WeeklyTemperatures(week);

        System.out.println(w);
        System.out.println("Avg: " + w.getAverage());
        System.out.println("Max: " + w.getMax());
        System.out.println("Max day: " + w.getDayNameOfMax());
        System.out.println("Above 75: " + w.countAbove(75));
    }
}


