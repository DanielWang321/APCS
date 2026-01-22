package apcs.unit06;

public class BowlingFrameSet {
    private int[] framescores;

    public BowlingFrameSet() {

        framescores = new int[10];
    }

    public void setFrameScore(int frameNumber, int score) {
        if (frameNumber >= 1 && frameNumber <= 10)
            framescores[frameNumber - 1] = score;
        else {
            throw new IllegalArgumentException();
        }
    }

    public int getFrameScore(int frameNumber) {
        if (frameNumber >= 1 && frameNumber <= 10)
            return framescores[frameNumber - 1];
        else {
            return -1;
        }
    }

    public int getTotalScore() {
        int sum = 0;
        for (int score : framescores) {
            sum += score;
        }
        return sum;
    }

    public getBestFrame(){
        int max = 0;
        for (int i = 0; i<framescores.length; i++){
            if(framescores[i]>framescores[max]){
                max = i;
            }
        }
        return max+1;
    }
    
    public int countStrikes(){
        int count = 0;
        for (int score : framescores) {
            if (score == 10){
                count+=1;
            }
        }
        return count;
    }
    
}
