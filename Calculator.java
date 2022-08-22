package csc252;
import java.util.Scanner;
public class Calculator{
	
	private double userNum1;
	private String operator;
	private double userNum2;
	private double result;
	
	
	public Calculator(){
		userNum1 = 0;
		userNum2 = 1;
	}	
	
	public Calculator(double userNum1, double userNum2) {
		
		this.userNum1 = userNum1;
		this.userNum2 = userNum2;
	}
	
	public void setNum1(double userNum1) {
		this.userNum1 = userNum1;
}
	public double getNum1() {
		return userNum1;
}
	public void setNum2(double userNum2) {
		this.userNum2 = userNum2;
}
	public double getNum2() {
		return userNum2;
}
	
	public double doMath(userNum1, userNum2){
		
		
		
		return 0;
	}
	
	
	public void makeProblem(){
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter first number to calculate.");
		this.userNum1 = keyboard.nextDouble();
		System.out.println("Enter second number to calculate.");
		this.userNum2 = keyboard.nextDouble();
		System.out.println("");

		
	}
	
	
	
	
	public static void main(String[] args){
		
		
		
	}
}

