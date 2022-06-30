import java.io.*;
import java.util.*;


public class Nim {
    public static void main(String[] args) {
        int stones = 12;
        int stonesTaken = 0;

        Scanner input = new Scanner(System.in);

        //loop until the game ends

        while(stones > 0) {

            //checking if the while loop is working -- printing stones >0 for each time and then decreasing stones by 1
            // System.out.print("Stones >0 ");
            // stones -= 1;
            //prompt the user for input

            System.out.println("How many stones would you like to remove (pick between 1 and 3).");
            int userChoice = input.nextInt();
            System.out.println("You decided to remove " + userChoice + " stones." );
            

            //calculate number of stones remaining and print it
            stonesTaken += userChoice;
            stones -= userChoice;
            System.out.println("There are " + stones + " left");

            //check for win
            if (stones == 0) {
               System.out.println("Congratulations, you won!"); 
            }

            else {
                //machine takes a turn

                double randNum = Math.random() * (3);
                int rounded = (int) randNum;
                rounded += 1;

                System.out.println("The computer has selected to remove " + rounded + " stones.");
                


                stonesTaken += rounded;
                stones -= rounded;
                System.out.println("There are " + stones + " left");

                //check for win

                if (stones <= 0) {
                   System.out.println("The Computer won!"); 
                }
            }

            
        }
        
    }
}