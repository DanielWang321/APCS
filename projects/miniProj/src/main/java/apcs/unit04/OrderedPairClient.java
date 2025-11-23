package apcs.unit04;
import java.util.Arrays;

public class OrderedPairClient {
    public static void main(String[] args) {
        OrderedPair op1 = new OrderedPair(3, 4);
        OrderedPair op2 = new OrderedPair(3, 7);
        OrderedPair op3 = new OrderedPair(3, 3);
        OrderedPair op4 = new OrderedPair(3, 3);
        
        OrderedPair[] points = {op1, op2, op3, op4};
        
        Arrays.sort(points);
            for (OrderedPair op : points) {
            System.out.println(op);
        }
    }
}
