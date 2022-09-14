import java.util.*; // for Scanner from Java 1.5, 1.6, etc., and ArrayList
import java.io.*;   // for file input
import static java.lang.System.*; // so that you don't have to do System.

// NOTE: reading from a file is almost like reading from the keyboard
//       use methods nextLine(), nextInt()

public class Main
{
	// no instance variables are needed
	
	
	public static void main(String[] args) throws IOException
	{

		// print out your name
    System.out.println("Ivy Yip");
    System.out.println();

		// this loads the file ValidPhoneNumber.dat into the Scanner object called input		
		Scanner input = new Scanner(new File("ValidPhoneNumber.dat")); // reads in the data file 	
			

		
		// FINISH ME
		// read in the first line from the file and convert it to an int
		// this number is the number of data sets in the file
	  int lines = input.nextInt();
		
		input.nextLine(); // this moves the cursor to the next line in the file
		
		// We will need a variable to store the new String
		// It will not contain any characters to start
	  String phoneNumber = "";
    String phoneChar = "()-";

    
		
		// you will now need a loop to loop through all the 
		// lines one by one and see if the potential phone number is
		// Valid or Invalid.
		// FINISH ME
		// 
		for (int i=0; i<lines; i++)
		{
		    // FINISH ME
		    // read in the potential phone number (use input.????)
			phoneNumber = input.nextLine();

		    // check the number of characters
			if (phoneNumber.length() == 14) // If it has 12 characters, it might be valid
			{
			    // FINISH ME
				// see if it is valid and if so print out "Valid"
			    // else print "Invalid"
         int count = 0;
         boolean fInvalidCharFound = false;
         for (int m = 0; m < phoneNumber.length(); m++) {
           if (Character.isDigit(phoneNumber.charAt(m))){
            count++;
           }
           else if (phoneChar.indexOf(phoneNumber.charAt(m)) == -1){
            fInvalidCharFound = true;
            break;
           }
         }
         if (count == 10 && !fInvalidCharFound){
           System.out.println("Valid");
         }
         else{
           System.out.println("Invalid");
         }
			    
			    
			}
			else if (phoneNumber.length() == 12) // it might be valid
			{
			    // FINISH ME
				// see if it is valid and if so print out "Valid"
			    // else print "Invalid"
         int count2 = 0;
         boolean fInvalidCharFound2 = false;
         for (int n = 0; n < phoneNumber.length(); n++) {
           if (Character.isDigit(phoneNumber.charAt(n))){
           count2++;
           } 
           else if (phoneChar.indexOf(phoneNumber.charAt(n)) == -1 ) {
             fInvalidCharFound2 = true;
             break;
           }
         }
         if (count2 == 10 && !fInvalidCharFound2){
           System.out.println("Valid");
         }
         else{
           System.out.println("Invalid");
         }
			}
			else
			{
				// It is invalid
				// print out "Invalid"
				System.out.println("Invalid");
				
			}
		    
		    			
		
		
		}
		
		
		
			
		input.close();

	} // end of main method

} // end of class





/*Example Output to Screen
========================
Invalid
Valid
Valid
Invalid
Invalid
Invalid
*/

