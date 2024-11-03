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

/////////////////
// composition //
/////////////////
method 1：

public class Engine {
    private int horsepower;

    public Engine(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return horsepower;
    }
}

public class Car {
    private Engine engine;  // Car 包含 Engine

    public Car(int horsepower) {
        engine = new Engine(horsepower);
    }

    public void startCar() {
        System.out.println("Car starts with " + engine.getHorsepower() + " horsepower.");
    }
}

public class Main {
    public static void main(String[] args) {
        // 创建一个 Car 对象，传入引擎的马力
        Car myCar = new Car(300);  // 使用 300 马力的引擎
        myCar.startCar();          // 输出：Car starts with 300 horsepower.
        
        // 可以再创建另一个 Car 对象，传入不同的马力值
        Car anotherCar = new Car(500);  // 使用 500 马力的引擎
        anotherCar.startCar();          // 输出：Car starts with 500 horsepower.
    }
}

method 2:
public class Car {
    private Engine engine;

    // Car 的构造函数需要一个引擎
    public Car(Engine engine) {
        this.engine = engine;
    }

    // 允许在运行时更换引擎
    public void changeEngine(Engine newEngine) {
        this.engine = newEngine;
    }

    public void startCar() {
        System.out.println("Car starts with " + engine.getHorsepower() + " horsepower.");
    }
}

// 测试代码
public class Main {
    public static void main(String[] args) {
        Engine engine1 = new Engine(200); // 创建 200 马力的引擎
        Engine engine2 = new Engine(500); // 创建 500 马力的引擎

        Car myCar = new Car(engine1);     // 用 200 马力引擎创建汽车
        myCar.startCar();                 // 输出: Car starts with 200 horsepower.

        // 更换引擎
        myCar.changeEngine(engine2);      // 用 500 马力的引擎替换旧引擎
        myCar.startCar();                 // 输出: Car starts with 500 horsepower.
    }
}

// method 1的优点:
隐藏细节：Car 隐藏了 Engine 的实现细节。用户只需要提供汽车的马力，内部的 Engine 如何创建完全由 Car 管理。这种封装让 Car 更加易用，并且可以防止用户错误地操作 Engine。
简化使用：用户不需要手动创建 Engine 对象，而只需传递一个简单的 int 参数。这让创建 Car 对象的流程变得更简洁，且代码更具可读性。
封装性增强：通过这种设计，用户不需要直接操作 Engine 类，只需提供一个简单的马力值即可创建 Car，这增加了封装性并简化了调用。

// method 1的缺点:
灵活性限制：这种设计减少了直接创建 Engine 的灵活性。如果未来需要不同类型的 Engine 或更复杂的构造，可能需要回到传递 Engine 对象的方式。



// 多态的代码示例:
// 基类 Engine
public class Engine {
    protected int horsepower;  // 让子类可以访问

    public Engine(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return horsepower;
    }

    // 定义一个通用的启动方法，子类可以重写它
    public void start() {
        System.out.println("Engine with " + horsepower + " horsepower is starting.");
    }
}

// 子类 GasEngine 表示汽油引擎
public class GasEngine extends Engine {
    public GasEngine(int horsepower) {
        super(horsepower);  // 调用父类的构造函数
    }

    @Override
    public void start() {
        System.out.println("Gas engine with " + horsepower + " horsepower is starting.");
    }
}

// 子类 ElectricEngine 表示电动引擎
public class ElectricEngine extends Engine {
    public ElectricEngine(int horsepower) {
        super(horsepower);  // 调用父类的构造函数
    }

    @Override
    public void start() {
        System.out.println("Electric engine with " + horsepower + " horsepower is starting.");
    }
}

public class Car {
    private Engine engine;  // Car 包含 Engine 对象，但可以是不同的子类

    // 通过构造函数传入引擎对象
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        engine.start();  // 调用多态方法，根据传入的引擎类型调用不同的启动方法
    }
}

public class Main {
    public static void main(String[] args) {
        // 创建不同类型的引擎对象
        Engine gasEngine = new GasEngine(300);    // 300 马力的汽油引擎
        Engine electricEngine = new ElectricEngine(500); // 500 马力的电动引擎

        // 创建 Car 对象并传入不同的引擎
        Car gasCar = new Car(gasEngine);
        gasCar.startCar();  // 输出：Gas engine with 300 horsepower is starting.

        Car electricCar = new Car(electricEngine);
        electricCar.startCar();  // 输出：Electric engine with 500 horsepower is starting.
    }
}


// interface的示例代码
// 定义一个 Engine 接口，规定所有引擎都必须实现 start() 方法
public interface Engine {
    int getHorsepower();
    void start();  // 接口中的方法没有实现，要求实现类必须定义
}
// 实现 Engine 接口的 GasEngine 类
public class GasEngine implements Engine {
    private int horsepower;

    public GasEngine(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public void start() {
        System.out.println("Gas engine with " + horsepower + " horsepower is starting.");
    }
}

// 实现 Engine 接口的 ElectricEngine 类
public class ElectricEngine implements Engine {
    private int horsepower;

    public ElectricEngine(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public void start() {
        System.out.println("Electric engine with " + horsepower + " horsepower is starting.");
    }
}

public class Car {
    private Engine engine;  // Car 使用的是 Engine 接口，而不是具体的类

    // 通过构造函数传入一个实现了 Engine 接口的引擎
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        engine.start();  // 调用引擎的 start 方法，具体行为由实现类决定
    }
}

public class Main {
    public static void main(String[] args) {
        // 创建不同类型的引擎对象，它们都实现了 Engine 接口
        Engine gasEngine = new GasEngine(300);        // 300 马力的汽油引擎
        Engine electricEngine = new ElectricEngine(500);  // 500 马力的电动引擎

        // 使用 GasEngine 创建 Car 对象
        Car gasCar = new Car(gasEngine);
        gasCar.startCar();  // 输出：Gas engine with 300 horsepower is starting.

        // 使用 ElectricEngine 创建 Car 对象
        Car electricCar = new Car(electricEngine);
        electricCar.startCar();  // 输出：Electric engine with 500 horsepower is starting.
    }
}

// 接口 Engine：
我们定义了 Engine 接口，规定所有实现它的类必须实现 getHorsepower() 和 start() 方法。接口不包含任何实现细节，只定义了类必须实现的行为。
GasEngine 和 ElectricEngine 实现接口：
GasEngine 和 ElectricEngine 实现了 Engine 接口，并提供了自己的 start() 方法实现。这样，两个类虽然实现了相同的接口，但具体行为不同。
Car 类使用接口：
Car 类不依赖于具体的引擎实现，而是使用 Engine 接口。通过这种方式，Car 可以和任何实现了 Engine 接口的对象一起工作，无需关心它们的内部实现。
多态性：
在 main 方法中，我们创建了两种不同的引擎（汽油引擎和电动引擎），并将它们传递给 Car 对象。由于 Car 依赖于接口，它能够处理不同类型的引擎，而不需要修改 Car 类本身。

// 接口 vs. 继承的对比：
// 继承：
使用继承时，你必须从基类派生出子类，这在某些情况下可能会导致类层次结构过于复杂，限制了灵活性。
继承还意味着子类会继承父类的所有行为和属性，适用于 "is-a" 的关系。
// 接口：
接口提供了更多的灵活性，允许不同类实现相同的行为，而不必存在直接的继承关系。
接口适用于 "can-do" 的关系，强调的是行为的实现，而不是类之间的层次关系。
类可以实现多个接口，这提供了类似多继承的灵活性，而在 Java 中类只能继承一个父类。


// user defined exception type
ex: A DensityCalculator program with two user-defined exception types.
InvalidNegativeInputException.java

public class InvalidNegativeInputException extends Exception {
   public InvalidNegativeInputException(String varName) {
      super("Variable " + varName + " is negative");
   }
}
NaNException.java

public class NaNException extends Exception {
   public NaNException(String varName) {
      super("Variable " + varName + " is NaN");
   }
}
DensityCalculator.java

import java.util.Scanner;

public class DensityCalculator {
   public static double getPositiveValue(Scanner scnr, String valName)
                        throws InvalidNegativeInputException {

      System.out.print("Enter " + valName + ": ");

      double inputVal = scnr.nextDouble();

      if (inputVal < 0.0) {
          throw new InvalidNegativeInputException(valName);
      }

      return inputVal;
   }

