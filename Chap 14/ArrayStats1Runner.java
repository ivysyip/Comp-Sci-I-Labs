// Lab Chapter 14 Arrays Set 1, Lab 1
// 1) Main.java and ArrayStats1.java

// FINISH ME
// Name: Ivy Yip

public class Main // ArrayStats1Runner
{
  
    public static void main( String args[] )
    {
        System.out.println("ArrayStats1Runner");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

        // FINISH ME
        System.out.println("Chapter 14 - Set 1 Lab 1  Written by Ivy Yip");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line
        
        ArrayStats1 arrayStats = new ArrayStats1();

        int [] array = new int[] {5,1,2,3,4,5,6,7,8,9,10};
        // we could also say:
        // int [] array = new int[11]; // new creates 11 variables with same name
        // array[0] = 5;
        // array[1] = 1;
        // array[2] = 2;
        // etc.
        
        arrayStats.printArray( array );     
        System.out.println( "The sum is               " + arrayStats.getTheSum( array ) );
        System.out.println( "The average is           " + arrayStats.getTheAverage( array ) );
        System.out.println( "The sum smaller than " + array[0] + "   " + arrayStats.getTheSumOfNumbersLessThanFirstNumber( array ) );
        System.out.println( "The sum smaller than " + array[array.length-1] + "  " + arrayStats.getTheSumOfNumbersLessThanLastNumber( array ) );
        System.out.println( "The first number repeats " + arrayStats.firstNumberRepeats( array ) );
        System.out.println( "The last number repeats  " + arrayStats.lastNumberRepeats( array ) );
          



 
        
    } // end of main method
    
} // end of class

/*
Chapter 14 - Set 1 Lab 1  Written by YOUR Ivy Yip


The list is 5 1 2 3 4 5 6 7 8 9 10 
The sum is               60
The average is           5.454545454545454
The sum smaller than 5   10
The sum smaller than 10  50
The first number repeats true
The last number repeats  false
*/

// Lab Chapter 14 Arrays Set 1, Lab 1
// 1) ArrayStats1Runner.java and ArrayStats1.java

// FINISH ME
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


public class ArrayStats1
{
    // ***********************************************
    // print the array's elements all on the same line
    // ***********************************************  
    // We will receive a reference (a memory address)
    // to an array. 
    // ray is the reference variable that receives the memory
    // address of some array.
    public void printArray(int[] ray)
    {
        System.out.print("The list is ");
        // loop through all of the elements
        // and print each element and a space
        for (int num : ray)
        {
             // print the ith element and a space
             System.out.print(num + " ");
        }
        
        // move the cursor to the next line
        System.out.println();
        
    } // end of method printArray()


    // ****************************************
    // find the sum of the numbers in the array
    // ****************************************  
    public int getTheSum(int[] ray)
    {
        // create a variable to hold your sum and set it 0.
        int sum = 0;
        
        // loop through all of the elements
        // and add each element to your sum
        for (int i = 0; i < ray.length; i++)
        {
             // add to your sum the value
             sum = sum + ray[i];
        }
        
        // return your sum
        return sum;  // replace the 0!!!!!!!!!!!!
    } // end of method getTheSum()

    
    
    // ****************************************
    // find the average of the numbers in array
    // ****************************************  
    public double getTheAverage(int[] ray)
    {
        // Get the sum and divide by the number
        // of elements in the array.
        // Make sure you do NOT lose any accuracy.
        double average = getTheSum(ray) / (double)ray.length;

        return average; // replace me with the average
    } // end of method getTheAverage()


    
    // ***************************************************************
    // find the sum of the numbers that are less than the first number
    // Example: ray = {10, 7, 4, 20, 3}
    // The sum would be 7 + 4 + 3 = 14, since 7, 4, and 3 are all less
    // than 10.
    // ***************************************************************  
    public int getTheSumOfNumbersLessThanFirstNumber(int[] ray)
    {
        // declare your sum variable
        int sum = 0;

        // get the first number from the array
        int firstNumber = ray[0];
        
        // loop from 1 to the end of the list
        for (int i = 1; i < ray.length; i++)
        {
             // if ray[i] is less than firstNumber then 
             // add to your sum the value of ray[i]
             if (ray[i] < firstNumber)
               sum = sum + ray[i];

        }
        
        return sum;  // return the sum
    } // end of method getTheSumOfNumbersLessThanFirstNumber()


    
    // ***************************************************************
    // find the sum of the numbers that are less than the last number
    // Example: ray = {10, 7, 4, 25, 20}
    // The sum would be 10 + 7 + 4 = 21, since 10, 7, and 4 are all less
    // than 20.
    // ***************************************************************  
    public int getTheSumOfNumbersLessThanLastNumber(int[] ray)
    {
        // get your initial sum
        int sum = 0;

        // get the last number from the array
        int lastNumber = ray[ray.length-1];
        
        // loop from 0 to the end of the list
        for (int i = 0; i < ray.length - 1; i++)
        {
             // if ray[i] is less than lastNumber then 
             // add to your sum the value of ray[i]
             if (ray[i] < lastNumber)
                sum = sum + ray[i];

        }
        
        return sum;  // return the sum
    } // end of method getTheSumOfNumbersLessThanLastNumber()

    
    // ****************************************
    // does the first number repeat?
    // ****************************************  
    public boolean firstNumberRepeats(int[] ray)
    {
        // get the first number in the list
        int firstNumber = ray[0];
        
        // loop through all of the elements starting at position 1
        // and see if you can find the firstNumber
        for (int i = 1; i < ray.length; i++)
        {
             // is the first number here? 
             // if so, return true
             if (ray[i] == firstNumber){
               return true;
             }

        }
        
        // return false
        return false;
    } // end of method firstNumberRepeats()

    
    // ****************************************
    // does the last number repeat?
    // ****************************************  
    public boolean lastNumberRepeats(int[] ray)
    {
        // get the last number in the list
        int lastNumber = ray[ray.length - 1];
        
        // loop through all of the elements-1 starting at position 0
        // and see if you can find the lastNumber
        // Or go backwards!
        for (int i = 0; i < ray.length - 1; i++)
        {
             // is the last number here? 
             // if so, return true
             if (ray[i] == lastNumber){
               return true;
             }

        }
        
        // return false
        return false;
    } // end of method lastNumberRepeats()

    
    
}  // end of class

