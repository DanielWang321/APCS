package apcs.unit06;
public class ManyDecks{
    private int numDecks;
    private Deck[] decks;

    public ManyDecks(int numDecks){
        this.numDecks = numDecks;
        decks = new Deck[this.numDecks];
        for(int i = 0; i<decks.length;i++){
            decks[i] = new Deck();
        }

    }
    public String toString(){
        String builder = "";
        for (Deck d : decks) {
            builder += d.toString() + "\n\n";
        }
        return builder;
    }
    public void shuffleAll(){
        for (Deck d : decks) {
            d.shuffle();
        }
    }
    public static void main(String[] args) {
        ManyDecks m = new ManyDecks(10);
        m.shuffleAll();
        System.out.println(m);
    }
}