// Lab Chapter 14 Arrays Set 1, Lab 2
// 1) Main.java and ArrayStats2.java
      
// FINISH ME
// Name: Ivy YIp

public class Main // ArrayStats2Runner
{
  
    public static void main( String args[] )
    {
        System.out.println("ArrayStats2Runner");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

        // FINISH ME
        System.out.println("Chapter 14 - Set 1 Lab 2  Written by Ivy Yip");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line
        
        ArrayStats2 arrayStats = new ArrayStats2();

        int [] array = new int[] {5,3,12,3,14,5,6,7,2,90,10};
        
        arrayStats.printArray( array );     
        System.out.println( "The largest number is  " + arrayStats.getTheLargestNumber( array ) );
        System.out.println( "The smallest number is " + arrayStats.getTheSmallestNumber( array ) );

        System.out.println( "The largest number from 1 to 5 is  " + arrayStats.getTheLargestNumber( array,1,5 ) );
        System.out.println( "The smallest number from 1 to 5 is " + arrayStats.getTheSmallestNumber( array,1, 5 ) );
        System.out.println();

        array = new int[] {500,3,12,-3,14,5,6,-7,2,90,100};
        
        arrayStats.printArray( array );     
        System.out.println( "The largest number is  " + arrayStats.getTheLargestNumber( array ) );
        System.out.println( "The smallest number is " + arrayStats.getTheSmallestNumber( array ) );

        System.out.println( "The largest number from 1 to 5 is  " + arrayStats.getTheLargestNumber( array,1,5 ) );
        System.out.println( "The smallest number from 1 to 5 is " + arrayStats.getTheSmallestNumber( array,1, 5 ) );

        System.out.println();
        System.out.println();
 
        
    } // end of main method
    
} // end of class

/*
Chapter 14 - Set 1 Lab 2  Written by IVY YIP


The list is 5 3 12 3 14 5 6 7 2 90 10 
The largest number is  90
The smallest number is 2
The largest number from 1 to 5 is  14
The smallest number from 1 to 5 is 3

The list is 500 3 12 -3 14 5 6 -7 2 90 100 
The largest number is  500
The smallest number is -7
The largest number from 1 to 5 is  14
The smallest number from 1 to 5 is -3

*/


// Lab Chapter 14 Arrays Set 1, Lab 2
// 1) Main.java and ArrayStats2.java
//      (biggest number and smallest number)

// Name: Ivy Yip


// NOTE: An array is an object, however it does
//       not have any methods of its own.  
//       It does have a constant variable called length.  
//       Variable length is NOT a method,
//       so NO parenthesis ().
//  
//       Suppose variable ray is a reference to an array.
//      
//       Examples:
//       ray.length is the number of elements in your array. [0 to ray.length-1]
//       You can access an element of the array by using
//       nameOfArray[position]
//       Examples:
//          ray[2] = 98;           // changing the value
//          ray[2] = ray[3];       // changing the value
//          out.println(ray[2]);   // printing
//          if (ray[i] == ray[i+1]) ...
//
public class ArrayStats2
{
    // ***********************************************
    // print the array's elements all on the same line
    // ***********************************************  
    // We will receive a reference (a memory address)
    // to an array. 
    // ray is the reference variable that receives the memory
    // address of some array.
  
    // PRE-CONDITION: Array ray has at least 1 element
    // POST-CONDITION: Array ray is printed
    public void printArray(int[] ray)
    {
        System.out.print("The list is ");
        // loop through all of the elements
        // and print each element and a space
        for (int numbers : ray){
          System.out.print(numbers + " ");
        }
        // move the cursor to the next line
        System.out.println();
        
    } // end of method printArray()


