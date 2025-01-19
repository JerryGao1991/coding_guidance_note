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
txt.substring()
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

// 继承的关键概念在 Java 中的实现：
Java 也可以通过创建父类和子类来实现继承。子类可以重用父类的属性和方法，同时可以重写父类的方法来实现不同的行为。
1. extends 关键字：在 Java 中，子类通过 extends 关键字继承父类。比如 Dog extends Animal 表示 Dog 继承了 Animal。
2. super() 调用父类构造方法：子类的构造方法可以通过 super() 调用父类的构造方法。比如 super(name) 用来调用父类的构造函数，并初始化 name。
3. 方法重写（Override）：子类可以通过使用 @Override 注解来重写父类的方法，提供自己的实现。比如 Dog 和 Cat 分别重写了 speak() 方法。
4. protected 访问控制：在 Java 中，如果父类的属性是 protected，子类可以直接访问父类的属性。否则，子类必须通过 getter/setter 方法来访问父类的私有属性。

eg:
// 父类
public class Animal {
    protected String name; // 子类可以访问父类的protected属性

    // 构造方法
    public Animal(String name) {
        this.name = name;
    }

    // 抽象的行为方法
    public void speak() {
        System.out.println("This is an animal.");
    }
}
// 子类
public class Dog extends Animal {

    // 构造方法
    public Dog(String name) {
        super(name); // 调用父类构造方法
    }

    // 重写父类的 speak 方法
    @Override
    public void speak() {
        System.out.println(name + " says Woof!");
    }
}
public class Main {
    public static void main(String[] args) {
        // 创建 Dog 和 Cat 对象
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        // 调用 speak 方法
        dog.speak();  // 输出: Buddy says Woof!
        cat.speak();  // 输出: Whiskers says Meow!
    }
}

// 多态
多态是面向对象编程（OOP）中的一个核心概念，允许同一操作在不同对象上表现出不同的行为。多态有两种主要形式：
编译时多态（静态多态）：通过方法重载（Method Overloading）实现。
运行时多态（动态多态）：通过方法重写（Method Overriding）和父类引用指向子类对象来实现。
1. 编译时多态（静态多态） - 方法重载
编译时多态通过方法重载实现，也就是说，同一个类中可以有多个方法，它们具有相同的方法名，但参数的类型或数量不同。编译器会根据参数类型或数量来决定调用哪个方法。
eg:
public class OverloadExample {
    
    // 同名方法：参数不同
    public void print(int num) {
        System.out.println("Integer: " + num);
    }

    public void print(String str) {
        System.out.println("String: " + str);
    }

    public static void main(String[] args) {
        OverloadExample example = new OverloadExample();
        example.print(5);        // 输出: Integer: 5
        example.print("Hello");  // 输出: String: Hello
    }
}
// 在这个例子中，print() 方法被重载了。根据传入的参数类型，Java 会选择调用合适的 print() 方法。这就是编译时多态，因为在编译期间已经确定了调用哪个方法。
2. 运行时多态（动态多态） - 方法重写
运行时多态通过方法重写（Method Overriding）实现。父类的引用可以指向子类的对象，并根据实际的对象类型调用子类的方法。即使你通过父类引用调用方法，最终执行的是子类的重写方法。这就是运行时多态。
eg:
// 父类
class Animal {
    public void speak() {
        System.out.println("The animal makes a sound");
    }
}

// 子类 Dog
class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("The dog says: Woof!");
    }
}

// 子类 Cat
class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("The cat says: Meow!");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // 父类引用指向子类对象
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // 调用 speak 方法时会根据对象的实际类型来调用
        myDog.speak();  // 输出: The dog says: Woof!
        myCat.speak();  // 输出: The cat says: Meow!
    }
}



// 如何理解多态？
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

//     def animal_sound(animal):
//         print(animal.speak())

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

