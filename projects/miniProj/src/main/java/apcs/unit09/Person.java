package apcs.unit09;

public class Person extends Animal{
    public Person(String name){
        super(name);
    }

    public void characteristics(){
        super.characteristics();
        System.out.println("I have opposable thumbs and a large brain");
    }

    public void move(){
        super.move();
        System.out.println("I walk on two legs");
    }
}
