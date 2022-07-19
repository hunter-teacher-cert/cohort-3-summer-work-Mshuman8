import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    
    LinkedList l = new LinkedList();

    l.add("SE1");
    l.add("SE2");
    l.add("APCSP");
    l.add("HR");
    System.out.print("Test of .add(): ");
    System.out.println(l);

    String testGet = l.get(1);
    System.out.print("Test of .get(): ");
    System.out.println(testGet);
    
    int sizeTest = l.size();
    System.out.print("Test of .size(): ");
    System.out.println(sizeTest);

    l.add(4,"SE3");
    l.add(0,"zero");
    System.out.print("Test of .add() part 2: ");
    System.out.println(l);

    int indexTest = l.indexOf("SE3");
    System.out.print("Test of .indexOf(): ");
    System.out.println(indexTest);

    System.out.print("Test of .toArray(): ");
    String[] testArray = l.toArray();
    for (int i=0; i<testArray.length; i++) {
      System.out.println(testArray[i]);
    }
  }
}