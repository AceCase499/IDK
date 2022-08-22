package csc252;
public class CompareArray {
	
	static int v = 3;
	
	public static int[] remove(int v, int[]numbers){

		int[] newArray = new int[8];
		
		System.out.print("{");

		for(int r = 0; r < numbers.length; r++){
			if((numbers[r] != v)){
				
				System.out.print(numbers[r] + ",");
			}
		}
		System.out.println("}");

		return newArray;
	}
	
	
	
	
	public static void removeDuplicates(char[] letters, char[] alphabet, int[] countRepeat){
		//char[]letters = {'a', 'a', 'a', 'b', 'b', 'd', 'f', 'f', 'g'};
		//new array has to be 5 elements long
		
		System.out.print("'letters' array is: \n{");
		for(int b = 0; b < letters.length; b++){
			System.out.print(letters[b] +", ");

		}
		System.out.print("} \n");
		
		System.out.println("'letters' array without redundant characters is:");
		
		for(int c = 0; c < letters.length; c++){
			
			for(int q = 0; q < alphabet.length; q++){
				if(letters[c] == alphabet[q]){
					countRepeat[q]++;
				}
			}
			
		}
		System.out.print("{");
		for(int g = 0; g < countRepeat.length; g++){
			
			if(countRepeat[g] > 0){
				System.out.print(alphabet[g] + ", ");
			}
			
		}
		System.out.print("}");

		
	}
	
	
	public static boolean isStrictlyIncreasing(double[]compare){
		
		for(int y = 1; y < compare.length-1; y++){
		//compare.length-1 is the number of positions array compare[] has minus 1.
			if(compare[y-1] >= compare[y]){
				return false;
			}
		}
		return true;
	}
	
	
	public static void main (String[] args){
		
		double[]compare = new double[6];
		compare[0] = 2.2;
		compare[1] = 2.9;
		compare[2] = 3.4;
		compare[3] = 5.2;
		compare[4] = 8.3;
		compare[5] = 10.9;
		
		char[]letters = {'a', 'a', 'a', 'b', 'b', 'd', 'f', 'f', 'g'};
		
		char[]alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		int[]countRepeat = new int [26];
		countRepeat[0] = 0;
		countRepeat[1] = 0;
		countRepeat[2] = 0;
		countRepeat[3] = 0;
		countRepeat[4] = 0;
		countRepeat[5] = 0;
		countRepeat[6] = 0;
		countRepeat[7] = 0;
		countRepeat[8] = 0;
		countRepeat[9] = 0;
		countRepeat[10] = 0;
		countRepeat[11] = 0;
		countRepeat[12] = 0;
		countRepeat[13] = 0;
		countRepeat[14] = 0;
		countRepeat[15] = 0;
		countRepeat[16] = 0;
		countRepeat[17] = 0;
		countRepeat[18] = 0;
		countRepeat[19] = 0;
		countRepeat[20] = 0;
		countRepeat[21] = 0;
		countRepeat[22] = 0;
		countRepeat[23] = 0;
		countRepeat[24] = 0;
		countRepeat[25] = 0;

		int[]numbers = new int[8];
		numbers[0] = 0;
		numbers[1] = 1;
		numbers[2] = 3;
		numbers[3] = 2;
		numbers[4] = 3;
		numbers[5] = 0;
		numbers[6] = 3;
		numbers[7] = 1;
		
		
		System.out.print("Each value inside the array is greater than the one before: ");
		System.out.print(CompareArray.isStrictlyIncreasing(compare));
		System.out.print("\n\n");
		
		CompareArray.removeDuplicates(letters, alphabet, countRepeat);
		System.out.print("\n\n");
		

		System.out.println("'numbers' array is:");
		System.out.print("{" + numbers[0] + ",");
		System.out.print(numbers[1] + ",");
		System.out.print(numbers[2] + ",");
		System.out.print(numbers[3] + ",");
		System.out.print(numbers[4] + ",");
		System.out.print(numbers[5] + ",");
		System.out.print(numbers[6] + ",");
		System.out.println(numbers[7] + "}");
		System.out.println("'numbers' array with value " + v + " removed:");
		CompareArray.remove(v, numbers);
				
		
	}
	
	/**
	 * 
    -Write a static method isStrictlyIncreasing(double[] in) that returns true if each
    value in the given array is greater than the value before it, or false otherwise.
    -Write a static method removeDuplicates(Character[] in) that returns a new array
    of the characters in the given array, but without any duplicate characters. Always
    keep the first copy of the character and remove subsequent ones. For example, if in
    contains b, d, a, b, f, a, g, a, a, and f, the method will return an array containing
    b, d a, f, and g. Hint: One way to solve this problem is to create a boolean array of
    the same size as the given array in and use it to keep track of which characters to
    keep. The values in the new boolean array will determine the size of the array to return.
    -Write a static method remove(int v, int[] in) that will return a new array of the integers
    in the given array, but with the value v removed. For example, if v is 3 and in contains
    0, 1, 3, 2, 3, 0, 3, and 1, the method will return an array containing 0, 1, 2, 0, and 1.
	 */
	
}
