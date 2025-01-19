// Linear search algorithm 
LinearSearch(numbers, numbersSize, key) {
   i = 0

   for (i = 0; i < numbersSize; ++i) {
      if (numbers[i] == key) {
         return i
      }
   }
      
   return -1 // not found
}
   
main() {
   numbers = {2, 4, 7, 10, 11, 32, 45, 87}
   NUMBERS_SIZE = 8
   i = 0
   key = 0
   keyIndex = 0
      
   print("NUMBERS: ")
   for (i = 0; i < NUMBERS_SIZE; ++i) {
      print(numbers[i] + " ")
   }
   printLine()
      
   print("Enter a value: ")
   key = getIntFromUser()
      
   keyIndex = LinearSearch(numbers, NUMBERS_SIZE, key)
      
   if (keyIndex == -1) {
      printLine(key + " was not found.")
   } 
   else {
      printLine("Found " + key + " at index " + keyIndex + ".")
   }
}



// Binary search algorithm
BinarySearch(numbers, numbersSize, key) {
   mid = 0
   low = 0
   high = numbersSize - 1
   
   while (high >= low) {
      mid = (high + low) / 2
      if (numbers[mid] < key) {
         low = mid + 1
      }
      else if (numbers[mid] > key) {
         high = mid - 1
      }
      else {
         return mid
      }
   }
   
   return -1 // not found
}

main() {
   numbers = { 2, 4, 7, 10, 11, 32, 45, 87 }
   NUMBERS_SIZE = 8
   i = 0
   key = 0
   keyIndex = 0
   
   print("NUMBERS: ")
   for (i = 0; i < NUMBERS_SIZE; ++i) {
      print(numbers[i] + " ")
   }
   printLine()
   
   print("Enter a value: ")
   key = getIntFromUser()
   
   keyIndex = BinarySearch(numbers, NUMBERS_SIZE, key)
   
   if (keyIndex == -1) {
      printLine(key + " was not found.")
   }
   else {
      printLine("Found " + key + " at index " + keyIndex + ".")
   }
}



// Doubly-linked list with 2 dummy nodes: append, prepend, insert after and remove operations. 
ListAppend(list, newNode) {
   newNode⇢prev = list⇢tail⇢prev
   newNode⇢next = list⇢tail
   list⇢tail⇢prev⇢next = newNode
   list⇢tail⇢prev = newNode
}

ListPrepend(list, newNode) {
   firstNode = list⇢head⇢next
   newNode⇢next = list⇢head⇢next
   newNode⇢prev = list⇢head
   list⇢head⇢next = newNode
   firstNode⇢prev = newNode
}
ListInsertAfter(list, curNode, newNode) {
   if (curNode == list⇢tail) {
      // Can't insert after dummy tail
      return
   }
   
   sucNode = curNode⇢next
   newNode⇢next = sucNode
   newNode⇢prev = curNode
   curNode⇢next = newNode
   sucNode⇢prev = newNode
}

ListRemove(list, curNode) {
   if (curNode == list⇢head || curNode == list⇢tail) {
      // Dummy nodes cannot be removed
      return
   }

   sucNode = curNode⇢next 
   predNode = curNode⇢prev 
  
   // Successor node is never null
   sucNode⇢prev = predNode
  
   // Predecessor node is never null
   predNode⇢next = sucNode
}


// Singly-linked list with dummy node: append, prepend, insert after, and remove after operations.
ListAppend(list, newNode) {
   list⇢tail⇢next = newNode
   list⇢tail = newNode
}


ListPrepend(list, newNode) {
   newNode⇢next = list⇢head⇢next
   list⇢head⇢next = newNode
   if (list⇢head == list⇢tail) { // empty list
      list⇢tail = newNode;
   }
}


ListInsertAfter(list, curNode, newNode) {
   if (curNode == list⇢tail) { // Insert after tail
      list⇢tail⇢next = newNode
      list⇢tail = newNode
   }
   else { 
      newNode⇢next = curNode⇢next
      curNode⇢next = newNode
   }
}


ListRemoveAfter(list, curNode) {
   if (curNode is not null and curNode⇢next is not null) {
      sucNode = curNode⇢next⇢next
      curNode⇢next = sucNode
     
      if (sucNode is null) {
         // Removed tail
         list⇢tail = curNode
      }
   }
}



// Doubly-linked list with dummy node: append, prepend, insert after, and remove operations.
ListAppend(list, newNode) {
   list⇢tail⇢next = newNode
   newNode⇢prev = list⇢tail
   list⇢tail = newNode
}


ListPrepend(list, newNode) {
   firstNode = list⇢head⇢next

   // Set the next and prev pointers for newNode
   newNode⇢next = list⇢head⇢next
   newNode⇢prev = list⇢head

   // Set the dummy node's next pointer
   list⇢head⇢next = newNode

   // Set prev on former first node
   if (firstNode is not null) {
      firstNode⇢prev = newNode
   }
}


ListInsertAfter(list, curNode, newNode) {
   if (curNode == list⇢tail) { // Insert after tail
      list⇢tail⇢next = newNode
      newNode⇢prev = list⇢tail
      list⇢tail = newNode
   }
   else {
      sucNode = curNode⇢next
      newNode⇢next = sucNode
      newNode⇢prev = curNode
      curNode⇢next = newNode
      sucNode⇢prev = newNode
   }
}


