
// Lab 5 from lab01_math
// This program calculates the area of a circle.

// YOUR NAME: Ivy Yip
// CLASS PERIOD: 08
// Unit 01 - Lab05 - Area of a Circle
// 2020

import java.util.*;

public class Main
{
	public static void main( String[] args )
	{
		// The Scanner class allows us to read from the 
		// keyboard when we pass it System.in
		// Create the Scanner object
		Scanner kb = new Scanner( System.in );
		
		
		System.out.println("Area of a Circle");
		System.out.println(); // prints a blank line
		System.out.println(); // prints a blank line

		System.out.println("Lab 5 Written by Ivy Yip");
		System.out.println(); // prints a blank line
		System.out.println(); // prints a blank line
		

		// Prompt the user to enter the radius
    int i = 0;
    for (i = 0; i < 7; i++){
		System.out.print( "Enter the radius :: " );


		// Declare a variable called radius of type double
		// and then call the nextDouble() method to read in
		// the user input.  Remember that kb refers to the
		// keyboard.
		double radius = kb.nextDouble();
		
		
		// We flush the input buffer ( a good habit )
		kb.nextLine();
		
		
		// Calculate the area  (3.14159 times radius times radius)
		double area = Math.PI * radius * radius;
		
		
		
		// Print your output here
		// See the sample output below.
		// Print a blank line first and then your result.

    System.out.println();
    System.out.println("Cirle area is :: " + String.format("%.2f", area));
    System.out.println();
    }
	}
}


/*
 
Sample Data: 
7.5
10
72.534
55
101
99.952


Sample Output : 
Circle area is :: 176.71
Circle area is :: 314.16
Circle area is :: 16528.49
Circle area is :: 9503.32
Circle area is :: 32047.39
Circle area is :: 31385.77
Circle area is :: 31415.93

*/