    // ****************************************
    // find the largest number in the array
    // ****************************************  
    // PRE-CONDITION: Array ray has at least 1 element
    // POST-CONDITION: The largest number is returned
    public int getTheLargestNumber(int[] ray)
    {
        // create a variable to hold your largest number and set it to -Integer.MIN_VALUE.
        // (or you could set it to ray[0])
        int largestNumber = Integer.MIN_VALUE;
        
        // loop through all of the elements
        // and check to see if each ith element is greater than largestNumber
        // if it is, then set largestNumber to ray[i]
        for (int i = 0; i < ray.length; i++)
        {
             // see if your element is greater than largestNumber
             if (ray[i] > largestNumber)
                largestNumber = ray[i];


        }
        
        // return your largest number
        return largestNumber;  // replace the 0!!!!!!!!!!!!
    } // end of method getTheLargestNumber()

    
    // ****************************************
    // find the smallest number in the array
    // ****************************************  
    // PRE-CONDITION: Array ray has at least 1 element
    // POST-CONDITION: The smallest number is returned
    public int getTheSmallestNumber(int[] ray)
    {
        // create a variable to hold your smallest number and set it to Integer.MAX_VALUE.
        // (or you could set it to ray[0])
        int smallestNumber = Integer.MAX_VALUE;
        
        // loop through all of the elements
        // and check to see if the ith element is smaller than smallestNumber
        // if it is, then set smallestNumber to ray[i]
        for (int i = 0; i < ray.length; i++)
        {
             // see if your element is smaller than smallestNumber
             if (ray[i] < smallestNumber)
               smallestNumber = ray[i];


        }
        
        // return your smallest number
        return smallestNumber;  // replace the 0!!!!!!!!!!!!
    } // end of method getTheSmallestNumber()

   
    // **************************************************
    // find the largest number in the array from position 
    // firstIndex to position lastIndex (inclusive)
    // NOTE: We have an overloaded method!!!!!!!
    //       Two methods in the same class with the same
    //       name but different parameters!!!!!!
    // **************************************************  
    // PRE-CONDITION: Array ray has at least 1 element
    // POST-CONDITION: The largest number in the range is returned
    public int getTheLargestNumber(int[] ray, int firstIndex, int lastIndex)
    {
        // create a variable to hold your largest number and set it to -Integer.MIN_VALUE.
        // (or you could set it to ray[firstIndex])
        int largestNumber = Integer.MIN_VALUE;
        
      
        // loop through all of the elements
        // from position firstIndex to position lastIndex (inclusive)
        // and check to see if the ith element is greater than largestNumber
        // if it is, then set largestNumber to ray[i]
        for (int i = firstIndex; i <= lastIndex; i++){
          if (ray[i] > largestNumber)
            largestNumber = ray[i];
        }
      
      
      
        // return your largest number
        return largestNumber;  // replace the 0!!!!!!!!!!!!
    } // end of method getTheLargestNumber()


    
    // ***************************************************
    // find the smallest number in the array from position
    // firstIndex to position lastIndex (inclusive)
    // NOTE: We have an overloaded method!!!!!!!
    //       Two methods in the same class with the same
    //       name but different parameters!!!!!!
    // ***************************************************  
    // PRE-CONDITION: Array ray has at least 1 element
    // POST-CONDITION: The smallest number in the range is returned
    public int getTheSmallestNumber(int[] ray, int firstIndex, int lastIndex)
    {
        // create a variable to hold your smallest number and set it to Integer.MAX_VALUE.
        // (or you could set it to ray[firstIndex])
        int smallestNumber = Integer.MAX_VALUE;
        
        // loop through all of the elements
        // from position firstIndex to position lastIndex (inclusive)
        // and check to see if the ith element is smaller than smallestNumber
        // if it is, then set smallestNumber to ray[i]
        for (int i = firstIndex; i <= lastIndex; i++){
          if (ray[i] < smallestNumber)
            smallestNumber = ray[i];
        }
      
      
        // return your smallest number
        return smallestNumber;  // replace the 0!!!!!!!!!!!!
    } // end of method getTheSmallestNumber()

   


}  // end of public class ArrayStats2
