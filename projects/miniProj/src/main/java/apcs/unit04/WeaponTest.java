package apcs.unit04;


public class WeaponTest {
    public static void main(String[]args){
		Weapon w = new Weapon();
		Weapon w2 = new Weapon("Paper"); //pass whatever data type your function accepts
		System.out.println(w);
		System.out.println(w2);
		w.setWeapon();
		w2.setWeapon("Rock"); //pass whatever data type your function accepts
		System.out.println(w);
		System.out.println(w2);
		System.out.println(w2.getWeapon());
    }
}