// Java JDK 结构:
JVM（Java Virtual Machine）位于最内层，它是负责执行 Java 字节码的虚拟机。
JRE（Java Runtime Environment）包含 JVM 以及运行 Java 程序所需的类库和资源。
JDK（Java Development Kit）是最外层的，它包含 JRE 以及用于开发 Java 应用程序的工具，如 Java 编译器（javac）、Java 调试器（jdb）、Java 文档生成器（javadoc）和 Java 打包工具（jar）等。

Java源码本质上是一个文本文件，我们需要先用javac把Hello.java编译成字节码文件Hello.class，然后，用java命令执行这个字节码文件：

┌──────────────────┐
│    Hello.java    │◀── source code
└──────────────────┘
          │ compile
          ▼
┌──────────────────┐
│   Hello.class    │◀── byte code
└──────────────────┘
          │ execute
          ▼
┌──────────────────┐
│    Run on JVM    │
└──────────────────┘

// 为什么需要构造函数？
1. 如果不定义构造函数，Java 会提供一个默认的无参构造函数，用于初始化对象的实例变量为默认值。（数字类型默认为 0，引用类型默认为 null，布尔类型默认为 false）
public class Car {
    String make;  // 实例变量默认是 null
    String model; // 实例变量默认是 null
}

public class Main {
    public static void main(String[] args) {
        // 使用 new 关键字创建对象
        Car myCar = new Car();

        // 打印默认值
        System.out.println("Make: " + myCar.make);   // 输出: null
        System.out.println("Model: " + myCar.model); // 输出: null
    }
}

2. 构造函数的作用是初始化对象，为实例变量赋值，并确保对象在创建时处于有效状态。
自定义构造函数的优势在于简化初始化过程，并确保对象在创建时已经拥有正确的状态。
没有构造函数时，虽然可以使用 new 来创建对象，但对象的属性将需要手动赋值，可能导致代码冗长和初始化错误。
虽然 Java 提供了一个默认的无参构造函数，但如果你不定义自己的构造函数，你就无法在对象创建时给实例变量赋值或执行初始化操作。也就是说，所有属性都会是默认值，你需要通过其他方法手动赋值。
public class Car {
    String make;
    String model;
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();

        // 手动赋值
        myCar.make = "Toyota";
        myCar.model = "Corolla";

        System.out.println("Make: " + myCar.make);   // 输出: Toyota
        System.out.println("Model: " + myCar.model); // 输出: Corolla
    }
}
3. 构造函数允许你在创建对象时直接赋值和初始化，这比手动赋值更简洁、高效，并确保对象在创建时处于有效状态。
public class Car {
    String make;
    String model;

    // 自定义构造函数
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
}

public class Main {
    public static void main(String[] args) {
        // 通过构造函数直接赋值并创建对象
        Car myCar = new Car("Toyota", "Corolla");

        System.out.println("Make: " + myCar.make);   // 输出: Toyota
        System.out.println("Model: " + myCar.model); // 输出: Corolla
    }
}
4. 如果你定义了一个有参数的构造函数，Java 就不会再提供默认的无参构造函数。如果你还需要无参构造函数，你必须显式定义一个。
public class Car {
    String make;
    String model;

    // 无参构造函数
    public Car() {}

    // 有参构造函数
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
}

// 实例变量与类变量
| **对比项**         | **实例变量（Instance Variable）**                    | **类变量（Class Variable / Static Variable）**          |
|--------------------|----------------------------------------------------|---------------------------------------------------------|
| **定义**           | 属于每个对象的变量。                                | 属于类的变量，所有对象共享。                              |
| **声明**           | 在类中声明，不使用 `static` 关键字。                    | 在类中声明，使用 `static` 关键字。                         |
| **存储位置**       | 每个对象有自己独立的实例变量，存储在堆内存中。               | 类变量存储在内存的静态区，所有对象共享。                      |
| **内存分配**       | 每创建一个对象就分配一次内存。                            | 类加载时分配一次内存，所有对象共享同一个变量。                  |
| **生命周期**       | 对象创建时开始，销毁时结束。                             | 类加载时开始，程序结束时销毁。                               |
| **访问方式**       | 必须通过对象来访问。                                    | 可以通过类名直接访问，也可以通过对象访问。                      |
| **是否独立**       | 每个对象有自己独立的实例变量，互不影响。                      | 所有对象共享类变量，任何对象的修改会影响所有对象。                 |
| **示例**           | `car1.make` 与 `car2.make` 是不同的实例变量。            | `Car.carCount` 是类变量，所有对象共享。                       |

