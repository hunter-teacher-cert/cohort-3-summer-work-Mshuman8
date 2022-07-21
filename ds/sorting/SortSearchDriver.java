import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {


	// Uncomment these to test part 1
	
	SortSearch ss = new SortSearch(20);
	// System.out.println(ss);
	
		
	// Uncomment these to test part 2

	int i;
	i = ss.findSmallestIndex(0);
	System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);

	i = ss.findSmallestIndex(3);
	System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
	
	// Uncomment these to test part 3

	// System.out.println(ss);
	ss.sort();
  System.out.println();
	// System.out.println(ss);

  // Test for Linear Search

  int linear1 = ss.linearSearch(8);
  System.out.print("An 8 is at: ");
  System.out.println(linear1);

  int linear2 = ss.linearSearch(2);
  System.out.print("An 2 is at: ");
  System.out.println(linear2);

  int linear3 = ss.linearSearch(ss.get(0));
  System.out.print("A " + ss.get(0) + " is at: ");
  System.out.println(linear3);

  int binary1 = ss.binarySearch(ss.get(0));
  System.out.print("A " + ss.get(0) + " is at: ");
  System.out.println(binary1);

  int binary2 = ss.binarySearch(2);
  System.out.print("An 2 is at: ");
  System.out.println(binary2);

  int binary3 = ss.binarySearch(8);
  System.out.print("An 8 is at: ");
  System.out.println(binary3);
  
	


	      

    }
}