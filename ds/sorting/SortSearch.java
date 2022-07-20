import java.io.*;
import java.util.*;

/*

Sort Project:

Part 1:  (BASIC)
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm
  the behavior of the constructors.

  Part 2: (BASIC)
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortProjectDriver to test.

  Part 3: (INTERMEDIATE)
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortProjectDriver to test.



Search Project:
  1. Complete the linear search (BASIC)
  2. Complete the binary search (Intermediate)
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch{

    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 

    
    public SortSearch(){ //defaulted constructor -- not including parameters
	    data = new ArrayList<Integer>();
	    r = new Random();
      //fills the data ArrayList with 15 random numbers between 0 and 20.
	    for (int i=0;i<15;i++){
	      this.data.add(r.nextInt(20));
	    }
	
      }

  //overloaded constructor -- instead of creating an ArrayList that is 15 long, it makes one that is a specific number long.
    public SortSearch(int size){
    	this.data = new ArrayList<Integer>();
    	r = new Random();
    	for (int i=0;i<size;i++){
    	    this.data.add(r.nextInt(20));
    	}
	
    }

    /* Convenience function to get data out of the ArrayList from the driver */
    public int get(int index){
	return this.data.get(index);
    }
    


    /*
      return the index of the smallest data item from index start to the end of the ArrayList. If there are multiple of the smallest value, return any of them.
      
      Example, if the arraylist has:
      5,2,10,6,8
      if start was 2 (start at index 2, value 10) then it would return 3 which is the index of the value 6 which is the index with the smallest value from start to end

      On the other hand, if start was 0, then the method would return 1 since the value 3 is in index 1 and that is the smallest.
      
    */
    public int findSmallestIndex(int start){
    	int smallIndex = start;
      int minValue = this.data.get(start);

      for (int i=smallIndex; i<this.data.size(); i++) {
        if (this.data.get(i) < minValue) {
          minValue = this.data.get(i);
          smallIndex = i;
        }
      }
    	
    	return smallIndex;
    }


    /**
       Implement the selection sort algorithm by sorting the ArrayList
       data in place.

       Algorithm:
       Loop a variable that represents the ArrayList index from
       0 to the end of the ArrayList.
         For each index, find the smallest from that Location
	 to the end of the array and swap it with that index.
      5,2,10,6,8 (compare 5 to everything)

      2,5,10,6,8 (swap 2&5, compare 5 to everything else. Then compare 10 to everything)

      2,5,6,10,8 (swap 6&10, compare 10 with everything after)

      2,5,6,8,10 (swap 10&8)

    */
    public void sort(){

      for (int i=0; i<this.data.size()-1; i++) {

        int ogIValue = this.data.get(i); //get and store the original value at i index
        int minIndex = findSmallestIndex(i); //find the index of the smallest value in the list
        int minValue = this.data.get(minIndex); //get and store the minimum value at the smallest index (minIndex)

        this.data.set(i,minValue); //assign the minimum value to the i index
        this.data.set(minIndex,ogIValue); //assign the original i value to the place where the minimum index was.
      
        
      }

    }



    /* Search project starts here */
    
    /**
       performs a linear search. Returns the index of the first occurence of
       value in the ArrayList data or -1 if not found.

       This works by starting at the first element and searching one element at a time 
       until either the element is found or you've looked at all the elements.

       This algorithm works on any ArrayList.

    */
    public int linearSearch(int value){

      for (int i=0; i<this.data.size(); i++) {
        if (this.data.get(i) == value) {
          return i;
        }
        else {
          return -1;
        }
      }
	    // return 0; // replace this return
    }
    
    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
    public int binarySearch(int value){

      int lowInd = 0;
      int highInd = this.data.size() - 1;
      int midInd = highInd/lowInd;

      if (value == midInd) { // value is midInd
        return midInd;
      }
      
      else if (value > midInd) { //value is higher than midInd
        lowInd = midInd;
        midInd = highInd/lowInd;
        
      }
      else { //value is lower than midInd
        
      }
      

	// create assign variables  representing the high, low and middle indices 
	// while we're not done:
	//   if the item is at data.get(middle), return middle
	//   otherwise, update high, low, and middle

	return 0;
	    
    }
    
    /**
       Implement a RECURSIVE binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */

    public int binarySearchRecursive(int value, int lowIndex, int highIndex){

	// refer to class discussion
	
	return 0;
	    
    }
    
	
    public String toString(){
	return ""+data;
    };


    public void builtinSort(){
	Collections.sort(data);
	
    }
    

    
}
