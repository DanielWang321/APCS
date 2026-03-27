package apcs.unit09;

public class Fish extends Animal{
    public static enum WaterType{SALTWATER, FRESHWATER}
    private WaterType myWater;

    public Fish (String name, WaterType myWater){
        super(name);
        this.myWater = myWater;

    }

    public void characteristics(){
        super.characteristics();
        System.out.println("I have gills");
    }

    public void getMyWater(){
        System.out.println("I live in " + myWater);
    }
}
