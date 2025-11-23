package apcs.unit04;

public class OrderedPairClient2 {
    public static void main(String[] args)
{

    // ---------------------------------------------------------------
    // SCENARIO 1: Primitive vs reference parameter
    // ---------------------------------------------------------------
    int n = 5;
    OrderedPair a = new OrderedPair(2, 3);

    bumpNumberAndPoint(n, a);

    // Q1: After the call to bumpNumberAndPoint, what are the values of n and a?
    //n = 5, a = (2, 13)
    // Q2: Explain your results.
    //since n is a primitive, it is passed by its value, and so its not changed outside the method
    //since a is an object, the reference to the object is passed, and the method changes the object itself, so the change is reflected outside the method


    // ---------------------------------------------------------------
    // SCENARIO 2: aliasing (shallow copy)
    // ---------------------------------------------------------------
    OrderedPair b = new OrderedPair(0, 10);
    OrderedPair c = b;   

    moveBoth(b, c);

    // Q3: After moveBoth(b, c), what are the coordinates of b and c? (-1,11) ( -1,11)

    // Q4: Why do b and c have the value they do? 
    //since b and c are both references to the same object, changing one changes the other as well


    // ---------------------------------------------------------------
    // SCENARIO 3: Reassignment vs mutation
    // ---------------------------------------------------------------
    OrderedPair d = new OrderedPair(7, -4);

    resetWrong(d); 
    resetCorrect(d);

    // Q5: After resetWrong(d), what are the coordinates of d? (7,-4)
    // Q6: After resetCorrect(d), what are the coordinates of d? (-7,4)
    //     Why does resetCorrect work while resetWrong does not?
            //resetWrong creates a new object while resetCorrect modifies the object

    // ---------------------------------------------------------------
    // SCENARIO 4: Failed swap (pass-by-value)
    // ---------------------------------------------------------------
    OrderedPair e = new OrderedPair(1, 1);
    OrderedPair f = new OrderedPair(9, 9);

    swapWrong(e, f);

    // Q7: After swapWrong(e, f), what are e and f? (1,1) (9,9)
    // Q8: Why did you get these results? theres no swap because only the parameter references were swapped, not the actual objects


    // ---------------------------------------------------------------
    // SCENARIO 5: Copying vs aliasing (deep vs. shallow)
    // ---------------------------------------------------------------
    OrderedPair g = new OrderedPair(4, 4);
    OrderedPair h = copyPoint(g);  // g and h are distinct objects
    OrderedPair i = g;             // i is reference to g

    shiftRight(h, 5);
    shiftRight(i, -2); //changes the actual object g

    // Q9:
    //   (a) How many distinct OrderedPair OBJECTS exist among g, h, and i? 2 distinct objects
    //   (b) Which variables refer to the same object? g and i refer to the same object
    //   (c) What are the final coordinates of g, h, and i? h = (9,4), i = (2,4), g = (2,4)


    // ---------------------------------------------------------------
    // SCENARIO 6: Methods that return new objects
    // ---------------------------------------------------------------
    OrderedPair j = new OrderedPair(0, 0);
    OrderedPair k = new OrderedPair(6, 0);
    OrderedPair m = new OrderedPair(6, 6);

    OrderedPair center = midpointChain(j, k, m);

    // Q10:
    //   (a) Which of j, k, m, and center changed after the call? only center changed
    //   (b) How many NEW OrderedPair objects were created inside midpointChain? 3 new objects
    //   (c) How is this scenario different from methods like resetCorrect and shiftRight? those functions actually edit the objects, while this 
    //                                                                                      function creates new objects without changing the originals                   


    // ---------------------------------------------------------------
    // SCENARIO 7: Aliasing inside a method
    // ---------------------------------------------------------------
    OrderedPair p = new OrderedPair(-1, 3);
    sneakChange(p);

    // Q11: Why does p change when temp is the one that was modified? they refer the same location, sneakchange the acutal objects, which p refers to
    //     What does this reveal about copying references vs copying objects?
            //copying references means that your copy could change when changing the actual object
            //copying objects means the value wont change unless you explicitly modify it
}

public static void bumpNumberAndPoint(int n2, OrderedPair p)
{
    n2 = n2 + 10;
    p.translate(0, 10);
}

public static void shiftRight(OrderedPair p, double amt)
{
    p.translate(amt, 0);
}

public static void resetWrong(OrderedPair p)
{
    p = new OrderedPair(0, 0);
}

public static void resetCorrect(OrderedPair p)
{
    p.translate(-p.getX(), -p.getY());
}

public static void moveBoth(OrderedPair a, OrderedPair d)
{
    a.translate(1, 1);
    d.translate(-2, 0);
}

public static void swapWrong(OrderedPair p1, OrderedPair p2)
{
    OrderedPair temp = p1;
    p1 = p2;
    p2 = temp;
}

public static OrderedPair copyPoint(OrderedPair p)
{
    return new OrderedPair(p.getX(), p.getY());
}

public static OrderedPair midpointChain(OrderedPair p, OrderedPair q, OrderedPair r)
{
    OrderedPair m1 = p.getMidpoint(q);
    OrderedPair m2 = q.getMidpoint(r);
    OrderedPair center = m1.getMidpoint(m2);
    return center;
}

public static void sneakChange(OrderedPair p2)
{
    OrderedPair temp = p2; //temp is a reference to the same object as p2
    temp.translate(1, -1);
}


}
