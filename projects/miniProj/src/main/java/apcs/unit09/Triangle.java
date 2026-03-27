package apcs.unit09;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double s1, double s2, double s3) {
        super(3);
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
