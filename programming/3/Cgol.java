import java.io.*;
import java.util.*;

/**
 * Conway's Game of Life by Team AreWeSentientYet?
 * Marisa Shuman
 * collaborators: Shana Henry, Jihae Park, Seth Adams
 */

/**
   The Rules of Life:
   Survivals:
   * A living cell with 2 or 3 living neighbours will survive for the next generation.
   Deaths:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.
   Births:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.
   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation.
*/

public class Cgol
{

  //create, initialize, and return  empty board (all cells dead)
  public static char[][] createNewBoard( int rows, int cols )
  {

    char[][] board = new char[rows][cols];

    for (int i=0; i<rows; i++) {
      
      for (int j=0; j<cols; j++) {
        board[i][j] = '-';
      }
      
    }
    return board;

  }


  //print the board to the terminal
  public static void printBoard( char[][] board ) {
    
    for (int i=0; i<board.length; i++) {
      for (int j=0; j<board[0].length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  
  }


  //set cell (r,c) to val
  public static void setCell( char[][] board, int r, int c, char val )
  {
    board[r][c] = val;
  }


  //return number of living neigbours of board[r][c]
  public static int countNeighbours( char[][] board, int r, int c )
  {

    int count = 0; 

    //start at the r to the top left -- iterate over that until it is at the bottom right. count 

    for (int i=r-1; i<=r+1; i++) {

      for (int j=c-1; j<=c+1; j++) {
        
      // if (i!=r && j!= c) {
        if (i >= 0 && i < board.length) {
          if (j >= 0 && j < board[0].length) {
            
            if (board[i][j] == 'X') {
              count ++;
            }
                
          }
        }
      // } 
      }
      
    }
    if (board[r][c] == 'X') {
          count --;
        }

    return count;

  }


  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     (alive 'X', dead ' ')
  */
  public static char getNextGenCell( char[][] board,int r, int c )
  {

    int numLive = countNeighbours(board,r,c);

    if (board[r][c] == 'X' && (numLive < 2 || numLive > 3)) {
      //alive cell with either less than 2 or greater than 3 neighbors
      return '-';
    }

    else if (board[r][c] == '-' && numLive == 3) {
      return 'X';
    }
    return board[r][c];
    

      //Survival: 
      //A living cell with 2 or 3 living neighbours will survive for the next generation.
   // Deaths:
   //  Each cell with >3 neighbours will die from overpopulation.
   //  Every cell with <2 neighbours will die from isolation.
   // Births:
   // Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.

  }


  //generate and return a new board representing next generation
  public static char[][] generateNextBoard( char[][] board ) {

    //create a new variable to hold a new temporary board
    //iterate through the entire original board and run the getNextGenCell() on it and store the result in the new temporary board
    //return the new temporary board

    char[][] tempBoard = createNewBoard(board.length, board[0].length);

    for (int i=0; i<board.length; i++) {

      for (int j=0; j<board[0].length; j++) {

        tempBoard[i][j] = getNextGenCell(board,i,j);
        
      }
      
    }
    return tempBoard;
  }


  public static void main( String[] args )
  {
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    char[][] board;
    board = createNewBoard(25,25);
    //breathe life into some cells:
    setCell(board, 0, 0, 'X');
    setCell(board, 0, 1, 'X');
    setCell(board, 1, 0, 'X');
    // TASK:
    // Once your initial version is running,
    // try out different starting configurations of living cells...
    // (Feel free to comment out the above three lines.)
    System.out.println("Gen X:");
    printBoard(board);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");

    int test1 = countNeighbours(board,0,0);
    System.out.println(test1);
    
    board = generateNextBoard(board);
    System.out.println("Gen X+1:");
    printBoard(board);
    System.out.println("--------------------------\n\n");

    board = generateNextBoard(board);
    System.out.println("Gen X+2:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class