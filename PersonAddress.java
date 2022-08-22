package csc252;
import java.util.Scanner;

public class PersonAddress {
	
	private String first;
	private String last;
	private String email;
	private String phone;
	private String response;
	private String choice;
	
	public void setFirst(String first) {
		this.first = first;
}
	public String getFirst() {
		return first;
}
	public void setLast(String last) {
		this.last = last;
}
	public String getLast() {
		return last;
}
	public void setEmail(String email) {
		this.email = email;
}
	public String getEmail() {
		return email;
}
	public void setPhone(String phone) {
		this.phone = phone;
}
	public String getPhone() {
		return phone;
}
	public void setResponse(String response) {
		this.response = response;
}
	public String getResponse() {
		return response;
}
//getters and setters for first, last, email, phone, response, and choice.
	public String displayInfo(){
/**
* Precondition: objects p1, p2, and p3 are given data from the main method and are tested if they are equal to each other.
* Postcondition: the results of the testing of the objects are printed in the console. the data stored in the instance
* variables of the receiving objects is printed in the console. input response from the user is returned to the main method.
*/
		//"String" in 'public String displayInfo()' is needed so the method can return the String variable "response".
			getFirst();
			getLast();
			getEmail();
			getPhone();
			System.out.println(first);
			System.out.println(last);
			System.out.println(email);
			System.out.println(phone + "\n");
			System.out.print("Is this information correct? Enter 'yes' or 'no': ");
			Scanner keyboard = new Scanner(System.in);
			response = keyboard.nextLine();
			if(response.equals("yes")){
				System.out.println("Welcome, " + first + " " + last + "!");
				System.exit(0);
			}
			if(response.equals ("no")){
				return response;
			}
			while((!(response.equals("yes"))) && (!(response.equals("no")))) {
				System.out.print("ERROR! Please enter 'yes' or 'no' using small cases. ");
				System.exit(0);
			}
			return response;
		}

public boolean equals (PersonAddress otherPerson) {
	/**
	* Precondition: objects p1, p2, and p3 are given data from the main method and are tested if they are equal to each other.
	* Postcondition: the results of the testing of the objects are saved in memory.
	*/
	return (this.first.equals(otherPerson.first) && this.last.equals(otherPerson.last));
	
}

	public void change() {
		/**
		 * Precondition: private String variable 'response' entered by the user is 'no'.
		 * Postcondition: user enters 'first', 'last', 'email', or 'phone', which is given to private String variable 'choice'.
		 * then they overwrite one of the four variables.
		 */
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please choose a category to change. Please do not use capital letters.");
		System.out.println("Choose from: first, last, email, or phone.");
		choice = keyboard.nextLine();
//Here, the user can input the category of info they want changed, and change it. Afterwards, the updated PersonAddress is displayed.
		switch (choice) {
		case "first":
			System.out.print("Choose a new first name: ");
			this.first = keyboard.nextLine();
			if(!(this.first.equals (first))) {
				System.out.println("New first name is " + first + ".");
			} else {
				System.out.println("Entered name matches the old one.");
			}
			break;
		case "last":
			System.out.print("Choose a new last name: ");
			this.last = keyboard.nextLine();
			if(this.last == last) {
				System.out.println("Entered name matches the old one.");
			} else {
				System.out.print("New last name is " + last + ".");
			}
			break;
		case "email":
			System.out.print("Choose a new e-mail address: ");
			this.email = keyboard.nextLine();
			if(this.email == email) {
				System.out.println("Entered email matches the old one.");
			}
			break;
		case "phone":
			System.out.print("Choose a new phone number: ");
			this.phone = keyboard.nextLine();
			if((!(this.phone.length() == 7)) && (!(this.phone.length() == 10))) {
			System.out.println("Invalid phone number.  Please try again.\n");
			change();
			}
			break;
//The entered phone number must be 7 or 10 digits long, or else the method is called again.
		default:
			System.out.println("Input unrecognized. Please try again.\n");
			change();
		}
		
	}
	
public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);

	PersonAddress p1 = new PersonAddress();
	p1.setFirst("Jerrod");
	p1.setLast("Graham");
	p1.setEmail("grahamj586@strose.edu");
	p1.setPhone("9179218022");
	
	PersonAddress p2 = new PersonAddress();
	p2.setFirst("Jerrod");
	p2.setLast("Graham");
	p2.setEmail("grahamj586@strose.edu");
	p2.setPhone("9179218022");
	//sets new "PersonAddress" object with default info of Jerrod, Graham, grahamj586@strose.edu, 9179218022.
	System.out.println("result of equals method " + p1.equals(p2));
	
	PersonAddress p3 = new PersonAddress();
	p3.setFirst("robert");
	p3.setLast("stevens");
	p3.setEmail("grahamj586@strose.edu");
	p3.setPhone("9179218022");
	//sets new "PersonAddress" object with default info of Jerrod, Graham, grahamj586@strose.edu, 9179218022.
	
	System.out.println("result of equals method " + p1.equals(p3));
	p1.displayInfo();
	
while(!(p1.response.equals ("yes"))) {
	p1.change();
	p1.displayInfo();
}

/*Step 1: Display default info and ask the user if the info is correct. 
 * If no, move to Step 2, if yes, move to Step 4, if something else is entered, the method will ask again until "yes" or "no" is entered.
 *Step 2: open method change(), where the user can choose a category and change it to their liking. Afterwards, move to Step 3.
 *Step 3: display the updated info and again ask the user if the info is correct. If no, move back to Step 2.
 *This application cycles through steps 1-3 repeatedly until the user enters "yes" when asked if the info is correct. Then move to Step 4.
 *Step 4: Welcome the user using the first and last name they entered.
 */
	
 }
}