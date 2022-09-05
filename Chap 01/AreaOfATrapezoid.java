// YOUR NAME: IVY Yip
// CLASS PERIOD: 08
// Unit 01 - Lab02 - Area of a Trapezoid
// 2020

import java.util.*;

class Main
{
    public static void main( String[] args )
    {
        // The Scanner class allows us to read from the 
        // keyboard when we pass it System.in
        // Create a new Scanner object.
        Scanner kb = new Scanner( System.in );
        
        
        System.out.println("Area of a Trapezoid");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

        System.out.println("Unit 01 - Lab 02 Written by Ivy Yip");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line
        
        // prompt the user to enter base 1
        int i = 0;
        for (i = 0; i <6; i++){
        System.out.print( "Enter base1 :: " );

        // declare a variable called base1 of type int
        // kb.nextInt() will read in what the user types and
        // convert it to an int
        int base1 = kb.nextInt();
        
        
        // prompt the user to enter base 2
        System.out.print( "Enter base2 :: " );     

        // declare a variable called base2 of type int
        int base2 = kb.nextInt();
        
        
        // prompt the user to enter the height
        System.out.print( "Enter the height :: " );       

        // declare a variable called height of type int
        int height = kb.nextInt();
        
        System.out.println(); // prints a blank line
        
        
        // print out the answer here
        System.out.println("The area of the trapezoid is " + (double)1/2* height * (base1+base2) );
        System.out.println();
        }
        
    }
}

/*
 
Sample Data: 
3 3 3
5 6 7
7 10 6
13 9 3
6 11 4
11 8 5


Sample Output : 
The area of the trapezoid is 9.0
The area of the trapezoid is 38.5
The area of the trapezoid is 51.0
The area of the trapezoid is 33.0
The area of the trapezoid is 34.0
The area of the trapezoid is 47.5

*/
