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
