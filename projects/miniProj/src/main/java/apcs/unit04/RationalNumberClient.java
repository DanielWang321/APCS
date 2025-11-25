package apcs.unit04;

public class RationalNumberClient {
    public static void main(String[] args){
        RationalNumber n1 = new RationalNumber(2, 100);
        RationalNumber n2 = new RationalNumber(5,300);
        System.out.println(n1.compareTo(n2));
    }
}
