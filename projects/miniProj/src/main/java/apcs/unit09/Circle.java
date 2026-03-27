package apcs.unit09;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super(0);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getCircumference(){
        return Math.PI * 2 * radius;
    }

    public double getPerimeter(){
        return Math.PI * 2 * radius;
    }

    public String toString(){
        return this.getClass().getSimpleName() + "\nArea: " + this.getArea() + "\nCircumference" + this.getPerimeter();
    }

    public double getArcLength(double radians){
        return radians * radius;
    }

    public double getAreaOfSector(double radians){
        return radians/ (2*Math.PI) * getArea();
    }
    

}
