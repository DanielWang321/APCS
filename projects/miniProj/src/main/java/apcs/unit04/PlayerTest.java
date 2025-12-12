package apcs.unit04;

public class PlayerTest 
{
	public static void main(String[] args)
	{
		Player p1 = new Player();
		Player p2 = new Player("John", "Smith");
		Player p3 = new Player("Rita", "Barber");
		
		p1.setBalance(100);
		p2.setBalance(100);
		p3.setBalance(100);
		p1.setBalance(50);
		p1.win();
		p2.setBalance(20);
		p2.lose();
		System.out.println(p1 + "\n");
		System.out.println(p2 + "\n");
		System.out.println(p3 + "\n\n");
		
		p2.setWeapon();
		System.out.println(p2.getWeapon());
		p1.setWeapon("Rock"); //pass whatever data type your function accepts
		System.out.println(p1.getWeapon());
	}
}

