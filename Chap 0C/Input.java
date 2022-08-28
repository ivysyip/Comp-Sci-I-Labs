// YOUR NAME: Ivy Yip
// CLASS PERIOD: 08
// Unit 0c Lab01 - Input 
// 2020

import static java.lang.System.*;
import java.util.Scanner;

public class Main
{

    // The code in method main below will be run
    // or executed when you hit the Run Button.
    // This method must be called main since it
    // is the main starting point.
    public static void main (String[] args)
    {
        // The command new Scanner(System.in)
        // creates a Scanner object that can read from
        // the keyboard.  
        
        // Objects can have variables which contain 
        // data or memory addresses, and they also contain 
        // methods which contain computer code, and other stuff.
        
        // The variable keyboard receives the memory location of
        // where the Scanner object is stored in RAM memory.
        
        // There are quite a few methods that you can
        // call or invoke, which means that it will run
        // or execute the code that is in the method.
        // Sometimes we call a method a function.
        
        // keyboard.nextLine() reads in the user data 
        //     as a String
        // keyboard.nextInt() reads in the user data 
        //     and converts it to an int
        // keyboard.nextDouble() reads in the user data 
        //     and converts it to a double
        // keyboard.nextFloat() reads in the user data 
        //     and converts it to a float
        // keyboard.nextShort() reads in the user data 
        //     and converts it to a short
        
        Scanner keyboard = new Scanner(System.in);

        // This define's variables of different types
        int intOne, intTwo;
        double doubleOne, doubleTwo;
        float floatOne, floatTwo;
        short shortOne, shortTwo;

        // Here we prompt the user to enter an integer.
        // keyboard.nextInt() waits for the user to enter an integer,
        // and then reads in the number that the user enters,
        // and it better be an integer number or we crash
        // Notice that the number is stored in the variable intOne
        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();


        // Here we prompt the user to enter another integer
        // and then read it in.
        // Notice that the number is stored in the variable intTwo
        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();

        // ****************************************
        // Add in input for all the other variables
        // Follow the pattern used above.
        // ****************************************
        System.out.print("Enter a double :: ");
        doubleOne = keyboard.nextDouble();

        System.out.print("Enter a double :: ");
        doubleTwo = keyboard.nextDouble();

        System.out.print("Enter a float :: ");
        floatOne = keyboard.nextFloat();

        System.out.print("Enter a float :: ");
        floatTwo = keyboard.nextFloat();

        System.out.print("Enter a short :: ");
        shortOne = keyboard.nextShort();

        System.out.print("Enter a short :: ");
        shortTwo = keyboard.nextShort();





        // Now we print out a message and the value of each variable.
        // You will need to do the same thing for all the other variables.
        System.out.println();
        System.out.println("integer one = " + intOne );
        System.out.println("integer two = " + intTwo );
        System.out.println();
        System.out.println("double one = " + doubleOne);
        System.out.println("double two = " + doubleTwo);
        System.out.println();
        System.out.println("float one = " + floatOne);
        System.out.println("float two = " + floatTwo);
        System.out.println();
        System.out.println("short one = " + shortOne);
        System.out.println("short two = " + shortTwo);
        System.out.println();

        // Add in output for all the other variables
        // Follow the pattern above with the two ints
        
        
        
        


    } // end of method main
    
} // end of class Main
