package csc252;
public class TwoDArray {
	
	public static void main (String [] args){
		
		String[][]s = new String[3][2];
		s[0][0]="yarn";
		s[0][1]="hemp";
		s[1][0]="thread";
		s[1][1]="nylon";
		s[2][0]="twine";
		s[2][1]="550cord";
		
		for(int row = 0; row < 3; row++){
			
			for(int col=0; col < 2; col++){
				System.out.println(s[row][col]);
			}
		}
		
	}
}
