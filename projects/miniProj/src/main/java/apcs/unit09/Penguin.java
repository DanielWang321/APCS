package apcs.unit09;

public class Penguin extends Bird{
    public Penguin(String name){
        super(name);
    }

    public void characteristics(){
        super.characteristics();
        System.out.println("I am a flipper winged bird for life in the water");
    }

    public void move(){
        System.out.println("I waddle");
    }
}
