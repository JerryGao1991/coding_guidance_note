import java.util.Scanner;

public class CallStore {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Store ourPlace = new Store();
      String currName;

      currName = scnr.nextLine();
      ourPlace.setName(currName);

      ourPlace.readAllProducts(scnr);
      ourPlace.printSale(3);
   }
}

import java.util.Scanner;

public class Store {
   private String name;
   Products products;

   public Store() {
      products = new Products();
   }

   public void setName(String storeName) {
      name = storeName;
   }

   public void readAllProducts(Scanner scnr) {
      products.inputProducts(scnr);
   }

   public void printSale(int saleAmount) {
      System.out.println(name + "'s sale:");

      products.printAfterDiscount(saleAmount);
   }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Products {
   private ArrayList<Product> productList;

   public Products() {
      productList = new ArrayList<Product>();
   }

   public void inputProducts(Scanner scnr) {
      Product currProduct;
      int currPrice;
      String currName;

      currPrice = scnr.nextInt();
      while (currPrice >= 0) {
         currProduct = new Product();
         currName = scnr.next();
         currProduct.setPriceAndName(currPrice, currName);
         productList.add(currProduct);
         currPrice = scnr.nextInt();
      }
   }

   public void printAfterDiscount(int discountPrice) {
      int i;
      int currDiscountPrice;

      for (i = 0; i < productList.size(); ++i) {
         currDiscountPrice = productList.get(i).getPrice() - discountPrice;
         System.out.println("$" + currDiscountPrice + " " + productList.get(i).getName());
      }
   }
}

public class Product {
   private int price;
   private String name;

   public void setPriceAndName(int productPrice, String productName) {
      price = productPrice;
      name = productName;
   }

   public int getPrice() {
      return price;
   }

   public String getName() {
      return name;
   }
}

CallStore 类：负责程序的入口，管理用户输入和整体流程的调用。这个类只关注如何从用户获取输入并调用相关业务逻辑，而不是具体操作细节。
Store 类：这个类表示商店，主要职责是管理商店的名称并委托操作给 Products 类。它本身并不直接管理产品的输入或输出，而是充当了协调者角色，清楚职责划分。
Products 类：负责存储和管理所有产品的逻辑，包括输入产品信息和处理打折后的价格。它将产品相关的功能集中在一个类中，避免了职责混乱。
Product 类：表示单个产品，专门管理产品的价格和名称。这个类的职责单一，只负责产品本身的信息。


import java.util.ArrayList;
import java.util.Scanner;

public class PlayerManager {
   // Adds playerNum to end of ArrayList
   public static void addPlayer (ArrayList<Integer> players, int playerNum) {
      players.add(playerNum);
   }

   // Deletes playerNum from ArrayList
   public static void deletePlayer (ArrayList<Integer> players, int playerNum) {
      int i;
      boolean found;

      // Search for playerNum in ArrayList
      found = false;
      i = 0;

      while ( (!found) && (i < players.size()) ) {
         if (players.get(i).equals(playerNum)) {
            players.remove(i); // Remove
            found = true; 
         }

         ++i;
      }
   }
   
   // Prints player numbers currently in ArrayList
   public static void printPlayers(ArrayList<Integer> players) {
      int i;

      for (i = 0; i < players.size(); ++i) {
         System.out.println(" " + players.get(i));
      }
   }

   // Maintains ArrayList of player numbers 
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<Integer> players = new ArrayList<Integer>();
      String userInput;
      int playerNum;

      userInput = "-";

      System.out.println("Commands: 'a' add, 'd' delete,");
      System.out.println("'p' print, 'q' quit: ");

      while (!userInput.equals("q")) {
         System.out.print("Command: ");
         userInput = scnr.next();

         if (userInput.equals("a")) {
            System.out.print(" Player number: ");
            playerNum = scnr.nextInt();

            addPlayer(players, playerNum);
         }
         if (userInput.equals("d")) {
            System.out.print(" Player number: ");
            playerNum = scnr.nextInt();

            deletePlayer(players, playerNum);
         }
         else if (userInput.equals("p")) {
            printPlayers(players);
         }
      }

   }
}


// javadoc 工具和java类文档 (见 useful_example_code.java)
eg:
ElapsedTime.java:
/**
 * A class representing an elapsed time measurement 
 * in hours and minutes. 
 * @author Mary Adams
 * @version 1.0
 */
public class ElapsedTime {
   /**
    * The hours portion of the time
    */
   private int hours;
   
   /**
    * The minutes portion of the time
    */
   private int minutes;

   /**
    * Constructor initializing hours to timeHours and 
    * minutes to timeMins. 
    * @param timeHours hours portion of time
    * @param timeMins minutes portion of time
    */   
   public ElapsedTime(int timeHours, int timeMins) {
      hours   = timeHours;
      minutes = timeMins;
   }
   
   /**
    * Default constructor initializing all fields to 0. 
    */   
   public ElapsedTime() {
      hours = 0;
      minutes = 0;
   }
   /**
    * Prints the time represented by an ElapsedTime 
    * object in hours and minutes.
    */
   public void printTime() {
      System.out.print(hours + " hour(s) " + minutes + " minute(s)");
   }
   
   /**
    * Sets the time to timeHours:timeMins.
    * @param timeHours hours portion of time
    * @param timeMins minutes portion of time
   */
   public void setTime(int timeHours, int timeMins) {
      hours = timeHours;
      minutes = timeMins;
   }

   /**
    * Returns the total time in minutes.
    * @return an int value representing the elapsed time in minutes.
    */
   public int getTimeMinutes() {
      return ((hours * 60) + minutes);
   }
}

TimeDifference.java:
import java.util.Scanner;

/**
 * This program calculates the difference between two 
 * user-entered times. This class contains the 
 * program's main() method and is not meant to be instantiated.
 * @author Mary Adams
 * @version 1.0
 */
public class TimeDifference {
   /**
    * Asks for two times, creating an ElapsedTime object for each, 
    * and uses ElapsedTime's getTimeMinutes() method to properly 
    * calculate the difference between both times.
    * @param args command-line arguments
    * @see ElapsedTime#getTimeMinutes()
    */
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int timeDiff;     // Stores time difference
      int userHours;
      int userMins;
      ElapsedTime startTime = new ElapsedTime(); // Starting time
      ElapsedTime endTime = new ElapsedTime(); // Ending time

      // Read starting time in hours and minutes
      System.out.print("Enter starting time (hrs mins): ");
      userHours = scnr.nextInt();
      userMins = scnr.nextInt();
      startTime.setTime(userHours, userMins);
              
      // Read ending time in hours and minutes
      System.out.print("Enter ending time (hrs mins): ");
      userHours = scnr.nextInt();
      userMins = scnr.nextInt();
      endTime.setTime(userHours, userMins);

      // Calculate time difference by converting both times to minutes
      timeDiff = endTime.getTimeMinutes() - startTime.getTimeMinutes(); 
      
      System.out.println("Time difference is " + timeDiff + " minutes");
   }
}