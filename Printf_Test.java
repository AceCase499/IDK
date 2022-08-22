package csc252;

public class Printf_Test {
	
	public static void main(String[] args) {
	
	int i,j,k;
	i = 5;
	j = 4;
	k = i + j;
	
	System.out.println("The addition of " + i + " and " + j + " is " + k);
	System.out.printf("The addition of %d and %d is %d",i,j,k);
	//when referencing a double using printf, limit how many decimal places are displayed using %d.2
	//replace '2' with number of choice
	//decimals will be lost if you calculate a double and an int, since the double will be converted to int after calculation
 }
}