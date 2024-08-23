A primitive type always has a value, while non-primitive types can be null.
A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
原始类型总是有具体的值，不能是 null，并且总是以小写字母开头。
非原始类型可以是 null，表示不引用任何对象，总是以大写字母开头。

// 常见的原始类型：
类型	大小	默认值	描述
byte	1 字节	0	8 位有符号整数，范围 -128 到 127
short	2 字节	0	16 位有符号整数，范围 -32,768 到 32,767
int	4 字节	0	32 位有符号整数，范围 -2^31 到 2^31-1
long	8 字节	0L	64 位有符号整数，范围 -2^63 到 2^63-1
float	4 字节	0.0f	32 位单精度浮点数
double	8 字节	0.0d	64 位双精度浮点数
char	2 字节	'\u0000'	单个 16 位 Unicode 字符
boolean	1 位（JVM 实现依赖）	false	布尔值，true 或 false

// 常见的非原始类型：
字符串（String）：用于表示字符串序列。
数组（Array）：存储相同类型元素的集合。
类对象（Class）：Java 中的每个类本质上都是一个非原始类型。
接口（Interface）：非原始类型的一部分，表示接口类型。
枚举（Enum）：定义一组命名的常量，实际上是一个类。

// 原始类型与非原始类型的对比
特性	原始类型（Primitive Types）	非原始类型（Non-Primitive Types）
内存位置	栈内存	堆内存（引用在栈内存中）
存储内容	直接存储数据	存储对象的内存地址（引用）
默认值	有默认值（如 0，false）	默认值为 null
方法支持	无方法	可以调用类方法
大小	固定	不固定，取决于对象内容
速度	通常较快	可能较慢（涉及到对象的创建和销毁）

// java type casting:
Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double
eg:     
int myInt = 9;
double myDouble = myInt; // Automatic casting: int to double  

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte
eg:
double myDouble = 9.78d;
int myInt = (int) myDouble; // Manual casting: double to int

// string method : 
txt.length()
txt.toUpperCase()
txt.toLowerCase()
txt.indexOf()
eg:
String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate")); // Outputs 7

// math method 
Math.max(x,y)
Math.min(x,y)
Math.sqrt(64)  // return 8.0
Math.abs(-4.7)
Math.random()  // return a number between 0.0 and 1.0 
               // int randomNum = (int)(Math.random() * 101);  // 0 to 100

// use shorthand eles if 
int time = 20;
if (time < 18) {
  System.out.println("Good day");
} else {
  System.out.println("Good evening");
}

替换成

int time = 20;
String result = (time < 18) ? "Good day" : "Good evening.";
System.out.println(result);

// java forEach loop
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}

// javascript forEach loop
let cars = ["Volvo", "BMW", "Ford", "Mazda"];
for (let car of cars) {
  console.log(car);
}

// arrays:
// string array
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
// int array
int[] myNum = {10, 20, 30, 40};

// array method:
cars.length

// Multidimensional Arrays
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

// loop through multidimensional array:
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
for (int i = 0; i < myNumbers.length; ++i) {
  for (int j = 0; j < myNumbers[i].length; ++j) {
    System.out.println(myNumbers[i][j]);
  }
}

or 

int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
for (int[] row : myNumbers) {
  for (int i : row) {
    System.out.println(i);
  }
}

// method, namely function:
// create
public class Main {
  static void myMethod() {
    // code to be executed
    System.out.println("I just got executed!");
  }
}
方法必须在类中声明。
myMethod()是方法的名称
static表示该方法属于 Main 类，而不是 Main 类的对象。您将在本教程后面了解有关对象以及如何通过对象访问方法的更多信息。
void表示该方法没有返回值。
// call
在里面main，调用 myMethod()方法：

public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}



// 如何理解封装？
// 它指的是隐藏对象的内部状态和行为实现细节，仅通过对象提供的方法进行交互。在 Python 中，封装通常通过使用私有（private）前缀 _ 或 __ 来实现。
// class Computer:
//     def __init__(self):
//         self.__max_price = 900

//     def sell(self):
//         return f"Selling Price: {self.__max_price}"

//     def set_max_price(self, price):
//         if price > 800:
//             self.__max_price = price

// 创建 Computer 类的实例
c = Computer()
print(c.sell())  # 输出: Selling Price: 900

// # 尝试修改价格
c.__max_price = 1000
print(c.sell())  # 仍然输出: Selling Price: 900

// # 使用 setter 方法合法修改价格
c.set_max_price(1000)
print(c.sell())  # 输出: Selling Price: 1000

