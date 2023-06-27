import java.util.Scanner;
public class VoteRecorder {
	static String prezCandName1;
	static String prezCandName2;
	static String vpCandName1;
	static String vpCandName2;
	static int prezVotes1;
	static int prezVotes2;
	static int vpVotes1;
	static int vpVotes2;
	
	public static void setCandidatesPresident(String newName1, String newName2){VoteRecorder.prezCandName1 = newName1;VoteRecorder.prezCandName2 = newName2;}
	public static void setCandidatesVicePresident(String newName1, String newName2){VoteRecorder.vpCandName1 = newName1;VoteRecorder.vpCandName2 = newName2;}
	public static String getCurrentVotePresident(){return "Votes for " + prezCandName1 +": " + prezVotes1 + "\nVotes for " + prezCandName2+": " + prezVotes2;}
    public static String getCurrentVoteVicePresident(){return "Votes for " + vpCandName1 +": " + vpVotes1 + "\nVotes for " + vpCandName2+": " + vpVotes2;}

    public static void resetVotes(){prezVotes1 = 0;prezVotes2 = 0;vpVotes1 = 0;vpVotes2 = 0;}
    
    private static int recordVotePrezCand1(){prezVotes1++;return prezVotes1;}
    private static int recordVotePrezCand2(){prezVotes2++;return prezVotes2;}
    private static int recordVoteVPcand1(){vpVotes1++;return vpVotes1;}
    private static int recordVoteVPcand2(){vpVotes2++;return vpVotes2;}
    
    public Boolean confirmVote(String choice) {
    	Scanner keyboard = new Scanner(System.in);
    	System.out.printf("Your vote is for %s. Is this correct? (Enter 'yes' or 'no'.)%n", choice);
	     return keyboard.next().equals("yes");}
    
	public void castPrezVote(){
		Boolean validInput = false;
		Scanner keyboard = new Scanner(System.in);
		while (!validInput) {
			try{
				System.out.printf("Enter your vote for President. (1 for %s, 2 for %s, 0 for neither.)%n", prezCandName1, prezCandName2);
				String choiceInput = keyboard.nextLine();
				switch(choiceInput){
				case "1":
					if(this.confirmVote(prezCandName1)) {
						recordVotePrezCand1();
						System.out.println("Input Confirmed: Your vote was recorded."); validInput = true;}
					break;
				case "2":
					if(this.confirmVote(prezCandName2)) {
						recordVotePrezCand2();
						System.out.println("Input Confirmed: Your vote was recorded."); validInput = true;}
					break;
				case "0":
					if(this.confirmVote("-No one-")) {
						System.out.println("Input Confirmed: No new votes recorded."); validInput = true;}
					break;
				default:
					System.out.println("Input not recognized. Enter 1, 2, or 0.");}}
			catch(java.util.InputMismatchException badInput) {
				System.out.println("Input not recognized. Enter 1, 2, or 0.");}} keyboard.close();}
	
	public void castVPvote() {
		Boolean validInput = false;
		Scanner keyboard = new Scanner(System.in);
		while (!validInput) {
			try {
				System.out.printf("Enter your vote for VICE President. (1 for %s, 2 for %s, 0 for neither.)%n", vpCandName1, vpCandName2);
				String choiceInput = keyboard.nextLine();
				switch(choiceInput){
				case "1":
					if(this.confirmVote(vpCandName1)) {
						recordVoteVPcand1();
						System.out.println("Input Confirmed: Your vote was recorded."); validInput = true;}
					break;
				case "2":
					if(this.confirmVote(vpCandName2)) {
						recordVoteVPcand2();
						System.out.println("Input Confirmed: Your vote was recorded."); validInput = true;}
					break;
				case "0":
					if(this.confirmVote("-No one-")) {
						System.out.println("Input Confirmed: No new votes recorded."); validInput = true;}
					break;
				default:
					System.out.println("Input not recognized. Enter 1, 2, or 0.");}}
			catch(java.util.InputMismatchException badInput) {
				System.out.println("Input not recognized. Enter 1, 2, or 0.");}}
	keyboard.close();}

public static void main(String[] args) {
    VoteRecorder.setCandidatesPresident("Mark", "Allie");
    VoteRecorder.setCandidatesVicePresident("Frank", "Grace");
    VoteRecorder.resetVotes();
    boolean moreVotes = true;
    Scanner keyboard = new Scanner(System.in);

    while(moreVotes){
        VoteRecorder newVoter = new VoteRecorder();
        newVoter.castPrezVote();
        newVoter.castVPvote();
        System.out.println("Enter 'yes' to cast a vote. Enter something else to exit.");
        moreVotes = keyboard.next().equals("yes");
    }
    System.out.println(VoteRecorder.getCurrentVotePresident());
    System.out.println(VoteRecorder.getCurrentVoteVicePresident());
    keyboard.close();}}
