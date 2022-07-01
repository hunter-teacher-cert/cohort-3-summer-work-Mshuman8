import java.io.*;
import java.util.*;


public class Demo{
    public static void main(String[] args) {

    // Converts a string: all lower case characters(ascii 97-122) are converted to uppercase (ascii 65-90)

        String name = "MariSa";
        int nameLength = name.length();
        String newName = "";

        for (var i=0; i<nameLength; i++) {

            //get individual char
            char currentChar = name.charAt(i);
            int asciiCode = (int) currentChar; //get ascii of current char
            
            if (asciiCode >= 97 && asciiCode <= 122) {
                System.out.println(currentChar + " is a lower case letter with an ascii number of " + asciiCode);
                asciiCode -= 32;
                
            }
            newName = newName + (char) asciiCode;
            
        }

        
    }

    //Prints out the second word of a sentence entered by a user. You can assume that the sentence does not begin with spaces, and that words are separated by spaces only and there are at lest three words in the sentence.



    //After lunch challenge
    // Go through the first word character by character without displaying anything
    // Precondition: someString does not begin with spaces. Words are separated by spaces.
    // Thus, someString in position 0 is not a space char.
    
//     int i = 0; //creating a variable to hold index value
//     while ( someString . charAt( i ) != ' ') //while the char at the index value is not a space
//     {
//       i++ ; // go to the next index
//     }

//     //String someString = "What is Java"

//     // Postcondition: someString in position i IS a space.
//     // Go through all the spaces after the first word


//     while (someString . charAt( i ) == ' ')
//     {
//       i++ ;
//     }


//     // Postcondition: someString in position i IS NOT a space.
//     // Go through the second word character by character and display each character.
//     // Precondition: someString[ i ] is the first letter of the second word
// //     while (someString [ i ] != ' ') // This only works for sentences of three words or more. Try to fix it!
// //     {
// //                      System.out.print( someString.charAt ( i ) );
// //       i++ ;
// //     }
    

// // }