ListRemove(list, curNode) {
   if (curNode == list⇢head) {
      // Dummy node cannot be removed
      return
   }

   sucNode = curNode⇢next 
   predNode = curNode⇢prev 
  
   if (sucNode is not null) {
      sucNode⇢prev = predNode   
   }
  
   // Predecessor node is always non-null
   predNode⇢next = sucNode
  
   if (curNode == list⇢tail) { // Removed tail
      list⇢tail = predNode
   }
}




// Stack push, resize, and pop operations.     
ArrayStackPop(stack) {
   popped = stack⇢array[stack⇢length - 1]
   stack⇢length = stack⇢length - 1
   return popped
}

ArrayStackPush(stack, item) {
   // Cannot push if at maximum length
   if (stack⇢length == stack⇢maxLength) {
      return false
   }

   // Resize if length equals allocation size
   if (stack⇢length == stack⇢allocationSize) {
      ArrayStackResize(stack)
  }

   // Push the item and return true
   stack⇢array[stack⇢length] = item
   stack⇢length = stack⇢length + 1
   return true
}

ArrayStackResize(stack) {
   newSize = stack⇢allocationSize * 2
   if (stack⇢maxLength > 0) {
      newSize = min(newSize, stack⇢maxLength)
   }
   newArray = Allocate new array of size newSize
   Copy all elements from stack⇢array to newArray
   stack⇢array = newArray
   stack⇢allocationSize = newSize
}





// A recursive method carrying out a binary search algorithm.   
import java.util.Scanner;

public class NumberGuessGame {
   public static void guessNumber(int lowVal, int highVal, Scanner scnr) {
      int midVal;            // Midpoint of low..high
      char userAnswer;       // User response

      midVal = (highVal + lowVal) / 2;

      // Prompt user for input
      System.out.print("Is it " + midVal + "? (l/h/y): ");
      userAnswer = scnr.next().charAt(0);

      if ((userAnswer != 'l') && (userAnswer != 'h')) { // Base case: found number
         System.out.println("Thank you!");
      }
      else {                                            // Recursive case: split into lower OR upper half
         if (userAnswer == 'l') {                       // Guess in lower half
            guessNumber(lowVal, midVal, scnr);            // Recursive call
         }
         else {                                         // Guess in upper half
            guessNumber(midVal + 1, highVal, scnr);           // Recursive call
         }
      }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Print game objective, user input commands
      System.out.println("Choose a number from 0 to 100.");
      System.out.println("Answer with:");
      System.out.println("   l (your num is lower)");
      System.out.println("   h (your num is higher)");
      System.out.println("   any other key (guess is right).");

      // Call recursive function to guess number
      guessNumber(0, 100, scnr);
   }
}





// eg: Recursively searching a sorted list.
import java.util.Scanner;
import java.util.ArrayList;

public class NameFinder {
   /* Finds index of string in vector of strings, else -1.
      Searches only with index range low to high
      Note: Upper/lower case characters matter
   */
   public static int findMatch(ArrayList<String> stringList, String itemMatch, 
                               int lowVal, int highVal) {
      int midVal;        // Midpoint of low and high values
      int itemPos;       // Position where item found, -1 if not found
      int rangeSize;     // Remaining range of values to search for match

      rangeSize = (highVal - lowVal) + 1;
      midVal = (highVal + lowVal) / 2;

      if (itemMatch.equals(stringList.get(midVal))) {           // Base case 1: item found at midVal position
         itemPos = midVal;
      }
      else if (rangeSize == 1) {                                // Base case 2: match not found
         itemPos = -1;
      }
      else {                                                    // Recursive case: search lower or upper half
         if (itemMatch.compareTo(stringList.get(midVal)) < 0) { // Search lower half, recursive call
            itemPos = findMatch(stringList, itemMatch, lowVal, midVal);
         }
         else {                                                 // Search upper half, recursive call
            itemPos = findMatch(stringList, itemMatch, midVal + 1, highVal);
         }
      }

      return itemPos;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<String> attendeesList = new ArrayList<String>(); // List of attendees
      String attendeeName;                                       // Name of attendee to match
      int matchPos;                                              // Matched position in attendee list

      // Omitting part of program that adds attendees
      // Instead, we insert some sample attendees in sorted order
      attendeesList.add("Adams, Mary");
      attendeesList.add("Carver, Michael");
      attendeesList.add("Domer, Hugo");
      attendeesList.add("Fredericks, Carlos");
      attendeesList.add("Li, Jie");

      // Prompt user to enter a name to find
      System.out.print("Enter person's name: Last, First: ");
      attendeeName = scnr.nextLine(); // Use nextLine() to allow space in name
     
      // Call function to match name, output results
      matchPos = findMatch(attendeesList, attendeeName, 0, attendeesList.size() - 1);
      if (matchPos >= 0) {
         System.out.println("Found at position " + matchPos + ".");
      }
      else {
         System.out.println("Not found.");
      }
   }
}




// Output statements can help debug recursive methods, especially if indented based on recursion depth.
import java.util.Scanner;
import java.util.ArrayList;

