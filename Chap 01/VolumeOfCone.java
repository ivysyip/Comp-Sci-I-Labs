// Lab 3 from lab01_math
// This program calculates the volume of a cone.

// YOUR NAME: Ivy Yip
// CLASS PERIOD: 08
// Unit 01 - Lab03 - Volume of a Cone
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

        System.out.println("Volume of a Cone");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

        System.out.println("Lab 3 Written by Ivy Yip");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line
        
        // prompt the user to enter the radius
        int i = 0;
        for (i = 0; i < 8; i++){
        System.out.print( "Enter the radius :: " );
        
        // declare a variable called radius of type double
        // and then call the nextDouble() method of the Scanner object
        double radius = kb.nextDouble();
        
        // prompt the user to enter the height
        System.out.print( "Enter the height :: " );
                
        // declare a variable called height of type int
        // and then call the nextInt() method of the Scanner object
        int height = kb.nextInt();

        System.out.println(); // prints a blank line

        
        // calculate your volume   volume = pi x r x r x (h/3.0)
        double volume = Math.PI * radius * radius * (height/3.0);
        
        
        // print your output here
        System.out.println("The volume of the cone is " + String.format("%.2f", volume) + " cubic units.");
        System.out.println();
        }
    }
}

/*
 
Sample Data: 
4 4
4 3
9 3
1 3
1 5
7 7
1.5 3
1.5 5


Sample Output : 
The volume of the cone is 67.02 cubic units.
The volume of the cone is 50.27
The volume of the cone is 254.47
The volume of the cone is 3.14
The volume of the cone is 5.24
The volume of the cone is 359.19
The volume of the cone is 7.07
The volume of the cone is 11.78

*/
