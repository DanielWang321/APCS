package apcs.unit06;

public class Deck {
    private Card[] cards;
    public static final int NUM_CARDS = 52;
    public Deck(){
        cards = new Card[NUM_CARDS]; //initializes array of cards BUT every element in the array is null

        for(int i =0;i<cards.length;i++){
            cards[i] = new Card(i%Card.VALUES.length,i/Card.VALUES.length);
        }
    }
    public String toString(){
        String builder = "";
        for(int i = 0; i<cards.length;i++){
            builder += cards[i] + "\t";
            if((i+1)%Card.VALUES.length==0)
                builder += "\n";
        }
        return builder;
    }

    private void swap(int i, int j){
        Card c = cards[i];
        cards[i] = cards[j];
        cards[j] = c;
    }
    public void shuffle(){
        for(int i = 0; i<cards.length; i++){
            swap(i, (int)(Math.random()*cards.length));
        }
    }
    public static void main(String[] args) {
        Deck d = new Deck();
        d.shuffle();
        System.out.println(d);
    }
}
