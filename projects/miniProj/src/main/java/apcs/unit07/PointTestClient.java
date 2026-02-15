package apcs.unit07;

public class PointTestClient {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(-1, 6);
        System.out.println(p1.distance(p2));
        System.out.println(p1);
        System.out.println(p2.getX());
        System.out.println(p1.getY());
    }

}
