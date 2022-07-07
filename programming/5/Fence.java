/**
 * Recursion Practice with Strings by Team SweatEquity
 * Marisa Shuman
 * collaborators: Susie Seccafico, Sam Lojacono, Wayne Tobias
 */

public class Fence
{

  /**
     String fenceR(int) -- recursive fence generator
     precond:  input is a positive integer
     postcond: returns fence with n posts
     eg
     fenceR(1) -> "|"
     fenceR(2) -> "|--|"
     fenceR(3) -> "|--|--|"
  */
  public static String fenceR( int n )
  {
    // Make a variable to start and have it equal to "|"
    // Keep adding "--|" until we have reached the number
    // Do ^ by making a for loop

    // String totalFence = "|"; //variable to hold finished fence
    // String toAdd = "--|"; //variable to hold each additional piece

    //create a conditional to check if n = 1 -- if it is then the fence is totalFence (return it)
    
    if (n==0) {
      return "";
    }
    
    else if (n==1) { //base case
      return "|";
    }

    //then for everything else: add totalFence and toAdd and then call the function again.
    else {
      String currentFence = "|--" + fenceR(n-1);
      return currentFence;
    }
    
    // for (int i=2; i<n; i++) {
    //   totalFence += toAdd; //totalFence = totalFence + toAdd 
    //   //this will take whatever the totalFence is currently and add "--|"
    // }

    // return totalFence;
  }


  public static void main( String[] args )
  {
    System.out.println(fenceR(3));
    
    for( int i = 0; i < 10; i++ ) {
      System.out.println( i + "-post fences: " );
      System.out.println( fenceR(i) );
    }

    /* feel free to add extra tests... */

  }
}