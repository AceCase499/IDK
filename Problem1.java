public class Problem1 {

	public static void main(String[] args) {
		
		int[]plain = new int[10];
		plain[0] = 1;
		plain[1] = 2;
		plain[2] = 3;
		plain[3] = 4;
		plain[4] = 5;
		plain[5] = 6;
		plain[6] = 7;
		plain[7] = 8;
		plain[8] = 9;
		plain[9] = -1;
		
		for(int a = 0; a < plain.length; a++){
			System.out.print(plain[a] +" ");

		}
		System.out.print("\n");
		
		System.out.println("ascending");
		int[]asc = new int[10];
		asc[0] = 23;
		asc[1] = 19;
		asc[2] = 17;
		asc[3] = 13;
		asc[4] = 11;
		asc[5] = 7;
		asc[6] = 5;
		asc[7] = 3;
		asc[8] = 2;
		asc[9] = -1;
		
		for(int b = 0; b < asc.length; b++){
			System.out.print(asc[b] +" ");

		}
		System.out.print("\n");

		System.out.println("descending");

		int[]dec = new int[9];
		dec[0] = 4;
		dec[1] = 5;
		dec[2] = 6;
		dec[3] = 7;
		dec[4] = 8;
		dec[5] = 9;
		dec[6] = 3;
		dec[7] = 18;
		dec[8] = -1;
		
		for(int c = 0; c < dec.length; c++){
			System.out.print(dec[c] +" ");

		}
		System.out.print("\n");
		
		System.out.println("neither");
		System.out.print(-1);

	}

}
