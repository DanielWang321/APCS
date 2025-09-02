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
* 2 / 2 =
* 3 / 2 =
* 2 / 6 =
* double result = 2 / 4; //
*
* 2. Floating Point Division - is performed when one or
* the other or both operands are of floating point
* type, this could be literal or variable - this functions
* the way that we would normally consider division to operate
*/
public class Notes_1_3
{
    public static void main(String[] args)
        {
            int x = 5, y = 7, z;
            double b = 1.0, c;
            z = x / y; //
            c = y / x; //
            c = b / y; //
            c = x / 2; //
            c = x / 2.0; //
            z = y % x; //
            z = x % y; //
            double n = 1, p = 3.5;
            int q = 4, r = 2;
            double result1;
            int result2;
            //result1 = (r / q) + r; //
            //result2 = (r / q) + p; //
            result1 = q * n + n / r; //
            result1 = n / q * r; //
            result1 = r / q * r; //
            result1 = p * r + n; //
            result2 = q * r + 1; //
            result2 = r / q + 1; //
            /*
            Write the expression:
            set n to half the value of a
            set z to the square of x
            set y to 10 less than twice the value of g
            set p to 5 more than one third the value of j
            */
}
}