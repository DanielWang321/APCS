package apcs.unit04;

public class Player {

    private String firstName;
    private String lastName;
    private int wins;
    private int losses;
    private double balance;
    private double betAmount;
    private Weapon currentChoice;

    public Player() {
        this.firstName = "George";
        this.lastName = "Devol";
        this.wins = 0;
        this.losses = 0;
        this.balance = 0;
        this.betAmount = 0;
        this.currentChoice = new Weapon();
    }

    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.wins = 0;
        this.losses = 0;
        this.balance = 0;
        this.betAmount = 0;
        this.currentChoice = new Weapon();
    }

    public void win() {
        this.wins += 1;
        this.balance += betAmount;
    }

    public void lose() {
        this.losses += 1;
        this.balance -= betAmount;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setBetAmount(double betAmount){
        this.betAmount = betAmount;
    }

    public void setWeapon(String choice){
        this.currentChoice.setWeapon(choice);
    }
    public void setWeapon(){
        this.currentChoice.setWeapon();
    }

    public Weapon getWeapon(){
        return this.currentChoice;
    }
    public double getBalance(){
        return this.balance;
    }

    public String toString(){
        return(firstName + " " +lastName + " has " + balance + " dollars and has a win/loss of "+ wins +"/"+losses);
    }


}
