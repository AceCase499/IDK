package csc252;
import java.util.Scanner;
public class DollarFormatFirstTry{
    /**
    Displays amount in dollars and cents notation.
    Rounds after two decimal places.
    Does not advance to the next line after output.
    */
    public static void write (double amount){
        int allCents = (int) (Math.round (amount * 100));
        int dollars = allCents / 100;                    
        int cents = allCents % 100;                      
        System.out.print('$');
        System.out.print(dollars);
        System.out.print('.');
        if (cents < 10)              
        {                            
            System.out.print ('0');  
            System.out.print (cents);
        }                            
        else                         
            System.out.print (cents);
    }


    /**
    Displays amount in dollars and cents notation.
    Rounds after two decimal places.
    Advances to the next line after output.
    */
    
    public static void main (String [] args)
    {
        double amount;
        String response;
        Scanner keyboard = new Scanner (System.in);
        System.out.println (
                "Testing DollarFormatFirstTry.write:");
        do
        {
            System.out.println ("Enter a value of type double:");
                amount = keyboard.nextDouble ();
            DollarFormatFirstTry.write (amount);
            System.out.println ();
            System.out.println ("Test again?");
            response = keyboard.next ();
        }
        while (response.equalsIgnoreCase ("yes"));
        System.out.println ("End of test.");
    }
    /**
    Displays amount in dollars and cents notation.
    Rounds after two decimal places.
    Does not advance to the next line after output.
    */
    public static void write2 (double amount){
        if (amount >= 0){
            System.out.print ('$');
            writePositive (amount);
        }
        else{
            double positiveAmount = -amount;
            System.out.print ('$');
            System.out.print ('-');
            writePositive (positiveAmount);
        }
    }

    //Precondition: amount >= 0;
    //Displays amount in dollars and cents notation. Rounds
    //after two decimal places. Omits the dollar sign.
    private static void writePositive (double amount) {
        int allCents = (int) (Math.round (amount * 100));
        int dollars = allCents / 100;
        int cents = allCents % 100;
        System.out.print (dollars);
        System.out.print ('.');

    if (cents < 10)
        System.out.print ('0');
    System.out.print (cents);
        /**
        Displays amount in dollars and cents notation.
        Rounds after two decimal places.
        Advances to the next line after output.
        */
   }

}
//print formatting, wrapper classes, 
//overloading: when two or more methods have the same name within the same class