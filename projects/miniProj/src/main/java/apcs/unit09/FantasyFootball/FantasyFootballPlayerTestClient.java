package apcs.unit09.FantasyFootball;

import java.util.ArrayList;

public class FantasyFootballPlayerTestClient
{

    public static void main(String[] args)
    {

        // Create players
        FantasyFootballPlayer rb = new RunningBack("Christian McCaffrey");
        FantasyFootballPlayer wr = new WideReceiver("Justin Jefferson");
        FantasyFootballPlayer qb = new Quarterback("Josh Allen");

        // Test initial state
        System.out.println("=== Initial Player Stats ===");
        System.out.println(rb);
        System.out.println(wr);
        System.out.println(qb);

        // Test separate mutators
        rb.addYards(20);
        rb.addTouchdown(1);

        wr.addYards(30);
        wr.addTouchdown(1);

        qb.addYards(50);
        qb.addTouchdown(1);

        System.out.println("\n=== After Separate Mutator Calls ===");
        System.out.println(rb);
        System.out.println(wr);
        System.out.println(qb);

        // Test addGameStats
        rb.addGameStats(100, 0);   // total: 120 yards, 1 TD
        wr.addGameStats(60, 1);    // total: 90 yards, 2 TD
        qb.addGameStats(200, 2);   // total: 250 yards, 3 TD

        System.out.println("\n=== After Adding Stats ===");
        System.out.println(rb);
        System.out.println(wr);
        System.out.println(qb);

        // Test polymorphism with a collection
        ArrayList<FantasyFootballPlayer> players = new ArrayList<FantasyFootballPlayer>();
        players.add(rb);
        players.add(wr);
        players.add(qb);

        System.out.println("\n=== Polymorphism Test (Looping Through Players) ===");

        int totalScore = 0;
        FantasyFootballPlayer mvp = players.get(0);

        for (FantasyFootballPlayer p : players)
        {
            int score = p.getCurrentScore();
            System.out.println(p.getPositionName() + " Score: " + score);

            totalScore += score;

            if (score > mvp.getCurrentScore())
            {
                mvp = p;
            }
        }

        System.out.println("\nTotal Combined Score: " + totalScore);
        System.out.println("MVP: " + mvp.getPositionName() + " - " + mvp.getCurrentScore());

        // Test validation behavior
        System.out.println("\n=== Validation Test ===");

        // Negative yards SHOULD be allowed
        rb.addYards(-20);

        // Negative touchdowns should NOT be allowed (via addGameStats)
        rb.addGameStats(0, -2);

        System.out.println(rb);
    }
}
