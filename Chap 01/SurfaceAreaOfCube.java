
// Lab 4 from lab01_math
// This program calculates the surface area of a cube.

// YOUR NAME: Ivy Yip
// CLASS PERIOD: 08
// Unit 01 - Lab04 - Surface Area of a Cube
// 2020

import java.util.*;

class Main
{
    public static void main( String[] args )
    {
        // The Scanner class allows us to read from the 
        // keyboard when we pass it System.in
        // Create the Scanner object (new it)
        Scanner kb = new Scanner( System.in );
        
        System.out.println("Surface Area of a Cube");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

        System.out.println("Lab 4 Written by Ivy Yip");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line
        
        // prompt the user to the side of the cube
        int i = 0;
        for (i = 0; i < 7; i++){
        System.out.print( "Enter the side :: " );

        // declare a variable called side of type int
        // and then call the nextInt() method of the Scanner object
        int side = kb.nextInt();

        System.out.println(); // prints a blank line
        
        
        // calculate your area
        int answer = side * side * 6;
        
        
        // print your output here
        // (See sample output below)

        System.out.println("Cube area is :: " + (double)answer);
        System.out.println();
        }
        
        
    }
}

/*
 
Sample Data: 
112
4
33
50
5
19
111


Sample Output : 
Cube area is :: 75264.0
Cube area is :: 96.0
Cube area is :: 6534.0
Cube area is :: 15000.0
Cube area is :: 150.0
Cube area is :: 2166.0
Cube area is :: 73926.0

*/
