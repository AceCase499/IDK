package csc252;
public class BaseBallPlayer {
	
	private String playerName;
	private double bAverage;
	private String playerCoach;
	private String coachQuote;
	// /!\ make the argument name different from the static variable
	// /!\ instead of making static variables to fix an error, try creating an object
	
	//arg constructor
	public BaseBallPlayer(String playerName, double bAverage, String playerCoach, String coachQuote){
		
		this.playerName = playerName;
		this.bAverage = bAverage;
		this.playerCoach = playerCoach;
		this.coachQuote = coachQuote;

	}
	//default constructor
	public BaseBallPlayer(){
		

	}
	
	public void setPlayerName(String player){
		playerName = "Jackie Robinson";
	}
	
	public String getPlayerName() {
		
		return playerName;
	}
	
	public void setbAverage(double batAverage){
		bAverage = batAverage;
	}
	
	public double getbAverage() {
		
		return bAverage;
	}
	
	
	public void setPlayerCoach(String coach){
		playerCoach = coach;
	}
	
	public String getPlayerCoach() {
		
		return playerCoach;
	}
	
	public void setCoachQuote(String quote){
		coachQuote = quote;
	}
	
	public String getCoachQuote() {
		
		return coachQuote;
	}
	
	
	public static void main(String[] args) {
		
		System.out.print("This class can compile.");
		
	}
	
/**
 * Draw the appropriate UML Inheritance Diagram.
Create a class BaseballPlayer that is the base class for a Major League Baseball player.
It should have attributes for the player's name and batting average, the name of the player's
coach, and a motivational quote from their coach. It should have appropriate accessor and mutator
methods for each of the attributes.

Derive a class PinchHitter from BaseballPlayer, as described in the previous exercise. The new
class should override the accessor method for the batting average, reporting the batting average
plus 10. It also should override the accessor for the motivational quote, returning the player's
existing quote concatenated with the words "You are doing great your batting average is " concatenated
with their current batting average.

 */	
	
}
