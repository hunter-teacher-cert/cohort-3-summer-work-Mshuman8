import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    
    LinkedList l = new LinkedList();

    l.add("one");
    l.add("two");
    l.add("three");
    System.out.println(l);

    String testGet = l.get(1);
    System.out.println(testGet);
    
    
  }
}