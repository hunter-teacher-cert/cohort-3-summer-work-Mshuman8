/**
 * ArrayPractice by Team BossCoders
 * Marisa Shuman
 * collaborators: Taylor Grant-Knight
 */

/**
   INSTRUCTIONS:
   This file contains stubs (empty methods) for the following methods:
   1. buildIncreasingArray ✅
   2. buildRandomArray ✅
   3. printArray ✅
   4. arraySum ✅
   5. firstOccurence ✅
   6. isSorted ✅
   7. findMaxValue ✅
   8. countOdds
   9. flip
   The stubs will have comments describing what they should do
   Levels:
   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   Basic:
   Complete these methods:
   - buildRandomArray
   - printArray
   - arraySum
   - firstOccurence
   - findMaxValue
   Intermediate:
   Complete all the methods for basic and also
   - buildIncreasingArray
   - isSorted
   - countOdds
   Advanced:
   Complete all the methods
*/

import java.util.*;
import java.io.*;

public class ArrayPractice {

  /**
     Parameters:
     size - how large the array should be
     startValue - the value of the first element
     step - the interval to the next value
     Returns:
     a new array of integers
     Examples:
     buildIncreasingArray(5,3,2) will return an array
     with the values 3,5,7,9,11 (five values, starting with 3 with a step size of 2)
  */

    
  public static int[] buildIncreasingArray( int size, int startValue, int step ) {
      int[] data = new int[size];

      //create an array that is of the length of the argument size
      //set the first value to the startValue argument
      //increase the value for the next
      for (var i=0; i<size; i++) {
          if (i==0) {
              data[i] = startValue;
          }
          else {
              data[i] = startValue + step*i;          
          }
          // System.out.println("The " + i+1 + " value of the array is " + data[i]);
      }



    // loop through each element of the array and
    /* YOUR BRILLIANT CODE HERE */

    // assign the appropriate value to each one.
    /* YOUR BRILLIANT CODE HERE */

    return data;
  }


  /**
     Parameters:
     size - how many elements in the array
     maxValue - the largest possible random value to use
     Returns:
     a new array where each element is an integer between 0
     and up to but not including maxValue
  */
  public static int[] buildRandomArray( int size, int maxValue )
  {
    Random r = new Random(); // setting up for a random number
    int[] data = new int[size];

    for (var i=0; i<size; i++) {

        data[i] = r.nextInt(maxValue);

    }

    return data;
  }


  /**
     Parameters:
     data - an array of ints
     Returns:
     nothing
     prints out the array
     Note: data.length stores the length of the array
     Another Note: yes, we know William live coded this a few minutes ago.
  */
 public static void printArray(int [] data) {
        for (int i=0; i<data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }



  /**
     Parameters:
     data - an array of integers
     value - the value to search for
     Returns:
     the index (location) of the first occurence of value
     Example:
     given array data, containing 1,5,2,7,5,8,5,12,19,5
     firstOccurence(data,5) would return 1
     since the first occurence of the value 5 is at a[1]
  */
  public static int firstOccurence( int[] data, int value )
  {

    for (var i=0; i<data.length; i++) {
        if (data[i] == value) {
            return i;
        }
      }

    /* YOUR BRILLIANT CODE HERE */

    return -1; 
  }


  /**
     Parameters: data - an array of ints
     Returns: an integer that is equal to the sum of all the elements in the array
     Ex: If the input array has the values 5,2,4,10 the return
     value will be 21 (5+2+4+10)
  */
  public static int arraySum( int[] data )
  {
    int sum = 0;
    for (var i=0; i<data.length; i++) {
      sum += data[i];
    }

    return sum;
  }


  /**
     Parameters:
     data - an array of integers
     Returns:
     true if the array is sorted, false otherwise
     That is, if each element is < the element to its right
     then the array is sorted.
     An array with values 5,6,10,15 is sorted
     An array with values 5,6,10,18,15 is not
  */
  public static boolean isSorted( int[] data )
  {
    int firstVal = data[0];

    for (var i=0; i<data.length; i++) {
      if (data[i] < firstVal) {
        return false;
      }
      else {
        firstVal = data[i];
      }
    }

    return true; 

  }

  /**
     Parameters:
     data - an array of integers
     Returns:
     value of the largest element in the array
  */
  public static int findMaxValue( int[] data ) {
    int currMax = data[0];  // will hold the maximum value;

    for (var i=0; i<data.length; i++) {
      if (data[i] > currMax) {
        currMax = data[i];
      }
    }

    return currMax;
  }


  /**
     Parameters:
     data - an array of integers
     Returns:
     the number of odd elements in the array
     Ex: if data holds 5,6,7,8,9,10 then the return value
     will be 3 since three of the elements are odd.
  */
  public static int countOdds( int[] data ) {
    int count = 0;

    for (var i=0; i<data.length; i++) {
      if (data[i]%2 == 1) {
        count+=1;
      } 
    }

    return count;
  }

  /**
     Parameters:
     data - an array of integers
     Returns:
     no return value since this is a void function -- but
     you will manipulate the values in the array parameter
     Postcondition:
     elements of the input array are in reverse order
     Example:
     If the input array contains 5,8,13,7,27,2
     After the routine, the array will contain 2,27,7,13,8,5
  */

  //5,8,13,7,27,2
  public static void flip( int[] data )
  {
    int[] newArray = new int[data.length];
    for (var i=data.length-1; i>=0; i--) {
      newArray[(data.length-1)-i] = data[i];
    }

    for (var i=0; i<data.length; i++) {
      data[i] = newArray[i];
    }
      
  }


  public static void main( String[] args )
  {

    // remove the comments as you complete each routine
    // and add more lines as you add additional routines.

    //challenge 1
    // int[] data2 = buildIncreasingArray(10,5,3);
    // printArray(data2);

    //challenge2
    // int[] data = buildRandomArray(10, 50);
    // printArray(data);

      //challenge3
      // int[] data3 = {1,5,2,7,5,8,5,12,19,5};
      // int first8 = firstOccurence(data3,8);
      // System.out.println(first8);

    //challenge4
    // int[] data4 = {1,2,3};
    // int sumTest = arraySum(data3);
    // System.out.println(sumTest);

    //challenge5
    // int[] data5 = {1,2,3};
    // boolean sortTest = isSorted(data5);
    // System.out.println(sortTest);

    // //challenge6
    // int[] data6 = {6,8,2,9,1,10,3};
    // int maxTest = findMaxValue(data6);
    // System.out.println(maxTest);

    //challenge7
    // int[] data7 = {1,2,3,4,5,6,7,8,9};
    // int oddTest = countOdds(data7);
    // System.out.println(oddTest);
      

    //challenge8
    int[] data8 = {1,2,3,4,5,6,7,8,9};
    flip(data8);
    printArray(data8);

    // add calls to show that the methods you write work.
  }
}