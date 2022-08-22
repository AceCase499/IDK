package csc252;
import java.util.Scanner;
public class VoteRecorder {
	
	static String nameCandidatePresident1;
	static String nameCandidatePresident2;
	static String nameCandidateVicePresident1;
	static String nameCandidateVicePresident2;
	static int canPresVotes1;
	static int canPresVotes2;
	static int canViPresVotes1;
	static int canViPresVotes2;
	static int myVoteForPresident;
	static int myVoteForVicePresident;
	static String presVoteChoice;
	static String viPresVoteChoice;
	
	
	public static void setCandidatesPresident(String nameCandidatePresident1, String nameCandidatePresident2){
		nameCandidatePresident1 = "Annie";
		nameCandidatePresident2 = "Bob";
	}
	public static void setCandidatesVicePresident(String nameCandidateVicePresident1, String nameCandidateVicePresident2){
		nameCandidateVicePresident1 = "John";
		nameCandidateVicePresident2 = "Susan";
	}
	
	public static String getCurrentVotePresident() {
		
		return "Votes for Annie: " + canPresVotes1 + "    " + "Votes for Bob: " + canPresVotes2;
	}
	
    public static String getCurrentVoteVicePresident() {
    	
		return "Votes for John: " + canViPresVotes1 + "    " + "Votes for Susan: " + canViPresVotes2;
	}

	
    public static void resetVotes(){
    	canPresVotes1 = 0;
		canPresVotes2 = 0;
		canViPresVotes1 = 0;
		canViPresVotes2 = 0;
    }
    
    
    private static int recordVotes(){
		
		canPresVotes1++;
		return canPresVotes1;
}
    private static int recordVotes2(){
		
		canPresVotes2++;
		return canPresVotes2;
}
    private static int recordVotes3(){
	
	    canViPresVotes1++;
	    return canViPresVotes1;
}
    private static int recordVotes4(){
	
    	canViPresVotes2++;
    	return canViPresVotes2;
}
    
    
public static void getAndConfirmVotes(){
	Scanner keyboard = new Scanner(System.in);
	//user votes for president
	System.out.println("Enter your vote for President. (1 for Annie, 2 for Bob, 0 for neither.)");
	myVoteForPresident = keyboard.nextInt();
	keyboard.nextLine();
	
	switch(myVoteForPresident){
	
	case 0:
	     System.out.println("Your vote is for no one. Is this correct? (Enter 'yes' or 'no'.)");
	     presVoteChoice = keyboard.nextLine();
	     if(presVoteChoice.equals("yes")){
	    	 System.out.println("No vote entered...\n");
	    	 break;
	     }
	     if(presVoteChoice.equals("no")){
	    	 System.out.print("Your vote was discarded. Please enter a new one.");
	    	 System.exit(0);
	     }
	     if((!(presVoteChoice.equals("yes"))) || (!(presVoteChoice.equals("no")))){
	    	 keyboard.nextLine();
	    	 System.out.print("Input unrecognized. Please try again(from case 0).");
	    	 System.exit(0);
	     }  
	     break;
	     
	case 1:
		System.out.println("Your vote is for Annie. Is this correct? (Enter 'yes' or 'no'.)");
		presVoteChoice = keyboard.nextLine();
		if(presVoteChoice.equals("yes")){
	    	 System.out.println("Your vote has been entered.\n");
	    	 recordVotes();
	     }
	     if(presVoteChoice.equals("no")){
	    	 System.out.println("Your vote was discarded. Please enter a new one.");
	    	 System.exit(0);
	     }
	     if((!(presVoteChoice.equals("yes"))) && (!(presVoteChoice.equals("no")))){
	    	 System.out.print("Input unrecognized, vote discarded. Please reenter vote.");
	    	 System.exit(0);
	     }  
	     break;
	case 2:
		System.out.println("Your vote is for Bob. Is this correct? (Enter 'yes' or 'no'.)");
		presVoteChoice = keyboard.nextLine();
		if(presVoteChoice.equals("yes")){
	    	 System.out.println("Your vote has been entered.\n");
	    	 recordVotes2();
	     }
	     if(presVoteChoice.equals("no")){
	    	 System.out.println("Your vote was discarded. Please enter a new one.");
	    	 System.exit(0);
	     }
	     if((!(presVoteChoice.equals("yes"))) && (!(presVoteChoice.equals("no")))){
	    	 System.out.println("Input unrecognized. Please try again(from case 2).");
	    	 System.exit(0);
	     }
	     break;
	default:
		if((!(presVoteChoice.equals(0))) && (!(presVoteChoice.equals(1))) && (!(presVoteChoice.equals(2)))){
			System.out.println("Input unrecognized. Please try again(from default).");
	   	    System.exit(0);
		}
	}

	//user votes for vice president
		System.out.println("Enter your vote for Vice President. (1 for John, 2 for Susan, 0 for neither.)");
		myVoteForVicePresident = keyboard.nextInt();
		keyboard.nextLine();
		
		switch(myVoteForVicePresident){
		
		case 0:
		     System.out.println("Your vote is for no one. Is this correct? (Enter 'yes' or 'no'.)");
		     viPresVoteChoice = keyboard.nextLine();
		     if(viPresVoteChoice.equals("yes")){
		    	 System.out.println("No vote entered...\n");
		    	 break;
		     }
		     if(viPresVoteChoice.equals("no")){
		    	 System.out.println("Your vote was discarded. Please enter a new one.");
		    	 System.exit(0);
		     }
		     if((!(viPresVoteChoice.equals("yes"))) || (!(viPresVoteChoice.equals("no")))){
		    	 System.out.print("Input unrecognized. Please try again.(from case 0)");
		    	 System.exit(0);
		     }  
		     break;
		     
		case 1:
			System.out.println("Your vote is for John. Is this correct? (Enter 'yes' or 'no'.)");
			viPresVoteChoice = keyboard.nextLine();
			if(viPresVoteChoice.equals("yes")){
		    	 System.out.println("Your vote has been entered...\n\n");
		    	 recordVotes3();
		    	 break;
		     }
		     if(viPresVoteChoice.equals("no")){
		    	 System.out.println("Your vote was discarded. Please enter a new one.");
		    	 System.exit(0);
		     }
		     if((!(viPresVoteChoice.equals("yes"))) || (!(viPresVoteChoice.equals("no")))){
		    	 System.out.print("Input unrecognized. Please try again.(from case 1)");
		    	 System.exit(0);
		     }  
		     break;
		 		
		case 2:
			System.out.println("Your vote is for Susan. Is this correct?");
			viPresVoteChoice = keyboard.nextLine();
			if(viPresVoteChoice.equals("yes")){
		    	 System.out.println("Your vote has been entered...\n\n");
		    	 recordVotes4();
		    	 break;
		     }
		     if(viPresVoteChoice.equals("no")){
		    	 System.out.println("Your vote was discarded. Please enter a new one.");
		    	 System.exit(0);
		     }
		     if((!(viPresVoteChoice.equals("yes"))) && (!(viPresVoteChoice.equals("no")))){
		    	 System.out.print("Input unrecognized. Please try again.(from case 2)");
		    	 System.exit(0);
		     }
		     break;
		default:
			System.out.print("Input unrecognized. Please try again.");
			System.exit(0);
		}
    }
	
	

public static void main(String[] args) {
    VoteRecorder.setCandidatesPresident("Annie", "Bob");
    VoteRecorder.setCandidatesVicePresident("John", "Susan");
    VoteRecorder.resetVotes();

    boolean moreVotes = true;

    while(moreVotes){
        VoteRecorder aVoter = new VoteRecorder();
        aVoter.getAndConfirmVotes();
        System.out.println("Type yes if there is another voter");
        Scanner keyboard = new Scanner(System.in);
        moreVotes = keyboard.next().equals("yes");

    }

    System.out.println(VoteRecorder.getCurrentVotePresident());
    System.out.println(VoteRecorder.getCurrentVoteVicePresident());
  }

}
