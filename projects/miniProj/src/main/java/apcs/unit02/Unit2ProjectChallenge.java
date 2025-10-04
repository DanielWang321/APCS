package apcs.unit02;

public class Unit2ProjectChallenge {
    public static void main(String[] args) {

        for (int k = 1;k<=3;k++){
        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0;//counters for each number
        double propnum1, propnum2, propnum3, propnum4, propnum5, propnum6; //proportion for each number
        int iterations = 100*((int)Math.pow(10, (k-1))); //number of rolls
        System.out.println("Number of rolls: " + iterations);
        for (int i = 1; i <= iterations; i++) {

            int roll = (int) (Math.random() * 6 + 1); //generate 1-6 random number
            //System.out.println(roll);
            //count the number of each roll
            if (roll == 1) {
                num1++;
            } else if (roll == 2) {
                num2++;
            } else if (roll == 3) {
                num3++;
            } else if (roll == 4) {
                num4++;
            } else if (roll == 5) {
                num5++;
            } else if (roll == 6) {
                num6++;
            }

        }
        //calculate proportions
        propnum1 = (double)num1 / iterations;
        propnum2 = (double)num2 / iterations;
        propnum3 = (double)num3 / iterations;
        propnum4 = (double)num4 / iterations;
        propnum5 = (double)num5 / iterations;
        propnum6 = (double)num6 / iterations;
        //print results
        System.out.println("There were " + num1 + " 1s and thats " + propnum1 + "(Experimental prob) of the total, the theoretical probability is "+ 1.0/6);
        System.out.println("There were " + num2 + " 2s and thats " + propnum2 + "(Experimental prob) of the total, the theoretical probability is "+ 1.0/6);
        System.out.println("There were " + num3 + " 3s and thats " + propnum3 + "(Experimental prob) of the total, the theoretical probability is "+ 1.0/6);
        System.out.println("There were " + num4 + " 4s and thats " + propnum4 + "(Experimental prob) of the total, the theoretical probability is "+ 1.0/6);
        System.out.println("There were " + num5 + " 5s and thats " + propnum5 + "(Experimental prob) of the total, the theoretical probability is "+ 1.0/6);
        System.out.println("There were " + num6 + " 6s and thats " + propnum6 + "(Experimental prob) of the total, the theoretical probability is "+ 1.0/6);
    }
    }
}