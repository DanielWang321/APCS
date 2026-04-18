package apcs.unit10;

public class Notes {
    public static void main(String[] args) {
        System.out.println(factorialIt(5));
        System.out.println(factorialRec(43));
        System.out.println(fibonacciIt(5));
        System.out.println(fibonacciRec(5, 2, 1));
    }

    public static int factorialIt(int n) {
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        return total;
    }

    public static int factorialRec(int n) {
        if (n > 1) {
            return n * factorialRec(n - 1);
        } else {
            return 1;
        }
    }

    public static int fibonacciIt(int n) {
        int f1 = 2;
        int f2 = 1;
        int next = 0;
        for (int i = 0; i < n - 2; i++) {
            next = f2 + f1;
            f2 = f1;
            f1 = next;
        }
        return next;
    }

    public static int fibonacciRec(int n, int f1, int f2) {
        int next = f2 + f1;
        f2 = f1;
        f1 = next;
        if (n > 3) {
            return fibonacciRec(n - 1, f1, f2);
        } else {
            return next;
        }
    }

}
