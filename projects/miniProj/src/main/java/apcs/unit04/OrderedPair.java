package apcs.unit04;

public class OrderedPair implements Comparable<OrderedPair> {
    private double x;
    private double y;

    public OrderedPair() {
    }

    public OrderedPair(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // returns the distance from THIS (the calling object) ordered pair to origin
    // post: this is unchanged
    public double getDistance() {
        return Math.sqrt(x*x + y*y);
    }
    // returns distance from THIS (the calling object) ordered pair to another point
    // post: this is unchanged

    public double getDistance(OrderedPair other) {
        return Math.sqrt(Math.pow((this.x - other.x),2) + Math.pow((this.y - other.y),2));
    }

    // returns midpoint from THIS (the calling object) ordered pair to origin
    // post: this and other unchanged
    public OrderedPair getMidpoint() {
        return new OrderedPair(x/2, y/2);
    }

    // returns midpoint from THIS (the calling object) ordered pair to another point
    // post: this and other unchanged
    public OrderedPair getMidpoint(OrderedPair other) {
        return new OrderedPair((this.x + other.x)/2.0, (this.y + other.y)/2.0);
    }

    // slope from origin to this OP
    // post: this is unchanged
    public double getSlope() {
        return 0;
    }

    // slope from other to this OP
    // post: this is unchanged
    public double getSlope(OrderedPair other) {

        return (this.y-other.y)/(this.x-other.x);
    }

    // returns angle in radians of angle in standard position
    // which terminal side intersects this in radians
    // post: this is unchanged
    public double getAngle() {
        return this.getPolar().getTheta();
    }
    

    // returns quadrant where this OP lies, -1 if lies on axis
    public int getQuadrant() {
        if (x>0 && y>0){
            return 1;
        } else if (x<0 && y>0){
            return 2;
        } else if (x<0 && y<0){
            return 3;
        } else if (x>0 && y<0){
            return 4;
        } else {
            return -1;
        }
    }

    // polar coordinate equivalent to this OP
    // post: this is unchanged
    public PolarCoordinate getPolar() {
        return new PolarCoordinate(this);
    }

    // post: this.x has been increased by deltaX, same w Y
    public void translate(double deltaX, double deltaY) {
        x += deltaX;
        y += deltaY;
    }

    // post: this.x has been increased by other.x, same w Y

    public void translate(OrderedPair other) {
        this.x += other.x;
        this.y += other.y;
    }

    //post: this OP has been dilated by factor
    public void dilate(double factor){
        this.x *= factor;
        this.y *= factor;
    }

    //pre: radians is measured in radians
    //post: this OP has been rotated radians radians
    public void rotate(double radians){
        PolarCoordinate temp = new PolarCoordinate(radians + this.getAngle(),this.getDistance());
        OrderedPair tempOP = temp.getCartesian();
        this.x = tempOP.x;
        this.y = tempOP.y;
    }

    //post: this OP has been reflected
    public void reflectOverOrigin(){

    }

    //post: this OP has been reflected over y axis
    public void reflectOverYAxis(){
        x*=-1;
    }

    public void reflectOverXAxis(){
        y*=-1;
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }
    //returns true if this and o are equal
    public boolean equals(Object o){
        if (!(o instanceof OrderedPair)){ //tests to make sure o is an OrderedPair
            return false;
        }
        OrderedPair other = (OrderedPair) o; //if o isnt OP, error
        return (this.x == other.x && this.y == other.y);
    }
    
    public int compareTo(OrderedPair other){
        double thisDistance = this.getDistance();
        double otherDistance = other.getDistance();
        if (thisDistance < otherDistance){
            return -1;
        }else if(thisDistance > otherDistance){
            return 1;
        }else{
            return 0;
        }

        //return Double.compare(this.getDistance(), other.getDistance));
        
    }

    // distance
    // linear regression
    // random ordered pair
    // area of a triangle with three ordered pairs
    // line of best fit

}
