import java.io.*;
import java.util.*;


public class Day2{
    public static void main(String[] args) {

        // // Allowing the programmer to determine the exact size of the array

        // Scanner input = new Scanner(System.in);
        // System.out.print("How many names do you want to include in the array? ");
        // int listLength = input.nextInt(); // getting the user's input
        // input.nextLine(); //getting a blank line
        // String myFriends[] = new String[listLength];

        // for (int i=0; i<listLength; i++) {
        //     System.out.print("Enter a name of one of your friends: ");
        //     myFriends[i] = input.nextLine();
        // }

        String myFriends[] = new String[1000];
        Scanner input = new Scanner(System.in);

        int numOfFriends = 0;
        String aFriend = "";

        while (!aFriend.equals("Stop")) {
            System.out.print("Enter a friend's name. Type Stop to end:");
            aFriend = input.nextLine();
            myFriends[numOfFriends] = aFriend;

            numOfFriends++; //incrementing the friends 
        }

        System.out.println("You have " + numOfFriends + " friends!");

        for (int i=0; i<numOfFriends; i++) {
            if (myFriends[i] != "Stop") {
                            System.out.println(myFriends[i]);
            }
        }

        
        


        
    }

}