package apcs.unit04;

public class CarsClient {
    public static void main(String[] args) {
        Cars c1 = new Cars("crv");
        Cars c2 = new Cars("i8", "BMW", 435);
        Cars c3 = new Cars("Contentintal", "Bentley", 650);
        Cars c4 = new Cars("Model S", "Tesla", 1020);
        Cars c5 = new Cars("Mustang", "Ford", 450);
        System.out.println(c4.getType());
        System.out.println(c2);
        System.out.println(c3);
        Cars.race(c2, c5);

    }
}
