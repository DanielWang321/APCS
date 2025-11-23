package apcs.unit04;

public class Cars {
    private String model; // instance data that can describe a car: model, brand, horsepower
    private String brand;
    private double hp;
    private String type;

    // constructors
    // this constructor is for when I only know the model of the car
    public Cars(String model) {
        this.model = model;
    }

    // this is for when I know all the information about the car
    public Cars(String model, String brand, int hp) {
        this.model = model;
        this.brand = brand;
        this.hp = hp;
    }

    // mutators
    // included setters for brand and hp, because those can change, but model should
    // not change
    public void setHP(int hp) {
        this.hp = hp;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // accessors
    // getters so other classes can see car info
    public String getModel() {
        return model;
    }

    public String getType() {
        if (hp <= 150) {
            type = "Compact";
        } else if (hp <= 300) {
            type = "SUV";
        } else if (hp <= 600) {
            type = "Performance";
        } else {
            type = "Sports car";
        }
        return type;
    }
    


    public String getBrand() {
        return brand;
    }

    public double getHP() {
        return hp;
    }

    public String toString() {
        return (brand + " " + model + "\nHP: " + hp);
    }

    // Fun/cool method
    // car hp is combined with a random number to simulate unpredictability in
    // racing
    // static because it doesnt use "this"
    public static void race(Cars car1, Cars car2) {
        double car1Score = car1.hp + (Math.random() * 50);
        double car2Score = car2.hp + (Math.random() * 50);
        if (car1Score > car2Score) {
            System.out.println(car1.getModel() + " wins!");
        } else if (car2Score > car1Score) {
            System.out.println(car2.getModel() + " wins!");
        } else {
            System.out.println("Its a tie");
        }
    }

}