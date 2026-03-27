package apcs.unit09.FantasyFootball;


public class Quarterback extends FantasyFootballPlayer {
	
	public Quarterback(String name) {
		super(name);
	}
	public int getPointsPerTouchdown() {
		return 4;
	}
	public int getYardsPerPoint() {
		return 25;
	}
	public String getPositionName() {
		return "Quarterback";
	}
}

