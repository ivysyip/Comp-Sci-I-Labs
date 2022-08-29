// Lab 6 from lab01_math
// This program converts a fahrenheit temperature into celsius.

// YOUR NAME: Ivy Yip
// CLASS PERIOD: 08
// Unit 01 - Lab06 - Fahrenheit to Celsius
// 2020

import java.util.*;


class Main
{
	public static void main( String[] args )
	{
		// The Scanner class allows us to read from the 
		// keyboard when we pass it System.in
		// Create a Scanner object (use new)
		Scanner kb = new  Scanner( System.in );
		
		
		System.out.println("Fahrenheit to Celsius");
		System.out.println(); // prints a blank line
		System.out.println(); // prints a blank line

		System.out.println("Lab 6 Written by Ivy Yip");
		System.out.println(); // prints a blank line
		System.out.println(); // prints a blank line
		
		
		// prompt the user to enter the fahrenheit temperature
		int i = 0;
    for (i=0; i<5; i++){
    System.out.print("Enter the fahrenheit temperature :: ");


		// Declare a variable called f (for Fahrenheit) of type double
		// and then read in the user input and convert the String
		// input into a double.
		double f = kb.nextDouble();

		
		// Print out a blank line.
		System.out.println();
		
    double c = (f-32)*5/9;
		
		// Print your answer here.
		System.out.println(String.format("%.2f", c) + " degrees in Celsius");
    System.out.println();

    }
	}
}

/*
 
Sample Data: 
98.6
52.30
82.45
75.00
100.00

Sample Output : 
37.00 degrees in Celsius
11.28 degrees in Celsius
28.03 degrees in Celsius
23.89 degrees in Celsius
37.78 degrees in Celsius


*/
