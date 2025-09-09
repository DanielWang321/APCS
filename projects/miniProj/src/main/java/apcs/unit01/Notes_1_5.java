package apcs.unit01;

/*
terms to know - casting, widening, precedence
widening casting (automatic) converting a smaller type to a larger type size
narrowing casting (manually) converting a larger type to a smaller type size
the casting operators (int) and (double) can be used to create a temporary
value converted to a different data type
casting a double value to an int causes the digits to the right of the
decimal point to be truncated
//predict output
challenge: what line of code would allow you to round any positive number
to the nearest integer?
challenge 2: what line of code would allow you to round any negative number
to the nearest integer?
challenge 3: what line of code would allow you to round any positive number to the
nearest tenth? Hundredth?
ints are stored using 4 bytes of memory. An int value must be in the
range Integer.MIN_VALUE to Integer.MAX_VALUE
If an expression would evaluate to an int outside of the allowed range,
an integer overflow error occurs. This results in an incorrect value within
the allowed range
*/
public class Notes_1_5 {
    public static void main(String[] args) {
        int a = 2;
        double b = 1.7;
        // b = a; legal or not? legal
        // this is an example of __________________
        // a = b; legal or not? illegal
        // a = (int)b; - legal or not? legal
        System.out.println((double) a); // 2.0
        System.out.println((int) b);// 1
        System.out.println((int) b + a);// 3
        System.out.println((int) b + b);// 2.7
        System.out.println((int) (b / a));// 0
        double c = 2; //
        // DO NOT RUN - predict output
        double x = 2.8, y = 1.2;
        a = 5;
        int bb = 4;
        System.out.println((int) x); // 2
        System.out.println(x); // 2.8
        System.out.println((int) y); // 1
        System.out.println((double) a); // 5.0
        System.out.println((int) x + y); // 3.2
        System.out.println((int) (x + y)); // 4
        System.out.println((double) a / bb); // 1.25
        System.out.println((double) (a / bb)); // 1.0
        System.out.println((int) (a / y)); // 4
        System.out.println((int) x / a); // 0
    }
}