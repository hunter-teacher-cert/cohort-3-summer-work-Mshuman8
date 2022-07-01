import java.io.*;
import java.util.*;

public class ArraysEx {

    static int[] someData = new int[] {45,23,78,99,12};
    static int someDataLength = someData.length;

    // static someData[3] = 0;
    // static someData[4] = 0;

    static int someDataSize = 3;

    public static void main(String args[]) {

        printArray(someData);
        printPartialArray(someData,someDataSize);
        int theIndex = find(67,someData);
        System.out.println("78 is in position " + theIndex);
        theIndex = find(99,someData);
        System.out.println("99 is in position " + theIndex);
    }

    //precondition: assumes array is filled
    public static void printArray(int [] data) {
        for (int i=0; i<data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }

    //precondition: assume array is partially filled
    public static void printPartialArray(int [] data, int currSize) {
        
        for (int i=0; i<currSize; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }

    //returns position of target Item if found
    // If not found return the array size
    public static int find (int targetItem, int[] data) {
        for (int i=0; i<data.length; i++) {
            if (data[i] == targetItem) {
                return i;
            }
        }
        //post condition: loop ended
        return data.length;
    }
    
}