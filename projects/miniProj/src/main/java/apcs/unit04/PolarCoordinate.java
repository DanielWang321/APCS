package apcs.unit04;

public class PolarCoordinate {
    private double length;
    private double theta;

    public PolarCoordinate(OrderedPair op) {
        theta = Math.atan2(op.getY(), op.getX());
        if(theta<0){
            theta += (2*Math.PI);
        }
        length = op.getDistance();
    }

    public PolarCoordinate(double theta, double length) {
        this.theta = theta;
        if (length < 0) {
            throw new IllegalArgumentException();
        }
        this.length = length;
    }

    public double getTheta() {
        return theta;
    }

    public double getLength() {
        return 0;
    }
    public String toString() {
        return "(" + length + ", " + theta + ")";
    }
    public OrderedPair getCartesian(){
        double x = length * Math.cos(theta);
        double y = length * Math.sin(theta);
        return new OrderedPair(x, y);

    }

}
