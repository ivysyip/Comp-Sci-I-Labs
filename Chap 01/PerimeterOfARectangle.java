// Lab 1 from Unit 01 Math
// This program calculates the perimeter of a rectangle.

// YOUR NAME: Ivy Yip
// CLASS PERIOD: 08
// Unit 01 - Lab01 - Perimeter of a Rectangle
// 2020

import java.util.*;

class Main
{
    public static void main( String[] args )
    {
        // The Scanner class allows us to read from the 
        // keyboard when we pass it System.in
        Scanner kb = new Scanner( System.in );
        
        System.out.println("Perimeter of a Rectangle");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

        System.out.println("Unit 01 - Lab 01 Written by Ivy Yip");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line
            
        // Prompt the user to enter the length.    
        int i =0;
        for (i = 0; i < 7; i++){
        System.out.print( "Enter the length :: " );

        // Declare a variable called length of type int.
        int length = kb.nextInt();
        
        
        // Prompt the user to enter the width
        System.out.print( "Enter the width :: " );        

        // Declare a variable called width of type int.
        int width = kb.nextInt();

        System.out.println(); // prints a blank line

        
        // print your answer here
        
        System.out.println("The perimeter is " + 2 * (length + width));
        System.out.println();
        }
        
    }
}

/*
 
Sample Data: 
12  5
131 75
20  25
9  256
36  72
8  6
18  16


Sample Output : 
The perimeter is 34
The perimeter is 412
The perimeter is 90
The perimeter is 530
The perimeter is 216
The perimeter is 28
The perimeter is 68

*/
