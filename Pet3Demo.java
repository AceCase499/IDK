package csc252;
public class Pet3Demo {
	public static void main(String[] args) {
		
		Pet3 p1 = new Pet3();
		Pet3.owner = "person";
		p1.writeOutput();
		p1.setName("dog");
		p1.setAge(2);
		p1.setWeight(15);
		p1.writeOutput();
		Pet3 p2 = new Pet3("cat", 5, 20);
		p2.writeOutput();
		System.out.println("Are the 2 pets the same? " + p1.equals(p2));
		Pet3 p3 = new Pet3();
		p3.setName("cat");
		p3.setAge(5);
		p3.setWeight(20);
		p3.writeOutput();
		System.out.println("Are the 2 pets the same? " + p3.equals(p2));
	}
}
