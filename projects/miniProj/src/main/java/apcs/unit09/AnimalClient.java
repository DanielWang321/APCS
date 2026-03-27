package apcs.unit09;

import apcs.unit09.Fish.WaterType;

public class AnimalClient {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        animals[0] = new Animal("Elmo");
        animals[1] = new Person("Advaita");
        animals[2] = new Fish("Nemo",Fish.WaterType.SALTWATER);
        animals[3] = new Shark("Bruce", Fish.WaterType.SALTWATER);
        animals[4] = new Bird("Blue");
        animals[5] = new Penguin("Skipper");

        for(Animal a: animals){
            System.out.println(a);
            a.characteristics();
            a.move();
            //if animal IS actually a fish
            if(a instanceof Fish){
                ((Fish)a).getMyWater();
            }
            System.out.println();
        }
    }
}
