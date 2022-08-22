package csc252;

public class PinchHitter extends BaseBallPlayer{

	
	public PinchHitter(String playerName, double bAverage, String playerCoach, String coachQuote){
		super(playerName, bAverage, playerCoach, coachQuote);
		//super.getPlayerName();
		//super.getbAverage();
		//super.getPlayerCoach();
		//super.getCoachQuote();
	}
	public PinchHitter(){
	super();

	}

	public double getbAverage(){
		
		return super.getbAverage()+10;
	}
	
public String getCoachQuote(){
			
	return super.getCoachQuote() + " You are doing great! Your batting average is " + getbAverage();
	}
	
	

	public static void main(String[] args) {
		//the variables are initialized in the subclass, not the superclass
		PinchHitter Player1 = new PinchHitter();
		
		Player1.setPlayerName("Jackie Robinson");
		System.out.println(Player1.getPlayerName());
		Player1.setbAverage(0.311);
		System.out.println(Player1.getbAverage());
		Player1.setPlayerCoach("Branch Rickey");
		System.out.println(Player1.getPlayerCoach());
		Player1.setCoachQuote("Failure is not falling down, it is choosing not to get up.");
		System.out.println(Player1.getCoachQuote());
		System.out.println("\n");
		System.out.println(Player1.getbAverage());
		System.out.println(Player1.getCoachQuote());
	}
	
	/**
	Derive a class PinchHitter from BaseballPlayer, as described in the previous exercise. The new
	class should override the accessor method for the batting average, reporting the batting average
	plus 10. It also should override the accessor for the motivational quote, returning the player's
	existing quote concatenated with the words "You are doing great your batting average is " concatenated
	with their current batting average.
	 */	
}