public class NameFinder {
   /* Finds index of string in vector of strings, else -1.
      Searches only with index range low to high
      Note: Upper/lower case characters matter
   */
   public static int findMatch(ArrayList<String> stringList, String itemMatch,
                               int lowVal, int highVal, String indentAmt) { // indentAmt used for print debug
      int midVal;        // Midpoint of low and high values
      int itemPos;       // Position where item found, -1 if not found
      int rangeSize;     // Remaining range of values to search for match

      System.out.println(indentAmt + "Find() range " + lowVal + " " + highVal);
      rangeSize = (highVal - lowVal) + 1;
      midVal = (highVal + lowVal) / 2;

      if (itemMatch.equals(stringList.get(midVal))) {           // Base case 1: item found at midVal position
         System.out.println(indentAmt + "Found person.");
         itemPos = midVal;
      }
      else if (rangeSize == 1) {                                // Base case 2: match not found
         System.out.println(indentAmt + "Person not found.");
         itemPos = -1;
      }
      else {                                                    // Recursive case: search lower or upper half
         if (itemMatch.compareTo(stringList.get(midVal)) < 0) { // Search lower half, recursive call
            System.out.println(indentAmt + "Searching lower half.");
            itemPos = findMatch(stringList, itemMatch, lowVal, midVal, indentAmt + "   ");
         }
         else {                                                 // Search upper half, recursive call
            System.out.println(indentAmt + "Searching upper half.");
            itemPos = findMatch(stringList, itemMatch, midVal + 1, highVal, indentAmt + "   ");
         }
      }

      System.out.println(indentAmt + "Returning pos = " + itemPos + ".");
      return itemPos;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<String> attendeesList = new ArrayList<String>(); // List of attendees
      String attendeeName;                                       // Name of attendee to match
      int matchPos;                                              // Matched position in attendee list

      // Omitting part of program that adds attendees
      // Instead, we insert some sample attendees in sorted order
      attendeesList.add("Adams, Mary");
      attendeesList.add("Carver, Michael");
      attendeesList.add("Domer, Hugo");
      attendeesList.add("Fredericks, Carlos");
      attendeesList.add("Li, Jie");

      // Prompt user to enter a name to find
      System.out.print("Enter person's name: Last, First: ");
      attendeeName = scnr.nextLine(); // Use nextLine() to allow space in name

      // Call function to match name, output results
      matchPos = findMatch(attendeesList, attendeeName, 0, attendeesList.size() - 1, "   ");
      if (matchPos >= 0) {
         System.out.println("Found at position " + matchPos + ".");
      }
      else {
         System.out.println("Not found.");
      }
   }
}




// Fibonacci sequence step-by-step.
import java.util.Scanner;

public class FibonacciSequence {
   /* Output the Fibonacci sequence step-by-step.
      Fibonacci sequence starts as:
      0 1 1 2 3 5 8 13 21 ... in which the first
      two numbers are 0 and 1 and each additional
      number is the sum of the previous two numbers
   */
   public static void computeFibonacci(int fibNum1, int fibNum2, int runCnt) {
      System.out.println(fibNum1 + " + " + fibNum2 + " = " + 
                         (fibNum1 + fibNum2));

      if (runCnt <= 1) { // Base case: Ran for user specified
                         // number of steps, do nothing
      }
      else {             // Recursive case: compute next value
         computeFibonacci(fibNum2, fibNum1 + fibNum2, runCnt - 1);
      }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int runFor;     // User specified number of values computed

      // Output program description
      System.out.println("This program outputs the\n" +
                         "Fibonacci sequence step-by-step,\n" +
                         "starting after the first 0 and 1.\n");

      // Prompt user for number of values to compute
      System.out.print("How many steps would you like? ");
      runFor = scnr.nextInt();

      // Output first two Fibonacci values, call recursive function     
      System.out.println("0\n1");
      computeFibonacci(0, 1, runFor);
   }
}



// Calculate greatest common divisor of two numbers.
import java.util.Scanner;

public class GCDCalc {
   /* Determine the greatest common divisor
      of two numbers, e.g. GCD(8, 12) = 4
   */
   public static int gcdCalculator(int inNum1, int inNum2) {
      int gcdVal;     // Holds GCD results

      if (inNum1 == inNum2) {   // Base case: Numbers are equal
         gcdVal = inNum1;       // Return value
      }
      else {                    // Recursive case: subtract smaller from larger
         if (inNum1 > inNum2) { // Call function with new values
            gcdVal = gcdCalculator(inNum1 - inNum2, inNum2);
         }
         else { // n1 is smaller
            gcdVal = gcdCalculator(inNum1, inNum2 - inNum1);
         }
      }

      return gcdVal;
   }
   
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int gcdInput1;     // First input to GCD calc
      int gcdInput2;     // Second input to GCD calc
      int gcdOutput;     // Result of GCD
   
      // Print program function   
      System.out.println("This program outputs the greatest \n" + 
                         "common divisor of two numbers.");
              
      // Prompt user for input
      System.out.print("Enter first number: ");
      gcdInput1 = scnr.nextInt();
      
      System.out.print("Enter second number: ");
      gcdInput2 = scnr.nextInt();
       
      // Check user values are > 1, call recursive GCD function
      if ((gcdInput1 < 1) || (gcdInput2 < 1)) {
         System.out.println("Note: Neither value can be below 1.");
      }
      else {
         gcdOutput = gcdCalculator(gcdInput1, gcdInput2);
         System.out.println("Greatest common divisor = " +  gcdOutput);
      }
   }
}






// Scramble a word's letters in every possible way.

import java.util.Scanner;

