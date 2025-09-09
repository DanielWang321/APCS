package apcs.unit01;

/*
terms to know - arithmetic expression, assignment statement, arithmetic operator,
ArithmeticException, precedence rules
* Arithmetic Operators
* + addition
* - subtraction
* * multiplication
* % modular division (remainder division)
* Examples:
* 5 % 6 = 5
* 6 % 6 = 0
* 0 % 3 = 0
* 12 % 5 = 2
* 13 % 5 = 3
* # % n =
*
* / Division
* 1. Integer Division - performed if both operands
* are of type integer - this could be literal or variable -
* evaluates to the whole number only, meaning the remainder
* is truncated
* Examples:
* 2 / 2 = 1
* 3 / 2 = 1
* 2 / 6 = 0
* double result = 2 / 4; // 0.0
*
* 2. Floating Point Division - is performed when one or
* the other or both operands are of floating point
* type, this could be literal or variable - this functions
* the way that we would normally consider division to operate
*/
public class Notes_1_3 {
    public static void main(String[] args) {
        int x = 5, y = 7, z;
        double b = 1.0, c;
        z = x / y; // 0
        c = y / x; // 1.0
        c = b / y; // 0.142857 repeating
        c = x / 2; // 2.0
        c = x / 2.0; // 2.5
        z = y % x; // 2
        z = x % y; // 5
        double n = 1, p = 3.5;
        int q = 4, r = 2;
        double result1;
        int result2;
        // result1 = (r / q) + r; //2.0
        // result2 = (r / q) + p; //error
        result1 = q * n + n / r; // 4.5
        result1 = n / q * r; // 0.5
        result1 = r / q * r; // 0.0
        result1 = p * r + n; // 8.0
        result2 = q * r + 1; // 9
        result2 = r / q + 1; // 1
        /*
         * Write the expression:
         * set n to half the value of a
         * n = 0.5a;
         * set z to the square of x
         * z = Math.pow(x,2);
         * set y to 10 less than twice the value of g
         * y=2*g-10;
         * set p to 5 more than one third the value of j
         * p=(1.0/3)j + 5;
         */
    }
}