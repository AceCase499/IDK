package csc252;

public class PolymorhpismDemo {
	
	public static void main(String[] args) {
		
		Person[] people = new Person[4];
		people[0] = new Undergraduate("Cotty, Manny", 4910, 1);
		people[1] = new Undergraduate("Kick, Anita", 9931, 2);
		people[2] = new Student("DeBanque, Robin", 8812);
		people[3] = new Undergraduate("Bugg, June", 9901, 4);
		//undergraduate u = (Undergraduate)people[0];
		//undergraduate u1 = (Undergraduate)people[1];
		//people[0].equals(people[0]);
		
		testEquals(people[0], people[1]);
		
		for (Person p : people){
		
			p.writeOutput();
			System.out.println();
		}

	}
	
public static void testEquals(Person u, Person u1){
		
		if(u.equals(u1)){
			System.out.print("It is equal\n\n");
		} else {
			System.out.print("It is not equal\n\n");
		}
	}
}