public class WordScrambler {
   /* Output every possible combination of a word.
      Each recursive call moves a letter from
      remainLetters" to scramLetters".
   */
   public static void scrambleLetters(String remainLetters,  // Remaining letters
                                      String scramLetters) { // Scrambled letters
      String tmpString;      // Temp word combinations
      int i;                 // Loop index

      if (remainLetters.length() == 0) { // Base case: All letters used
         System.out.println(scramLetters);
      }
      else {                             // Recursive case: move a letter from
                                         // remaining to scrambled letters 
         for (i = 0; i < remainLetters.length(); ++i) {
            // Move letter to scrambled letters
            tmpString = remainLetters.substring(i, i + 1);
            remainLetters = removeFromIndex(remainLetters, i);
            scramLetters = scramLetters + tmpString;

            scrambleLetters(remainLetters, scramLetters);

            // Put letter back in remaining letters
            remainLetters = insertAtIndex(remainLetters, tmpString, i);
            scramLetters = removeFromIndex(scramLetters, scramLetters.length() - 1);
         }
      }
   }

   // Returns a new String without the character at location remLoc
   public static String removeFromIndex(String origStr, int remLoc) {
      String finalStr;      // Temp string to extract char

      finalStr = origStr.substring(0, remLoc);                     // Copy before location remLoc
      finalStr += origStr.substring(remLoc + 1, origStr.length()); // Copy after location remLoc

      return finalStr;
   }

   // Returns a new String with the character specified by insertStr 
   // inserted at location addLoc
   public static String insertAtIndex(String origStr, String insertStr, int addLoc) {
      String finalStr;      // Temp string to extract char

      finalStr = origStr.substring(0, addLoc);                 // Copy before location addLoc
      finalStr += insertStr;                                   // Copy character to location addLoc
      finalStr += origStr.substring(addLoc, origStr.length()); // Copy after location addLoc

      return finalStr;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String wordScramble;      // User defined word to scramble

      // Prompt user for input
      System.out.print("Enter a word to be scrambled: ");
      wordScramble = scnr.next();
      
      // Call recursive method
      scrambleLetters(wordScramble, "");
   }
}





// Shopping spree in which a user can fit 3 items in a shopping bag.
import java.util.ArrayList;

public class ShoppingSpreeCombinations {
   public static final int MAX_SHOPPING_BAG_SIZE = 3; // Max number of items in shopping bag

   /* Output every combination of items that fit
      in a shopping bag. Each recursive call moves
      one item into the shopping bag.
   */
   public static void shoppingBagCombinations(ArrayList<GroceryItem> currBag,          // Bag contents
                                              ArrayList<GroceryItem> remainingItems) { // Available items
      int bagValue;               // Cost of items in shopping bag
      GroceryItem tmpGroceryItem; // Grocery item to add to bag
      int i;                      // Loop index

      if (currBag.size() == MAX_SHOPPING_BAG_SIZE) {   // Base case: Shopping bag full
         bagValue = 0;
         for (i = 0; i < currBag.size(); ++i) {
            bagValue += currBag.get(i).priceDollars;
            System.out.print(currBag.get(i).itemName + "  ");
         }
         System.out.println("= $" + bagValue);
      }
      else {                                           // Recursive case: move one
         for (i = 0; i < remainingItems.size(); ++i) { // item to bag
            // Move item into bag
            tmpGroceryItem = remainingItems.get(i);
            remainingItems.remove(i);
            currBag.add(tmpGroceryItem);

            shoppingBagCombinations(currBag, remainingItems);

            // Take item out of bag
            remainingItems.add(i, tmpGroceryItem);
            currBag.remove(currBag.size() - 1);
         }
      }
   }

   public static void main(String[] args) {
      ArrayList<GroceryItem> possibleItems = new ArrayList<GroceryItem>(); // Possible shopping items
      ArrayList<GroceryItem> shoppingBag = new ArrayList<GroceryItem>();   // Current shopping bag
      GroceryItem tmpGroceryItem;                                          // Temp item

      // Populate grocery with different items
      tmpGroceryItem = new GroceryItem();
      tmpGroceryItem.itemName = "Milk";
      tmpGroceryItem.priceDollars = 2;
      possibleItems.add(tmpGroceryItem);

      tmpGroceryItem = new GroceryItem();
      tmpGroceryItem.itemName = "Belt";
      tmpGroceryItem.priceDollars = 24;
      possibleItems.add(tmpGroceryItem);

      tmpGroceryItem = new GroceryItem();
      tmpGroceryItem.itemName = "Toys";
      tmpGroceryItem.priceDollars = 19;
      possibleItems.add(tmpGroceryItem);

      tmpGroceryItem = new GroceryItem();
      tmpGroceryItem.itemName = "Cups";
      tmpGroceryItem.priceDollars = 12;
      possibleItems.add(tmpGroceryItem);

      // Try different combinations of three items
      shoppingBagCombinations(shoppingBag, possibleItems);
   }
}



// Find distance of traveling to 3 cities. 
import java.util.ArrayList;

public class TravelingSalesmanPaths {
   public static final int NUM_CITIES = 3;                                // Number of cities
   public static int[][] cityDistances = new int[NUM_CITIES][NUM_CITIES]; // Distance between cities
   public static String[] cityNames = new String[NUM_CITIES];             // City names