// 如何理解继承？
// 继承允许我们定义一个派生类（子类）继承另一个类（父类或基类）的字段和方法。子类可以重用父类的代码，这可以减少重复的代码，并且可以扩展父类的功能。
// # 父类
// class Animal:
//     def __init__(self, name):
//         self.name = name

//     def speak(self):
//         raise NotImplementedError("Subclasses must implement this method")

// # 子类
// class Dog(Animal):
//     def speak(self):
//         return f"{self.name} says Woof!"

// class Cat(Animal):
//     def speak(self):
//         return f"{self.name} says Meow!"

// # 创建子类的实例并调用方法
// dog = Dog("Buddy")
// cat = Cat("Whiskers")
// print(dog.speak())  # 输出: Buddy says Woof!
// print(cat.speak())  # 输出: Whiskers says Meow!

//如何理解多态？
// 多态是面向对象编程中的一个关键概念，它允许通过共同的接口来访问不同类的对象，并且每个类的对象能够提供自己独特的实现。这意味着同一个接口可以用于不同的数据类型，而具体使用哪种数据类型由运行时决定。

// 多态的优点
// 增加了程序的灵活性：通过使用多态，可以写出更通用的代码，这些代码可以与任何类的对象一起工作，只要这些类遵守相同的接口。
// 易于扩展：可以添加更多类型的对象，而不必修改依赖于多态的代码。
// Python 中的多态
// 在 Python 中，多态是隐式的，因为 Python 是一种动态类型语言。这意味着你不需要在代码中明确指定使用哪种类型。如果一个方法在父类中存在，那么即使子类使用不同的方式实现了该方法，父类的引用也可以调用到子类的方法。这是通过简单地调用相应对象上的方法来实现的，而不需要类型兼容性检查。

// 更详细的实例解析
// 假设我们有一个基类 Animal 和两个派生类 Dog 和 Cat。每个类都有一个 speak 方法，但实现方式不同。

// python
// 复制代码
// class Animal:
//     def speak(self):
//         raise NotImplementedError("Subclasses must implement this method")

// class Dog(Animal):
//     def speak(self):
//         return "Woof!"

// class Cat(Animal):
//     def speak(self):
//         return "Meow!"

// def animal_sound(animal):
//     print(animal.speak())

// # 创建 Dog 和 Cat 的实例
// dog = Dog()
// cat = Cat()

// # 调用 animal_sound，展示多态
// animal_sound(dog)  # 输出: Woof!
// animal_sound(cat)  # 输出: Meow!
// 解析
// Animal 类：定义了一个基本的方法 speak()，但实际上并没有实现（它抛出了一个异常）。这是多态的核心，它设定了一个接口规范。
// Dog 和 Cat 类：这两个类继承自 Animal 并分别实现了 speak() 方法。尽管每个类的 speak() 方法的行为不同，这正是多态性的体现。
// animal_sound 函数：这个函数接受任何 Animal 的实例作为参数，并调用其 speak() 方法。此函数不需要关心传递给它的对象具体是哪个类的实例，它只关心对象是否具有 speak() 方法。这允许函数在不知道对象详细信息的情况下操作对象，实现了代码的通用性和可扩展性。
// 这个例子展示了多态如何使我们能够编写更通用、灵活的代码。通过这种方式，可以在不改变现有函数的前提下引入新的 Animal 类型，只要它们实现了 speak() 方法。这对于构建大型、可扩展的软件系统尤其有用。


// method without return value example:
public class PracticeMethod {
  static void myMethod(String fname) {
    System.out.println(fname + " someone");
  }

  static void ageCheck(int age) {
    if (age >= 18) {
      System.out.println("Your age is " + age +", approved!");
    } else {
      System.out.println("Your age is " + age +", denied!");
    }
  }

  public static void main(String[] args) {
    myMethod("Jerry"); 
    myMethod("snowLee");
    ageCheck(10);
    ageCheck(19);
  }
}

// method with return value example:
public class PracticeMethodReturn {
  static int myMethod(int x) {
    return x + 5;
  }
  
  public static void main(String[] args) {
    System.out.println(myMethod(5));
    System.out.println(myMethod(8));
  }
}


// class, object, attribute, method:  
// class and object: 
eg:

public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj1 = new Main();  // Object 1
    Main myObj2 = new Main();  // Object 2
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}

// using multiple classes:
Main.java

public class Main {
  int x = 5;
}

Second.java

class Second {
  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}


// 如果你不想 attribute 被override, 那么可以加上关键字 final
public class Main {
  final int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}

