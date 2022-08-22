package csc252;

public class TimeInUseException extends Exception{
	
public TimeInUseException(){
		
		super("ERROR! Selected time slot is already filled. Please try another one.");
	}
	
	public TimeInUseException(String errorMessage2){
		
		super(errorMessage2);
	}
	
	
	
	
	
}