   /* Output every possible travel path. 
      Each recursive call moves to a new city.
   */
   public static void travelPaths(ArrayList<Integer> currPath, 
                                  ArrayList<Integer> needToVisit) {
      int totalDist;     // Total distance given current path
      int tmpCity;       // Next city distance
      int i;             // Loop index

      if (currPath.size() == NUM_CITIES) { // Base case: Visited all cities
         totalDist = 0;                      // Return total path distance
         for (i = 0; i < currPath.size(); ++i) {
            System.out.print(cityNames[currPath.get(i)] + "   ");

            if (i > 0) {
               totalDist += cityDistances[currPath.get(i - 1)][currPath.get(i)];
            }
         }

         System.out.println("= " + totalDist);
      }
      else {                                 // Recursive case: pick next city
         for (i = 0; i < needToVisit.size(); ++i) {
            // add city to travel path
            tmpCity = needToVisit.get(i);
            needToVisit.remove(i);
            currPath.add(tmpCity);

            travelPaths(currPath, needToVisit);

            // remove city from travel path
            needToVisit.add(i, tmpCity);
            currPath.remove(currPath.size() - 1);
         }
      }
   }   
   
   public static void main (String[] args) {
      ArrayList<Integer> needToVisit = new ArrayList<Integer>(); // Cities left to visit
      ArrayList<Integer> currPath = new ArrayList<Integer>();    // Current path traveled
      
      // Initialize distances array
      cityDistances[0][0] = 0;
      cityDistances[0][1] = 960;  // Boston-Chicago
      cityDistances[0][2] = 2960; // Boston-Los Angeles
      cityDistances[1][0] = 960;  // Chicago-Boston
      cityDistances[1][1] = 0;
      cityDistances[1][2] = 2011; // Chicago-Los Angeles
      cityDistances[2][0] = 2960; // Los Angeles-Boston
      cityDistances[2][1] = 2011; // Los Angeles-Chicago
      cityDistances[2][2] = 0;
      
      cityNames[0] = "Boston";
      cityNames[1] = "Chicago";
      cityNames[2] = "Los Angeles";
      
      needToVisit.add(0); // Boston
      needToVisit.add(1); // Chicago
      needToVisit.add(2); // Los Angeles
      
      // Explore different paths   
      travelPaths(currPath, needToVisit);
   }
}



// Binary search tree insertions.
BSTInsert(tree, node) {
   if (tree⇢root is null) {
      tree⇢root = node
   }
   else {
      currentNode = tree⇢root
      while (currentNode is not null) {
         if (node⇢key < currentNode⇢key) {
            if (currentNode⇢left is null) {
               currentNode⇢left = node
               currentNode = null
            }
            else {
               currentNode = currentNode⇢left
            }
         }
         else {
            if (currentNode⇢right is null) {
               currentNode⇢right = node
               currentNode = null
            }
            else {
               currentNode = currentNode⇢right
            }
         }
      }
   }
}




// BST inorder traversal algorithm.  
BSTPrintInorder(node) {
  if (node is null)
      return                     

  BSTPrintInorder(node⇢left)   
  Print node                     
  BSTPrintInorder(node⇢right)  
}



// BSTInsert algorithm for BSTs with nodes containing parent pointers.
BSTInsert(tree, node) {
   if (tree⇢root == null) {
      tree⇢root = node
      node⇢parent = null
      return
   }

   cur = tree⇢root
   while (cur != null) {
      if (node⇢key < cur⇢key) {
         if (cur⇢left == null) {
            cur⇢left = node
            node⇢parent = cur
            cur = null
         }
         else
            cur = cur⇢left
      }
      else {
         if (cur⇢right == null) {
            cur⇢right = node
            node⇢parent = cur
            cur = null
         }
         else
            cur = cur⇢right
      }
   }
}




// BSTReplaceChild algorithm.
BSTReplaceChild(parent, currentChild, newChild) {
   if (parent⇢left != currentChild &&
       parent⇢right != currentChild)
      return false

   if (parent⇢left == currentChild)
      parent⇢left = newChild
   else
      parent⇢right = newChild

   if (newChild != null)
      newChild⇢parent = parent
   return true
}



// BSTRemoveKey and BSTRemoveNode algorithms for BSTs with nodes containing parent pointers.
BSTRemoveKey(tree, key) {
   node = BSTSearch(tree, key)
   BSTRemoveNode(tree, node)
}

BSTRemoveNode(tree, node) {
   if (node == null)
      return

   // Case 1: Internal node with 2 children
   if (node⇢left != null && node⇢right != null) {
      // Find successor
      succNode = node⇢right
      while (succNode⇢left)
         succNode = succNode⇢left
            
      // Copy value/data from succNode to node
      node = Copy succNode
            
      // Recursively remove succNode
      BSTRemoveNode(tree, succNode)
   }

   // Case 2: Root node (with 1 or 0 children)
   else if (node == tree⇢root) {
      if (node⇢left != null)
         tree⇢root = node⇢left
      else
         tree⇢root = node⇢right
            
      // Make sure the new root, if non-null, has a null parent
      if (tree⇢root != null)
         tree⇢root⇢parent = null
   }

   // Case 3: Internal with left child only
   else if (node⇢left != null)
      BSTReplaceChild(node⇢parent, node, node⇢left)
   
   // Case 4: Internal with right child only OR leaf
   else
      BSTReplaceChild(node⇢parent, node, node⇢right)
}




// BST recursive search algorithm.
BSTSearch(tree, key) {
   return BSTSearchRecursive(tree⇢root, key)
}

BSTSearchRecursive(node, key) {
   if (node is not null) {
      if (key == node⇢key)
         return node
      else if (key < node⇢key)
         return BSTSearchRecursive(node⇢left, key)
      else
         return BSTSearchRecursive(node⇢right, key)
   }
   return null
}




// BST get parent algorithm.
BSTGetParent(tree, node) {
   return BSTGetParentRecursive(tree⇢root, node)
}

