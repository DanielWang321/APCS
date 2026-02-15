package apcs.unit07;

public class Point{
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }

    public double distance(Point other){
        return Math.pow((Math.pow((other.x-this.x),2) + Math.pow((other.y-this.y),2)),0.5);
    }

    public String toString(){
        return("(" + this.getX() + ", " + this.getY() + ")");
    }
}