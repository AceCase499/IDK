package csc252;
import java.util.Scanner;
import java.io.*;
public class ContactInfo{
	
	String Bphone;
	String Hphone;
	String Cphone;
	String name;
	String email;
	String address;
	
	String aString;
	
	public ContactInfo(String astring){
		
		aString= "Crash Bandicoot"
				+ "Somewhereland, Earth#"
				+ "CRATESMASH909@gmail.com#"
				+ "978-300-1823#"
				+ "908-342-8654#"
				+ "789-034-3458\n"
				+ "Charlie Brown#"
				+ "Hennepin County, Minnesota#"
				+ "chuckB004@gmail.com#"
				+ "849-205-0042#"
				+ "849-205-0042#"
				+ "789-458-4523\n"
				+ "Spongebob Squarepants#"
				+ "63 Kelp Ave, Bikini Bottom#"
				+ "masterjellyfisher5@gmail.com#"
				+ "753-489-4052#"
				+ "229-384-7293#"
				+ "229-894-8541\n"
				+ "Fred Flintstone#"
				+ "301 Cobblestone Way, Bedrock#"
				+ "rockman60@gmail.com#"
				+ "899-393-4633#"
				+ "743-922-5704#"
				+ "098-033-1765\n";
		
		ContactInfo S = new ContactInfo("");
		
		String[]hold = new String [50];
		hold[0] = "aString";
		String[]hold = aString.split("#");
		
		
	}
	


	public String getBphone() {
		return Bphone;
	}
	public void setBphone(String bphone) {
		this.Bphone = bphone;
	}
	public String getHphone() {
		return Hphone;
	}
	public void setHphone(String hphone) {
		this.Hphone = hphone;
	}
	public String getCphone() {
		return Cphone;
	}
	public void setCphone(String cphone) {
		this.Cphone = cphone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	public String toString(){
		
		
		return 	name + " " + address  + " " + email  + " " + Cphone  + " " + Bphone  + " " + Hphone;
		
	}
	
	
	
	public void createFile() throws FileNotFoundException{
		
		
		try {
			File newFile = new File("personInfo.txt");
			/*FileWriter infoWriter;
			infoWriter = new FileWriter("personInfo.txt");*/
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.print("ERROR. File not found.");
		}
		catch (IOException e) {
			e.printStackTrace();
			System.out.print("ERROR. Unexpected error.");
		}
		PrintWriter outputFile = new PrintWriter(infoWriter);
		
	}
	
	
	public String writeDefaultData(){
		
		try {
			FileWriter infoWriter = new FileWriter("personInfo.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(toString());
		
		
		return "The file has been written.";
	}
	
	
	
	public void editContact(){
		
		Scanner keyboard = new Scanner(System.in);
		Scanner inputFile = new Scanner(newFile);
		
		System.out.print("Enter a new name: ");
		this.name = keyboard.nextLine();
		System.out.print("Enter a new address: ");
		this.address = keyboard.nextLine();
		System.out.print("Enter a new email: ");
		this.email = keyboard.nextLine();
		System.out.print("Enter a new cell phone number: ");
		this.Cphone = keyboard.nextLine();
		System.out.print("Enter a new business phone number: ");
		this.Bphone = keyboard.nextLine();
		System.out.print("Enter a new home phone number: ");
		this.Hphone = keyboard.nextLine();
		
		
		System.out.println("Edit complete!\n");
		inputfile.close();
	}
	
	
	public void addContact(){
		Scanner keyboard = new Scanner(System.in);

		ContactInfo c5 = new ContactInfo("");
		
		System.out.print("Enter a new name: ");
		this.name = keyboard.nextLine();
		System.out.print("Enter a new address: ");
		this.address = keyboard.nextLine();
		System.out.print("Enter a new email: ");
		this.email = keyboard.nextLine();
		System.out.print("Enter a new cell phone number: ");
		this.Cphone = keyboard.nextLine();
		System.out.print("Enter a new business phone number: ");
		this.Bphone = keyboard.nextLine();
		System.out.print("Enter a new home phone number: ");
		this.Hphone = keyboard.nextLine();
		
		
	}
	
	
	public void eraseContact() {
		
		this.name = "-blank-";
		this.address = "-blank-";
		this.email = "-blank-";
		this.Cphone = "-blank-";
		this.Bphone = "-blank-";
		this.Hphone = "-blank-";
		
	}
	

	public static void main(String[] args) throws IOException{
		
		Scanner keyboard = new Scanner(System.in);
		
		PrintWriter outputFile = new PrintWriter("PersonInfo");
		
		ContactInfo C = new ContactInfo("");
		
		
		
		C.setName("Crash Bandicoot");
		C.setAddress("Somewhereland, Earth");
		C.setEmail("CRATESMASH909@gmail.com");
		C.setCphone("9783001823");
		C.setBphone("9083428654");
		C.setHphone("7890343458");
		
		System.out.println(C);
		
		String namei = C.getName();
		String adressi = C.getAddress();
		String emaili = C.getEmail();
		String Cphonei = C.getCphone();
		String Bphonei = C.getBphone();
		String Hphonei = C.getHphone();
		
		
		C.createFile();
		C.writeDefaultData();
		
			
			System.out.println("What would you like to do?\n"
					+ "Enter 'edit' to edit a contact.\n"
					+ "Enter 'add' to add a new contact.\n"
					+ "Enter 'erase' to erase a contact.\n"
					+ "Enter 'quit to to nothing and exit.'");

		  String userChoice = keyboard.next();
			
			switch(userChoice){
			
			case "edit":
					C.editContact();
			case "add":
				C.addContact();
				break;
			case "erase":
				System.out.println("Select a contact to erase: 1, 2, 3, or 4.");
				
			case "quit":
				System.out.println("Shutting down.");
				System.exit(0);
			}
			
			
			//<replace old data with new data by appending to the file here>
			//<the file will be closed here>
			
			
		}
		
	}
	/* Write a class ContactInfo to store contact information for a person. It should have attributes
	   for a person's name, business phone, home phone, cell phone, email address, and home address.
	   It should have a toString method that returns this data as a string, making appropriate
	   replacements for any attributes that do not have values. It should have a constructor
	   ContactInfo(aString) that creates and returns a new instance of the class, using data in the
	   string aString. The constructor should use a format consistent with what the toString method
	   produces. Using a text editor, create a text file of contact information, as described in the
	   previous paragraph, for several people. Write a program that reads this file, displays the
	   data on the screen, and creates an array whose base type is ContactInfo. Allow the user to do
	   one of the following: change some data in one contact, add a contact, or delete a contact.
	   Finally, write over the file with the modified contacts. Make your own exception that gets
	   thrown if the file is not formatted properly one such case is if you do not have the required
	   number of fields or too many fields or there are no pound signs # between the data. (Pick what
	   type of exception you want to have and explain in comments.) Be sure to use useful variable
	   names and comment your code.
	 */