BSTGetParentRecursive(subtreeRoot, node) {
   if (subtreeRoot is null)
      return null

   if (subtreeRoot⇢left == node or 
       subtreeRoot⇢right == node) {
      return subtreeRoot
   }

   if (node⇢key < subtreeRoot⇢key) {
      return BSTGetParentRecursive(subtreeRoot⇢left, node)
   }
   return BSTGetParentRecursive(subtreeRoot⇢right, node)
}




// Recursive BST insertion and removal.
BSTInsert(tree, node) {
   if (tree⇢root is null)
      tree⇢root = node
   else
      BSTInsertRecursive(tree⇢root, node)
}

BSTInsertRecursive(parent, nodeToInsert) {
   if (nodeToInsert⇢key < parent⇢key) {
      if (parent⇢left is null)
         parent⇢left = nodeToInsert
      else
         BSTInsertRecursive(parent⇢left, nodeToInsert)
   }
   else {
      if (parent⇢right is null)
         parent⇢right = nodeToInsert
      else
         BSTInsertRecursive(parent⇢right, nodeToInsert)
   }
}

BSTRemove(tree, key) {
   node = BSTSearch(tree, key)
   parent = BSTGetParent(tree, node)
   BSTRemoveNode(tree, parent, node)
}

BSTRemoveNode(tree, parent, node) {
   if (node == null)
      return false
        
   // Case 1: Internal node with 2 children
   if (node⇢left != null && node⇢right != null) {
      // Find successor and successor's parent
      succNode = node⇢right
      successorParent = node
      while (succNode⇢left != null) {
         successorParent = succNode
         succNode = succNode⇢left
      }
            
      // Copy the value from the successor node
      node = Copy succNode
            
      // Recursively remove successor
      BSTRemoveNode(tree, successorParent, succNode)
   }

   // Case 2: Root node (with 1 or 0 children)
   else if (node == tree⇢root) {
      if (node⇢left != null)
         tree⇢root = node⇢left
      else
         tree⇢root = node⇢right
   }

   // Case 3: Internal with left child only
   else if (node⇢left != null) {
      // Replace node with node's left child
      if (parent⇢left == node)
         parent⇢left = node⇢left
      else
         parent⇢right = node⇢left
   }

   // Case 4: Internal with right child only OR leaf
   else {
      // Replace node with node's right child
      if (parent⇢left == node)
         parent⇢left = node⇢right
      else
         parent⇢right = node⇢right
   }        

   return true
}





// Trie insert algorithm.
TrieInsert(root, string) {
   node = root
   for (character in string) {
      if (character is not in node⇢children) {
         node⇢children[character] = new TrieNode()
      }
      node = node⇢children[character]
   }

   if (0 is not in node⇢children) {
      node⇢children[0] = new TrieNode()
   }
   return node⇢children[0]
}

trieRoot = new TrieNode()
TrieInsert(trieRoot, "APPLE")
TrieInsert(trieRoot, "APPLY")
TrieInsert(trieRoot, "APP")



// Trie search algorithm.
TrieSearch(root, string) {
   node = root
   for (character in string) {
      if (character is not in node⇢children) {
         return null
      }
      node = node⇢children[character]
   }

   if (0 is in node⇢children) {
      return node⇢children[0]
   }
   return null
}

search1 = TrieSearch(root, "PAPAYA")
search2 = TrieSearch(root, "GRAPE")
search3 = TrieSearch(root, "PEA")





// Trie remove algorithm.
TrieRemove(root, string) {
   return TrieRemoveRecursive(root, string, 0)
}

TrieRemoveRecursive(node, string, charIndex) {
   if (charIndex == string⇢length) {
      if (0 in node⇢children) {
         Remove 0 from node⇢children[0]
         return true
      }
      return false // string not found
   }

   character = string[charIndex]
   if (character is not in node⇢children) {
      return false
   }
   child = node⇢children[character]
   TrieRemoveRecursive(child, string, charIndex + 1)
   if (child⇢children⇢length == 0) {
      Remove character from node⇢children
   }
   return true
}

TrieRemove(root, "BANANA")
TrieRemove(root, "APPLE")




// Hash table with chaining: Each bucket contains a list of items.  
HashInsert(hashTable, item) {
   if (HashSearch(hashTable, item⇢key) == null) {
      bucketList = hashTable[Hash(item⇢key)]
      node = Allocate new linked list node
      node⇢next = null
      node⇢data = item
      ListAppend(bucketList, node)
   }
}

HashRemove(hashTable, item) {
   bucketList = hashTable[Hash(item⇢key)]
   itemNode = ListSearch(bucketList, item⇢key)
   if (itemNode is not null) {
      ListRemove(bucketList, itemNode)
   } 
}

HashSearch(hashTable, key) {
   bucketList = hashTable[Hash(key)]
   itemNode = ListSearch(bucketList, key)
   if (itemNode is not null)
      return itemNode⇢data
   else
      return null
}





// Insert with linear probing.
HashInsert(hashTable, item) {
   // Hash function determines initial bucket
   bucket = Hash(item.key)    
   bucketsProbed = 0
   N = hashTables size
   while (bucketsProbed < N) {
      // Insert item in next empty bucket
      if (hashTable[bucket] is Empty) {
         hashTable[bucket] = item
         return true 
      }

      // Increment bucket index
      bucket = (bucket + 1) % N

      // Increment number of buckets probed
      ++bucketsProbed
   }

   return false      
}




