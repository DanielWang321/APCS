package apcs.unit09.FantasyFootball;

public class RunningBack extends FantasyFootballPlayer {
	public RunningBack(String name) {
		super(name);
	}
	public int getPointsPerTouchdown() {
		return 6;
	}
	public int getYardsPerPoint() {
		return 10;
	}
	public String getPositionName() {
		return "Running Back";
	}
    

}
