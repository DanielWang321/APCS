package apcs.unit09.FantasyFootball;

public abstract class FantasyFootballPlayer {
	private String name;
	private int touchdowns;
	private int yards;
	
	public FantasyFootballPlayer(String name) {
		this.name =  name;
		touchdowns = 0;
		yards = 0;
	}

	public String getName(){
		return name;
	}
	
	public int getTouchdown() {
		return touchdowns;
	}
	
	public int getYards() {
		return yards;
	}
	
	public void addYards(int yards) {
		this.yards += yards;
	}
	
	public void addTouchdown(int TDs) {
		if(TDs < 0)
			TDs = 0;
		touchdowns += TDs;
		
	}
	
	public void addGameStats(int yards, int touchdowns) {
		if(touchdowns < 0)
			touchdowns = 0;
		this.addTouchdown(touchdowns);
		this.addYards(yards);
	} 
	public abstract int getPointsPerTouchdown();
	public abstract int getYardsPerPoint();
	public abstract String getPositionName();

	
	public int getCurrentScore() {
		return (this.getYards() / this.getYardsPerPoint()) + this.getTouchdown() * this.getPointsPerTouchdown();  
	}
	
	public String toString() {
		return "Name: " + this.name + "\nPosition " + this.getPositionName() + "\nYards: " + this.getYards() + "\nTouchdowns: " + this.getTouchdown() + "\nCurrent Score: " + this.getCurrentScore();
	}
	

}
