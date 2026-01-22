package apcs.unit06;
 
public class Card {
    private String value;
    private char suit;
    public static final String[] VALUES = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    public static final char[] SUITS = {'C','H','D','S'}; // clubs, hearts, diamonds, spades

    //pre: 0<=val < VALUES.length and 0<=suits < SUITS.length
    public Card(int val, int s){
        this.value = VALUES[val];
        this.suit = SUITS[s];
    }

    public String toString(){
        return(value+suit);
    }

    public static void main(String[] args){
        Card c = new Card(1,1);
        System.out.println(c);
    }

    
}
