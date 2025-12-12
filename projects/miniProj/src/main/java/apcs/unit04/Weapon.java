package apcs.unit04;

public class Weapon {
    private String weapon;

    public Weapon(String weapon){
        this.weapon = weapon;
    }
    public Weapon(){
        int random = (int)(Math.random()*3); //0,1,2
        if (random == 0){
            this.weapon = "Rock";
        } else if (random == 1){
            this.weapon = "Paper";
        } else if(random == 2){
            this.weapon = "Scissors";
        }
        
    }

    public String getWeapon(){
        return weapon;
    }

    public void setWeapon(String weapon){
        if (!(weapon.equals("Rock") || weapon.equals("Paper") || weapon.equals("Scissors"))){
            throw new IllegalArgumentException("Invalid weapon choice");
        }
        this.weapon = weapon;
    }
    public void setWeapon(){
        int random = (int)(Math.random()*3);
        if (random == 0){
            this.weapon = "Rock";
        } else if (random == 1){
            this.weapon = "Paper";
        } else {
            this.weapon = "Scissors";
        }
    }

    public String toString(){
        return(weapon+"");
    }

    public boolean equals(Object other){
        if (other instanceof String){ //used to compare to string directly
            return this.weapon.toString().equals(other);
        }
        if (!(other instanceof Weapon)){ //tests to make sure other is an Weapon
            return false;
        }
        Weapon o = (Weapon) other; //if other isnt Weapon, error
        return this.weapon.equals(o.weapon);
    }
}
