import java.io.*;
import java.util.*;

/** Methods to write

Basic level:
------------
public static ArrayList<Integer> buildRandomList(int size, int maxval)
public static int sumOfList(ArrayList<Integer> dataList)

Intermediate level:
-------------------
public static void swapElements(ArrayList<Integer> dataList, int indexA,int indexB)
public static void removeValue(ArrayList<Integer> dataList, int valueToRemove)

Challenge level:
-------------------
public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
*/


public class AlPractice{

  /**
  Parameters:
  - size - an integer representing how many items to add to the list
  - maxval - the largest value to store in the list
  Preconditions:
  - size >= 0
  - maxVal > 0
  Returns:
  - A new ArrayList of Integers with each value being a random
    number between 0 and maxval (not including maxval).
  */
  public static ArrayList<Integer> buildRandomList(int size, int maxval){
    
    ArrayList <Integer> newList = new ArrayList <Integer>(size);

    Random random = new Random(); //initializing the random
    
    for (int i=0; i<size; i++) {
      
      newList.add(random.nextInt(maxval)); // getting a random number and adding to the list for 
    }
    
    
    return newList;//placeholder to compile.
  }

  /**
  Parameters:
  - dataList - an ArrayList of integer values.
  Returns:
  - The sum of all of the elements of the ArrayList.
  */
  public static int sumOfList(ArrayList<Integer> dataList){
    int sum = 0;

    for (int i=0; i<dataList.size(); i++) {
      sum += dataList.get(i);
    }
    
    return sum;
  }

  /**
  Parameters:
  - dataList - an ArrayList of Integers
  - index1, index2 - the two locations to swap.
  Preconditions:
  - index1 and index2 are valid indecies of dataList
  Postconditions:
  - The ArrayList is modified such that
    The value that was in dataList[index1] is now in dataList[index2], and
    the value  that was in dataList[index2] is now in dataList[index1].
  - No other values should be modified.
  */
  public static void swapElements(ArrayList<Integer> dataList, int index1,int index2){

    int ind1Val = dataList.get(index1);
    int ind2Val = dataList.get(index2);

    dataList.add(index1,ind2Val);
    dataList.add(index2,ind1Val);

  }

  /**
  Parameters:
  - dataList - an ArrayList of Integers
  - valueToRemove - the value to remove
  Postconditions:
  - The dataList is modified such that all occurances of valueToRemove are removed.
  */
  public static void removeValue(ArrayList<Integer> dataList, int valueToRemove){

    for (int i=dataList.size()-1; i>0; i--) {
      if (dataList.get(i) == valueToRemove) {
        dataList.remove(i);
      }
    }
    
  }


  /**
  Parameters:
  - ListA,ListB - ArrayLists of integer values.
  Preconditions:
  - ListA and ListB have equal lengths.
  Returns:
  - A new ArrayList that contains the sum of the corresponding indecies of the two arraylists.
    e.g. sumLists( [1,2,3], [4,0,5]) would return: [5,2,8]
  Postconditions:
  - The parameter ArrayLists should not be modified.
  */
  public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB){

    ArrayList <Integer> sumArray = new ArrayList <Integer>(ListA.size());

    for (int i=0; i<ListA.size(); i++) {
      int sum = ListA.get(i) + ListB.get(i);
      sumArray.add(i,sum);
    }
    return sumArray;
  }

  /** zipLists
  Parameters:
  - ListA,ListB - ArrayLists of integer values.
  Returns:
  - A new ArrayList that contains all of the elements from both ArrayLists in alternating order starting with ListA's first element.
    When one list has no more values to add, continue adding the remaining values of the longer list.
    e.g. zipLists( [1,2,3,4], [8,9]) would return: [1,8,2,9,3,4]
  Postconditions:
  - The parameter ArrayLists should not be modified.
  */
  public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB){

    ArrayList <Integer> zipList = new ArrayList <Integer>(ListA.size()*2);

    for (int i=0; i<ListA.size(); i++) {
      zipList.add(i,ListA.get(i));
      zipList.add(2*i,ListB.get(i));
    }
    
    return zipList;//placeholder to compile.
  }




  public static void main(String[] args) {

    ArrayList<Integer> al;
    ArrayList<Integer> arrayList2;
    ArrayList<Integer> arrayList3;
    ArrayList<Integer> sumArrays;
    ArrayList<Integer> zippedTest;

    //Uncomment these to test buildRandomList
    al = buildRandomList(10,100);
    System.out.println(al);

    int sumAl = sumOfList(al);
    System.out.print("The sum of the list is: ");
    System.out.println(sumAl);

    //Uncomment these to test swapElements
    swapElements(al,2,6); // NOTE: had to include al
    System.out.println(al);

    //Removing all 8s from a list
    removeValue(al,8);
    System.out.println(al);

    // Uncomment these to test removeValue
    al.add(5);
    al.add(10);
    al.add(5);
    al.add(13);
    al.set(2,5);
    al.set(3,5);
    System.out.println(al); // needed al, not a
    removeValue(al,5);
    System.out.println(al); // needed al, not a


    arrayList2 = buildRandomList(10,100);
    System.out.print("The first list is:");
    System.out.println(arrayList2);
    
    arrayList3 = buildRandomList(10,100);
    System.out.print("The second list is:");
    System.out.println(arrayList3);

    sumArrays = sumLists(arrayList2, arrayList3);
    System.out.print("The sum list is:");
    System.out.println(sumArrays);

    zippedTest = zipLists(arrayList2,arrayList3);
    System.out.print("The zipped list is:");
    System.out.println(zippedTest);
  }

}