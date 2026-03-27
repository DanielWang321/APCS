package apcs.unit09;

public class Shark extends Fish {
    public Shark(String name, WaterType myWater){
        super(name,myWater);
    }
    public void characteristics(){
        super.characteristics();
        System.out.println("I have sharp teeth");
    }
}