// static method
// 非static 必须通过创建 object 来调用， static 可以直接调用。
// eg 1
public class Main {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // 非 static method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would compile an error

    Main myObj = new Main(); // Create an object of Main
    myObj.myPublicMethod(); // Call the method on the object
  }
} 
// eg 2
public class MyClass {
    static int count = 0;

    public static void incrementCount() {
        count++;
    }

    public static void displayCount() {
        System.out.println("Count: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.incrementCount();
        MyClass.incrementCount();
        MyClass.displayCount(); // 输出：Count: 2
    }
}

// eg 3
public class Main {
 
  // Create a fullThrottle() method
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  // Inside main, call the methods on the myCar object
  public static void main(String[] args) {
    Main myCar = new Main();   // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
  }
}


// printf 在多种编程语言中的用法：
主要格式说明符：

%d：输出整数。
%f：输出浮点数，默认保留6位小数。
%s：输出字符串。
%c：输出单个字符。
%x：输出整数的十六进制表示。
%p：输出指针的地址。
\n：表示换行符()

// Java:
System.out.printf("Number: %d", num);     // 输出整数
System.out.printf("Pi: %.2f", pi);        // 输出浮点数，保留两位小数
System.out.printf("Name: %s", name);      // 输出字符串

// python:
// Python：没有直接的 printf，但可以使用 % 操作符、format 方法或 f-string 来实现类似功能。Python 的格式化选项更灵活且现代化。
print("Number: %d" % num)          # 输出整数
print("Pi: %.2f" % pi)             # 输出浮点数，保留两位小数
print("Name: %s" % name)           # 输出字符串

print("Number: {}".format(num))     # 输出整数
print("Pi: {:.2f}".format(pi))      # 输出浮点数，保留两位小数
print("Name: {}".format(name))      # 输出字符串

// C:
printf("Hello, World!");  

// string的不可变性：（python 也是一样， 除了C， C++） 
在 Java 中，不可变性（immutability） 是指对象在创建后，其状态（即其字段或数据）不能被修改。
对于 String 类来说，这意味着一旦一个字符串对象被创建，它的内容就不能被更改。任何试图修改字符串内容的操作，实际上都会生成一个新的 String 对象，而不是修改原有的对象。
eg:
String str = "Hello";
str = "World";
在这个示例中，最初 str 被赋值为 "Hello"。由于 String 是不可变的，当你试图将 str 改为 "World" 时，Java 并不会修改 "Hello" 字符串，而是创建一个新的字符串 "World"，然后将 str 变量指向这个新的字符串对象。
原来的 "Hello" 字符串对象依然存在，但 str 不再引用它。由于 str 被重新指向了 "World"，如果没有其他变量引用 "Hello"，它将被垃圾回收机制回收

// 在 Java 中，数组（array）是可变的，这意味着一旦创建数组对象，你可以修改数组中的元素值。虽然数组的大小在创建时是固定的，不能改变，但其内容是可以改变的。
eg:
int[] numbers = {1, 2, 3, 4};
numbers[0] = 10;  // 将第一个元素修改为 10
for (int number : numbers) {
    System.out.println(number);
}

// 一些语言中的数组大小在创建时固定（如 C、C++、Java、C#），而其他语言（如 Python、JavaScript、Ruby、Swift）则支持动态数组，可以在运行时调整大小。


// java 访问修饰符
// public , protected, default, private
// public：方法可以被任何其他类访问。
// protected：方法可以被同一个包中的类或任何子类访问。
// 默认（包级访问）：没有访问修饰符时，方法只能被同一个包中的类访问。
// private：方法只能在同一个类中访问，其他类无法访问。
eg:
// 文件：MyClass.java
public class MyClass {
    // Public 方法
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Default (Package-private) 方法
    void defaultMethod() {
        System.out.println("This method has default (package) access.");
    }

    // Protected 方法
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    // Private 方法
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // 方法用于测试 privateMethod 的访问性
    public void accessPrivateMethod() {
        privateMethod(); // 内部调用 private 方法是允许的
    }
}

// 文件：AnotherClass.java
public class AnotherClass {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // 尝试调用各种方法
        obj.publicMethod(); // 可以调用，因为它是 public 的

        obj.defaultMethod(); // 可以调用，因 AnotherClass 和 MyClass 在同一个包中

        obj.protectedMethod(); // 可以调用，因 AnotherClass 和 MyClass 在同一个包中

        // obj.privateMethod(); // 编译错误！无法直接调用 private 方法

        obj.accessPrivateMethod(); // 可以调用，通过公共方法间接调用 private 方法
    }
}
