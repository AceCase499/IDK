//package csc252;
import java.util.Scanner;
public class Appointments {
	
	String fullName;
	static boolean schedEmpty = true;
	String timeChoice;	
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getTimeChoice() {
		return timeChoice;
	}
	public void setTimeChoice(String timeChoice) {
		this.timeChoice = timeChoice;
	}



	public void makeAppointment(String schedule[][]){ //throws InvalidTimeException, TimeInUseException{
		
		if((schedule[0][1] != "-Enter name-") && (schedule[1][1] != "-Enter name-") && 
		   (schedule[2][1] != "-Enter name-") && (schedule[3][1] != "-Enter name-") &&
		   (schedule[4][1] != "-Enter name-") && (schedule[5][1] != "-Enter name-")){
			
			System.out.print("\n\nAll time slots are full.");
			System.exit(0);
		}		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("\nPlease enter an appointment time between 1:00-6:00 in 12 hour format. Enter 'none' when finished. ");
		timeChoice = keyboard.nextLine();
		
		try{
		switch(timeChoice){
		case "1:00":
			System.out.print("Please enter your name: ");
			fullName = keyboard.nextLine();
			if((schedule[0][1] != "-Enter name-")){
				throw new TimeInUseException("Sorry! This time slot is filled.\nPlease select another, if they are any left.\n");
			}
			schedule[0][1] = this.fullName;
			break;
		case "2:00":
			System.out.print("Please enter your name: ");
			fullName = keyboard.nextLine();
			if((schedule[1][1] != "-Enter name-")){
				throw new TimeInUseException("Sorry! This time slot is filled.\nPlease select another, if they are any left.\n");
			}
			schedule[1][1] = this.fullName;
			break;
		case "3:00":
			System.out.print("Please enter your name: ");
			fullName = keyboard.nextLine();
			if((schedule[2][1] != "-Enter name-")){
				throw new TimeInUseException("Sorry! This time slot is filled.\nPlease select another, if they are any left.\n");
			}
			schedule[2][1] = this.fullName;
			break;
		case "4:00":
			System.out.print("Please enter your name: ");
			fullName = keyboard.nextLine();
			if((schedule[3][1] != "-Enter name-")){
				throw new TimeInUseException("Sorry! This time slot is filled.\nPlease select another, if they are any left.\n");
			}
			schedule[3][1] = this.fullName;
			break;
		case "5:00":
			System.out.print("Please enter your name: ");
			fullName = keyboard.nextLine();
			if((schedule[4][1] != "-Enter name-")){
				throw new TimeInUseException("Sorry! This time slot is filled.\nPlease select another, if they are any left.\n");
			}
			schedule[4][1] = this.fullName;
			break;
		case "6:00":
			System.out.print("Please enter your name: ");
			fullName = keyboard.nextLine();
			if((schedule[5][1] != "-Enter name-")){
				throw new TimeInUseException("Sorry! This time slot is filled.\nPlease select another, if they are any left.\n");
			}
			schedule[5][1] = this.fullName;
			break;
		case "none":
			System.out.print("Shutting down. Have a nice day!");
			System.exit(0);

		default:
			throw new InvalidTimeException("ERROR! '" + this.timeChoice + "' is not a valid time. Please try again.\n");
		}
	}
		catch(Exception InvalidTimeException){
			
			System.out.println(InvalidTimeException.getMessage());
			
		}			

	}
	
	
	public static void main(String[] args) {
		
		Appointments Tester;

		String[][] schedule = new String[6][2];
		schedule[0][0] = "1:00";
		schedule[0][1] = "-Enter name-";
		schedule[1][0] = "2:00";
		schedule[1][1] = "-Enter name-";
		schedule[2][0] = "3:00";
		schedule[2][1] = "-Enter name-";
		schedule[3][0] = "4:00";
		schedule[3][1] = "-Enter name-";
		schedule[4][0] = "5:00";
		schedule[4][1] = "-Enter name-";
		schedule[5][0] = "6:00";
		schedule[5][1] = "-Enter name-";
		
		
		while(schedEmpty = true){
			
			for(int row = 0; row < 6; row++){
				
				for(int col=0; col < 2; col++){
					System.out.print(schedule[row][col] + " ");
				}
			}
		//	try {
				Tester = new Appointments();
				Tester.makeAppointment(schedule);
			/*} catch (InvalidTimeException e) {
				//e.printStackTrace();
				System.out.println("Time entered was not formatted properly.");
				System.out.println("Please enter a time between 1:00 and 6:00");
			} catch (TimeInUseException r) {
				//r.printStackTrace();
				System.out.println("That appointment time is already taken please try another");
			}*/
			
		}

	}
	
}

