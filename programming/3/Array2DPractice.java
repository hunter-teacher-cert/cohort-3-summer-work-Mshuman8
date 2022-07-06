import java.io.*;
import java.util.*;

/**
 * Array2DPractice by Team LucidThinkeren
 * Marisa Shuman
 * collaborators: Elizabeth Rechtin, Richard Parker, Will LaMorie
 */

/**
   INSTRUCTIONS:
   Place this file in a folder named programming/3/.
   This file contains the following completed method. Use it as a model
   to help you with the other methods:
   - buildBoard
   This file also contains stubs (empty methods) for the following
   methods (split into 3 levels):
   Basic level (complete all):
   - printBoard *
   - copyBoard *
   Intermediate level (complete Basic methods plus this method):
   - explodeSquare *
   Advanced level (complete Basic + Intermediate + these two methods):
   - explodeAllChar *
   - downString
   The routines with the * will be particularly helpful for the
   Conway's Game of Life project that you'll work on after this one.
*/


/**
   creates and returns a 2D array of size rowsxcols chars. All elements
   in the 2D array will be set to the char value.
   Ex: buildBoard(3,4,'x') will return this 2D array:
   xxxx
   xxxx
   xxxx
   xxxx
   Use this completed method as an example to help you with some of the
   other methods.
*/

