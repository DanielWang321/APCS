package apcs.unit09;

public class Client {
    public static void main(String[] args) {
        Superclass sup = new Superclass(1, 2, 3);
        Subclass sub = new Subclass(1, 2, 3, 4);
        //1 sup.pri = 42; //legal? why/why not: illegal, pri is private which cant be accessed in client
        //2 sup.pro = 42; //legal? why/why not: legal, pro is protected which can be accessed in client because client is in the same package as superclass
        //3 sup.pub = 42; //legal? why/why not: legal, pub is public which can be accessed anywhere
        //4 sup.subData = 42; //legal? why/why not: illegal, subData is not part of superclass
        //5 sub.pri = 42; //legal? why/why not: illegal, private data cannot be accessed in client
        //6 sub.pro = 42; //legal? why/why not: legal, same package so protected data can be accessed
        //7 sub.pub = 42; //legal? why/why not: legal, public data can be accessed anywhere
        //8 sub.subData = 42; //legal? why/why not: ilegal, subData is private and cannot be accessed in client
        /*
         * 9sup.setPri(4); //legal? why/why not: legal, there is a public setter
         * 10sub.setPri(4); //legal? why/why not: legal, it inherits the public setter from superclass
         * 11sup.setSubData(42); //legal? why/why not: illegal, setSubData is not a method in superclass
         * 12 sub.setSubData(42); //legal? why/why not: legal, setSubData is a public method in subclass
         */
        System.out.println(sup); // predict output: "pri: 1 \npro: 2 pub: 3"
        System.out.println(sub); // predict output: "pri: 1 \npro: 2 pub: 3 \nsubData: 4"
        // 13 Superclass sup2 = new Subclass(5, 6, 7, 8); //legal? legal, upcasting is legal, subclass IS-A superclass, so you can make a superclass with a subclass constructor
        // 14 Subclass sub2 = new Superclass(5, 6, 7); //legal? illegal, superclass is not a subclass, so you cannot make a subclass with a superclass constructor
        // 15 sup2.setPri(2); //legal? why/why not: legal, setPri is a public method in superclass
        // 16 sup2.setSubData(3); //legal? why/why not: illegal, sup2 is a superclass and does not inherit the setSubData because its a subclass and has a HAS-A relationship with the subclass, not an IS-A relationship, so it only has access to superclass methods
        // 17 ((Subclass)sup2).setSubData(3); //legal? why/why not: legal, sup2 gets cast to a subclass which has access to setSubData
        // 18 ((Subclass)sup).setSubData(3); //legal? why/why not: illegal, sup was created as a superclass, and during runtime, it is a superclass, so it cannot be downcasted to a subclass
        // 19 String output = sup2.toString(); //output: "pri:5 \npro: 6 \npub: 7, \nsubData: 8"
    }
}