   public static double getDensity(Scanner scnr)
                        throws InvalidNegativeInputException, NaNException {

      double massVal = getPositiveValue(scnr, "massVal");
      double volumeVal = getPositiveValue(scnr, "volumeVal");
      double densityCalc = massVal / volumeVal;

      if (Double.isNaN(densityCalc)) {
         throw new NaNException("densityCalc");
      }

      return densityCalc;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      try {
         System.out.println("Density: " + getDensity(scnr));
      }
      catch (InvalidNegativeInputException excpt) {
         System.out.println(excpt.getMessage());

         // Handle ...
      }
      catch (NaNException excpt) {
         System.out.println(excpt.getMessage());

         // Handle ...
      }
   }
}


// 24.4 Programming Assignment 6: Soccer team roster
我的代码:
import java.util.Scanner;
import java.util.ArrayList;


class PlayerRoster {
    static ArrayList<Integer> playerNumList;
    static ArrayList<Integer> ratingNumList;
    static int playQuantity = 5;

    public static void readInfo(Scanner scnr) {
        playerNumList = new ArrayList<Integer>();
        ratingNumList = new ArrayList<Integer>();

        int playerNum;
        int ratingNum;

        for (int i = 1; i <= playQuantity; ++i) {
            System.out.println("Enter player " + i + "'s jersey number:");
            playerNum = scnr.nextInt();
            playerNumList.add(playerNum);

            System.out.println("Enter player " + i + "'s rating:");
            ratingNum = scnr.nextInt();
            ratingNumList.add(ratingNum);
            System.out.println();
            
        }
        System.out.println("ROSTER");
        for (int i = 0; i < playQuantity; ++i) {
            System.out.println("Player " + (i + 1) + " -- Jersey number: " + playerNumList.get(i) + ", Rating: " + ratingNumList.get(i));  
        }
        System.out.println();
    }

    public static void menuOperate(Scanner scnr) {
        boolean index = true;
        String indexStr;
        
        while (index) {
            System.out.println("MENU");
            System.out.println("u - Update player rating");
            System.out.println("a - Output players above a rating");
            System.out.println("r - Replace player");
            System.out.println("o - Output roster");
            System.out.println("q - Quit");
            System.out.println();
            System.out.println("Choose an option:");
            indexStr = scnr.next();
            switch (indexStr) {
                case "q":
                    index = false;
                    break;
                case "o":
                    printRoster();
                    break;
                case "u":
                    updateRating(scnr);
                    break;
                case "a":
                    printAbove(scnr);
                    break;
                case "r":
                    replaceRating(scnr);
                    break;
                default:
                    break;
            }
        }
    }

    public static void printRoster() {
        System.out.println("ROSTER");
        for (int i = 0; i < playQuantity; ++i) {
            System.out.println("Player " + (i + 1) + " -- Jersey number: " + playerNumList.get(i) + ", Rating: " + ratingNumList.get(i));   
        }
        System.out.println();
    }

    public static void updateRating(Scanner scnr) {
        int jeseryNum;
        int newRating;
        System.out.println("Enter a jersey number:");
        jeseryNum = scnr.nextInt();
        System.out.println("Enter a new rating for player:");
        newRating = scnr.nextInt();
        for (int i = 0; i < playQuantity; ++i) {
            if (playerNumList.get(i) == jeseryNum) {
                ratingNumList.set(i, newRating);
            }
        }
    }

    public static void printAbove(Scanner scnr) {
        int ratingNum;
        System.out.println("Enter a rating:");
        ratingNum = scnr.nextInt();
        System.out.println();
        System.out.println("ABOVE " + ratingNum);

        for (int i = 0; i < playQuantity; ++i) {
            if (ratingNumList.get(i) > ratingNum) {
                System.out.println("Player " + (i + 1) + " -- Jersey number: " + playerNumList.get(i) + ", Rating: " + ratingNumList.get(i));   
            }
        }
        System.out.println();
        
    }

    public static void replaceRating(Scanner scnr) {
        int jeseryNum;
        int newJeseryNum;
        int newRating;
        System.out.println("Enter a jersey number:");
        jeseryNum = scnr.nextInt();
        for (int i = 0; i < playQuantity; ++i) {
            if (playerNumList.get(i) == jeseryNum) {
                System.out.println("Enter a new jersey number:");
                newJeseryNum = scnr.nextInt();
                playerNumList.set(i, newJeseryNum);
                System.out.println("Enter a rating for the new player:"); 
                newRating = scnr.nextInt();
                ratingNumList.set(i, newRating);
            }    
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        readInfo(scnr);
        menuOperate(scnr);

    }
}

// GPT修改过的代码：
import java.util.Scanner;
import java.util.ArrayList;

class PlayerRoster {
    private ArrayList<Integer> playerNumList;
    private ArrayList<Integer> ratingNumList;
    private int playQuantity = 5;

    // 构造函数初始化
    public PlayerRoster() {
        playerNumList = new ArrayList<>();
        ratingNumList = new ArrayList<>();
    }

    public void readInfo(Scanner scnr) {
        for (int i = 1; i <= playQuantity; ++i) {
            System.out.println("Enter player " + i + "'s jersey number:");
            while (!scnr.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scnr.next(); // 清除无效输入
            }
            int playerNum = scnr.nextInt();
            playerNumList.add(playerNum);

            System.out.println("Enter player " + i + "'s rating:");
            while (!scnr.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scnr.next(); // 清除无效输入
            }
            int ratingNum = scnr.nextInt();
            ratingNumList.add(ratingNum);
            System.out.println();
        }
        printRoster(); // 打印初始阵容
    }

