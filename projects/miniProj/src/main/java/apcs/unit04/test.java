package apcs.unit04;

public class test {
    public static void main(String[] args) {
        System.out.println(findPower(360,7));

    }
    public static int findPower(int num, int prime){
        int i = 0;
        while(num%Math.pow(prime,i)==0){
            i++;
        }
        return (i-1);
    }
}