public class Array2DPractice
{
  public static char[][] buildBoard( int rows, int cols, char value )
  {
    char[][] board = new char[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board[i][j]=value;
      }
    }
    return board;
  }

  /**
     pretty prints a 2D array of characters
     This should print the array as a grid
  */

  //void means the method will not have a return
  public static void printBoard( char[][] board ) {
    for (int i=0; i<board.length; i++) { //for loop to deal with each row

      for (int j=0; j<board[i].length; j++) { // for loop to deal with each column of each row

        //first need to print each cell
        System.out.print("" + board[i][j]);
      }

      //add a println
      System.out.println();
    }
  }

  /**
     Parameters:
     board - a 2D array of char
     row - the row you want to set
     value - the value to set all the elements in row
     Returns:
     Nothing
     Change the 2D array board so that all the elements in the
     specified row are set to value.
     Ex: Given array:
     xxxx
     xxxx
     xxxx
     xxxx
     setRow(board,2,'@') will change board to
     xxxx
     xxxx
     @@@@
     xxxx
  */
  public static void setRow( char[][] board, int row, char value )
  {
    for (int i=0; i<board.length; i++) {

      if (i == row) {
        for (int j=0; j<board[i].length; j++) {
          board[i][j] = value;
        }
      }
      
      
    }
  }


  /**
     creates and returns a new 2D array of char the same size as
     original and copies all the elements
  */
  public static char[][] copyBoard( char[][] original )
  {
    int rowLength = original.length;
    int colLength = original[0].length;

    char[][] newArray = new char[rowLength][colLength];

    for (var i=0; i<rowLength; i++) {

      for (var j=0; j<colLength; j++) {
        newArray[i][j] = original[i][j];
        
      }
      
    }
    return newArray;
  }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     Returns:
     nothing
     A location in a 2D array can be though of as having 6
     neighbors.  In the below 2D array, the neighbors of the element
     marked Q are the numbered elements.
     oooooo
     o123oo
     o4Q5oo
     o678oo
     oooooo
     This method should change all the neighbor cells (elements) to an X
     but not change the element at row,col
     Ex:
     Given the 2D array
     QQQQQ
     QQQQQ
     QQQQQ
     QQQQQ
     explodeSquare(board,1,1) will change the array to
     XXXQQ
     XQXQQ
     XXXQQ
     QQQQQ
     Note: Make sure to correctly handle the cases when you try
     to explode an element on the edges.
  */
  public static void explodeSquare( char[][] board, int row, int col )
  {

    //check to determine that the row is not the top or bottom

    //check that the column is not the left or right

    //If it is not, then put an x in the top, bottom, left, right, top left, top right, bottom left and bottom right.

    //if it IS, then...

    //if it is in top and NOT in the left or right edge
    //if it is in top and in the left edge
    //if it is in top and in the right edge

    //if it is in bottom and NOT in the left or right edge
    //if it is in bottom and in the left edge
    //if it is in bottom and in the right edge
    
    //if it is left or right and NOT in the top/bottom

    //combos

    /**
    //Will's suggestion
    // // for all from row -1 > row + 1 where value >= 0 and < board.length
    for(int i = row -1; i <= row +1; i++){ 
       
      if(i >=0 && i < board.length){ // constrain to board
    
         // we now have the 3 possbale values for row, but just on the board
    
         for(int j = col - 1; j <= col +1; j ++){
    
           if(j >= 0 && j < board[0].length){ // constrain to board
             
            if(i != row || j != col){
             board[i][j] = 'X'; // almost done
            }
           }
         }
        
       }
     }
    */

    board[row][col] = 'O';

    if (row != 0 && row != board.length-1) { //not on the top/bottom

      if (col != 0 && col != board[0].length-1) { //not on the left/right

        //we are at board[row][col]
        board[row-1][col] = 'x'; //above
        board[row+1][col] = 'x'; //below
        board[row][col-1] = 'x'; //left
        board[row][col+1] = 'x'; //right
        board[row-1][col-1] = 'x'; //above left
        board[row-1][col+1] = 'x'; //above right
        board[row+1][col-1] = 'x'; //below left
        board[row+1][col+1] = 'x'; //below right
        
        
      }
    } 
    else if (row == 0) { //top row
      if (col != 0 && col != board[0].length-1) { //top center
        board[row+1][col] = 'x'; //below
        board[row][col-1] = 'x'; //left
        board[row][col+1] = 'x'; //right
        board[row+1][col-1] = 'x'; //below left
        board[row+1][col+1] = 'x'; //below right
      }
      else if (col == 0) { //top left
        board[row+1][col] = 'x'; //below
        board[row][col+1] = 'x'; //right
        board[row+1][col+1] = 'x'; //below right
      }
      else if (col == board[0].length-1) { //top right
        board[row+1][col] = 'x'; //below
        board[row][col-1] = 'x'; //left
        board[row+1][col-1] = 'x'; //below left
      }
    }

    else if (row == board.length - 1) { //bottom
      if (col != 0 && col != board[0].length-1) { //bottom center
        board[row-1][col] = 'x'; //above
        board[row][col-1] = 'x'; //left
        board[row][col+1] = 'x'; //right
        board[row-1][col-1] = 'x'; //above left
        board[row-1][col+1] = 'x'; //above right
      }

      else if (col == 0) { //bottom left
        board[row-1][col] = 'x'; //above
        board[row][col+1] = 'x'; //right
        board[row-1][col+1] = 'x'; //above right
      }

      else if (col == board[0].length -1) { //bottom right
        board[row-1][col] = 'x'; //above
        board[row][col-1] = 'x'; //left
        board[row-1][col-1] = 'x'; //above left
      }
    }
    //you are on the left 
    else if (col == 0) {
      board[row-1][col] = 'x'; //above
      board[row+1][col] = 'x'; //below
      board[row][col+1] = 'x'; //right
      board[row-1][col+1] = 'x'; //above right
      board[row+1][col+1] = 'x'; //below right
    }
    //you are on the right
    else if (col == board[0].length-1) {
      board[row-1][col] = 'x'; //above
      board[row+1][col] = 'x'; //below
      board[row][col-1] = 'x'; //left
      board[row-1][col-1] = 'x'; //above left
      board[row+1][col-1] = 'x'; //below left
    }

  


    // return board;
    
  }

  /**
     This method will search through the 2D array board and it will
     explode each square that contains the char c (using the above
     definition of exploding).
     Example:
     Given the array
     qqzqq
     qqqqq
     qqqqq
     qqqqq
     qzqqq
     qqqqq
     qqqqz

     explodeAllchar(board,'z') will change board to:
     qXzXq
     qXXXq
     qqqqq
     XXXqq
     XzXqq
     XXXXX
     qqqXz
  */

  //sample board:
    // qqzqq
    // qqqqq
    // qqqzq
    // qqqqq
    // qzqqq

  // Go through each row
  // Go through each column
  // If the character in the position of the row,col is the specific char
  // Explode everything around it (explodeSquare())

  
  public static void explodeAllChar(char[][] board, char c)
  {

    for (int i=0; i<board.length; i++) {

      for (int j=0; j<board[0].length; j++) {
        
        if (board[i][j] == c) { //checking to see IF the char at the given location [i][j] is the given character
          explodeSquare(board,i,j);
        }
        
      }
      
    }
  }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     word - a String that you want to insert into the board.
     This will insert the parameter word into board in the downward
     direction. See examples below
     Example:
     Given this array
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     downString(board,1,1,"Hello") will change board to:
     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxxxx
     xOxxxx
     xxxxxx
     Given the above array, downString(board,4,3,"World") will
     change board to:
     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxWxx
     xOxOxx
     xxxRxx
     Note that the method has to stop at the bottom of the array.
  */
  public static void downString( char[][] board, int row, int col, String word )
  {
    /* YOUR AWESOME CODE HERE */
  }


  public static void main( String[] args )
  {
    char[][] board1 = buildBoard(5,10,'z');

    // printBoard(board1);

    setRow(board1, 2, 'M');

    // printBoard(board1);

    char[][] board2 = copyBoard(board1);

    char[][] board3 = buildBoard(5,5,'-');

    //board to test exploding all
    char[][] testExplodeAll = {{'-', '-', 'z', '-', '-'},
                     {'-', '-', '-', '-', '-'},
                     {'-', '-', '-', '-', '-'},
                     {'-', '-', '-', '-', '-'},
                     {'-', 'z', '-', '-', '-'},
                     {'-', '-', '-', 'z', '-'},
                     {'-', '-', '-', '-', 'z'}};

    printBoard(testExplodeAll);
    System.out.println();
    explodeAllChar(testExplodeAll,'z');
    printBoard(testExplodeAll);
    // printBoard(board2);

    explodeSquare(board2,1,1);
    // printBoard(board2);

    explodeSquare(board3,2,3);
    printBoard(board3);
    System.out.println();
    explodeSquare(board3,0,0);
    printBoard(board3);
    System.out.println();
    explodeSquare(board3,4,4);
    printBoard(board3);
    System.out.println();
    explodeSquare(board3,0,4);
    printBoard(board3);
    System.out.println();
    explodeSquare(board3,4,0);
    printBoard(board3);
    System.out.println();
    explodeSquare(board3,2,3);
    printBoard(board3);
    System.out.println();


    char[][] board4 = buildBoard(5,5,'-');

    
    
    /*
      Note, you can directly set elements in the board
      using array notation like b[3][2]='z' and you
      can use array notation to also access individual
      elements
    */

  }
}