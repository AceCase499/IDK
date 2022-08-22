package csc252;
import java.util.Scanner;
public class ArrayPractice {

   
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
       
       
        String[] colors = new String[7];
        colors[0] = "red";
        colors[1] = "orange";
        colors[2] = "yellow";
        colors[3] = "green";
        colors[4] = "blue";
        colors[5] = "indigo";
        colors[6] = "violet";
       
        // 0 = 3.5, 1 = 7.1, 2 = 0.4 and so on.
        double[] inchesOfSnow = {3.5, 7.1, 0.4, 2.2, 5.1, 1.9, 0.6};
        //System.out.println(inchesOfSnow[3]);
       
       
        for(int r = colors.length-1; r >= 0; r--){
           
            //System.out.println("My favorite color is " + colors[r] + ".");
        }
        String word;
        char detect;
        
        char[]vowels = {'a', 'e', 'i', 'o', 'u'};
        
        int[]counter = new int[5];
        counter[0] = 0;
        counter[1] = 0;
        counter[2] = 0;
        counter[3] = 0;
        counter[4] = 0;

       
        System.out.println("Enter a Password: ");
        word = keyboard.nextLine();
        System.out.println("Entered Password is: " + word);
        System.out.println("Vowel(s) from Password: ");
       
        for(int y = 0; y < word.length(); y++){
        	detect = word.charAt(y);
        	
        	if(detect == vowels[0]) {
				counter[0]++;
			}
        	if(detect == vowels[1]) {
				counter[1]++;
			}
        	if(detect == vowels[2]) {
				counter[2]++;
			}
        	if(detect == vowels[3]) {
				counter[3]++;
			}
        	if(detect == vowels[4]) {
				counter[4]++;
			}
        	/**
            switch(detect){
            case vowels[0]:
                System.out.print(y);
                break;
           
            case vowels[1]:
                System.out.print(y);
                break;
               
            case vowels[2]:
                System.out.print(y);
                break;
               
            case vowels[3]:
                System.out.print(y);
                break;
           
            case vowels[4]:
                System.out.print(y);
                break;
            }
           */
        }
     
        System.out.println("a: " + counter[0]);
        System.out.println("e: " + counter[1]);
        System.out.println("i: " + counter[2]);
        System.out.println("o: " + counter[3]);
        System.out.println("u: " + counter[4]);

    }
}


/**
 * import java.util.Scanner;

public class LetterFrequency {
	public static void main(String[] args) {

		int letterCount = 0;
		String userWord;
		String userLetterInput
		char userLetter;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a word or phrase: ");
		userWord = keyboard.nextLine();
		System.out.print("Enter a letter: ");
		userLetterInput = keyboard.nextLine();

		//Convert the read String to a character in the following way: 
		userLetter = userLetterInput.charAt(0);
		
		for(int index = 0; index <= userWord.length()-1; index++) {

			if(userLetter == userWord.charAt(index)) {
				letterCount++;
			}
		}
		
		System.out.println("The character " + userLetter + " has appeared " + letterCount + " times in this word/phrase."); 
	}
}
 */