public class Car {
    // 实例变量
    String make;
    String model;

    // 类变量
    static int carCount;

    // 构造函数
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        carCount++;  // 每次创建一个新对象，类变量 carCount 加 1
    }

    // 实例方法
    public void displayInfo() {
        System.out.println("Make: " + make + ", Model: " + model);
    }

    // 静态方法
    public static void displayCarCount() {
        System.out.println("Total Cars: " + carCount);
    }
}

public class Main {
    public static void main(String[] args) {
        // 创建两个对象
        Car car1 = new Car("Toyota", "Corolla");
        Car car2 = new Car("Honda", "Civic");

        // 调用实例方法
        car1.displayInfo();
        car2.displayInfo();

        // 调用类方法，输出静态变量 carCount 的值
        Car.displayCarCount();  // 输出: Total Cars: 2
    }
}


// Character.getNumericValue(char ch) 和  Integer.parseInt(String str)
如果你需要将 单个字符（如 '3'）转换为数字值，使用 Character.getNumericValue()。
如果你需要将 完整的数字字符串（如 "1234"）转换为整数，使用 Integer.parseInt()。
只能对表示数字的字符串进行解析。如果字符串包含非数字字符，它会抛出 NumberFormatException 异常。
支持更广泛的字符集，不仅限于阿拉伯数字，还包括罗马数字、Unicode 字符等。
Character.getNumericValue('A') 返回 10（十六进制值）。


// StringBuilder 替换字符串拼接
StringBuilder binaryStr = new StringBuilder();
binaryStr.append(intList[i]);



// 哈希表 Hashmap 常用操作

| 操作               | 方法                           | 说明                                   | 示例代码                                   |
|--------------------|--------------------------------|----------------------------------------|--------------------------------------------|
| **创建哈希表**      | `new HashMap<>()`              | 创建一个空的哈希表                      | `HashMap<String, Integer> map = new HashMap<>();` |
| **添加键值对**      | `put(key, value)`              | 向哈希表中添加键值对                    | `map.put("apple", 5);`                     |
| **获取值**          | `get(key)`                     | 根据键获取对应的值                      | `map.get("apple");`                        |
| **检查键是否存在**  | `containsKey(key)`             | 检查哈希表中是否包含指定的键            | `map.containsKey("apple");`               |
| **检查值是否存在**  | `containsValue(value)`         | 检查哈希表中是否包含指定的值            | `map.containsValue(5);`                   |
| **删除键值对**      | `remove(key)`                  | 删除指定键的键值对                      | `map.remove("apple");`                    |
| **获取所有的键**    | `keySet()`                     | 获取哈希表中所有的键，返回一个 `Set`    | `map.keySet();`                            |
| **获取所有的值**    | `values()`                     | 获取哈希表中所有的值，返回一个 `Collection` | `map.values();`                            |
| **获取所有键值对**  | `entrySet()`                   | 获取哈希表中所有的键值对，返回一个 `Set<Map.Entry>` | `map.entrySet();`                          |
| **获取大小**        | `size()`                      | 返回哈希表中键值对的数量                | `map.size();`                              |
| **清空哈希表**      | `clear()`                      | 删除哈希表中的所有键值对                | `map.clear();`                             |
| **替换值**          | `replace(key, value)`          | 替换指定键的值                          | `map.replace("apple", 10);`                |
| **获取指定键的值**  | `getOrDefault(key, defaultValue)` | 获取指定键的值，如果键不存在，返回默认值 | `map.getOrDefault("banana", 0);`          |
| **遍历键值对**      | `forEach((key, value) -> {...})` | 使用 Lambda 表达式遍历哈希表            | `map.forEach((key, value) -> System.out.println(key + ": " + value));` |
| **合并键值对**      | `merge(key, value, remappingFunction)` | 合并键值对，如果键已存在，使用合并函数更新值 | `map.merge("apple", 2, (oldValue, newValue) -> oldValue + newValue);` |



