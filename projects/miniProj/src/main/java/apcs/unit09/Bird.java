package apcs.unit09;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    public void characteristics() {
        super.characteristics();
        System.out.println("I have feathers and hollow bones");
    }

    public void move() {
        System.out.println("I fly");
    }
}