// Remove with linear probing.
HashRemove(hashTable, key) {  
   // Hash function determines initial bucket
   bucket = Hash(key)
   bucketsProbed = 0

   while ((hashTable[bucket] is not EmptySinceStart) and
         (bucketsProbed < N)) {

      if ((hashTable[bucket] is not Empty) and
         (hashTable[bucket]⇢key == key)) {
         hashTable[bucket] = EmptyAfterRemoval
         return
      }

      // Increment bucket index
      bucket = (bucket + 1) % N

      // Increment number of buckets probed
      ++bucketsProbed
   }
}






// Search with linear probing.
HashSearch(hashTable, key) {
   // Hash function determines initial bucket
   bucket = Hash(key)
   bucketsProbed = 0

   while ((hashTable[bucket] is not EmptySinceStart) and
         (bucketsProbed < N)) {

      if ((hashTable[bucket] is not Empty) and
         (hashTable[bucket]⇢key == key)) {
         return hashTable[bucket]
      }

      // Increment bucket index
      bucket = (bucket + 1) % N

      // Increment number of buckets probed
      ++bucketsProbed
   }

   return null  // Item not found
}






// HashInsert with quadratic probing
HashInsert(hashTable, item) {
   i = 0
   bucketsProbed = 0

   // Hash function determines initial bucket
   bucket = Hash(item⇢key) % N
   while (bucketsProbed < N) {
      // Insert item in next empty bucket 
      if (hashTable[bucket] is Empty) {
         hashTable[bucket] = item
         return true  
      }

      // Increment i and recompute bucket index
      // c1 and c2 are programmer-defined constants for quadratic probing
      i = i + 1
      bucket = (Hash(item⇢key) + c1 * i + c2 * i * i) % N

      // Increment number of buckets probed
      bucketsProbed = bucketsProbed + 1
   }
   return false       
}





// HashRemove and HashSearch with quadratic probing.
HashRemove(hashTable, key) {
   i = 0
   bucketsProbed = 0

   // Hash function determines initial bucket
   bucket = Hash(key) % N

   while ((hashTable[bucket] is not EmptySinceStart) and (bucketsProbed < N)) {
      if ((hashTable[bucket] is Occupied) and (hashTable[bucket]⇢key == key)) {
         hashTable[bucket] = EmptyAfterRemoval
         return true
      }

      // Increment i and recompute bucket index
      // c1 and c2 are programmer-defined constants for quadratic probing
      i = i + 1
      bucket = (Hash(key) + c1 * i + c2 * i * i) % N

      // Increment number of buckets probed
      bucketsProbed = bucketsProbed + 1
   }
   return false // key not found
}


HashSearch(hashTable, key) {
   i = 0
   bucketsProbed = 0

   // Hash function determines initial bucket
   bucket = Hash(key) % N

   while ((hashTable[bucket] is not EmptySinceStart) and (bucketsProbed < N)) {
      if ((hashTable[bucket] is Occupied) and (hashTable[bucket]⇢key == key)) {
         return hashTable[bucket]
      }

      // Increment i and recompute bucket index
      // c1 and c2 are programmer-defined constants for quadratic probing
      i = i + 1
      bucket = (Hash(key) + c1 * i + c2 * i * i) % N

      // Increment number of buckets probed
      bucketsProbed = bucketsProbed + 1
   }
   return null  // key not found
}






// Hash table resize operation.
HashResize(hashTable, currentSize) {
   newSize = nextPrime(currentSize * 2)

   newArray = Allocate new array of size newSize
   Set all entries in newArray to EmptySinceStart

   bucket = 0
   while (bucket < currentSize) {
      if (hashTable[bucket] is not Empty) {
         key = hashTable[bucket]
         HashInsert(newArray, key)
      }
      bucket = bucket + 1
   }

   return newArray
}

Hash(key, tableSize) {
   return key % tableSize
}







// Quicksort algorithm.
Partition(numbers, lowIndex, highIndex) {
   // Pick middle element as pivot
   midpoint = lowIndex + (highIndex - lowIndex) / 2
   pivot = numbers[midpoint]
   
   done = false
   while (!done) {
      // Increment lowIndex while numbers[lowIndex] < pivot
      while (numbers[lowIndex] < pivot) {
         lowIndex += 1
      }
      
      // Decrement highIndex while pivot < numbers[highIndex]
      while (pivot < numbers[highIndex]) {
         highIndex -= 1
      }
      
      // If zero or one elements remain, then all numbers are 
      // partitioned. Return highIndex.
      if (lowIndex >= highIndex) {
         done = true
      }
      else {
         // Swap numbers[lowIndex] and numbers[highIndex]
         temp = numbers[lowIndex]
         numbers[lowIndex] = numbers[highIndex]
         numbers[highIndex] = temp
         
         // Update lowIndex and highIndex
         lowIndex += 1
         highIndex -= 1
      }
   }
   
   return highIndex
}

Quicksort(numbers, lowIndex, highIndex) {
   // Base case: If the partition size is 1 or zero 
   // elements, then the partition is already sorted
   if (lowIndex >= highIndex) {
      return
   }
   
   // Partition the data within the array. Value lowEndIndex 
   // returned from partitioning is the index of the low 
   // partition's last element.
   lowEndIndex = Partition(numbers, lowIndex, highIndex)
   
   // Recursively sort low partition (lowIndex to lowEndIndex) 
   // and high partition (lowEndIndex + 1 to highIndex)
   Quicksort(numbers, lowIndex, lowEndIndex)
   Quicksort(numbers, lowEndIndex + 1, highIndex)
}

