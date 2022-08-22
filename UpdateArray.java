package csc252;

public class UpdateArray {

	public static void main(String[] args) {
		
		int[][]x;
		x=new int[3][];
		x[0] = new int[4];
		x[1] = new int[5];
		x[2] = new int[6];
		
		x[0][0] = 2;
		x[0][1] = 4;
		x[0][2] = 6;
		x[0][3] = 8;
		
		x[1][0] = 3;
		x[1][1] = 6;
		x[1][2] = 9;
		x[1][3] = 12;
		x[1][4] = 15;

		x[2][0] = 4;
		x[2][1] = 8;
		x[2][2] = 12;
		x[2][3] = 16;
		x[2][4] = 20;
		x[2][5] = 24;
		
		for(int c = 0; c < x.length; c++){
			System.out.print("{");
			for(int d = 0; d < x[c].length-1; d++){
				System.out.print(x[c][d] + ", ");
			}
			System.out.println(x[c][x[c].length-1] + "}");
		}

		
	}

}
