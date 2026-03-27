package apcs.unit09;

public class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }

    public void characteristics(){
        System.out.println("I am alive");
    }

    public void move(){
        System.out.println("I move");
    }

    public String toString(){
        return "My name is " + name + " and I am a " + this.getClass().getSimpleName();
    }
}