// 有关方法 中 数组引用方法前后的变化 ， 引用拷贝
public class Main {
    
    // 这个方法试图修改传入的数组引用
    public static void modifyArray(int[] arr) {
        // 创建一个新的数组并给 arr 赋值，实际上这里修改的是 arr 的副本
        arr = new int[10];  // 这不会影响调用者传入的 arr
        arr[0] = 100;  // 只会修改方法内部 arr 的内容
    }

    public static void main(String[] args) {
        int[] myArray = new int[5];  // 创建一个大小为 5 的数组
        myArray[0] = 1;  // 初始化数组
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;

        System.out.println("Before modifyArray:");
        System.out.println("myArray[0]: " + myArray[0]);  // 输出 1

        // 调用 modifyArray 方法，传递 myArray
        modifyArray(myArray);

        System.out.println("After modifyArray:");
        System.out.println("myArray[0]: " + myArray[0]);  // 仍然是 1
    }
}
// 代码解析：
1. 初始化数组：在 main 方法中，我们创建了一个包含 5 个元素的数组 myArray，并初始化了其中的值。
2. 传递数组：我们将 myArray 传递给 modifyArray 方法。此时，方法接收到的 arr 变量只是 myArray 引用的一个副本。
3. 方法内部的操作：在 modifyArray 方法中，arr 被重新赋值为一个新的数组 new int[10]，这个新数组的大小为 10。然后，我们在 arr 数组的第一个位置设置了值 100。
4. 结果：但是，方法中的 arr 是 myArray 引用的副本，修改它并不会改变 main 方法中的 myArray 引用。所以，在 main 方法中，myArray[0] 仍然是原来的值 1。
// 总结：
Java 方法中传递数组时，传递的是数组引用的副本。
如果在方法内部修改这个副本（比如让它指向一个新的数组），只会改变方法内部的引用，原始数组的引用不受影响。
要修改原数组的内容，你需要操作数组中的元素，而不是改变数组引用本身。


public class Main {
    
    // 这个方法修改数组中的元素
    public static void modifyArrayContent(int[] arr) {
        // 修改数组中的元素
        arr[0] = 100;  // 修改数组第一个元素的值
        arr[1] = 200;  // 修改数组第二个元素的值
    }

    public static void main(String[] args) {
        int[] myArray = new int[5];  // 创建一个大小为 5 的数组
        myArray[0] = 1;  // 初始化数组
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;

        System.out.println("Before modifyArrayContent:");
        System.out.println("myArray[0]: " + myArray[0]);  // 输出 1
        System.out.println("myArray[1]: " + myArray[1]);  // 输出 2

        // 调用 modifyArrayContent 方法，传递 myArray
        modifyArrayContent(myArray);

        System.out.println("After modifyArrayContent:");
        System.out.println("myArray[0]: " + myArray[0]);  // 输出 100
        System.out.println("myArray[1]: " + myArray[1]);  // 输出 200
    }
}

// 代码解析：
1. 初始化数组：我们在 main 方法中创建了一个包含 5 个元素的数组 myArray，并初始化了数组的内容。
2. 传递数组引用：我们将 myArray 数组传递给 modifyArrayContent 方法，传递的是数组引用的副本。
3. 修改数组内容：在 modifyArrayContent 方法中，我们直接修改了数组的内容。例如，修改了 arr[0] 和 arr[1] 的值为 100 和 200。
4. 结果：由于传递的是数组的引用副本（引用仍指向同一数组），因此在方法内部对数组元素的修改会影响到外部数组的内容。

