// barGraphify(int[] nums); // takes an array of non-negative integers and prints a horizontal bar for each index, commensurate with the value at said index.

  
// _Exempli gratia,_ ????


// if x=[0,1,2,3] then barGraphify(x) will output
// 0:
// 1: =
// 2: ==
// 3: ===



// if x=[1,0,3,2] then barGraphify(x) will output
// 0: =
// 1:
// 2: ===
// 3: ==

public class Day3 {

  public static void barGraphify( int[] dataArray ) {
    // String result = "";
    

    
    for (int i=0; i<dataArray.length; i++) {
      String result = i+": ";
      
      for(int j=0; j<dataArray[i]; j++) {
        result += "=";  
      }
      result += "\n";
      System.out.println(result);
    }
    
  }
  
   
    
// vBarGraphify(int[] nums) takes an array of non-negative integers and prints a set of vertical bars visualizing the magnitude of the value at each index. Exempli gratia,
// Exempli gratia,
// if x=[0,1,2,3] then barGraphify(x) will output
//       * 
//     * * 
//   * * * 
// 0 1 2 3 

// if x=[1,0,3,2] then barGraphify(x) will output
//     *   
//     * * 
// *   * * 
// 0 1 2 3 

  //we will need a variable called row that keeps track of the row that we are currently making -- it starts at whatever the highest value is
  
  //we need another variable that is equal to the number of elements in the array -- to see how wide the graph needs to be

  // We will need to loop DOWN starting at the row variable and creating the string to print with spaces and astricks -- counting on in the row number <= the value that is in that position

  public static void vbarGraphify( int[] dataArray ) 
  {
    int row = dataArray[0];
    int numElements = dataArray.length;

    //determine maximum value (to determine how many stars vertically)
    for(int i = 0; i < dataArray.length; i++ ) {
        if(dataArray[i] > row) {
          row = dataArray[i];
        }
      }   
   
    for (int j=row; j>=0; j--) {

      String result = "";

      if (j>0) {
        for (int i = 0; i < dataArray.length; i++) {
        
        if (dataArray[i] >= j) {
          result += "*";
        } else {
          result += " ";
        }
        }
      }
      else {
        for (int i=0; i < dataArray.length; i++) {
          result += i;
        }
      }
      System.out.println(result);
    }
    
  }
  

  public static void main( String[] args ) 
  
  {
  int [] testArray2={0,1,2,3};
  int [] testArray1={1,0,3,2};  
  
    barGraphify(testArray1);
    barGraphify(testArray2);

    vbarGraphify(testArray1);
    vbarGraphify(testArray2);
  }

  
}