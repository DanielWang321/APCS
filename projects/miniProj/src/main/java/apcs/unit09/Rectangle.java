package apcs.unit09;
public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        super(4);
        this.length = length;
        this.width = width;
    } 

    @Override
    public double getArea(){
        return length * width;
    }

    @Override
    public double getPerimeter(){
        return 2*length + 2*width;
    }

    public boolean isSquare(){
        return length == width;
    }
    
}
