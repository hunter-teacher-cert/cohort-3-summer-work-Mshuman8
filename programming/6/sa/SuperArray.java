/**
 * SuperArray by Team MarvelvsDC
 * First Last
 * collaborators: First Last, First Last
 */

/**
   SKELETON
   SuperArray is a wrapper class for an array.

   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length

   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;

public class SuperArray
{
  /**
     SUBGOAL:
     declare instance vars
     ...and initialize?
  */


  //instance vars
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    //init underlying/inner storage of specified capacity
    this.numberElements = 0;
    this.data = new int[size];

    //init instance vars
    /* YOUR SIMPLE+SMART CODE HERE */

  }

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    //init underlying/inner storage of capacity 10
        this.numberElements = 0;
        this.data = new int[10];
    //init instance vars
        /* YOUR SIMPLE+SMART CODE HERE */
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add( int value )
  {
    // test to see if we need to grow, then grow
    /**
       IMPORTANT:
       This is the first code that should run in this method
       but the last code you should write.
       Implement the rest of this method first,
       then only write this section once the rest is tested and working.
    */
    /* YOUR SIMPLE+SMART CODE HERE */
    int[] tempArray = new int[data.length+1];

    if (this.data.length <= numberElements) {
      for (int i=0; i<data.length; i++) {
        tempArray[i] = this.data[i];
      }
      this.data = tempArray;
    }
    // add item
    /* YOUR SIMPLE+SMART CODE HERE */
    this.data[this.numberElements] = value;
    
    // increment numberElements
    /* YOUR SIMPLE+SMART CODE HERE */
    this.numberElements ++;
      
  }//end add()


  public boolean isEmpty()
  {

    if (this.numberElements == 0) {
      return true;
    }
    else {
      return false;
    }
    
    //return whether this SuperArray instance is empty
    /* YOUR SIMPLE+SMART CODE HERE */
    
  }


  public int get(int index)
  {
    //return item at index
    /* YOUR SIMPLE+SMART CODE HERE */
    return this.data[index];
      
  }


  public String toString() {
    String output = "";
    for (int i=0; i<this.data.length; i++) {
      if (data[i] == 0) {
        output += "- ";
      }
      else {
        output += this.data[i] + " ";
      }
    }
    return output;
    /* YOUR SIMPLE+SMART CODE HERE */
  }//end toString()


  // //return Stringified version of this Object,
  // // with extra debugging info
  // //(helper method for debugging/development phase)
  public String debug(){
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()


  public void remove(int index){
    for (int i=index; i<this.data.length; i++) {
      if (i <= this.data.length-2) {
        this.data[i] = this.data[i+1];
      }
      else {
        this.data[i] = 0;
      }
    }

    numberElements -= 1;

    // subtract fom numElements;
    /* YOUR SIMPLE+SMART CODE HERE */
  }


  public void add(int index, int value)
  {
    // see if there's enough room
    if (this.numberElements < this.data.length) {
      for (int i=this.data.length-1; i>=index; i--) {
        if (i != index) {
          this.data[i] = this.data[i-1];
        }
        else {
          this.data[i] = value;
        }
      }
      numberElements += 1;
    }
      

  //   // shift elements toward the end of the array
  //   /* YOUR SIMPLE+SMART CODE HERE */

  //   // insert new element
  //   /* YOUR SIMPLE+SMART CODE HERE */

  //   // increment numElements
  //   /* YOUR SIMPLE+SMART CODE HERE */
  }


  public void grow()
  {
    int[] tempArray = new int[this.data.length*2];

    for (int i=0; i<this.data.length; i++) {
      tempArray[i] = this.data[i];
    }

    this.data = tempArray;
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?
    /* YOUR SIMPLE+SMART CODE HERE */

    // copy over all the elements from the old array to the new one
    /* YOUR SIMPLE+SMART CODE HERE */

    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?
    /* YOUR SIMPLE+SMART CODE HERE */
  }//end grow()

}//end class