main() {
   numbers[] = { 10, 2, 78, 4, 45, 32, 7, 11 }
   NUMBERS_SIZE = 8
   i = 0
   
   print("UNSORTED: ")
   for(i = 0; i < NUMBERS_SIZE; ++i) {
      print(numbers[i] + " ")
   }
   printLine()
   
   // Initial call to quicksort
   Quicksort(numbers, 0, NUMBERS_SIZE - 1)
   
   print("SORTED: ")
   for(i = 0; i < NUMBERS_SIZE; ++i) {
      print(numbers[i] + " ")
   }
   printLine()
}






// Merge sort algorithm.
Merge(numbers, i, j, k) {
   mergedSize = k - i + 1                // Size of merged partition
   mergePos = 0                          // Position to insert merged number
   leftPos = 0                           // Position of elements in left partition
   rightPos = 0                          // Position of elements in right partition
   mergedNumbers = new int[mergedSize]   // Dynamically allocates temporary array
                                         // for merged numbers
   
   leftPos = i                           // Initialize left partition position
   rightPos = j + 1                      // Initialize right partition position
   
   // Add smallest element from left or right partition to merged numbers
   while (leftPos <= j && rightPos <= k) {
      if (numbers[leftPos] <= numbers[rightPos]) {
         mergedNumbers[mergePos] = numbers[leftPos]
         ++leftPos
      }
      else {
         mergedNumbers[mergePos] = numbers[rightPos]
         ++rightPos
         
      }
      ++mergePos
   }
   
   // If left partition is not empty, add remaining elements to merged numbers
   while (leftPos <= j) {
      mergedNumbers[mergePos] = numbers[leftPos]
      ++leftPos
      ++mergePos
   }
   
   // If right partition is not empty, add remaining elements to merged numbers
   while (rightPos <= k) {
      mergedNumbers[mergePos] = numbers[rightPos]
      ++rightPos
      ++mergePos
   }
   
   // Copy merge number back to numbers
   for (mergePos = 0; mergePos < mergedSize; ++mergePos) {
      numbers[i + mergePos] = mergedNumbers[mergePos]
   }
}

MergeSort(numbers, i, k) {
   j = 0
   
   if (i < k) {
      j = (i + k) / 2  // Find the midpoint in the partition
      
      // Recursively sort left and right partitions
      MergeSort(numbers, i, j)
      MergeSort(numbers, j + 1, k)
      
      // Merge left and right partition in sorted order
      Merge(numbers, i, j, k)
   }
}

main() {
   numbers = { 10, 2, 78, 4, 45, 32, 7, 11 }
   NUMBERS_SIZE = 8
   i = 0
   
   print("UNSORTED: ")
   for(i = 0; i < NUMBERS_SIZE; ++i) {
      print(numbers[i] + " ")
   }
   printLine()
   
   MergeSort(numbers, 0, NUMBERS_SIZE - 1)
   
   print("SORTED: ")
   for(i = 0; i < NUMBERS_SIZE; ++i) {
      print(numbers[i] + " ")
   }
   printLine()
}






// Radix sort algorithm (for non-negative integers).
RadixSort(array, arraySize) {
   buckets = create array of 10 buckets

   // Find the max length, in number of digits
   maxDigits = RadixGetMaxLength(array, arraySize)
      
   // Start with the least significant digit
   pow10 = 1
   for (digitIndex = 0; digitIndex < maxDigits; digitIndex++) {
      for (i = 0; i < arraySize; i++) {
         bucketIndex = abs(array[i] / pow10) % 10
         Append array[i] to buckets[bucketIndex]
      }
      arrayIndex = 0
      for (i = 0; i < 10; i++) {
         for (j = 0; j < buckets[i]⇢size(); j++)
            array[arrayIndex++] = buckets[i][j]
      }
      pow10 = 10 * pow10
      Clear all buckets
   }
}





// RadixGetMaxLength and RadixGetLength functions.
// Returns the maximum length, in number of digits, out of all elements in the array
RadixGetMaxLength(array, arraySize) {
   maxDigits = 0
   for (i = 0; i < arraySize; i++) {
      digitCount = RadixGetLength(array[i])
      if (digitCount > maxDigits)
         maxDigits = digitCount
   }
   return maxDigits
}

// Returns the length, in number of digits, of value
RadixGetLength(value) {
   if (value == 0)
      return 1

   digits = 0
   while (value != 0) {
      digits = digits + 1
      value = value / 10
   }
   return digits
}








// RadixSort algorithm (for negative and non-negative integers).
RadixSort(array, arraySize) {
   buckets = create array of 10 buckets

   // Find the max length, in number of digits
   maxDigits = RadixGetMaxLength(array, arraySize)
        
   pow10 = 1
   for (digitIndex = 0; digitIndex < maxDigits; digitIndex++) {
      for (i = 0; i < arraySize; i++) {
         bucketIndex = abs(array[i] / pow10) % 10
         Append array[i] to buckets[bucketIndex]
      }
      arrayIndex = 0
      for (i = 0; i < 10; i++) {
         for (j = 0; j < buckets[i]⇢size(); j++) {
            array[arrayIndex] = buckets[i][j]
            arrayIndex = arrayIndex + 1
         }
      }
      pow10 = pow10 * 10
      Clear all buckets
   }

   negatives = all negative values from array
   nonNegatives = all non-negative values from array
   Reverse order of negatives
   Concatenate negatives and nonNegatives into array
}











