package apcs.unit09.FantasyFootball;

public class WideReceiver extends FantasyFootballPlayer{
	public WideReceiver(String name) {
		super(name);
	}
	public int getPointsPerTouchdown() {
		return 6;
	}
	public int getYardsPerPoint() {
		return 15;
	}
	public String getPositionName() {
		return "Wide Receiver";
	}
}