// 总结：
当你传递一个数组到方法时，方法内部可以修改数组的内容（即数组元素的值），这些修改会直接影响到外部的数组，因为数组是引用类型。
但是如果你在方法内部改变数组引用（让它指向一个新的数组），则不会影响原数组。



// 为什么 String 是引用类型，但不具有普通引用类型的特性？
不可变性：String 对象的内容一旦创建，就不能改变。这就避免了对 String 对象的修改可能带来的副作用，确保了它的安全性和一致性。
字符串常量池（String Pool）：Java 使用字符串常量池来优化内存管理。当多个 String 对象拥有相同的值时，JVM 会使它们共享同一个内存位置，从而节省内存。
String s1 = "Hello";
String s2 = "Hello";  // s2 会指向和 s1 相同的内存位置

System.out.println(s1 == s2);  // 输出 true，表示它们指向同一个对象

// 关键！！！由于不可变性，即使多个引用指向同一个 String 对象，对其中一个引用的修改不会影响其他引用。



// HashMap
是 Java 中的一个基于哈希表的数据结构，用于存储键值对。它的核心原理是 通过哈希函数将键映射到数组中的一个位置（桶），从而实现快速的查找和存储。
// 工作原理: 
// 1. 计算哈希值：
HashMap 使用键的 hashCode() 方法生成一个整数（哈希值）。
// ps: 默认的 hashCode() 方法通常基于对象的内存地址生成哈希值。
//     许多类都重写了 hashCode()，使其根据类的字段内容生成更有意义的哈希值。
//     字符串的 hashCode()：字符值的加权和.  eg: hashCode("abc") = ('a' * 31^2) + ('b' * 31^1) + ('c' * 31^0)
//     整数的 hashCode()： 对于 Integer，哈希值就是它的值本身：Integer x = 42;
//                                                       System.out.println(x.hashCode()); // 输出：42
然后，通过 hash值 % 数组长度 计算该键在数组中的位置（即桶索引）。
String key = "apple";
int hashCode = key.hashCode(); // 生成哈希值
int bucketIndex = hashCode % buckets.length; // 计算桶索引
// 2. 处理哈希冲突：
不同的键可能映射到相同的桶索引，这被称为 哈希冲突。
HashMap 使用链地址法来解决冲突：将冲突的键值对存储在链表中（Java 8 之后，当链表过长时会转换为红黑树）。
// 3. 插入数据：
根据桶索引找到对应的位置。如果没有冲突，直接插入；如果冲突了，将新的键值对添加到链表或树中。
// 4. 查找过程
计算哈希值和桶索引：与存储类似，使用键的 hashCode() 计算桶索引。
定位到具体元素：
如果桶中有链表，遍历链表找到匹配的键。
如果是红黑树，则按照树的查找规则定位键值对。

// HashMap 的优化措施
// 1. 压缩哈希值：
HashMap 对原始的哈希值进行了优化，通过 hash = key.hashCode() ^ (key.hashCode() >>> 16) 混合高低位，以减少冲突。
// 2. 动态扩容：
当装载因子（Load Factor）超过设定值（默认 0.75）时，HashMap 会自动扩容（将数组大小翻倍）。
扩容时需要重新计算每个键的哈希值并重新分配位置，称为 rehashing。
// 3. 链表转红黑树：
当链表的长度超过 8 且数组大小超过 64 时，链表会转为红黑树，以提高查找效率。

// 常用操作
添加：put                                   map.put("apple", 10);
获取：get                                   map.get("apple");
删除：remove                                map.remove("apple");
大小 size                                   map.size();
清空 clear                                  map.clear();
判断为空 isEmpty                             map.isEmpty();
遍历：keySet、values、entrySet
遍历示例:                                    for (Map.Entry<String, Integer> entry : map.entrySet()) {
                                               System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
                                            } 
判断：containsKey、containsValue             map.containsKey("apple"); 

// 注意点！！！ HashMap 的 key 和 value类型必须是对象类型，不能是原始数据类型， 例如 long 就要变成 Long， int 就要变成 Integer