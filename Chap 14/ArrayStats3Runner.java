// Lab Chapter 14 Arrays Set 1, Lab 3
// 3) Main.java and ArrayStats3.java
      
// FINISH ME
// Name: Ivy Yip

public class Main // ArrayStats3Runner
{
  
    public static void main( String args[] )
    {
        System.out.println("ArrayStats3Runner");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

        // FINISH ME
        System.out.println("Chapter 14 - Set 1 Lab 3  Written by Ivy Yip");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line
        
        ArrayStats3 arrayStats = new ArrayStats3();

        int [] array = new int[] {1,3,12,8,16,18,26,77,82,90,100};
        
        arrayStats.printArray( array );     
        System.out.println( "Is it strictly increasing  " + arrayStats.isStrictlyIncreasing( array ) );
        System.out.println( "Is it strictly decreasing " + arrayStats.isStrictlyDecreasing( array ) );

        
        System.out.println();

        array = new int[] {1,3,12,15,15,18,26,77,82,90,100};
        
        arrayStats.printArray( array );     
        System.out.println( "Is it strictly increasing  " + arrayStats.isStrictlyIncreasing( array ) );
        System.out.println( "Is it strictly increasing " + arrayStats.isStrictlyDecreasing( array ) );

                
        System.out.println();

        array = new int[] {1,3,12,15,16,18,26,77,82,90,100};
        
        arrayStats.printArray( array );     
        System.out.println( "Is it strictly increasing  " + arrayStats.isStrictlyIncreasing( array ) );
        System.out.println( "Is it strictly increasing " + arrayStats.isStrictlyDecreasing( array ) );


        System.out.println();

        array = new int[] {100,93,85,95,66,58,46,37,22,10,5};
        
        arrayStats.printArray( array );     
        System.out.println( "Is it strictly increasing  " + arrayStats.isStrictlyIncreasing( array ) );
        System.out.println( "Is it strictly increasing " + arrayStats.isStrictlyDecreasing( array ) );

       
       System.out.println();

        array = new int[] {100,93,85,75,75,58,46,37,22,10,5};
        
        arrayStats.printArray( array );     
        System.out.println( "Is it strictly increasing  " + arrayStats.isStrictlyIncreasing( array ) );
        System.out.println( "Is it strictly increasing " + arrayStats.isStrictlyDecreasing( array ) );

       System.out.println();

        array = new int[] {100,93,85,75,66,58,46,37,22,10,5};
        
        arrayStats.printArray( array );     
        System.out.println( "Is it strictly increasing  " + arrayStats.isStrictlyIncreasing( array ) );
        System.out.println( "Is it strictly increasing " + arrayStats.isStrictlyDecreasing( array ) );


        
        
        System.out.println();
        System.out.println();
 
        
    } // end of main method
    
} // end of class

/*
Chapter 14 - Set 1 Lab 3  Written by Ivy Yip


The list is 1 3 12 8 16 18 26 77 82 90 100 
Is it strictly increasing  false
Is it strictly decreasing false

The list is 1 3 12 15 15 18 26 77 82 90 100 
Is it strictly increasing  false
Is it strictly increasing false

The list is 1 3 12 15 16 18 26 77 82 90 100 
Is it strictly increasing  true
Is it strictly increasing false

The list is 100 93 85 95 66 58 46 37 22 10 5 
Is it strictly increasing  false
Is it strictly increasing false

The list is 100 93 85 75 75 58 46 37 22 10 5 
Is it strictly increasing  false
Is it strictly increasing false

The list is 100 93 85 75 66 58 46 37 22 10 5 
Is it strictly increasing  false
Is it strictly increasing true


*/


// Lab Chapter 14 Arrays Set 1, Lab 3
// 3) Main.java and ArrayStats3.java
      
// FINISH ME
// Name: Ivy YIp


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
public class ArrayStats3
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


    // *****************************************************
    // determine if the numbers always increase in the array
    // *****************************************************  
    // PRE-CONDITION: Array ray has at least 1 element
    // POST-CONDITION: true if the numbers always increase
    public boolean isStrictlyIncreasing(int[] ray)
    {        
        // Loop through all of the elements - 1
        // and check to see if the ith element is greater than or
        // equal to the i+1 element (don't go out of bounds).
        // if it is, then return false
        for (int i = 0; i < ray.length - 1; i++){
          if (ray[i] >= ray[i+1])
            return false;
        }
      
      
        return true;
    } // end of method isStrictlyIncreasing()

    
   
    // *****************************************************
    // determine if the numbers always decrease in the array
    // *****************************************************  
    // PRE-CONDITION: Array ray has at least 1 element
    // POST-CONDITION: true if the numbers always decrease
    public boolean isStrictlyDecreasing(int[] ray)
    {        
        // Loop through all of the elements - 1
        // and check to see if the ith element is less than or
        // equal to the i+1 element (don't go out of bounds).
        // if it is, then return false
        for (int i = 0; i < ray.length - 1; i++){
          if (ray[i] <= ray[i+1])
            return false;
        }
      
      
        return true;
    } // end of method isStrictlyDecreasing()

    


}  // end of class
