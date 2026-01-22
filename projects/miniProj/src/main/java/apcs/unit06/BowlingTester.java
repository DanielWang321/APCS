package apcs.unit06;

    public class BowlingTester
{
    public static void main(String[] args)
    {
        BowlingFrameSet g = new BowlingFrameSet();

        g.setFrameScore(1, 10);
        g.setFrameScore(2, 7);
        g.setFrameScore(3, 9);
        g.setFrameScore(4, 10);

        System.out.println(g);
        System.out.println("Best frame: " + g.getBestFrame());
        System.out.println("Strikes: " + g.countStrikes());
        System.out.println("Frame 2: " + g.getFrameScore(2));
    }
}

}
