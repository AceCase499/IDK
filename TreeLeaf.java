import java.util.Scanner;

public class TreeLeaf {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String Tree = keyboard.nextLine();
		int LeafCount = 0;
		
		if (Tree.length() == 2) {
			System.out.print(0);
			System.exit(0);
		}
		
		for (int i = 0; i < Tree.length(); i++) {
			
			if (Tree.charAt(i) == ')') {
				if (Tree.charAt(i-1) == '(') {
					LeafCount += 1;
				}
			}
		}
		System.out.print(LeafCount);
	}

}
