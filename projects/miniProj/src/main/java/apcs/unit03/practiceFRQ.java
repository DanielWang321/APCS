package apcs.unit03;

public class practiceFRQ {
    public static void main(String[] args) {
        System.out.println(scoreGuess("aaaabb", "c"));
    }
    public static int scoreGuess(String secret, String guess){
        int index;
        int occurences = 0;
        int score;
        while(secret.indexOf(guess)!=-1){
            index = secret.indexOf(guess);
            occurences+=1;
            secret = secret.substring(index+guess.length());
        }
        score = occurences * (guess.length()) * (guess.length());
        return score;
    }
}
