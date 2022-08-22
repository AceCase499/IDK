package csc252;
import java.util.Scanner;
public class CharFreq {
	
	public static void main(String[] args) {
		//index positions, not real values
		String userPhone;
		char detect;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your phone number. Please do not enter spaces or special characters.");
		userPhone = keyboard.nextLine();
        
        int[]counter = new int[10];
        counter[0] = 0;
        counter[1] = 0;
        counter[2] = 0;
        counter[3] = 0;
        counter[4] = 0;
        counter[5] = 0;
        counter[6] = 0;
        counter[7] = 0;
        counter[8] = 0;
        counter[9] = 0;

       
        System.out.println("Numbers found in entered phone number are: ");
       
        for(int y = 0; y < userPhone.length(); y++){
        	detect = userPhone.charAt(y);
        	
        	for(int i = 0; i < 10; i++){
        		if(Integer.parseInt(Character.toString(detect)) == i){
        			counter[i]++;
        			
        		}
		}
	}
		
		System.out.println("0: " + counter[0]);
        System.out.println("1: " + counter[1]);
        System.out.println("2: " + counter[2]);
        System.out.println("3: " + counter[3]);
        System.out.println("4: " + counter[4]);
        System.out.println("5: " + counter[5]);
        System.out.println("6: " + counter[6]);
        System.out.println("7: " + counter[7]);
        System.out.println("8: " + counter[8]);
        System.out.println("9: " + counter[9]);
	/**
	*(30 points) Write a program in a class CharFreq that counts the number of
	times a digit appears in a telephone number. Your program should create an array of
	size 10 that will hold the count for each digit from 0 to 9. Read a telephone number
	from the keyboard as a string. Examine each character in the phone number and
	increment the appropriate count in the array. Display the contents of the array.
	*/
	
	}
}