    public void menuOperate(Scanner scnr) {
        boolean index = true;

        while (index) {
            System.out.println("MENU");
            System.out.println("u - Update player rating");
            System.out.println("a - Output players above a rating");
            System.out.println("r - Replace player");
            System.out.println("o - Output roster");
            System.out.println("q - Quit");
            System.out.println();
            System.out.println("Choose an option:");
            String choice = scnr.next();
            switch (choice) {
                case "q":
                    index = false;
                    break;
                case "o":
                    printRoster();
                    break;
                case "u":
                    updateRating(scnr);
                    break;
                case "a":
                    printAbove(scnr);
                    break;
                case "r":
                    replaceRating(scnr);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    public void printRoster() {
        System.out.println("ROSTER");
        for (int i = 0; i < playQuantity; ++i) {
            System.out.println("Player " + (i + 1) + " -- Jersey number: " + playerNumList.get(i) + ", Rating: " + ratingNumList.get(i));   
        }
        System.out.println();
    }

    public void updateRating(Scanner scnr) {
        int jerseyNum;
        int newRating;
        System.out.println("Enter a jersey number:");
        jerseyNum = scnr.nextInt();
        System.out.println("Enter a new rating for player:");
        newRating = scnr.nextInt();
        for (int i = 0; i < playQuantity; ++i) {
            if (playerNumList.get(i) == jerseyNum) {
                ratingNumList.set(i, newRating);
                System.out.println("Rating updated for player with jersey number " + jerseyNum);
                return; // 更新完毕后退出方法
            }
        }
        System.out.println("Jersey number not found.");
    }

    public void printAbove(Scanner scnr) {
        int ratingNum;

        // 输入评分并处理输入类型检查
        while (true) {
            System.out.println("Enter a rating:");
            if (scnr.hasNextInt()) {
                ratingNum = scnr.nextInt();
                break; // 有效输入，退出循环
            } else {
                System.out.println("Invalid input. Please enter an integer."); // 提示用户输入有效数字
                scnr.next(); // 清除无效输入
            }
        }

        System.out.println();
        System.out.println("ABOVE " + ratingNum);

        // 输出大于输入评分的球员
        for (int i = 0; i < playQuantity; ++i) {
            if (ratingNumList.get(i) > ratingNum) {
                System.out.println("Player " + (i + 1) + " -- Jersey number: " + playerNumList.get(i) + ", Rating: " + ratingNumList.get(i));   
            }
        }
        System.out.println();
    }

    public void replaceRating(Scanner scnr) {
        int jerseyNum;
        int newJerseyNum;
        int newRating;
        System.out.println("Enter a jersey number:");
        jerseyNum = scnr.nextInt();
        for (int i = 0; i < playQuantity; ++i) {
            if (playerNumList.get(i) == jerseyNum) {
                System.out.println("Enter a new jersey number:");
                newJerseyNum = scnr.nextInt();
                playerNumList.set(i, newJerseyNum);
                System.out.println("Enter a rating for the new player:"); 
                newRating = scnr.nextInt();
                ratingNumList.set(i, newRating);
                System.out.println("Player replaced successfully.");
                return; // 替换完成后退出方法
            }    
        }
        System.out.println("Jersey number not found.");
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        PlayerRoster roster = new PlayerRoster(); // 创建 PlayerRoster 实例
        roster.readInfo(scnr);
        roster.menuOperate(scnr);
    }
}


// Quick sort algorithm
// 快速排序算法

public class QuickSort {
   public static int partition(int [] numbers, int i, int k) {
      int l;
      int h;
      int midpoint;
      int pivot;
      int temp;
      boolean done;

      /* Pick middle element as pivot */
      midpoint = i + (k - i) / 2;
      pivot = numbers[midpoint];

      done = false;
      l = i;
      h = k;

      while (!done) {
         /* Increment l while numbers[l] < pivot */
         while (numbers[l] < pivot) {
            ++l;
         }

         /* Decrement h while pivot < numbers[h] */
         while (pivot < numbers[h]) {
            --h;
         }

         /* If there are zero or one items remaining,
            all numbers are partitioned. Return h */
         if (l >= h) {
            done = true;
         } 
         else {
            /* Swap numbers[l] and numbers[h],
               update l and h */
            temp = numbers[l];
            numbers[l] = numbers[h];
            numbers[h] = temp;

            ++l;
            --h;
         }
      }

      return h;
   }

   public static void quicksort(int [] numbers, int i, int k) {
      int j;

      /* Base case: If there are 1 or zero entries to sort,
       partition is already sorted */
      if (i >= k) {
         return;
      }

      /* Partition the data within the array. Value j returned
         from partitioning is location of last item in low partition. */
      j = partition(numbers, i, k);

      /* Recursively sort low partition (i to j) and
         high partition (j + 1 to k) */
      quicksort(numbers, i, j);
      quicksort(numbers, j + 1, k);
   }

   public static void main(String [] args) {
      int [] numbers = {10, 2, 78, 4, 45, 32, 7, 11};
      int i;

      System.out.print("UNSORTED: ");
      for (i = 0; i < numbers.length; ++i) {
         System.out.print(numbers[i] + " ");
      }
      System.out.println();

      /* Initial call to quicksort */
      quicksort(numbers, 0, numbers.length - 1);

      System.out.print("SORTED: ");
      for (i = 0; i < numbers.length; ++i) {
         System.out.print(numbers[i] + " ");
      }
      System.out.println();
   }
}
 
UNSORTED: 10 2 78 4 45 32 7 11 
SORTED: 2 4 7 10 11 32 45 78


// merge sort algorithm
// 归并排序
public class MergeSort {
   public static void merge(int [] numbers, int i, int j, int k) {
      int mergedSize = k - i + 1;       // Size of merged partition
      int mergedNumbers [] = new int[mergedSize]; // Temporary array for merged numbers
      int mergePos;                     // Position to insert merged number
      int leftPos;                      // Position of elements in left partition
      int rightPos;                     // Position of elements in right partition

      mergePos = 0;
      leftPos = i;                      // Initialize left partition position
      rightPos = j + 1;                 // Initialize right partition position

      // Add smallest element from left or right partition to merged numbers
      while (leftPos <= j && rightPos <= k) {
         if (numbers[leftPos] < numbers[rightPos]) {
            mergedNumbers[mergePos] = numbers[leftPos];
            ++leftPos;
         } 
         else {
            mergedNumbers[mergePos] = numbers[rightPos];
            ++rightPos;
         }
         ++mergePos;
      }

      // If left partition is not empty, add remaining elements to merged numbers
      while (leftPos <= j) {
         mergedNumbers[mergePos] = numbers[leftPos];
         ++leftPos;
         ++mergePos;
      }

      // If right partition is not empty, add remaining elements to merged numbers
      while (rightPos <= k) {
         mergedNumbers[mergePos] = numbers[rightPos];
         ++rightPos;
         ++mergePos;
      }

      // Copy merge number back to numbers
      for (mergePos = 0; mergePos < mergedSize; ++mergePos) {
         numbers[i + mergePos] = mergedNumbers[mergePos];
      }
   }

   public static void mergeSort(int [] numbers, int i, int k) {
      int j;

      if (i < k) {
         j = (i + k) / 2;  // Find the midpoint in the partition

         // Recursively sort left and right partitions
         mergeSort(numbers, i, j);
         mergeSort(numbers, j + 1, k);

         // Merge left and right partition in sorted order
         merge(numbers, i, j, k);
      }
   }

   public static void main(String [] args) {
      int [] numbers = {10, 2, 78, 4, 45, 32, 7, 11};
      int i;

      System.out.print("UNSORTED: ");
      for (i = 0; i < numbers.length; ++i) {
         System.out.print(numbers[i] + " ");
      }
      System.out.println();

      /* initial call to merge sort with index */
      mergeSort(numbers, 0, numbers.length - 1);

      System.out.print("SORTED: ");
      for (i = 0; i < numbers.length; ++i) {
         System.out.print(numbers[i] + " ");
      }
      System.out.println();
   }
}
UNSORTED: 10 2 78 4 45 32 7 11 
SORTED: 2 4 7 10 11 32 45 78


// Using a JFormattedTextField to enter a formatted distance value for a travel time calculation.
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FlyDriveFrame extends JFrame implements ActionListener {
   private JButton calcButton;            // Triggers time calculation
   private JLabel distLabel;              // Label for distance input
   private JLabel hrsFlyLabel;            // Label for fly time
   private JLabel hrsDriveLabel;          // Label for drive time
   private JTextField hrsFlyField;        // Displays fly time
   private JTextField hrsDriveField;      // Displays drive time
   private JFormattedTextField distField; // Holds distance input

   /* Constructor creates GUI components and adds GUI components
      using a GridBagLayout. */
   FlyDriveFrame() {
      // Used to specify GUI component layout
      GridBagConstraints layoutConst = null;

      // Set frame's title
      setTitle("Fly Drive Travel Time Calculator");

      // Create labels
      distLabel = new JLabel("Distance (miles):");
      hrsFlyLabel = new JLabel("Flight time (hrs):");
      hrsDriveLabel = new JLabel("Driving time (hrs):");

      // Create button and add action listener
      calcButton = new JButton("Calculate");
      calcButton.addActionListener(this);

      // Create flight time filed
      hrsFlyField = new JTextField(15);
      hrsFlyField.setEditable(false);

      // Create driving time field
      hrsDriveField = new JTextField(15);
      hrsDriveField.setEditable(false);

      // Create and set-up an input field for numbers (not text)
      distField = new JFormattedTextField(NumberFormat.getNumberInstance());
      distField.setEditable(true);
      distField.setText("0");
      distField.setColumns(15); // Initial width of 10 units 

      // Use a GridBagLayout
      setLayout(new GridBagLayout());

      // Specify component's grid location
      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 10, 1);
      layoutConst.gridx = 0;
      layoutConst.gridy = 0;
      add(distLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 1, 10, 10);
      layoutConst.gridx = 1;
      layoutConst.gridy = 0;
      add(distField, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 5, 10, 10);
      layoutConst.gridx = 2;
      layoutConst.gridy = 0;
      add(calcButton, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 0, 1, 10);
      layoutConst.gridx = 1;
      layoutConst.gridy = 1;
      add(hrsFlyLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(1, 0, 10, 10);
      layoutConst.gridx = 1;
      layoutConst.gridy = 2;
      add(hrsFlyField, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 0, 1, 10);
      layoutConst.gridx = 2;
      layoutConst.gridy = 1;
      add(hrsDriveLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(1, 0, 10, 10);
      layoutConst.gridx = 2;
      layoutConst.gridy = 2;
      add(hrsDriveField, layoutConst);
   }

   /* Method is automatically called when an event 
      occurs (e.g, Enter key is pressed) */
   @Override
   public void actionPerformed(ActionEvent event) {
      double totMiles;     // Distance to travel
      double hrsFly;       // Corresponding hours to fly
      double hrsDrive;     // Corresponding hours to drive

      // Get value from distance field
      totMiles = ((Number) distField.getValue()).doubleValue();

      // Check if miles input is positive
      if (totMiles >= 0.0) {
         hrsFly = totMiles / 500.0;
         hrsDrive = totMiles / 60.0;

         hrsFlyField.setText(Double.toString(hrsFly));
         hrsDriveField.setText(Double.toString(hrsDrive));
      }
      else {
         // Show failure dialog
         JOptionPane.showMessageDialog(this, "Enter a positive distance value!");
      }
   }

   /* Creates a FlyDriveFrame and makes it visible */
   public static void main(String[] args) {
      // Creates FlyDriveFrame and its components
      FlyDriveFrame myFrame = new FlyDriveFrame();

      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.pack();
      myFrame.setVisible(true);
   }
}


// Using a JSpinner to enter a dog's age for a GUI that converts a dog's age into human years. 
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class DogYearsFrame extends JFrame implements ChangeListener {
   private JSpinner yearsSpinner;    // Triggers travel time calculation
   private JTextField ageHumanField; // Displays dog's age in human years
   private JLabel yearsLabel;        // Label for dog years
   private JLabel ageHumanLabel;     // Label for human years

   /* Constructor creates GUI components and adds GUI components
      using a GridBagLayout. */
   DogYearsFrame() {
      int initYear;     // Spinner initial value display
      int minYear;      // Spinner min value
      int maxYear;      // Spinner max value
      int stepVal;      // Spinner step

      initYear = 0;
      minYear = 0;
      maxYear = 30;
      stepVal = 1;

      // Used to specify GUI component layout
      GridBagConstraints layoutConst = null;

      // Specifies the types of values displayed in spinner
      SpinnerNumberModel spinnerModel = null;

      // Set frame's title
      setTitle("Dog's age in human years");

      // Create labels
      yearsLabel = new JLabel("Select dog's age (years):");
      ageHumanLabel = new JLabel("Age (human years):");

      // Create a spinner model, the spinner, and set the change listener
      spinnerModel = new SpinnerNumberModel(initYear, minYear, maxYear, stepVal);
      yearsSpinner = new JSpinner(spinnerModel);
      yearsSpinner.addChangeListener(this);

      // Create field
      ageHumanField = new JTextField(15);
      ageHumanField.setEditable(false);
      ageHumanField.setText("0 - 15");

      // Use a GridBagLayout
      setLayout(new GridBagLayout());

      // Specify component's grid location
      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 10, 1);
      layoutConst.anchor = GridBagConstraints.LINE_END;
      layoutConst.gridx = 0;
      layoutConst.gridy = 0;
      add(yearsLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 1, 10, 10);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 1;
      layoutConst.gridy = 0;
      add(yearsSpinner, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 10, 1);
      layoutConst.anchor = GridBagConstraints.LINE_END;
      layoutConst.gridx = 0;
      layoutConst.gridy = 1;
      add(ageHumanLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 1, 10, 10);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 1;
      layoutConst.gridy = 1;
      add(ageHumanField, layoutConst);
   }

   @Override
   public void stateChanged(ChangeEvent event) {
      Integer dogAgeYears;     // Dog age input

      dogAgeYears = (Integer) yearsSpinner.getValue();

      // Choose output based on dog's age component
      switch (dogAgeYears) {
         case 0:
            ageHumanField.setText("0 - 15");
            break;
            
         case 1:
            ageHumanField.setText("15");
            break;
            
         case 2:
            ageHumanField.setText("24");
            break;
            
         case 3:
            ageHumanField.setText("28");
            break;
            
         case 4:
            ageHumanField.setText("32");
            break;
            
         case 5:
            ageHumanField.setText("37");
            break;
            
         case 6:
            ageHumanField.setText("42");
            break;
            
         case 7:
            ageHumanField.setText("47");
            break;
            
         case 8:
            ageHumanField.setText("52");
            break;
            
         case 9:
            ageHumanField.setText("57");
            break;
            
         case 10:
            ageHumanField.setText("62");
            break;
            
         case 11:
            ageHumanField.setText("67");
            break;
            
         case 12:
            ageHumanField.setText("72");
            break;
            
         case 13:
            ageHumanField.setText("77");
            break;
            
         case 14:
            ageHumanField.setText("82");
            break;
            
         default:
            ageHumanField.setText("That's a long life!");
      }
   }

   /* Creates a DogYearsFrame and makes it visible */
   public static void main(String[] args) {
      // Creates DogYearsFrame and its components
      DogYearsFrame myFrame = new DogYearsFrame();

      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.pack();
      myFrame.setVisible(true);
   }
}


// Using a JTextArea to display the amount of money in a savings account per year. 
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SavingsInterestCalcFrame extends JFrame implements ActionListener {
   private JTextArea outputArea;                  // Displays yearly savings
   private JButton calcButton;                    // Triggers savings calculation
   private JFormattedTextField initSavingsField;  // Holds savings amount
   private JFormattedTextField interestRateField; // Holds interest amount
   private JFormattedTextField yearsField;        // Holds num years

   /* Constructor creates GUI components and adds GUI components
      using a GridBagLayout. */
   SavingsInterestCalcFrame() {
      GridBagConstraints layoutConst = null; // Used to specify GUI component layout
      JScrollPane scrollPane = null;         // Container that adds a scroll bar
      JLabel initSavingsLabel = null;        // Label for savings
      JLabel interestRateLabel = null;       // Label for interest
      JLabel yearsLabel = null;              // Label for num years
      JLabel outputLabel = null;             // Label for yearly savings

      // Format for the savings input
      NumberFormat currencyFormat = null;
      
      // Format for the interest rate input
      NumberFormat percentFormat = null;
      
      // Format for the years input
      NumberFormat integerFormat = null;

      // Set frame's title
      setTitle("Savings calculator");

      // Create labels
      initSavingsLabel = new JLabel("Initial savings:");
      interestRateLabel = new JLabel("Interest rate:");
      yearsLabel = new JLabel("Years:");
      outputLabel = new JLabel("Yearly savings:");

      // Create output area and add it to scroll pane
      outputArea = new JTextArea(10, 15);
      scrollPane = new JScrollPane(outputArea);
      outputArea.setEditable(false);

      calcButton = new JButton("Calculate");
      calcButton.addActionListener(this);

      // Create savings field and specify the currency format
      currencyFormat = NumberFormat.getCurrencyInstance();
      initSavingsField = new JFormattedTextField(currencyFormat);
      initSavingsField.setEditable(true);
      initSavingsField.setColumns(10); // Initial width of 10 units
      initSavingsField.setValue(0);

      // Create rate field and specify the percent format
      percentFormat = NumberFormat.getPercentInstance();
      percentFormat.setMinimumFractionDigits(1);
      interestRateField = new JFormattedTextField(percentFormat);
      interestRateField.setEditable(true);
      interestRateField.setValue(0.0);

      // Create years field and specify the default number (for doubles) format
      integerFormat = NumberFormat.getIntegerInstance();
      yearsField = new JFormattedTextField(integerFormat);
      yearsField.setEditable(true);
      yearsField.setValue(0);

      // Use a GridBagLayout
      setLayout(new GridBagLayout());

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 5, 1);
      layoutConst.anchor = GridBagConstraints.LINE_END;
      layoutConst.gridx = 0;
      layoutConst.gridy = 0;
      add(initSavingsLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 1, 5, 10);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 1;
      layoutConst.gridy = 0;
      add(initSavingsField, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(5, 10, 5, 1);
      layoutConst.anchor = GridBagConstraints.LINE_END;
      layoutConst.gridx = 0;
      layoutConst.gridy = 1;
      add(interestRateLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(5, 1, 5, 10);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 1;
      layoutConst.gridy = 1;
      add(interestRateField, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(5, 10, 10, 1);
      layoutConst.anchor = GridBagConstraints.LINE_END;
      layoutConst.gridx = 0;
      layoutConst.gridy = 2;
      add(yearsLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(5, 1, 10, 10);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 1;
      layoutConst.gridy = 2;
      add(yearsField, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(0, 5, 0, 10);
      layoutConst.fill = GridBagConstraints.BOTH;
      layoutConst.gridx = 2;
      layoutConst.gridy = 1;
      add(calcButton, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 1, 10);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 0;
      layoutConst.gridy = 3;
      add(outputLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(1, 10, 10, 10);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 0;
      layoutConst.gridy = 4;
      layoutConst.gridwidth = 3; // 3 cells wide
      add(scrollPane, layoutConst);
   }

   @Override
   public void actionPerformed(ActionEvent event) {
      int i;                       // Loop index
      double savingsDollars;       // Yearly savings
      double interestRate;         // Annual interest rate
      int numYears;                // Num years to calc savings

      // Get values from fields
      savingsDollars = ((Number) initSavingsField.getValue()).intValue();
      interestRate = ((Number) interestRateField.getValue()).doubleValue();
      numYears = ((Number) yearsField.getValue()).intValue();

      // Clear the text area
      outputArea.setText("");

      // Calculate savings iteratively in a while loop
      i = 1;
      while (i <= numYears) {
         outputArea.append("Savings in year " + i +
                           ": $" + savingsDollars + "\n");
         savingsDollars = savingsDollars + (savingsDollars * interestRate);

         i = i + 1;
      }
   }

   /* Creates a SavingsInterestCalcFrame and makes it visible */
   public static void main(String[] args) {
      // Creates SavingsInterestCalcFrame and its components
      SavingsInterestCalcFrame myFrame = new SavingsInterestCalcFrame();

      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.pack();
      myFrame.setVisible(true);
   }
}


// Calculating the maximum array value for an array displayed in a JTable.
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

public class ArrayMaxFrame extends JFrame implements ActionListener {
   private JLabel maxLabel;              // Label for max array element
   private JFormattedTextField maxField; // Holds max array element
   private JButton maxButton;            // Triggers search for max array element
   private JTable arrayValsTable;        // Table of array values
   private final int numElements = 8;    // Number of array elements
   private String[] columnHeadings;      // Stores the table's column headings
   private String[][] tableVals;         // Stores the table's values
 
   /* Constructor creates GUI components and adds GUI components
      using a GridBagLayout. */
   ArrayMaxFrame() {
      GridBagConstraints layoutConst = null; // GUI component layout
      int i;                      

      // Set frame's title
      setTitle("Array maximum");

      // Create label
      maxLabel = new JLabel("Max:");

      // Create field
      maxField = new JFormattedTextField(NumberFormat.getIntegerInstance());
      maxField.setColumns(15);
      maxField.setEditable(false);
      maxField.setValue(0);

      // Create button
      maxButton = new JButton("Find max");
      maxButton.addActionListener(this);

      // Table headings and values
      columnHeadings = new String[1];
      tableVals = new String[8][1];

      // Initialize column heading(s)
      columnHeadings[0] = "Element";

      // Initialize table values
      for (i = 0; i < numElements; ++i) {
         tableVals[i][0] = "0";
      }

      // Create a table with the specified values and column headings
      arrayValsTable = new JTable(tableVals, columnHeadings);

      // Use a GridBagLayout
      setLayout(new GridBagLayout());

      // Add table header
      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 0, 0);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 0;
      layoutConst.gridy = 0;
      layoutConst.gridwidth = 2;
      add(arrayValsTable.getTableHeader(), layoutConst);

      // Add table itself
      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(0, 10, 10, 0);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 0;
      layoutConst.gridy = 1;
      layoutConst.gridwidth = 2;
      add(arrayValsTable, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 10, 10);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 0;
      layoutConst.gridy = 2;
      add(maxButton, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 10, 1);
      layoutConst.anchor = GridBagConstraints.LINE_END;
      layoutConst.gridx = 1;
      layoutConst.gridy = 2;
      add(maxLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 1, 10, 10);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 2;
      layoutConst.gridy = 2;
      add(maxField, layoutConst);
   }

   @Override
   public void actionPerformed(ActionEvent event) {
      int i;               // Loop index
      int maxElement;      // Max value found
      String strElem;      // Array element value (string)
      int elemVal;         // Array element value (int)

      strElem = tableVals[0][0];              // Get table value (String)
      maxElement = Integer.parseInt(strElem); // Convert to Integer

      // Iterate through table values to find max
      for (i = 1; i < numElements; ++i) {
         strElem = tableVals[i][0];           // Get table value (String)
         elemVal = Integer.parseInt(strElem); // Convert to Integer
         if (elemVal > maxElement) {          // Check if new max value found
            maxElement = elemVal;             // If so, update max
         }
      }

      // Display maximum value
      maxField.setValue(maxElement);
   }

   /* Creates a ArrayMaxFrame and makes it visible */
   public static void main(String[] args) {
      // Creates ArrayMaxFrame and its components
      ArrayMaxFrame myFrame = new ArrayMaxFrame();

      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.pack();
      myFrame.setVisible(true);
   }
}


// Using JSliders to enter height in feet and inches.
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class HeightConverterFrame extends JFrame implements ActionListener, ChangeListener {
   private JTextField heightCmField;  // Holds height output value in cm
   private JTextField heightFtField;  // Holds height input value in feet
   private JTextField heightInField;  // Holds height input value in inches
   private JLabel feetLabel;          // Label for height input in feet
   private JLabel inchesLabel;        // Label for height input in inches 
   private JLabel cmLabel;            // Label for height in cm
   private JButton convertButton;     // Triggers height conversion
   private JSlider heightFtSlider;    // Slider for feet input
   private JSlider heightInSlider;    // Slider for inches input

   final static double CM_PER_IN = 2.54; // Centimeters per inch
   final static int IN_PER_FT = 12;      // Inches per foot

   /* Constructor creates GUI components and adds GUI components
      using a GridBagLayout. */
   HeightConverterFrame() {
      int feetMin = 0;    // Feet slider min value
      int feetMax = 10;   // Feet slider max value
      int feetInit = 5;   // Feet slider initial value
      int inchesMin = 0;  // Inches slider min value
      int inchesMax = 11; // Inches slider max value
      int inchesInit = 8; // Inches slider initial value
      GridBagConstraints layoutConst = null; // GUI component layout

      // Set frame's title
      setTitle("Height converter");

      // Create labels
      feetLabel = new JLabel("Enter feet:");
      inchesLabel = new JLabel("Enter inches:");
      cmLabel = new JLabel("Centimeters:");

      heightCmField = new JTextField(10);
      heightCmField.setEditable(false);

      convertButton = new JButton("Convert");
      convertButton.addActionListener(this);

      // Create slider that enables user to enter height in feet
      heightFtSlider = new JSlider(feetMin, feetMax, feetInit);
      heightFtSlider.addChangeListener(this); // Use HeightConverter's stateChanged()
      heightFtSlider.setMajorTickSpacing(10);
      heightFtSlider.setMinorTickSpacing(1);
      heightFtSlider.setPaintTicks(true);
      heightFtSlider.setPaintLabels(true);

      heightFtField = new JTextField(10);
      heightFtField.setEditable(false);
      heightFtField.setText("5");

      // Creates slider that enables user to enter height in inches
      heightInSlider = new JSlider(inchesMin, inchesMax, inchesInit);
      heightInSlider.addChangeListener(this); // Use HeightConverter's stateChanged()
      heightInSlider.setMajorTickSpacing(10);
      heightInSlider.setMinorTickSpacing(1);
      heightInSlider.setPaintTicks(true);
      heightInSlider.setPaintLabels(true);

      heightInField = new JTextField(10);
      heightInField.setEditable(false);
      heightInField.setText("8");

      // Create frame and add components using GridBagLayout
      setLayout(new GridBagLayout());

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 1, 1);
      layoutConst.anchor = GridBagConstraints.LINE_START;
      layoutConst.gridx = 0;
      layoutConst.gridy = 0;
      layoutConst.gridwidth = 1;
      add(feetLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 1, 1);
      layoutConst.anchor = GridBagConstraints.LINE_START;
      layoutConst.gridx = 2;
      layoutConst.gridy = 0;
      layoutConst.gridwidth = 1;
      add(inchesLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 1, 1, 10);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 1;
      layoutConst.gridy = 0;
      layoutConst.gridwidth = 1;
      add(heightFtField, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 1, 10);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 3;
      layoutConst.gridy = 0;
      layoutConst.gridwidth = 1;
      add(heightInField, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(1, 10, 10, 10);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 0;
      layoutConst.gridy = 1;
      layoutConst.gridwidth = 2;
      add(heightFtSlider, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(1, 10, 10, 10);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 2;
      layoutConst.gridy = 1;
      layoutConst.gridwidth = 2;
      add(heightInSlider, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 10, 5);
      layoutConst.anchor = GridBagConstraints.LINE_END;
      layoutConst.gridx = 0;
      layoutConst.gridy = 2;
      layoutConst.gridwidth = 1;
      add(convertButton, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 10, 1);
      layoutConst.anchor = GridBagConstraints.LINE_END;
      layoutConst.gridx = 1;
      layoutConst.gridy = 2;
      layoutConst.gridwidth = 1;
      add(cmLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 1, 10, 10);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 2;
      layoutConst.gridy = 2;
      layoutConst.gridwidth = 2;
      add(heightCmField, layoutConst);
   }

   /* Converts a height in feet/inches to centimeters. */
   public static double HeightFtInToCm(int ft, int in) {
      int totIn;              // Total inches input by user
      double cmHeight;        // Corresponding height in cm

      totIn = (ft * IN_PER_FT) + in; // Total inches
      cmHeight = totIn * CM_PER_IN;  // Convert to cm
      return cmHeight;
   }

   /* Called as slider value changes. Updates fields to display
      the numerical representation of the slider settings. */
   @Override
   public void stateChanged(ChangeEvent event) {
      int sliderVal;            // Slider value (int)
      String strSliderVal;      // Slider value (string)

      // Get source of event (2 sliders in GUI)
      JSlider sourceEvent = (JSlider) event.getSource();

      if (sourceEvent == heightFtSlider) {
         sliderVal = heightFtSlider.getValue();      // Get slider value
         strSliderVal = Integer.toString(sliderVal); // Convert to int
         heightFtField.setText(strSliderVal);        // Update display
      }
      else if (sourceEvent == heightInSlider) {
         sliderVal = heightInSlider.getValue();
         strSliderVal = Integer.toString(sliderVal);
         heightInField.setText(strSliderVal);
      }

   }

   /* Called when button is pressed. Converts height to cm. */
   @Override
   public void actionPerformed(ActionEvent event) {
      int ftVal;          // User defined height in feet
      int inVal;          // User defined height in inches
      double cmVal;       // Corresponding height in cm

      ftVal = heightFtSlider.getValue();    // Get ft slider value
      inVal = heightInSlider.getValue();    // Get in slider value
      cmVal = HeightFtInToCm(ftVal, inVal); // Convert ft/in to cm, update cmVal

      heightCmField.setText(Double.toString(cmVal)); // Update cm heigth
   }

   /* Creates a HeightConverterFrame and makes it visible */
   public static void main(String[] args) {
      // Creates HeightConverterFrame and its components
      HeightConverterFrame myFrame = new HeightConverterFrame();

      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.pack();
      myFrame.setVisible(true);
   }
}


// A seat reservation GUI involving a table, fields, and buttons.
SeatInfo.java
public class SeatInfo {
   private String firstName; // First name
   private String lastName;  // Last name
   private int amtPaid;      // Amount paid

   // Method to initialize Seat fields
   public void reserveSeat(String inFirstName, String inLastName, int ticketCost) {
      firstName = inFirstName;
      lastName = inLastName;
      amtPaid = ticketCost;
   }

   // Method to empty a Seat
   public void makeEmpty() {
      firstName = "empty";
      lastName = "empty";
      amtPaid = 0;
   }

   // Method to check if Seat is empty
   public boolean isEmpty() {
      return firstName.equals("empty");
   }

   // Method to print Seat fields
   public void printSeatInfo() {
      System.out.print(firstName + " ");
      System.out.print(lastName + " ");
      System.out.println("Paid: " + amtPaid);
   }

   public String getFirstName() {
      return firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public int getAmountPaid() {
      return amtPaid;
   }
}

SeatReservationFrame.java
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class SeatReservationFrame extends JFrame implements ActionListener {
   private JTextField firstNameField;             // Holds first name
   private JTextField lastNameField;              // Holds last name
   private JFormattedTextField seatNumField;      // Holds seat number
   private JFormattedTextField amountPaidField;   // Holds ticket cost
   private JLabel tableLabel;                     // Label for table display
   private JLabel seatNumLabel;                   // Label for seat number
   private JLabel firstNameLabel;                 // Label for first name
   private JLabel lastNameLabel;                  // Label for last name
   private JLabel amountPaidLabel;                // Label for amount paid
   private JButton reserveButton;                 // Triggers seat reservation
   private JButton quitButton;                    // Triggers termination of GUI
   private JTable seatStatusTable;                // Table tracks seat reservations
   private final static int NUM_SEATS = 5;        // Number of seat in reservation system
   private static ArrayList<SeatInfo> seatResArr; // ArrayList of Seat objects

   /* Constructor creates GUI components and adds GUI components
      using a GridBagLayout. */
   SeatReservationFrame() {
      Object[][] tableVals = new Object[5][4];                // Seat reservation table
      String[] columnHeadings = {"Seat Number", "First Name", // Column headings for reservation table
                                 "Last Name", "Amount Paid"};
      GridBagConstraints layoutConst = null;                  // GUI component layout
      NumberFormat currencyFormat = null;                     // Format for amount paid

      // Set frame's title
      setTitle("Seat reservation");

      // Add 5 seat objects to ArrayList
      seatResArr = new ArrayList<SeatInfo>();
      seatsAddElements(seatResArr, NUM_SEATS);

      // Make all seats empty
      seatsMakeEmpty(seatResArr);

      // Create seat reservation table
      tableLabel = new JLabel("Seat reservation status:");
      seatNumLabel = new JLabel("Seat Number:");
      firstNameLabel = new JLabel("First Name:");
      lastNameLabel = new JLabel("Last Name:");
      amountPaidLabel = new JLabel("Amount Paid:");

      seatNumField = new JFormattedTextField(NumberFormat.getIntegerInstance());
      seatNumField.setEditable(true);
      seatNumField.setValue(0);

      firstNameField = new JTextField(20);
      firstNameField.setEditable(true);
      firstNameField.setText("John");

      lastNameField = new JTextField(20);
      lastNameField.setEditable(true);
      lastNameField.setText("Doe");

      currencyFormat = NumberFormat.getCurrencyInstance();
      currencyFormat.setMaximumFractionDigits(0);
      amountPaidField = new JFormattedTextField(currencyFormat);
      amountPaidField.setEditable(true);
      amountPaidField.setValue(0.0);

      reserveButton = new JButton("Reserve");
      reserveButton.addActionListener(this);

      quitButton = new JButton("Quit");
      quitButton.addActionListener(this);

      // Initialize table
      seatStatusTable = new JTable(tableVals, columnHeadings);
      seatStatusTable.setEnabled(false); // Prevent user input via table

      // Add components using GridBagLayout
      setLayout(new GridBagLayout());

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 1, 0);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 0;
      layoutConst.gridy = 0;
      add(tableLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(1, 10, 0, 0);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 0;
      layoutConst.gridy = 1;
      layoutConst.gridwidth = 4;
      add(seatStatusTable.getTableHeader(), layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(0, 10, 10, 0);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 0;
      layoutConst.gridy = 2;
      layoutConst.gridwidth = 4;
      add(seatStatusTable, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 1, 0);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 0;
      layoutConst.gridy = 3;
      add(seatNumLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(1, 10, 10, 0);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 0;
      layoutConst.gridy = 4;
      add(seatNumField, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 1, 0);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 1;
      layoutConst.gridy = 3;
      add(firstNameLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(1, 10, 10, 0);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 1;
      layoutConst.gridy = 4;
      add(firstNameField, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 1, 0);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 2;
      layoutConst.gridy = 3;
      add(lastNameLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(1, 10, 10, 0);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 2;
      layoutConst.gridy = 4;
      add(lastNameField, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 1, 0);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 3;
      layoutConst.gridy = 3;
      add(amountPaidLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(1, 10, 10, 0);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 3;
      layoutConst.gridy = 4;
      add(amountPaidField, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(0, 10, 10, 5);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 4;
      layoutConst.gridy = 4;
      add(reserveButton, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(0, 5, 10, 10);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 5;
      layoutConst.gridy = 4;
      add(quitButton, layoutConst);
   }

   /* Called when either button is pressed. */
   @Override
   public void actionPerformed(ActionEvent event) {
      SeatInfo seatElement;  // Seat information
      String firstName;      // First name
      String lastName;       // Last name
      int seatNum;           // Seat number
      int amtPaid;           // Amount paid

      // Get source of event (2 buttons in GUI)
      JButton sourceEvent = (JButton) event.getSource();

      // User pressed the reserve button
      if (sourceEvent == reserveButton) {
         seatNum = ((Number) seatNumField.getValue()).intValue();

         // User tried to reserve non-existing seat
         if (seatNum >= NUM_SEATS) {
            // Show failure dialog
            JOptionPane.showMessageDialog(this, "Seat doesn't exist!");
         }
         // User tried to reserve a non-empty seat
         else if (!(seatResArr.get(seatNum).isEmpty())) {
            // Show failure dialog
            JOptionPane.showMessageDialog(this, "Seat is not empty!");
         }
         // Reserve the specified seat
         else {
            firstName = firstNameField.getText();
            lastName = lastNameField.getText();
            amtPaid = ((Number) amountPaidField.getValue()).intValue();

            seatElement = new SeatInfo();         // Create new Seat object
            seatElement.reserveSeat(firstName, lastName, amtPaid);
            seatResArr.set(seatNum, seatElement); // Add seat to ArrayList

            updateTable();                        // Synchronize table with sts ArrayList

            // Show success dialog
            JOptionPane.showMessageDialog(this, "Seat reservation completed.");
         }
      }
      else if (sourceEvent == quitButton) {
         dispose();                               // Terminate program
      }
   }

   /* Updates the reservation information displayed by the table */
   public void updateTable() {
      final int seatNumCol = 0;   // Col num for seat numbers
      final int firstNameCol = 1; // Col num for first names
      final int lastNameCol = 2;  // Col num for last names
      final int paidCol = 3;      // Col num for amount paid
      int i;                      // Loop index

      for (i = 0; i < NUM_SEATS && i < seatResArr.size(); ++i) {
         if (seatResArr.get(i).isEmpty()) { // Clear table entries 
            seatStatusTable.setValueAt(null, i, seatNumCol);
            seatStatusTable.setValueAt(null, i, firstNameCol);
            seatStatusTable.setValueAt(null, i, lastNameCol);
            seatStatusTable.setValueAt(null, i, paidCol);
         }
         else {                             // Update table with content in the seatResArr ArrayList
            seatStatusTable.setValueAt(i, i, seatNumCol);
            seatStatusTable.setValueAt(seatResArr.get(i).getFirstName(), i, firstNameCol);
            seatStatusTable.setValueAt(seatResArr.get(i).getLastName(), i, lastNameCol);
            seatStatusTable.setValueAt(seatResArr.get(i).getAmountPaid(), i, paidCol);
         }
      }
   }

   /* Makes seats empty */
   public static void seatsMakeEmpty(ArrayList<SeatInfo> seatsRes) {
      int i;      // Loop index
      
      for (i = 0; i < seatsRes.size(); ++i) {
         seatsRes.get(i).makeEmpty();
      }
   }

   /* Adds empty seats to ArrayList */
   public static void seatsAddElements(ArrayList<SeatInfo> seatsRes, int numSeats) {
      int i;     // Loop index
      
      for (i = 0; i < numSeats; ++i) {
         seatsRes.add(new SeatInfo());
      }
   }

   /* Creates a SeatReservationFrame and makes it visible */
   public static void main(String[] args) {
      // Creates SeatReservationFrame and its components
      SeatReservationFrame myFrame = new SeatReservationFrame();

      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.pack();
      myFrame.setVisible(true);
   }
}


// Displaying a yearly salary using a GUI.
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.TextField;

public class SalaryGuiFx extends Application {
   @Override
   public void start(Stage applicationStage) {
      int hourlyWage;
      int yearlySalary;
      Scene scene = null;                  // Scene contains all content
      Pane pane = null;                    // Positions components within scene
      TextField outputField = null;        // Displays output salary
      
      pane = new Pane();                   // Create an empty pane     
      scene = new Scene(pane);             // Create a scene containing the pane
            
      // Calculate yearly salary
      hourlyWage = 20;
      yearlySalary = hourlyWage * 40 * 50;
              
      // Create text field and display program output using the text field
      outputField = new TextField();
      outputField.setText("An hourly wage of $" + hourlyWage + "/hr " +
                          "yields $" + yearlySalary + "/yr.");
      outputField.setEditable(false);      // Prevent user from editing text
      outputField.setPrefColumnCount(22);  
      
      pane.getChildren().add(outputField); // Add text field to pane
      
      applicationStage.setScene(scene);    // Set window's scene  
      applicationStage.setTitle("Salary"); // Set window's title
      applicationStage.show();             // Display window
   }
   
   public static void main(String [] args) {
      launch(args); // Launch application
   }
}


// Using a GridPane to arrange graphical components.
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class SalaryLabelGuiFx extends Application {
   @Override
   public void start(Stage applicationStage) {
      int hourlyWage;
      int yearlySalary;
      Scene scene = null;         // Scene contains all content
      GridPane gridPane = null;   // Positions components within scene
      Label wageLabel = null;     // Label for hourly salary
      Label salaryLabel = null;   // Label for yearly salary
      TextField salField = null;  // Displays yearly salary
      TextField wageField = null; // Displays hourly wage
      Insets gridPadding = null;

      gridPane = new GridPane();   // Create an empty pane
      scene = new Scene(gridPane); // Create scene containing the grid pane
      
      // Calculate yearly salary
      hourlyWage = 20;
      yearlySalary = hourlyWage * 40 * 50;

      // Set hourly and yearly salary
      wageLabel = new Label("Hourly wage:");
      salaryLabel = new Label("Yearly salary:");

      // Create wage and salary text fields
      wageField = new TextField();
      wageField.setPrefColumnCount(15);
      wageField.setEditable(false);
      wageField.setText(Integer.toString(hourlyWage));

      salField = new TextField();
      salField.setPrefColumnCount(15);
      salField.setEditable(false);
      salField.setText(Integer.toString(yearlySalary));

      gridPane.add(wageLabel, 0, 0);   // Add wage label to location (0, 0)
      gridPane.add(wageField, 1, 0);   // Add wage text field to location (1, 0)
      gridPane.add(salaryLabel, 0, 1); // Add salary label to location (0, 1)
      gridPane.add(salField, 1, 1);    // Add salary text field to location (1, 1)
      
      gridPadding = new Insets(10, 10, 10, 10); // Padding values for top, right, bottom, and left
      gridPane.setPadding(gridPadding);         // Set padding around  grid
      gridPane.setHgap(10);                     // Spacing between columns
      gridPane.setVgap(10);                     // Spacing between rows

      applicationStage.setScene(scene);    // Set window's scene  
      applicationStage.setTitle("Salary"); // Set window's title
      applicationStage.show();             // Display window
   }

   public static void main(String [] args) {
      launch(args); // Launch application
   }
}


// Using a Button to trigger a yearly salary calculation. 
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class SalaryCalcButtonGuiFx extends Application {
   private Label wageLabel;     // Label for hourly salary
   private Label salLabel;      // Label for yearly salary
   private TextField salField;  // Displays hourly salary 
   private TextField wageField; // Displays yearly salary
   private Button calcButton;   // Triggers salary calculation
   
   @Override
   public void start(Stage applicationStage) {
      Scene scene = null;         // Scene contains all content
      GridPane gridPane = null;   // Positions components within scene
      
      gridPane = new GridPane();   // Create an empty pane
      scene = new Scene(gridPane); // Create scene containing the grid pane
      
      // Set hourly and yearly salary
      wageLabel = new Label("Hourly wage:");
      salLabel = new Label("Yearly salary:");
      
      wageField = new TextField(); 
      wageField.setPrefColumnCount(15);
      wageField.setEditable(true);
      wageField.setText("0");
      
      salField = new TextField(); 
      salField.setPrefColumnCount(15);
      salField.setEditable(false);
      
      // Create a "Calculate" button
      calcButton = new Button("Calculate");
      
      gridPane.setPadding(new Insets(10, 10, 10, 10)); // Padding around  grid
      gridPane.setHgap(10);                            // Spacing between columns
      gridPane.setVgap(10);                            // Spacing between rows
      
      gridPane.add(wageLabel, 0, 0);  // Add wage label to location (0, 0)
      gridPane.add(wageField, 1, 0);  // Add wage text field to location (1, 0)
      gridPane.add(salLabel, 0, 1);   // Add salary label to location (0, 1)
      gridPane.add(salField, 1, 1);   // Add salary text field to location (1, 1)
      gridPane.add(calcButton, 0, 2); // Add calculate button to location (0, 2)
      
      // Set an event handler to handle button presses
      calcButton.setOnAction(new EventHandler<ActionEvent>() {
         /* Method is automatically called when an event 
            occurs (e.g, button is pressed) */
         @Override
         public void handle(ActionEvent event) {
            String userInput; 
            int hourlyWage;    
            int yearlySalary;    

            // Get user's wage input and calculate yearly salary
            userInput = wageField.getText();            
            hourlyWage = Integer.parseInt(userInput);
            yearlySalary = hourlyWage * 40 * 50;

            // Display calculated salary
            salField.setText(Integer.toString(yearlySalary));
         } 
      });

      applicationStage.setScene(scene);    // Set window's scene  
      applicationStage.setTitle("Salary"); // Set window's title
      applicationStage.show();             // Display window
   }
   
   public static void main(String [] args) {
      launch(args); // Launch application
   }
}


// Displaying an Alert for invalid wage inputs.
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SalaryCalcButtonErrorAlertGuiFx extends Application {
   private Label wageLabel;     // Label for hourly salary
   private Label salLabel;      // Label for yearly salary
   private TextField salField;  // Displays hourly salary 
   private TextField wageField; // Displays yearly salary
   private Button calcButton;   // Triggers salary calculation
   
   @Override
   public void start(Stage applicationStage) {
      Scene scene = null;         // Scene contains all content
      GridPane gridPane = null;   // Positions components within scene
      
      gridPane = new GridPane();   // Create an empty pane
      scene = new Scene(gridPane); // Create scene containing the grid pane
      
      // Set hourly and yearly salary
      wageLabel = new Label("Hourly wage:");
      salLabel = new Label("Yearly salary:");
      
      wageField = new TextField(); 
      wageField.setPrefColumnCount(15);
      wageField.setEditable(true);
      wageField.setText("0");
      
      salField = new TextField(); 
      salField.setPrefColumnCount(15);
      salField.setEditable(false);
      
      // Create a "Calculate" button
      calcButton = new Button("Calculate");
      
      gridPane.setPadding(new Insets(10, 10, 10, 10)); // Padding around  grid
      gridPane.setHgap(10);                            // Spacing between columns
      gridPane.setVgap(10);                            // Spacing between rows
      
      gridPane.add(wageLabel, 0, 0);  // Add wage label to location (0, 0)
      gridPane.add(wageField, 1, 0);  // Add wage text field to location (1, 0)
      gridPane.add(salLabel, 0, 1);   // Add salary label to location (0, 1)
      gridPane.add(salField, 1, 1);   // Add salary text field to location (1, 1)
      gridPane.add(calcButton, 0, 2); // Add calculate button to location (0, 2)
      
      // Set an event handler to handle button presses
      calcButton.setOnAction(new EventHandler<ActionEvent>() {
         /* Method is automatically called when an event 
            occurs (e.g, button is pressed) */
         @Override
         public void handle(ActionEvent event) {
            String userInput; 
            int hourlyWage;    
            int yearlySalary;    

            // Get user's wage input and calculate yearly salary
            userInput = wageField.getText();            
            hourlyWage = Integer.parseInt(userInput);
            yearlySalary = hourlyWage * 40 * 50;

            if (hourlyWage >= 0) {
               // Display calculated salary
               salField.setText(Integer.toString(yearlySalary));
            }
            else {
               // Display an alert dialog 
               Alert alert = new Alert(AlertType.ERROR, 
                                       "Enter a positive hourly wage value.");
               alert.showAndWait();
            }
         } 
      });
      
      applicationStage.setScene(scene);    // Set window's scene  
      applicationStage.setTitle("Salary"); // Set window's title
      applicationStage.show();             // Display window
   }
   
   public static void main(String [] args) {
      launch(args); // Launch application
   }
}


// Template for creating a JavaFX application to draw 2D graphics. 
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class EmptyCanvasFx extends Application {
   @Override
   public void start(Stage applicationStage) {
      Pane pane = new Pane();                    // Create an empty pane    
      Scene scene = new Scene(pane);             // Create a scene containing the pane
      Canvas canvas = new Canvas(400, 200);      // Create a canvas in which to draw
      
      // Get the canvas' graphics context to draw
      GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
      
      // Write your drawing instructions here
      
      pane.getChildren().add(canvas);            // Add canvas to pane 
      applicationStage.setTitle("Empty canvas"); // Set window's title
      applicationStage.setScene(scene);          // Set window's scene
      applicationStage.show();                   // Display window
   }
   
   public static void main(String [] args) {
      launch(args); // Launch application
   }
}


// Drawing a histogram.       


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class HistogramViewerFx extends Application {
   @Override
   public void start(Stage applicationStage) {
      Pane pane = new Pane();                    // Create an empty pane    
      Scene scene = new Scene(pane);             // Create a scene containing the pane
      Canvas canvas = new Canvas(400, 200);      // Create a canvas in which to draw
      
      // Get the canvas' graphics context to draw
      GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
            
      // Draw 1st bin as an olive colored rectangle at (10,10)
      // with width = 200 and height = 50
      Color binColor1 = Color.rgb(128, 128, 0);
      graphicsContext.setFill(binColor1);
      graphicsContext.fillRect(10, 10, 200, 50);
      
      // Draw 2nd bin as a teal blue rectangle at (10,75)
      // with width = 150 and height = 50      
      Color binColor2 = Color.rgb(0, 200, 200);
      graphicsContext.setFill(binColor2);
      graphicsContext.fillRect(10, 75, 150, 50);
      
      // Draw 3rd bin as a gray rectangle at (10,140)
      // with width = 350 and height = 50 
      Color binColor3 = Color.rgb(100, 100, 100);
      graphicsContext.setFill(binColor3);
      graphicsContext.fillRect(10, 140, 350, 50);
      
      pane.getChildren().add(canvas);                // Add canvas to pane 
      applicationStage.setTitle("Histogram viewer"); // Set window's title
      applicationStage.setScene(scene);              // Set window's scene
      applicationStage.show();                       // Display window
   }
   
   public static void main(String [] args) {
       launch(args); // Launch application
   }
}