package csc252;

public class InvalidTimeException extends Exception{
	
	public InvalidTimeException(){
		
		super("ERROR! Entered time is not valid. Please try again.");
	}
	
	public InvalidTimeException(String errorMessage1){
		
		super(errorMessage1);
	}
}