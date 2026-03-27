package apcs.unit09;

public abstract class Shape {

    private int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public double getSumOfInteriorAngles() {
        return (Math.abs(numSides - 2) * 180);
    }

    public String toString(){
        return this.getClass().getSimpleName() + "\nArea: " + this.getArea() + "\nPerimeter" + this.getPerimeter();
    }
}
