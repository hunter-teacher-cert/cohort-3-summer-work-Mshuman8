import java.io.*;
import java.util.*;

/**
For all attempted methods, make sensible decisions for error and
edge cases (such as indexing out of bounds).

Basic
-----
add(string value)
get(int index);
toString()


Intermediate (at least add, size + one of the other two)
------------
size()
add(int index,String value)
indexOf(String value);
toArray()


Challenge
--------
remove(int index);
*/

public class LinkedList{

  private Node head;

  public LinkedList(){
    head = null;
  }

  /**
  Parameters:
  value - the new string to add to the list

  Adds a new node containing value to the front of the list.
  */
  public void add(String value){
    Node addNode = new Node(value);
    addNode.setNext(this.head);
    this.head = addNode;
  }

  /**
  Returns the String in the node at location index.
  */
  public String get(int index){

    Node tempNode = this.head;
    String result = "";

    for (int i=0; i< index; i++) {
      tempNode = tempNode.getNext();
    }

    result += tempNode;
    
    return result;
  }

  /**
  Return a string representation of the list
  */
  public String toString(){
    String result = "";
    Node tempNode = this.head;
    
    while (tempNode != null) {
      
      result = result + tempNode; //this will automatically call the toString method of the node
      tempNode = tempNode.getNext();
    }
    
    return result;
  }

  /**
  returns the number of elements in the list
  */
  public int size(){
    Node tempNode = this.head;
    int counter = 0;

    while (tempNode != null) {
      tempNode = tempNode.getNext();
      counter += 1;
    }
    
    return counter;
  }



  /**
  Parameters:
  index - an int with the location to add
  value - the new value

  Adds a new node with the String value to the list.
  The new node should be added at the location specified by the index.

  For example, given the list:
  "a" -> "b" -> "c" -> "d"

  add(1,"z") results in:
  "a"-> "z" -> "b" -> "c" -> "d"

  */
  public void add(int index, String value){
    Node tempNode = this.head;
    Node insertNode = new Node(value);

    if (index == 0) {
      this.add(value);
    }
    else {
      for (int i=0; i<index-1; i++) { //gets us to the index value where we want to insert the item
      tempNode.getNext();
      }

      insertNode.setNext(tempNode.getNext());
      tempNode.setNext(insertNode);
      
    }
    
    
    
  }


  /**
  Returns the index (location) of the first node in the list
  that contains value.

  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.

  */
  public int indexOf(String value){
    Node tempNode = this.head;
    int counter = 0;

    while (tempNode != null) {
      
      if (tempNode.getData() == value) {
        return counter;
      }
      tempNode = tempNode.getNext();
      counter ++;
      
    }
    return -1;
  }


  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.

  It should then copy all of the values to the array and return
  the array.

  */
  public String[] toArray(){
    Node tempNode = this.head;

    int size = 0;

    while (tempNode != null) {
      tempNode = tempNode.getNext();
      size ++;
    }

    String result[]; 
    result = new String[size];
    tempNode = this.head;
    for (int i = 0; i< result.length && tempNode != null; i++){
      result[i] = tempNode.getData();
      tempNode = tempNode.getNext();
    }
    
    return result;
  }

  

  /**
  Remove the Node at location index from the list.

  Ex:
  
  Given the list:
  "a"->"b"->"c"->"d"->"e"

  remove(2) results in:
  "a"->"b"->"d"->"e"
  */
  public void remove(int index){
  }
}