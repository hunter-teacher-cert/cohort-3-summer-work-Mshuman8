
// Unsure of big q overall for this snippet, so making some understanding code notes, some what should we do next if notes

// If providing all code:  STUDENT-PROMPT:  What is name of method?  What does it return? What are the parameters? 

// method should search through data and return the index of the first time value appears in `data`. If value is not in data return -1.
public int linearSearch(int value, ArrayList<Integer> data) { 

    int foundIndex = -1; // STUDENT-PROMT : why set this value to be -1? 

    for (int i=0; i < data.size(); i++) { // MUST-ANSWER-Q: 
      //What is our declared variable? What is our condition? How are we incrementing?

      int element = data.get(i);

      if (element == value) {
        foundIndex = i;
        break; //DELIBRATE-ERROR: insert a line "i++;""
        }
      }
    return foundIndex;  

}

//Big Idea:  discussion for application in code

// Questions:

// 