package csc252;
import java.util.Scanner;
public class ratioNum {
	
	static int rational;
	private int numer;
	private int denom;
	private double doubleNum;
	private double divideR;

	
	public ratioNum(){
		numer = 0;
		denom = 1;
	}
	
	public ratioNum(int numer, int denom) {
		this.numer = numer;
		this.denom = denom;	
		simplify();
	}
	
	public void setRational(int rational) {
		rational = numer/denom;
}
	public int getRational() {
		return rational;
}
	public void setNumer(int numer) {
		this.numer = numer;
}
	public int getNumer() {
		return numer;
}
	public void setDenom(int denom) {
		this.denom = denom;
}
	public int getDenom() {
		return denom;
}

	public void setRational2(int numer, int denom){
		numer = 4;
		if(denom >= 0){
			this.denom = denom;
		} else{
			System.out.println("ERROR! denominator is less than or equal to 0.");
			System.exit(0);
		}
		
	}
	
	
	public void writeOutput(){
		
		//user enters a fraction's numerator and denominator
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a numerator: ");
		this.numer = keyboard.nextInt();
		System.out.println("Enter a denominator: ");
		this.denom = keyboard.nextInt();
		//tests if the denominator is equal to 0 to avoid errors
		if(denom == 0){
			System.out.println("ERROR! Entered denominator is equal to zero.");
			System.exit(0);
		}
		//prints the user-entered number in a/b form
		System.out.println("The entered number is: " + numer + "/" + denom);
	}
	
	
    
    private static int getGCD(int numer, int denom) {
		int GCD = 1;
    	//finds the GCD between numer and denom using a for loop and int i
		for (int i=denom;i>=1;i--){
		if(numer%i == 0 && denom%i == 0){
			return GCD=i;
		}	
	  }
		return GCD;
	}
    
	private void simplify() {
		//simplifies user-entered number by dividing its numerator and denominator by the GCD
		int ration;
		ration = getGCD(numer, denom);
		numer = numer/ration;
		denom = denom/ration;
	}
    
	
	public void value(){
		//actually divides the numerator and the denominator and prints it in decimal form
		doubleNum = numer;
		divideR = doubleNum/denom;
		
		System.out.print("The simplied form as a decimal is: " + divideR + "\n");
	}
	
	public void result(){
		//prints the user-entered number after numer and denom has been reduced
		System.out.print("The simplied form is: " + numer + "/" + denom + "\n");
	}
	
	
	public boolean equals(ratioNum other){
		//Checks if the user-entered number is equal to the rational number in memory (4/17)
		return ((this.numer == other.numer) && (this.denom == other.denom));
	}
	
	public static void main(String[] args){
		
	Integer ration = new Integer(rational);
	
	//r1 = 0/1 by default, but is changed by the user
	ratioNum r1 = new ratioNum();
	r1.setRational(0/1);
	r1.setNumer(0);
	r1.setDenom(1);
	
	//r2 = 4/17 and stays in memory
	ratioNum r2 = new ratioNum();
	r2.setRational(0/1);
	r2.setNumer(4);
	r2.setDenom(17);
	
	
	r1.writeOutput();
	r1.getGCD(12,4);
	r1.simplify();
	r1.result();
	r1.value();
	
	System.out.println("User entered number is equal to rational number in memory (4/17): " + r1.equals(r2));
		
	}
}

	