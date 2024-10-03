import java.util.Scanner;
javac -Xlint yourfile.java             # 启用所有警告
javac -Xlint:none yourfile.java        # 禁用所有警告

// 1. 输入/输出设备 (I/O devices)：
定义：允许用户与计算机进行交互的设备，如键盘、鼠标、触摸屏、显示器等。
特点：这些设备通常被称为外设，包括输入设备（键盘、鼠标、麦克风等）和输出设备（显示器、打印机、扬声器等）。
// 2. 存储设备 (Storage)：
硬盘 (Disk)：用于存储文件和数据，属于非易失性存储，即关机后数据仍然存在。
闪存 (Flash storage)：通过电子隧道技术存储数据，不依赖磁性介质。
特点：存储设备的容量大、价格较低，但访问速度比内存慢。
// 3. 内存 (Memory)：
RAM (随机存取存储器)：临时存储数据，速度快但易失性，即断电后数据丢失。
特点：比硬盘存储快得多，用于存储正在执行的程序和数据。常见容量以 MB、GB、TB 为单位。
// 4. 处理器 (Processor/CPU)：
定义：负责执行计算机的指令，运行程序并控制计算机的操作。
特点：CPU 执行指令时依赖内存和缓存（处理器中的小块快速内存）。CPU 运行操作系统 (OS)，通过 OS 控制其他程序和外设。
// 5. 时钟 (Clock)：
定义：控制处理器的指令执行速度，以每秒的时钟频率表示，如 MHz 或 GHz。
特点：时钟频率越高，处理器执行指令的速度越快。例如，1 GHz 表示每秒执行 10 亿个时钟周期。
// 6. 多任务处理 (Multitasking)：
定义：操作系统可以通过快速切换在多个程序之间执行任务，使得多个程序看似同时运行。
// 记忆点：
I/O 设备：输入和输出设备被称为外设。
存储：硬盘和闪存是非易失性存储，RAM 是易失性存储。
内存：RAM 的速度快，但价格较高，断电数据丢失。
处理器：CPU 是运行程序的核心，配有缓存来加速数据访问。
时钟频率：CPU 的运行速度由时钟频率决定，单位是 MHz 或 GHz。
多任务：操作系统通过快速切换实现多程序的并行运行。


// 1. 存储层次结构：
计算机有不同层次的存储系统，包括：
磁盘（Disk）：存储大量数据，容量大但访问速度慢。
内存（Memory/RAM）：存储当前正在运行的程序和数据，比磁盘快很多，但容量较小，且是易失性的（断电后数据丢失）。
缓存（Cache）：处理器内的高速存储，存储最频繁使用的数据或指令，容量非常小但速度非常快。
// 2. 程序加载和执行的过程：
第1步：程序从磁盘加载到内存
用户运行ProgA。磁盘旋转，磁头读取 ProgA，并将其加载到内存。
操作系统运行ProgB，磁盘再次旋转，读取 ProgB，并将其加载到内存。
第2步：内存与缓存的交互
当处理器开始执行ProgA的指令时，它首先会从内存读取指令和数据。
为了提高速度，处理器会将最常用的数据或指令存储在缓存中，以便后续的访问不需要再从较慢的内存读取。
缓存的访问速度比内存更快，可以在1个时钟周期内完成，而内存访问可能需要几个时钟周期。
第3步：程序调度与内存管理
当操作系统让ProgA再次运行时，ProgA 仍然在内存中，无需再从磁盘加载，可以直接从内存运行。
如果 ProgA 的某些指令或数据已经在缓存中，处理器将直接从缓存读取，进一步加速程序执行。
// 3. 缓存的作用
缓存（Cache）位于处理器内部，是容量最小但最快的存储。
缓存主要存储最常使用的数据和指令。当处理器需要频繁访问某些数据时，它会优先在缓存中查找，以减少访问内存的次数，提升执行效率。
缓存有不同层次（L1、L2、L3 缓存），每一层次的缓存速度和容量不同，L1 缓存最快但最小，L3 缓存较慢但容量较大。
// 4. 各存储层次的特点和访问速度
磁盘（Disk）：容量大，访问最慢，通常需要几百个时钟周期。
内存（RAM）：容量适中，访问速度比磁盘快，通常需要几十个时钟周期。
缓存（Cache）：容量小，但访问速度极快，可以在1到几个时钟周期内完成访问。
处理器寄存器：处理器内部的最快存储，用于存储立即需要的值，几乎不需要时钟周期。
// 5. 程序运行过程中的优化（磁盘-内存-缓存）
磁盘读取：程序首次运行时从磁盘读取数据到内存。
内存访问：当程序已经加载到内存中，处理器从内存中读取数据和指令。
缓存加速：为了加快速度，处理器会将经常使用的数据和指令存入缓存，以减少对内存的访问。
// 6. 总结和记忆点
存储层次结构：计算机从磁盘、内存到缓存和寄存器，访问速度逐渐提升，但容量逐渐减小。
缓存的重要性：缓存位于处理器中，用于存储最频繁访问的数据，减少访问内存的次数，加快程序执行。
程序运行优化：
第一次运行时，程序从磁盘加载到内存。
处理器会将常用指令和数据缓存到缓存中，以加快后续访问。
如果缓存中有需要的数据，处理器直接从缓存中读取，减少对内存和磁盘的依赖。
通过缓存的加入，程序执行的效率显著提高，尤其是处理重复任务时，缓存避免了频繁访问较慢的内存和磁盘。

变量标识符identifier:
1. be a sequence of letters (a-z, A-Z), underscore (_), dollar signs ($), and digits (0-9)
2. start with a letter, underscore, or dollar sign
best practice:
Camel case: Lower camel case abuts multiple words, capitalizing each word except the first, as in numApples or peopleOnBus.
Underscore separated: Words are lowercase and separated by an underscore, as in num_apples or people_on_bus.

| 编程语言       | 整除符号           | 取余符号    | 示例（整除）      | 示例（取余）      |
|----------------|--------------------|-------------|------------------|------------------|
| **Python**     | `//`                | `%`         | `7 // 2` → `3`   | `7 % 2` → `1`    |
| **Java**       | `/` (整数除法)      | `%`         | `7 / 2` → `3`    | `7 % 2` → `1`    |
| **C/C++**      | `/` (整数除法)      | `%`         | `7 / 2` → `3`    | `7 % 2` → `1`    |
| **JavaScript** | `/` (整数除法需转换)| `%`         | `Math.floor(7/2)` → `3` | `7 % 2` → `1` |
| **Ruby**       | `/` (整数除法)      | `%`         | `7 / 2` → `3`    | `7 % 2` → `1`    |
| **Go**         | `/` (整数除法)      | `%`         | `7 / 2` → `3`    | `7 % 2` → `1`    |
| **PHP**        | `/` (整数除法)      | `%`         | `7 / 2` → `3`    | `7 % 2` → `1`    |
| **Swift**      | `/` (整数除法)      | `%`         | `7 / 2` → `3`    | `7 % 2` → `1`    |
| **Kotlin**     | `/` (整数除法)      | `%`         | `7 / 2` → `3`    | `7 % 2` → `1`    |
| **Rust**       | `/` (整数除法)      | `%`         | `7 / 2` → `3`    | `7 % 2` → `1`    |

//操作符周围需要加空格(将减号用作负数的情况除外)
eg:
xCoord = -yCoord

// 整数除法 和 浮点数除法
1. 当两个操作数都是整数类型（int, long 等）时，Java 会执行整数除法。
int a = 7;
int b = 2;
int result = a / b;  // 结果是 3

2. 当操作数中至少有一个是浮点数类型（float, double），Java 会执行浮点数除法。
double a = 7.0;
int b = 2;
double result = a / b;  // 结果是 3.5

3. 可以通过类型转换将整数转换为浮点数来执行浮点除法。
int a = 7;
int b = 2;
double result = (double) a / b;  // 结果是 3.5


// 许多程序员建议不要使用浮点数（float 或 double）来表示金钱，特别是在涉及金额的计算时。
// 原因:
1. 浮点数使用二进制表示，而不是十进制。这意味着某些十进制的小数在转换为浮点数时无法精确表示，这可能导致舍入误差。
2. 浮点数是为科学计算和表示非常大的或非常小的数设计的，但它们不适合表示像金钱这样精确可数的项目。
double value = 14.53;
System.out.println(value);  // 输出可能是 14.529999999999998 
                            // 当你使用浮点数来处理金钱计算时，舍入误差会逐渐累积。例如，如果你不断对金钱进行加减运算，小的舍入误差可能在经过多次运算后变得显著。

double value1 = 0.1;
double value2 = 0.2;
System.out.println(value1 + value2);  // 输出 0.30000000000000004

// 解决方法:
1. 使用整数表示：用最小单位来表示金钱。
int totalCents = 1453;  // 代表 14.53 美元
2. 使用 BigDecimal 类型：在 Java 中，BigDecimal 是一个用于高精度数值运算的类，专门设计用于像货币这样的场景。BigDecimal 可以避免浮点数的精度问题，能够精确表示小数并进行四舍五入、加减乘除等操作。
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal price = new BigDecimal("14.53");
        BigDecimal quantity = new BigDecimal("3");
        BigDecimal total = price.multiply(quantity);

        System.out.println("Total: " + total);  // 输出 Total: 43.59
    }
}

// java，浮点数除以 0 和 0除以0， 都不会报错
1. 非零浮点数除以 0： 返回 Infinity 或者 -Infinity
2. (零浮点数)0/0 : 返回 NaN
3. 整数除以 0: 报错，返回Error 

// System.out.printf
System.out.printf("%.3f", 9.1357);
System.out.printf("p = %.4f when w = %.2f\n", p, w);

// scientific notation 
6.02e23 = 6.02 * 10^23
1.0e-3  = 1 * 10^-3

// constant variable 常量变量
使用 final：用 final 关键字定义常量变量，防止它的值被修改。
命名惯例：常量变量通常用大写字母和下划线命名，便于在代码中识别。
final double SPEED_OF_SOUND   = 761.207; // Miles/hour (sea level)
final double SECONDS_PER_HOUR = 3600.0;  // Secs/hour

// math method:
// Java：使用 Math 类中的静态方法，如 Math.sqrt()、Math.pow() 等。
// Python：一些数学函数（如 sqrt, ceil, floor）来自 math 模块，其他为内置函数。
// C：使用相关的头文件（如 math.h 和 stdlib.h），有些需要宏定义（如 max 和 min）。
// JavaScript：大部分数学函数来自全局对象 Math。
| 功能             | **Java**                       | **Python**                          | **C**                                      | **JavaScript**               |
|------------------|--------------------------------|-------------------------------------|-------------------------------------------|------------------------------|
| **计算平方根**    | `Math.sqrt(x)`                 | `import math` <br> `math.sqrt(x)`   | `#include <math.h>` <br> `sqrt(x);`       | `Math.sqrt(x)`               |
| **计算次方**      | `Math.pow(x, y)`               | `pow(x, y)`                         | `#include <math.h>` <br> `pow(x, y);`     | `Math.pow(x, y)`             |
| **计算绝对值**    | `Math.abs(x)`                  | `abs(x)`                            | `#include <stdlib.h>` <br> `abs(x);` (整数) <br> `fabs(x);` (浮点数) | `Math.abs(x)`               |
| **取最大值**      | `Math.max(x, y)`               | `max(x, y)`                         | `#define max(a, b) ((a > b) ? a : b)`     | `Math.max(x, y)`             |
| **取最小值**      | `Math.min(x, y)`               | `min(x, y)`                         | `#define min(a, b) ((a < b) ? a : b)`     | `Math.min(x, y)`             |
| **四舍五入**      | `Math.round(x)`                | `round(x)`                          | `#include <math.h>` <br> `round(x);`      | `Math.round(x)`              |
| **向上取整**      | `Math.ceil(x)`                 | `import math` <br> `math.ceil(x)`   | `#include <math.h>` <br> `ceil(x);`       | `Math.ceil(x)`               |
| **向下取整**      | `Math.floor(x)`                | `import math` <br> `math.floor(x)`  | `#include <math.h>` <br> `floor(x);`      | `Math.floor(x)`              |
| **生成随机数**    | `Math.random()`                | `import random` <br> `random.random()` | `#include <stdlib.h>` <br> `rand();` <br> (`srand()` 设置种子) | `Math.random()`             |

// implicit conversion 隐式转换 (自动的)
1. 对于 + 或 * 之类的算术运算符，如果其中一个操作数是双精度型，则另一个操作数会自动转换为双精度型，然后执行浮点运算。
2. 对于赋值，如果转换可以且不损失精度，则将右侧类型转换为左侧类型。
int 到 double 的转换很简单：25 变成 25.0。
double 到 int 的转换可能会失去精度，因此不是自动的。


// 十进制 二进制 decimal number binary number
| 特性              | 十进制（Decimal）              | 二进制（Binary）                   |
|-------------------|-------------------------------|------------------------------------|
| **基数**          | 10                            | 2                                 |
| **使用的数字**    | 0-9                            | 0, 1                              |
| **位置权重**      | 每位的权重是 10 的幂次         | 每位的权重是 2 的幂次              |
| **计算机中的使用**| 人类常用的计数系统             | 计算机硬件中的基础数值系统         |
| **转换方法**      | 十进制除以 2，记录余数, 直到商为 0，最后将余数逆序排列得到二进制数         | 每位按 2 的幂次相加                |

// char 
char 类型用于存储单个字符，字符必须用单引号括起来。
占用 2 字节（16 位），因为 Java 使用 UTF-16 来表示字符。

// scnr.next().charAt(0);   // 可以这样读取char 类型

// scanner 的 next 相关方法
| 方法           | 返回类型   | 功能描述                                             | 示例代码                                         |
|----------------|------------|------------------------------------------------------|--------------------------------------------------|
| `next()`       | `String`   | 读取下一个单词，忽略空白符(空格、换行等），空白符后面的内容会保留在输入流中，等待下一次读取。                         | `String word = scnr.next();`                     |
| `nextLine()`   | `String`   | 读取整行输入，包括空白符和换行符。                   | `String line = scnr.nextLine();`                 |
| `nextInt()`    | `int`      | 读取下一个整数值。                                   | `int num = scnr.nextInt();`                      |
| `nextDouble()` | `double`   | 读取下一个双精度浮点数。                             | `double value = scnr.nextDouble();`              |
| `nextBoolean()`| `boolean`  | 读取布尔值，返回 `true` 或 `false`。                 | `boolean flag = scnr.nextBoolean();`             |
| `nextByte()`   | `byte`     | 读取下一个字节型整数。                               | `byte b = scnr.nextByte();`                      |
| `nextFloat()`  | `float`    | 读取下一个单精度浮点数。                             | `float f = scnr.nextFloat();`                    |
| `nextLong()`   | `long`     | 读取下一个长整数值。                                 | `long l = scnr.nextLong();`                      |
| `nextShort()`  | `short`    | 读取下一个短整数值。                                 | `short s = scnr.nextShort();`                    |


// Under the hood, a char variable stores a number.

// # Unicode、UTF-8、UTF-16 和 ASCII 的关系
// ASCII (American Standard Code for Information Interchange)


| 名称         | 类型       | 字节长度                | 编码范围                           | 特点                               |
|--------------|------------|-------------------------|------------------------------------|------------------------------------|
| **Unicode**  | 字符集     | 不定（编码格式定义）      | 包含全球所有字符，范围为 `0` 到 `10FFFF` | 定义字符的唯一码点，不规定如何存储   |
| **UTF-8**    | 编码格式   | 1-4 字节                 | 兼容 ASCII（前 128 个字符），其余字符使用多字节编码 | 可变长编码，兼容 ASCII，常用于互联网 |
| **UTF-16**   | 编码格式   | 2 或 4 字节              | 2 字节表示基本字符，4 字节表示扩展字符 | 对亚洲字符更高效，适用于需要多语言支持的应用, 不兼容ASCII |
| **ASCII**    | 编码标准   | 1 字节                   | 仅支持 128 个字符（英文字母和符号） | 仅支持基本英文字母和符号，作为 UTF-8 的子集 |

// ## 关系与区别
- **Unicode** 是全球字符的集合，定义了字符的唯一码点。
- **UTF-8** 和 **UTF-16** 是 Unicode 的具体编码实现，用于将字符码点转为二进制数据。
- **ASCII** 是较早的字符编码标准，仅支持 128 个字符，UTF-8 兼容 ASCII。

// 补充要点(有助于理解)
UTF-8 的设计使它能够与 ASCII 兼容，ASCII 字符只需 1 字节表示，并且其编码与 ASCII 完全一致。
UTF-16 的设计则是为了提供更广泛的字符支持，因此它即使表示 ASCII 字符也会使用 2 字节，这导致 UTF-16 不与 ASCII 兼容。

ASCII 字符使用 1 个字节，其他字符使用 2、3 或 4 个字节。这种设计使得 UTF-8 在表示常见字符时更加节省空间。2-4 个字节用于表示其他 Unicode 字符。
eg:
字符 'A' 在 UTF-8 中表示为 0x41（1 字节）。
字符 'A' 在 UTF-16 中表示为 0x0041（2 字节）。

在处理亚洲语言（如汉字、韩文）时，UTF-16 通常比 UTF-8 更高效，因为这些字符常常使用 2 字节表示，而 UTF-8 需要 3 个字节。
eg:
中文字符 '你' 在 UTF-16 中表示为 0x4F60（2 字节）。
中文字符 '你' 在 UTF-8 中表示为 0xE4 0xBD 0xA0（3 字节）。

ASCII 使用7 位二进制数来表示 128 个字符。
ASCII 仅能表示英文字母、数字、标点符号和一些控制字符（如换行、制表符等），范围是 0 到 127。
eg:
字符 'A' 的 ASCII 码是 65（0x41）。
字符 'a' 的 ASCII 码是 97（0x61）。

//字符 J 的 ASCII 码是 74。
//详细说明：
J 的 ASCII 码是 十进制 74。
在 十六进制表示中，J 的 ASCII 码是 0x4A。 
在 二进制表示中，J 的 ASCII 码是 01001010。

//十六进制与二进制的关系
// 0x 代表16进制
每个十六进制位对应 4 个二进制位（bit），因此2 位十六进制数可以表示 8 位二进制数，即 1 个字节。
例如：
十六进制 0x41 转换为二进制是 0100 0001，对应 8-bit 二进制数。
十六进制 0x0041 转换为二进制是 0000 0000 0100 0001，对应 16-bit 二进制数。

// 空字符的使用， 在输出文本上，至关重要！！
// Indicate the output. char let1 = 'a', and char let2 = 'b'.      
System.out.print(let1);                // a
System.out.print(let1 + let2);         // 195          注意！！！
System.out.print("" + let1 + let2);    // ab           注意！！！

// String 是引用类型：存储的是对 String 对象的引用，而不是直接存储字符串的值。
字符串赋值会创建新的对象：当你赋值一个字符串文字时，实际上是在创建一个新的 String 对象。
引用赋值不会创建新对象：如果将一个 String 变量赋值给另一个 String 变量，它们会指向同一个对象，而不会创建新的对象。
eg: 
Q: Suppose string str1 is initially "Hello" and str2 is "Hi".
After str1 = str2; and then str2 = "Bye";, what is str1?
Omit the quotes.
A: Hi
str2 赋值创建了一个新的对象而已

// combine next() 和 nextLine() 的时候要格外注意:
When following next() with nextLine(), an extra nextLine() is needed to get past the newline left in the input by next(). 

// 整数溢出 integer overflow
int 最多存储 32位 二进制数。
当赋给整数变量的值超过该类型能表示的最大值时，就会发生溢出(overflow),
溢出时，超出位数的高位被丢弃，只保留能够存储的低位。
eg:
数值 4,294,967,297 需要 33 位来表示，而 int 类型只能存储 32 位。
超出的第 33 位会被丢弃，剩下的 32 位是 00000000000000000000000000000001，这相当于十进制的 1。
int 类型通常是 32 位，最大可以存储约 21 亿的数值。
long 最多储存 64 位

// bit 和 byte 的关系
Bit 是 "binary digit" 的缩写，表示二进制位，是计算机中最小的数据存储单位。一个 bit 只能有两个可能的值：0 或 1。
8 bits 组合可以表示 256 种状态（2^8 = 256），即 1 字节（byte）。

//# Java 基本数据类型及其范围
| Declaration    | Size    | Supported Number Range                              |
|----------------|---------|-----------------------------------------------------|
| `byte myVar;`  | 8 bits  | -128 to 127                                         |
| `short myVar;` | 16 bits | -32,768 to 32,767                                   |
| `int myVar;`   | 32 bits | -2,147,483,648 to 2,147,483,647                     |
| `long myVar;`  | 64 bits | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |

// floating-point numeric
浮点数数据类型及其范围
| Declaration   | Size    | Supported Number Range                        |
|---------------|---------|-----------------------------------------------|
| `float x;`    | 32 bits | -3.4 × 10^38 to 3.4 × 10^38                   |
| `double x;`   | 64 bits | -1.7 × 10^308 to 1.7 × 10^308                 |

浮点数内部表示使用符号位、尾数和指数来表示数字。
eg: 6.02e23 中的 6.02 就是尾数，受精度限制。
float 和 double 的精度不同：
float 大约有 7 位尾数有效数字
double 有 16 位尾数有效数字。
浮点数溢出结果为无穷大（Infinity）。
整数溢出的结果为高位截断。

// 浮点数计算的性能问题
浮点数类型（如 float 和 double）通常只在必要时使用，因为它们可能会引发性能问题，特别是在嵌入式系统中。
在强大处理器上，浮点类型的性能差异几乎可以忽略。
浮点数可以在大整数超出范围时用作替代，但通常只在必须时才使用。

// 随机数
import java.util.Random;    
Random randGen = new Random();       
                                     
System.out.println(randGen.nextInt());     // range  -2^31 to 2^31 - 1
                                           // 可以传参 Random randGen = new Random(10);  代表随机数是从 0 到 9

Random 对象生成的整数称为伪随机数 Pseudo-random。
Random () 使用基于当前时间的数字为伪随机数生成器播种。由于每次程序运行的时间都不同，因此程序将获得一个唯一的序列。
若想获得同样的随机数序列，则需要设定随机数种子。
Random randGen = new Random(5)   or     randGen.setSeed(5)


// module, package, classes
A module is a group of related packages. A package is a group of related classes.
// Ex: The java.base module defines Java's foundational packages and APIs.

// java documentation
// class overview, constructor summary, method summary, constructor and method details
Java 类文档包含四个主要部分：类概述、构造函数摘要、方法摘要，以及构造函数和方法的详细描述。

// converting String to a number:
Byte.parseInt
Float.parseFloat
Double.parseDouble
Integer.parseInt
Long.parseLong
Short.parseShort

float num;
num = Float.parseFloat(str);

// 浮点数在java里会默认为 double 而不是float
例如 4.0 会被当成double, 如果要float 则要写成 4.0f
// 操作数类型提升规则：
在 Java 中，当你对 short、byte、或 char 类型的变量进行算术运算时，Java 会自动将这些类型提升为 int 类型。这意味着即使 intNum 和 a 都是 short 类型，intNum + a 的结果类型也会被提升为 int 类型。

// 二进制补码
// 在 Java 中，整数溢出是由二进制补码表示法（Two's Complement）引发的。当你在 short 类型中对数字进行运算并超出其表示范围时，溢出会导致数值从最大正数翻转为最小负数。我们可以通过理解 二进制补码 来解释这个现象。
// 1. 二进制补码表示法简介
// 在计算机中，有符号整数通常使用 二进制补码来表示：
// 正数和负数都可以用二进制来表示。
// 最高位（最左边的位）是符号位：
// 最高位为 0 表示正数。
// 最高位为 1 表示负数。
// 正数的二进制表示与无符号二进制数相同。
// 负数通过取正数的补码（将所有位取反然后加 1）来表示。
// 2. short 类型的范围
// 在 Java 中，short 是 16 位有符号整数。
// short 类型的范围是 -32768 到 32767：
// 32767 的二进制表示为：0111 1111 1111 1111（最高位 0 表示正数）。
// -32768 的二进制表示为：1000 0000 0000 0000（最高位 1 表示负数）。
// 3. 溢出是如何发生的？
// 当我们在 short 类型的最大正数（32767）的基础上加 1 时，结果超出了 short 类型的正数范围。这时，二进制数在运算时会发生进位，导致最高位从 0 变为 1，这就会导致结果被解释为负数。


// The operators should not be used with strings; string comparison methods equals() and compareTo() will be used instead.
// Floating-point types should not be compared using the equality operators, due to the imprecise representation of floating-point numbers

// logical operator (&&、||) 在所有优先级里排在最后
// && 的 优先级 比 || 高:
x == 5 || y == 10 && z != 10 is evaluated as (x == 5) || ((y == 10) && (z != 10)) because && has precedence over ||.

// switch syntax:
// expression: integer, char, string (boolean, floating-point not allowed)
// case expression cannot be a variable
switch (expression) {
   case constantExpr1: 
      // Statements
      break;

   case constantExpr2:
      // Statements
      break;
   
   ...
   
   default: // If no other case matches
      // Statements
      break;
}

// switch 里 的 fall-through 行为:
// 如果某个 case 分支中没有 break;，那么程序会继续执行后续的 case 分支代码，即使这些分支的条件不匹配当前的 case 值。
char userChar = 'E';
int encodedVal;

switch (userChar) {
   case 'B':
      encodedVal = 2;
      break;
   case 'C':
   case 'D':
      encodedVal = 4;
      break;
   case 'E':
      encodedVal = 5;  // 进入 case 'E'，encodedVal 现在是 5
      // 没有 break;，fall-through 继续执行下面的 case
   case 'F':
      encodedVal = 6;  // 继续执行 case 'F' 的代码，encodedVal 被重置为 6
      break;
   default:
      encodedVal = -1;
      break;
}

System.out.println("Encoded value: " + encodedVal);  // Encoded value: 6


// Using Boolean variables to simplify expressions.
/*
An expression that combines logical and relational operators can be simplified by assigning boolean variables with the result of the expression using relational operators. 
The if-else expression can then consist of only logical operations using those variables.
*/
isHot = (currentTemp > desiredTemp);
isReallyHot = (currentTemp > (desiredTemp + 5.0));
isHumid = (currentHumidity > 0.50);
   
if (isReallyHot) {
   // Use A/C and evaporative cooler
   acOn = true;
   evapCoolerOn = true;
}
else if (isHot && isHumid) {
   // Use A/C
   acOn = true;
   evapCoolerOn = false;
}
else if (isHot && !isHumid) {
   // Use evaporative cooler
   acOn = false;
   evapCoolerOn = true;
}
else {
   acOn = false;
   evapCoolerOn = false;
}


// char 的比较:
// char是原始数据类型， 比较和equality 都用 : <, >, ==, >=, <=
// 比较 ASCII 十进制码

// String的比较
equals()：比较的是字符串的内容，因此是判断两个字符串值是否相等的正确方式。 // str1.equals(str2)
equalsIgnoreCase()                                              // 忽略大小写
==：比较的是对象的引用，只有当两个字符串引用的是同一个对象时，才会返回 true。

| 语言          | 运算符      | 比较内容                  | 备注                                                           |
|---------------|-------------|---------------------------|----------------------------------------------------------------|
| **Python**    | `==`        | 比较字符串的内容           | 推荐使用 `==` 比较内容。                                        |
| **Python**    | `is`        | 比较对象是否是同一个实例    | `is` 比较的是引用，判断两个对象是否指向相同的内存地址。          |
| **JavaScript**| `==`        | 比较字符串的内容           | `==` 会进行类型转换，比较不同类型时可能会产生意外结果。         |
| **JavaScript**| `===`       | 严格比较内容和类型         | 推荐使用 `===` 进行字符串比较，避免隐式类型转换带来的问题。     |

// String relational compare:
字符编码比较：字符串比较时会使用字符的编码（例如 ASCII 值）来逐字符进行比较。   // 因为 'A' 的 ASCII 编码 65 小于 'a' 的 97，所以 "Apples" 被认为小于 "apples"。
逐字符比较：从索引 0 开始比较，直到找到第一个不同的字符或者比较到字符串的末尾。  // "Banana" 大于 "Apple"，因为 'B'（66）的编码大于 'A'（65）。
大写 vs 小写：大写字母的编码比小写字母小，例如 'A'（65）小于 'a'（97）。
长度影响：如果两个字符串的所有字符都相同，但其中一个字符串更短，那么较短的字符串被认为较小。 // "Apple" 比 "Apples" 小，因为 "Apple" 短于 "Apples"，尽管前 5 个字符相同。

compareTo() 
str1.compareTo(str2)
compareToIgnoreCase()       // 忽略大小写
返回值：
负数：str1 小于 str2（按字母顺序靠前）。
零：str1 等于 str2。
正数：str1 大于 str2（按字母顺序靠后）。

// userString = "Run!";
// x = userString.charAt(4);    // return error

// 注意原本是 String, 假如 charAt() 取了某个单个字符， 则取的这个单个字符的 类型是 char

// character(char) method:    注意 只有char类型能用!!
Character.isLetter(c)
Character.isDigit(c)         //  isDigit('x')  false
                             //  isDigit('6')  true
Character.toUpperCase(c)     //  toUpperCase('3')   3
Character.isWhitespace(c)    //  isWhitespace(' ')  true
                             //  isWhitespace('\n') true
Character.toLowerCase(c)     //  toLowerCase('3')   3

// String (String) method
indexOf()        // str.indexOf('z')  str.indexOf("me")     return indexnum; if cannot find, return -1
lastIndexOf()    // str.lastIndexOf()                       return indexnum; if cannot find, return -1
substring()      // str.substring()
                 //     substring(startIndex)               startIndex(inclusive)直到最后
                 //     substring(startIndex, endIndex)     startIndex(inclusive) 到 endIndex(exclusive)
                 //     startIndex 是 inclusive， endIndex 是 exclusive
concat()         // char 也能用 ！
replace()        // char F ！ 
str1 + str2
str1 += str2

// char 和 String的 method 总结:
1. is类的那些只有char 类型能用!!
2. 比较值大小和是否相等:
   char  : >, >=, ==, <, <=
   String: equals(), compareTo()

// String is immutable , string的不可变性: (可以参考 java_note.java 笔记里的内容)
// 如果要改变变量的字符串，可以重新赋值
// userText = userText.concat("ning")

// conditional expression 条件表达式
if (condition) {
  myVar = expr1;
}
else {
  myVar = expr2;
}

myVar = (condition) ? expr1 : expr2;

// floating-point number comparison 浮点数的比较
浮点数不应使用 == 进行直接比较，因为浮点数在计算机中存储时，由于精度限制，不能精确表示某些值。
由于这些精度问题，两个浮点数即使看起来相等，也可能并不完全相等。
正确比较方法示例:
Math.abs(x - y) < 0.0001          // 这表示如果 x 和 y 之间的差值小于 0.0001，则认为它们相等。
Epsilon 是用于判断浮点数相等的差值阈值, Epsilon 的值取决于程序的具体要求和浮点数的预期范围，但常用值为 0.0001

// loop issue remainder:
从 0 开始循环已成为标准，便于与数组等数据结构统一。
++i 更安全，初学者应优先使用前缀形式的自增操作符。
如有可能哈哈，避免在循环中声明变量，有助于降低初学者的出错率。

// 代码块 (Block): 
由大括号 {...} 包围的一组语句。常见于 if-else、for 循环或 while 循环等控制结构中。

// 变量的作用域 (Variable Scope):
变量的作用域从其声明开始，到对应的代码块的闭合大括号 } 结束。也就是说，变量只能在它声明所在的代码块内使用。

// 注意事项 和 javascript的 let, const 的块级作用域的区别
Java 中的变量声明是块级作用域。这意味着变量在其被声明的代码块 {} 内有效，离开该代码块后，变量就不可访问了。
然而，Java 对变量的重新声明有严格的限制：不能在嵌套的内部代码块中重新声明与外部代码块中已声明的变量同名的变量。
eg:
int a = 5;
{
    int a = 10;  // 编译错误：变量 'a' 已在外部作用域中声明，不能重复声明
    System.out.println(a);
}
System.out.println(a);


// 枚举类型（Enumeration Type）
定义：枚举类型（enum）是 Java 中一种特殊的数据类型，允许我们为变量定义一组预先确定的常量值。这些常量值称为 枚举常量（enumerators）。
用途：当一个变量只需要存储一小组固定的命名值时，枚举类型非常有用。例如，表示交通信号灯的状态，只需存储 GREEN、YELLOW 或 RED 三种状态。
//声明枚举类型：
public class TrafficLightControl {
   // 枚举类型的声明，位于 main 方法之外
   public enum LightState {RED, GREEN, YELLOW, DONE}

   public static void main(String[] args) {
// 声明枚举变量：
LightState lightVal;
// 赋值与比较：
lightVal = LightState.RED;  // 赋值
if (lightVal == LightState.GREEN) { ... }  // 比较
// 枚举的优势:
避免无效值: 如果使用字符串或整数，可能会赋予非法的值（如 "ORANGE" 或 -1），枚举可以防止这种情况。
类型安全： 枚举类型提供了编译时的类型检查，防止将无效的值赋给枚举变量。
可读性和维护性：枚举使代码更具可读性，明确了变量可以接受的合法值，减少了错误的可能性。

// 数组形式:
dataType[] arrayName = new dataType[numElements];

// 声明时候可以直接带上数组个数, 也可以不带, 也可以直接给值(这种不用带new的关键字)
int[] gameScores = new int[4];

or 

int[] gameScores;
gameScores = new int[4];

or 

int[] myArray = {5, 7, 11};

// vowels = {'a', 'e', 'i', 'o', 'u', 'y'};    注意，这种是错的 ！！

// 术语区分：[] 称为“方括号”（brackets），{} 称为“花括号”（braces）

// 数组未赋值元素的默认值: 当创建一个数组时，未显式赋值的元素会自动初始化为数据类型的默认值。对于 int 类型数组，默认值为 0。
| 数据类型   | 默认值         |
|------------|----------------|
| `int`      | 0              |
| `short`    | 0              |
| `long`     | 0L             |
| `float`    | 0.0f           |
| `double`   | 0.0d           |
| `char`     | '\u0000' (空字符) |
| `boolean`  | false          |
| `byte`     | 0              |
| `Object`   | null           |

// length 对于字符串和数组的syntax 区别:
对于 字符串，使用 length() 方法。          eg: str.length()
对于 数组，使用 length 属性（没有括号)      eg: array.length

// 几种常见的遍历数组用法套路:
1. 求最大值：
maxVal = userVals[0];                   // Largest so far
      
      for (i = 0; i < userVals.length; ++i) {
         if (userVals[i] > maxVal) {
            maxVal = userVals[i];
         }

2. 求总值:
     sumVal = 0;
      for (i = 0; i < userVals.length; ++i) {
         sumVal = sumVal + userVals[i];
      }

3. reverse an array
      for (i = 0; i < (userVals.length / 2); ++i) {
         tempVal = userVals[i];                           // Temp for swap
         userVals[i] = userVals[userVals.length - 1 - i]; // First part of swap
         userVals[userVals.length - 1 - i] = tempVal;     // Swap complete
      }

// 注意 ！！
// System.out.print(90 + "*");   // 90*      "*" 是一个String
// System.out.print(90 + '*');   // 132      '*' 是一个char, 在Java中，字符实际上是一个整数，它的值是该字符的ASCII码

// two-demensional arrays
int[][] myArray = new int[R][C] represents a table of int variables with R rows and C columns, so R*C elements total.
myArray[0][0] = 33

int[][] numVals = {
      {22, 44, 66}, // Row 0
      {97, 98, 99}  // Row 1
};

// for-each loop 
eg:
for (String playerName : teamRoster) {
  System.out.println(playerName);
}

// for-each loop common error:
for (String playerName : teamRoster) {      // 实际未改动到 array!!
  playerName = "Dennis";
}

// A parameter, like a variable declaration, cannot be an expression.
int myMthd(int userNum + 5) { ... }  ----> this is false!!!

// terminology : testbench, test harness, test vector
A testbench is a program whose job is to thoroughly test another program (or portion) via a series of input/output checks known as test cases. 
Unit testing means to create and run a testbench for a specific item (or "unit") like a method or a class.

// Assert operator
// Assert is an operator that prints an error message and exits the program if the provided test expression evaluates to false, having the form:
assert testExpression : detailedMessage;
eg:
assert (hrMinToMin(0, 0) == 0) : "Assertion (hrMinToMin(0, 0) == 0) failed";
eg:
   public static void main(String[] args) {
      System.out.println("Testing started");

      assert (hrMinToMin(0, 0) == 0) : "Assertion (hrMinToMin(0, 0) == 0) failed";
      assert (hrMinToMin(0, 1) == 1) : "Assertion (hrMinToMin(0, 1) == 1) failed";
      assert (hrMinToMin(0, 99) == 99) : "Assertion (hrMinToMin(0, 99) == 99) failed";
      assert (hrMinToMin(1, 0) == 60) : "Assertion (hrMinToMin(1, 0) == 60) failed";
      assert (hrMinToMin(5, 0) == 300) : "Assertion (hrMinToMin(5, 0) == 300) failed";
      assert (hrMinToMin(2, 30) == 150) : "Assertion (hrMinToMin(2, 30) == 150) failed";
      // Many more test vectors would be typical...

      System.out.println("Testing completed");
   }
// 在 Java 中，断言功能默认是未启用的。为了使用断言，程序员需要在运行程序时添加命令行参数 -ea 来启用断言。
// 启用断言的命令：要在运行时启用断言，使用以下命令：
// java -ea ClassName 例如：java -ea HrMinToMinTestHarness
// 测试输出检查：使用断言，可以轻松检查程序输出的正确性。如果程序没有检测到错误，输出通常是：
// "Testing started" 然后是 "Testing completed"，表明测试过程没有发现问题。

// Method Stub
// 方法存根的主体内容往往只有一个简单的 return 语句或者一个打印输出，表示这个方法的调用是成功的，但并没有执行任何真正的逻辑。
// 方法存根是软件开发的一种策略，用来分阶段开发程序。它允许程序员首先定义程序结构，逐步实现每个部分的细节。这种方法有助于保持代码的组织性，并在开发过程中进行阶段性的测试。
eg:
public class RoadTrip {
   // Method stub for calculating fuel cost
   public static double calculateFuelCost(double distance, double fuelEfficiency) {
      // This is a stub, the logic hasn't been written yet
      System.out.println("Fuel cost calculation not yet implemented.");
      return 0.0;
   }

   public static void main(String[] args) {
      double tripDistance = 300.0; // Example distance in miles
      double carEfficiency = 25.0; // Example fuel efficiency in miles per gallon

      // Main logic that uses the stub
      double fuelCost = calculateFuelCost(tripDistance, carEfficiency);

      System.out.println("Fuel cost: $" + fuelCost);
   }
}


// method 的调用机制
Each method call creates a new set of local variables, forming part of what is known as a stack frame. A return causes those local variables to be discarded.

eg: 
public class MethodExample {
    public static int calcSum(int a, int b) {
        return a + b;  // 方法执行，将 a 和 b 的和返回
    }

    public static void main(String[] args) {
        int result = calcSum(10, 20);  // 调用 calcSum 方法
        System.out.println("Result: " + result);  // 输出结果
    }
}
在这个例子中，程序的执行流程如下：

1. main 方法开始执行，调用 calcSum(5, 10)。
2. 在调用 calcSum 方法之前，Java 会将 main 方法的当前指令位置（即 System.out.println() 这一行的内存地址）存储在栈帧中。
3. 跳转到 calcSum 方法，执行 a + b，计算出结果 15。
4. 当 calcSum 执行完毕时，返回到 main 方法：
返回地址：Java 使用第二步中存储的返回地址，跳回 main 方法调用 calcSum 的地方（即 System.out.println()）。
返回值：方法的返回值 15 被传递回 main 方法，并赋值给变量 result。
5. System.out.println("Result: " + result) 打印 Result: 15。

// 总结一下method 调用机制的要点
1. 方法执行前:
a. 参数传递:                                                    // 参数(parameter), 局部变量（local variables）, 返回值(return value) 和 储存地址(return add)都会放在堆栈中 stack frame (call stack)
在方法执行之前，所有传递的参数都会被复制到该方法的局部变量表中。
10 和 20 被复制到 calcSum() 的局部变量 a 和 b 中。
b. 返回储存地址：
程序记录调用 calcSum() 的位置，以便方法执行完后可以返回。

2. 方法执行后:
当方法执行完毕，遇到 return 语句时，Java 会执行跳转，根据调用栈中的返回地址，让程序回到调用该方法的地方。
方法的返回值会通过栈传递回去, 会将返回值存储在调用栈中，供调用者使用。

// 数组参数传递 // 涉及primitive data type 和 non- primitive data type的区别
1. 原始类型的参数传递
当你将基本数据类型（如 int、char 等）作为参数传递给方法时，传递的是值的副本。也就是说，方法接收的是这个变量的一个复制品。
结果：在方法中对参数的修改不会影响原始变量，因为它们是独立的拷贝。
eg:
public static void changeValue(int x) {
    x = 10; // 修改的是副本，不会影响原始变量
}

public static void main(String[] args) {
    int myVar = 5;
    changeValue(myVar);
    System.out.println(myVar); // 输出 5
}

2. 数组的参数传递
当你将数组作为参数传递给方法时，传递的是数组引用的副本，而不是数组的副本。换句话说，方法接收到的是指向原始数组的引用地址的拷贝，而不是数组内容的副本。
结果：方法内对数组元素的修改会影响原始数组，因为它们指向同一个内存地址。
eg:
public static void changeArray(int[] arr) {
    arr[0] = 100; // 修改数组中的元素，原始数组会受影响
}

public static void main(String[] args) {
    int[] myArray = {1, 2, 3};
    changeArray(myArray);
    System.out.println(myArray[0]); // 输出 100
}

3. 数组引用本身的变化
虽然方法可以通过数组引用修改数组的内容，但如果你在方法中试图将数组引用指向另一个数组，这不会影响到调用者的原始数组引用。因为数组引用本身是值传递的。
结果：改变数组引用不会改变原始数组的引用指向，只会改变方法内部的局部引用。
eg:
public static void changeReference(int[] arr) {
    arr = new int[]{10, 20, 30}; // 修改的是局部引用，不影响原始数组引用
}

public static void main(String[] args) {
    int[] myArray = {1, 2, 3};
    changeReference(myArray);
    System.out.println(myArray[0]); // 输出 1，不受影响
}
// 3. 数组引用本身的变化   以下是这一点的引申解释
引用的值传递：当你将 myArray 传递给方法时，方法中的 arr 只是引用的副本。方法内部重新给 arr 赋值，只是改变了 arr 自己的指向，并没有改变 myArray 的指向。
更简单的类比：
可以把引用理解为一个指向某个房子的地址。当你给别人一张地址的副本，别人可以通过这个副本找到同一个房子并且在房子里做一些改动（修改数组内容）。但如果他用这张副本去找另一个房子（改变引用的指向），原来的房子和地址并没有变，只是副本找到了新的房子。


// variable/method Scope
局部变量（Local Variable):在方法中声明的变量，其作用域仅限于方法内部，无法被其他方法访问。局部变量的作用域从声明处开始，直到方法结束。
类成员变量（class member variable or Field): 在类中声明但不在任何方法内的变量。它们的作用域从类的开始 { 到结束 }，可以在类中的任何方法中访问。

// 同名变量与字段的冲突
如果方法中的局部变量（包括方法参数）与类的字段同名，那么在该方法内使用变量名时，优先指向局部变量，类的字段将被屏蔽。
// 避免使用全局变量
有些初学者为了避免参数传递，可能倾向于使用全局变量（类成员变量）。这虽然可以避免参数的使用，但会导致代码难以维护，是一种不良的编程习惯。

// 方法重载(method overloading)
// 定义:
指的是在同一个类中，可以定义多个同名但参数数量或类型不同的方法。这样，方法名称相同，但它们的行为可以根据不同的参数进行区分。
编译器通过方法调用时传递的参数类型来决定调用哪个重载的方法。
// 重载的规则
可以有多个同名方法，只要每个方法的参数类型或数量不同。
参数的名称不影响方法的重载，方法的区分仅依赖于参数类型和数量。

// 关于在method中用Scanner
对每个输入流（如 System.in）只使用一个 Scanner 对象。
将 Scanner 对象在 main() 中创建，并通过参数传递给需要使用输入的其他方法。
避免在同一个输入流上创建多个 Scanner，防止意外的读取问题。
eg: 
import java.util.Scanner;

public class CalculatePizzaCalories {

   public static double calcCircleArea(double circleDiameter) {
      double circleRadius;
      double circleArea;
      double piVal = 3.14159265;

      circleRadius = circleDiameter / 2.0;
      circleArea = piVal * circleRadius * circleRadius;

      return circleArea;
   }

   public static double getPizzaCalories(Scanner scnr) {
      double pizzaDiameter;
      double totalCalories;
      double caloriesPerSquareInch = 16.7;    // Regular crust pepperoni pizza

      System.out.print("Enter pizza's diameter (inches): ");
      pizzaDiameter = scnr.nextDouble();

      totalCalories = calcCircleArea(pizzaDiameter) * caloriesPerSquareInch;

      return totalCalories;
   }

   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);

      System.out.println("Pizza has " + getPizzaCalories(scnr) + " calories.");
      System.out.println("Pizza has " + getPizzaCalories(scnr) + " calories.");
   }
}

// 方法内部创建数组并返回数组引用，表示这是一个完美大小数组。
// 如方法返回数组时意味着返回一个完美大小数组
eg: The method signature char[] fromString(String inputWords) returns a perfect size array.
eg：The method signature void shuffleCards(int[] cards, int size) indicates that cards is not a perfect size array.
eg: The method signature void shuffleCards(int[] cards) indicates that cards is a perfect size array.

// oversize array
是指一个数组的容量可能大于实际存储的数据量。通常情况下，程序会为数组预分配较大的空间，而当前存储的数据量可能小于分配的容量。使用超大数组可以为后续增加数据预留空间，避免频繁调整数组大小。
// 超大数组的三大变量
数组引用：指向实际存储数据的数组。
当前大小（current size）：表示当前存储的数据量，即数组中有效元素的数量。
数组容量常量（array capacity constant）：表示数组的最大容量，通常声明为常量，用来明确数组最大可以存储多少元素。
// 例如，一个程序需要存储一份真/假测试的答案，可能会定义以下三个变量：
final int QUIZ_CAPACITY = 100;  // 数组的最大容量
boolean[] quizAnswers = new boolean[QUIZ_CAPACITY];  // 数组引用
int currentSize = 0;  // 当前数组中存储的有效答案数量
// 好处
避免了频繁的内存分配操作（重新创建数组）和数据复制操作。

///////////////////////////////
// Methods with Oversize Arrays
/////////////////////////////// 
当超大数组作为参数传递给方法时，通常需要传递两个参数：一个是数组的引用，另一个是数组的当前大小（currentSize）。
例如，printOversizeArray() 方法应使用 arraySize 而不是 arrayRef.length，以避免打印出未使用的数组元素。

// Method with oversize array has parameters for array reference and current size.
// 遍历数组
public static void printOversizeArray(String[] arrayRef, int arraySize) {
   int index;

   System.out.print("[");
   for (index = 0; index < arraySize; ++index) {
      System.out.print(arrayRef[index]);
      if (index != arraySize - 1) {  // Don't print trailing , for last element
         System.out.print(", ");
      }
   }
   System.out.println("]");
}

// 方法更新超大数组：添加元素
检查数组是否已满，如果已满，方法直接返回，不进行任何操作。
如果数组有可用空间，将新元素添加到下一个可用索引，并增加 currentSize。
返回新数组大小：方法返回新的 currentSize，调用方需要将新的数组大小存储起来，否则新增的元素将无法被访问，因为 currentSize 将不正确。
常见错误：忘记返回并更新数组的 currentSize，导致新添加的元素“丢失”，因为当前数组大小未正确更新。
final int LIST_SIZE = 4;
String[] toDoList = new String[LIST_SIZE];
int toDoListSize = 0;
                
toDoListSize = addElement(toDoList, toDoListSize, "Study");

...

public static int addElement(String[] arrayRef,
                            int currentSize,
                            String addMe) {
   // Check that array has space 
   if (currentSize == arrayRef.length) {    
      return currentSize;  
   }

   // If array has space, add the element to the array 
   arrayRef[currentSize] = addMe; 
   ++currentSize; 
   return currentSize;
}

// 方法更新超大数组：移除元素
循环遍历数组，找到匹配的元素。
找到匹配元素后，将后续元素向前移动一位，覆盖被删除的元素。
更新 currentSize 以反映数组大小的变化。
在方法结束时使用布尔值 targetFound 来检查是否找到了匹配的元素，并相应地更新数组的大小。

public static int removeFirst(int[] arrayRef, int arraySize, int targetVal) {
   boolean targetFound;
   int index;

   targetFound = false;

   // Step through the array one element at a time
   for (index = 0; index < arraySize; ++index) {
      // If matching element found, move each element to the previous index
      if (targetFound) {
         arrayRef[index-1] = arrayRef[index];
      }

      // Check if matching element found
      if (arrayRef[index] == targetVal) {
         targetFound = true;
      }
   }

   // If matching element found, array size is one element smaller
   // otherwise array size hasn't changed 
   if (targetFound) {
      return arraySize - 1;
   }
   else {
      return arraySize;
   }
}

// Comparing perfect size and oversize arrays
完美大小数组：方法只接受数组引用，不需要数组大小参数，通常返回数组引用。
超大数组：方法需要传递数组引用和当前数组大小两个参数，方法返回整数时，通常表示新的数组大小。
通过方法签名可以推断该方法是操作完美大小数组还是超大数组，这对理解方法的行为至关重要。

// 有关超大数组方法:
1. 超大数组的两个必要数据项
数组引用：用于访问和操作数组的数据。
数组的当前大小：指示数组中实际使用的元素数量，而不是数组的总容量。
超大数组通常具有大于当前存储数据的容量，因此我们需要额外的一个变量来记录当前有效的数据量（currentSize），而不是使用 array.length 来获取数组大小。

2. 方法只能返回一个值
在 Java 中，一个方法最多只能返回一个值。因此，如果你希望方法返回超大数组的结果，你不能同时返回数组引用和数组的当前大小。
示例：你不能让一个方法返回 {int[] array, int currentSize}，因为方法只能返回一个值，不能同时返回两个项目。
3. 超大数组的处理方式
为了处理这个限制，超大数组通常在方法调用之前就创建好，并且被传递给方法。方法可以通过传入的数组引用修改数组内容，同时返回新的数组大小。
方法返回新数组大小：方法的返回值通常是新的数组大小（currentSize），以指示数组的变化。
数组内容的修改：方法可以通过传递的数组引用修改数组内容，比如添加或删除元素。

| **Situation**                                       | **Perfect size array**                         | **Oversize array**                        |
|-----------------------------------------------------|------------------------------------------------|-------------------------------------------|
|                                                     | **Parameter(s)**  | **Return**            | **Parameter(s)**          | **Return**            |
| Array not modified                                  | Array reference   |                      | Array reference and      |                       |
|                                                     |                   |                      | array size               |                       |
| Array contents modified, but array size not modified| Array reference   |                      | Array reference and      |                       |
|                                                     |                   |                      | array size               |                       |
| Array size modified                                 | Consider if an    | Array reference       | Array reference and      | New array size         |
|                                                     | oversize array    |                      | array size               |                       |
|                                                     | should be used    |                      |                           |                       |
| Array reference returned                            |                   | Must be perfect size  | Impossible               |                       |


// 完美大小数组和超大数组的优缺点
// 完美
优点: 方法参数较少、内存占用精确，适合静态或固定大小的数据集。
缺点: 扩展性差：当需要增加新元素时，完美大小数组需要创建新的数组并进行数据复制
// 超大
优点: 避免频繁的数组重新分配和复制操作，在需要频繁添加或删除数据的场景下表现更好
缺点: 参数复杂, 内存消耗多
// Methods for adding elements to perfect size and oversize arrays.
// Method uses a perfect size array.
public static String[] addElement(String[] arrayRef, String addMe) {
   String[] returnArray = new String[arrayRef.length + 1];
   int index;
           
   // Copy the array elements to the newly constructed array
   for (index = 0; index < arrayRef.length; ++index) {
      returnArray[index] = arrayRef[index];
   }

   // Add in the new element to the end of the array
   returnArray[arrayRef.length] = addMe;
         
   return returnArray;
}

// Method uses an oversize array.
public static int addElement(String[] arrayRef, int currentSize, String addMe) {
   if (currentSize == arrayRef.length) return currentSize;
   
   arrayRef[currentSize] = addMe;
   ++currentSize;

   return currentSize;
}

// primitive data type 和 array 在method 中 储存方式的差异
基本数据类型（如 int 和 double）的变量在方法中是直接存储在栈（stack frame）中的。
数组内容在内存中**存储在堆（heap）**中，而不是直接存储在栈帧中。在栈中只存储了对数组的引用（即指向堆中数组数据的内存地址），而不是数组本身的内容。
eg: 
int[] topScores = {100, 99, 99};  
// topScores stores in stack
// topScores[0] stores in heap

// 存储方式的差异导致的行为差异：
当你将一个基本数据类型（如 int）传递给方法时，方法操作的是这个变量的副本，对该变量的修改不会影响到原始变量。
但是当你将数组传递给方法时，方法操作的是数组的引用，因此在方法中修改数组的内容会直接影响原始数组（因为堆中的数组是共享的）。


/*
1. 数组引用的传递方式：
当你将一个数组作为参数传递给方法时，数组引用本身是按值传递的，这意味着方法获得的是数组引用的副本，而不是引用的原始值。
方法中操作的数组引用和原始数组引用是两个不同的副本，虽然它们最初指向同一个数组，但引用本身在两个不同的栈帧中独立存储。
2. 数组内容可以修改：
虽然引用是按值传递的，但方法中仍然可以通过这个引用修改数组的内容，因为它们都指向堆中的同一个数组。
修改数组的内容（如 arr[0] = 10）会影响原始数组，因为无论是在方法中还是在调用者处，两个引用都指向相同的数组。
3. 不能修改数组引用本身：
常见错误：有人误以为可以在方法中通过修改数组引用（如 arr = new int[10]）来改变原始数组的引用。但实际上，这只是改变了方法中的数组引用副本，不会影响原始数组引用。
这种操作在方法中修改了局部引用的指向，但并没有改变调用方传入的原始数组引用。
4. 总结：
数组内容：方法可以通过引用修改数组内容，因为它们都指向相同的内存位置。
数组引用：方法不能修改传入数组的引用，因为方法获得的是数组引用的副本，改变它只会影响方法内部的引用，而不会改变调用者的原始引用。
*/


// 数组大小修改方案
// 数组大小不能直接修改：
Java 中的数组一旦创建，大小是固定的，不能直接增加或减少。
这是因为内存中的相邻位置可能已经被其他数据占用，或者被其他程序使用。
// 修改数组大小的替代方案：
当需要改变数组的大小时，必须构造一个新的数组，新数组的大小可以是所需的大小。
之后，将原数组的元素复制到新数组 中，并返回新数组的引用。
// resize() method changes the size of an array by constructing a new array and copying the array's elements.
String[] originalArray = {"Raven", "Daisy", "Jasmine"};
originalArray = resize(originalArray, 5);

...

public static String[] resize(String[] arrayReference, int newSize) {
   String[] resultArray = new String[newSize];
   int index;
   int numToCopy;

   // Determine the number of array elements to copy
   numToCopy = Math.min(newSize, arrayReference.length);

   // Copy elements from arrayReference to resultArray
   for (index = 0; index < numToCopy; ++index) {
      resultArray[index] = arrayReference[index];
   }
   
   return resultArray;
}


// method signature design 数组方法的功能需要单一化
//  三种常见的数组操作方法
1.  计算并返回结果，数组不变：
这些方法基于数组的数据进行计算，但不会修改数组的内容。
返回值：该方法必须返回某种结果。
示例：int binarySearch(int[] arrayReference, int target)：通过搜索数组中的 target 来计算目标值的索引，数组内容不变，返回索引或负数（若未找到）。
2. 修改数组内容，但不改变数组大小：
方法的目的是修改数组中的元素，但不会改变数组的大小。
返回值类型：通常为 void，因为不需要返回新数组或数据。
示例：void sort(int[] arrayReference)：排序数组，将数组中的元素重新排列为升序，方法没有返回值。
3. 创建新数组或改变数组大小：  // 这种情况下 建议在方法中创建一个新数组来return， 而不要使用argument的原数组。
方法需要创建一个新的数组或调整数组大小。
返回值：方法必须返回一个数组引用，因为数组的引用不能在方法内修改。
示例：double[] copyOf(double[] arrayReference, int newLength)：该方法返回一个新的数组，其大小为 newLength，并将旧数组中的数据复制到新数组中。


// Unintended side effects 
副作用是指方法在执行时无意间修改了数据，导致数据发生了预期之外的改变。即使方法返回值正确，副作用也可能导致程序中的其他部分出现问题。
常见副作用：例如，一个计算方法在计算过程中无意间修改了数组的内容，或调整了数组的顺序。
单一职责原则：一个方法应该只执行一个任务。如果一个方法的目的是计算某个值，那么它不应该同时修改数组内容。如果目的是修改数组，它不应同时执行计算任务。
例如：findMostFrequent() 方法在寻找最频繁元素时排序了数组，这虽然计算结果是正确的，但副作用是修改了数组的顺序，这可能在其他地方引发问题。
在编写方法时，应确保计算和修改操作是分开的，避免在计算过程中无意修改数据。
在测试方法时，除了验证返回值是否正确，还应该检查输入数据是否保持原样，以确保没有副作用发生。


// Java automatically imports the java.lang package, which allows a programmer to use the String class and corresponding methods.

// private fields 私有字段
// 除了公共成员方法之外，类定义还具有私有字段：成员方法可以访问但类用户不能访问的变量。每个私有字段声明前都有 private 访问修饰符。
// private fields 作用:
数据封装和保护：将字段设为 private 可以防止外部代码直接访问和修改它们。这样可以确保类的内部状态不会被外部意外修改，增加了数据的安全性和完整性。
封装实现细节：private 字段隐藏了类的实现细节，外部只需通过公共方法与类交互，而不需要关心类的内部如何实现。这使得代码更灵活，类的实现细节可以在不影响外部代码的情况下修改。
eg: 

public class Restaurant {                        // Keeps a user's review of a restaurant
   private String name;                          // private field
   private int rating;                           // private field
   
   public void setName(String restaurantName) {  // Sets the restaurant's name        
      ...
   }
}

Restaurant.name    // error 因为name 属于private field， 只有method 可以访问， class 没法访问

// 程序员在定义类时，首先命名类，声明私有字段，并定义公共成员方法。类的字段和方法统称为类成员。
public class Restaurant {                          // Info about a restaurant
   private String name;
   private int rating;

   public void setName(String restaurantName) {    // Sets the restaurant's name
      name = restaurantName;
   }

   public void setRating(int userRating) {         // Sets the rating (1-5, with 5 best)
      rating = userRating;
   }

   public void print() {                           // Prints name and rating on one line
      System.out.println(name + " -- " + rating);
   }
}
eg:实战参考代码:
Kangaroo.java:

import java.util.Scanner;

public class KangarooData {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Kangaroo kangaroo1 = new Kangaroo();
      String userColor;
      String userName;

      userColor = scnr.next();
      userName = scnr.next();

      kangaroo1.setColor(userColor);
      kangaroo1.setName(userName);

      System.out.println("Color: " + kangaroo1.getColor());
      System.out.println("Name: " + kangaroo1.getName());
   }
}

KangarooData.java:

import java.util.Scanner;

public class KangarooData {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Kangaroo kangaroo1 = new Kangaroo();
      String userColor;
      String userName;

      userColor = scnr.next();
      userName = scnr.next();

      kangaroo1.setColor(userColor);
      kangaroo1.setName(userName);

      System.out.println("Color: " + kangaroo1.getColor());
      System.out.println("Name: " + kangaroo1.getName());
   }
}


// 修改器 mutators, 访问器 accessors
// 类的公共方法通常分为两类：修改器（mutators） 和 访问器（accessors）。
修改器方法（mutator） 可以修改类的字段，常见的修改器方法通常以 set 开头，被称为 setter。
访问器方法（accessor） 仅访问类的字段，但不会修改它们，常见的访问器方法通常以 get 开头，被称为 getter。
存在其他不与某个字段直接关联的修改器或访问器方法，如 print() 方法。
eg:
public class Restaurant {                          
   private String name;
   private int rating;

   public void setName(String restaurantName) {  // Mutator
      name = restaurantName;
   }

   public void setRating(int userRating) {       // Mutator
      rating = userRating;
   }

   public String getName() {  // Accessor
      return name;
   }

   public int getRating() {  // Accessor
      return rating;
   }

   public void print() {      // Accessor
      System.out.println(name + " -- " + rating);
   }
}


// private helper method 私有辅助方法
任何成员方法（公共或私有）都可以调用私有成员方法。
类的用户可以调用公共成员方法，但不能直接调用私有成员方法（这会导致编译器错误）。
eg:
public class MyClass {
   private int numA;

   private int methodX() {
      ...
   }

   public void method1() { 
   

   }
}

public class TestClass {
   public static void main(String[] args) {
      
      MyClass someObj = new MyClass();

      someObj.method1();               // Ok

      ...

      someObj.methodX();               // error
   }
}

// private helper method 私有辅助方法的作用
简化代码、提高可读性、增强代码复用性，并且隐藏实现细节，它们通常将某些复杂或重复的任务抽取成独立的方法，从而使得代码更易于维护和扩展。
eg: 假设我们要创建一个 BankAccount 类，该类有一个用于打印账户信息的公共方法，但这个方法涉及多个步骤，比如格式化账户余额。我们可以将格式化的部分提取为一个私有辅助方法：
代码简洁：printAccountInfo 负责打印信息，formatBalance 负责处理格式化，使得代码更加简洁明了。
代码复用：如果以后需要在其他地方也使用相同的余额格式化逻辑，可以复用这个私有辅助方法。
隐藏实现细节：外部无法直接调用 formatBalance，只能通过公共方法 printAccountInfo 使用它，保证了类的内部实现细节不会暴露。

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // 公共方法，用于打印账户信息
    public void printAccountInfo() {
        String formattedBalance = formatBalance(); // 使用私有方法格式化余额
        System.out.println("Account: " + accountNumber + " | Balance: " + formattedBalance);
    }

    // 私有辅助方法，用于格式化余额
    private String formatBalance() {
        return String.format("$%.2f", balance);  // 格式化为两位小数的货币格式
    }
}

// 构造函数 constructor (也可以参考java_note.java)  // 其实 构造函数 的运用 代码上 相当于 替换了 private 参数的初始值assign 和 一部分setter
构造方法（constructor） 是 Java 中的一个特殊类成员方法，在创建类对象时被调用，用于初始化类的所有字段。
构造方法的名称与类名相同，并且没有返回类型，甚至不使用 void。例如：public Restaurant() {...} 定义了 Restaurant 类的构造方法。
程序员在创建对象时指定要调用的构造方法。例如：Restaurant favLunchPlace = new Restaurant(); 创建一个新的 Restaurant 对象并调用构造方法。
如果类没有程序员定义的构造方法，Java 编译器会隐式地定义一个无参默认构造方法，并将所有字段初始化为默认值。
A default constructor is implicitly defined by Java if a constructor doesn't exist. The default constructor initializes the capacity field to an int's default value, 0.
eg:
Restaurant.java:

public class Restaurant {
   private String name;
   private int rating;

   public Restaurant() {  // Constructor with no arguments
      name = "NoName";    // Default name: NoName indicates name was not set
      rating = -1;        // Default rating: -1 indicates rating was not set
   }

   public void setName(String restaurantName) {
      name = restaurantName;
   }

   public void setRating(int userRating) {
      rating = userRating;
   }

   public void print() {
      System.out.println(name + " -- " + rating);
   }
}

RestaurantFavorites.java:
public class RestaurantFavorites {
   public static void main(String[] args) {
      Restaurant favLunchPlace = new Restaurant(); // Calls the constructor

      favLunchPlace.print();

      favLunchPlace.setName("Central Deli");
      favLunchPlace.setRating(4);
      favLunchPlace.print();
   }
}


// deposing into classes
类的分解：程序员通过将复杂问题分解成多个类来管理不同的对象和功能。例如，在管理足球队员时，程序员可能会创建一个 Person 类来代表每个队员。
类的设计：每个类通常包含私有数据（如姓名、年龄）和公共方法（如 get/set 方法和打印方法）。私有数据保护对象内部状态，公共方法提供操作和访问这些数据的接口。
eg:
TeamPerson.java:

public class TeamPerson {
   private String fullName;
   private int ageYears;
   
   public void setFullName(String firstAndLastName) {
      fullName = firstAndLastName;
   }
   
   public void setAgeYears(int ageInYears) {
      ageYears = ageInYears;
   }
   
   public String getFullName() {
      return fullName;
   }
   
   public int getAgeYears() {
      return ageYears;
   }
   
   public void print() {
      System.out.println("Full name: " + fullName);
      System.out.println("Age (years): " + ageYears);
   }
}

SoccerTeam.java:
public class SoccerTeam {
   private TeamPerson headCoach;
   private TeamPerson assistantCoach;
   // Players omitted for brevity
   
   public void setHeadCoach(TeamPerson teamPerson) {
      headCoach = teamPerson;
   }
   
   public void setAssistantCoach(TeamPerson teamPerson) {
      assistantCoach = teamPerson;
   }
   
   public TeamPerson getHeadCoach() {
      return headCoach;
   }
   
   public TeamPerson getAssistantCoach() {
      return assistantCoach;
   }
   
   public void print() {
      System.out.println("HEAD COACH: ");
      headCoach.print();
      System.out.println();
      
      System.out.println("ASSISTANT COACH: ");
      assistantCoach.print();
      System.out.println();
   }
}

SoccerTeamPrinter.java:
public class SoccerTeamPrinter {
   public static void main(String[] args) {
      SoccerTeam teamCalifornia = new SoccerTeam();
      TeamPerson headCoach = new TeamPerson();
      TeamPerson asstCoach = new TeamPerson();
      
      headCoach.setFullName("Mark Miwerds");
      headCoach.setAgeYears(42);
      teamCalifornia.setHeadCoach(headCoach);

      asstCoach.setFullName("Stanley Lee");
      asstCoach.setAgeYears(30);
      teamCalifornia.setAssistantCoach(asstCoach);

      teamCalifornia.print();
   }
}

// testbench， unit testing
// A testbench is a program whose job is to thoroughly test another program (or portion) via a series of input/output checks known as test cases. 
// Unit testing means to create and run a testbench for a specific item (or "unit") like a method or a class.
// good testbench include:
自动检查：自动比较值，例如 testData.GetNum1() != 100，只打印失败的结果，以提高简洁性。
独立测试用例：每个测试用例都独立，例如对 GetAverage() 的测试会赋予新的值，而不是依赖之前的值。
100% 代码覆盖率：确保每行代码都被执行，良好的测试平台应有比当前测试更多的测试用例。
包括边界案例：不仅测试典型值，还包括极端或不寻常的值，如 0、负数或大数，以确保全面验证代码的鲁棒性。
eg:
StatsInfo.java:
public class StatsInfo {

   // Note: This class intentionally has errors

   private int num1;
   private int num2;

   public void setNum1(int numVal) {
      num1 = numVal;
   }

   public void setNum2(int numVal) {
      num2 = numVal;
   }

   public int getNum1() {
      return num1;
   }

   public int getNum2() {
      return num1;
   }

   public int getAverage() {
      return num1 + num2 / 2;
   }
}

testbench: StatsInfoTest.java
public class StatsInfoTest {
   public static void main(String[] args) {
      StatsInfo testData = new StatsInfo();

      // Typical testbench tests more thoroughly

      System.out.println("Beginning tests.");

      // Check set/get num1
      testData.setNum1(100);
      if (testData.getNum1() != 100) {
         System.out.println("   FAILED set/get num1");
      }

      // Check set/get num2
      testData.setNum2(50);
      if (testData.getNum2() != 50) {
         System.out.println("   FAILED set/get num2");
      }

      // Check getAverage()
      testData.setNum1(10);
      testData.setNum2(20);
      if (testData.getAverage() != 15) {
         System.out.println("   FAILED GetAverage for 10, 20");
      }

      testData.setNum1(-10);
      testData.setNum2(0);
      if (testData.getAverage() != -5) {
         System.out.println("   FAILED GetAverage for -10, 0");
      }

      System.out.println("Tests complete.");
   }
}


// Regression testing
// 回归测试指的是在类或其他代码项修改后重新测试，以确保先前通过的测试用例仍然能够通过。如果之前通过的测试用例失败了，说明该代码项发生了“回归”。


// constructor overloading
构造方法重载：程序员可以通过定义多个参数类型不同的构造方法来支持不同的初始化方式。
匹配调用：使用 new 操作符创建对象时，传递的参数会匹配相应的构造方法。
显式定义默认构造方法：如果程序员定义了任何构造方法，编译器不会隐式定义默认构造方法。因此，最好显式定义一个无参默认构造方法，确保可以使用 new MyClass() 创建对象。
If the programmer doesn't define any constructors, the compiler implicitly defines a default constructor having no statements.
eg:
public class Pet {
   private String name;
   private int age;

   public Pet() {
      name = "Unnamed";
      age = -1;
   }

   public Pet(int yearsOld) {
      name = "NoName";
      age = yearsOld;
   }

   public Pet(String petName, int yearsOld) {
      name = petName;
      age = yearsOld;
   }

   public void print() {
      System.out.println(name + ", " + age);
   }
}

// class 的 reference理解
A statement like TimeHrMin travelTime; declares a reference to an object of type TimeHrMin. while String firstName; declares a reference to an object of type String. 
The reference variables do not store data for those class types. Instead, the programmer must assign each reference to an object, which can be created using the new operator.
The statement TimeHrMin travelTime; declares a reference variable with an unknown value. A common error is to attempt to use a reference variable that does not yet refer to a valid object.
The new operator allocates memory for an object, then returns a reference to the object's location in memory. 
Thus, travelTime = new TimeHrMin(); sets travelTime to refer to a new TimeHrMin object in memory. travelTime now refers to a valid object and the programmer may use travelTime to access the object's methods. The reference variable declaration and object creation may be combined into a single statement: TimeHrMin travelTime = new TimeHrMin();
eg:
FlightInfo flightPlan;           // Declare a reference variable named flightPlan that can refer to an object of type FlightInfo. Do not create a new object.
flightPlan = new FlightInfo();   // Write a statement that creates an object of FlightInfo and assigns the new object to the reference variable flightPlan.
Two or more reference variables may refer to the same object
eg:
RunnerInfo lastRun;
RunnerInfo currRun = new RunnerInfo();
// Assign reference to lastRun
lastRun = currRun;

// 隐式参数（Implicit Parameter）
隐式传递：调用对象的成员方法时，objectReference.method() 语法中的对象引用被隐式地作为参数传递给方法，等同于 method(objectReference, ...)。
this 关键字：在成员方法内部，隐式传递的对象引用可以通过 this 访问，表示当前对象。例如，this.classMember 访问类成员。
区分同名参数：当方法参数与类成员名称相同时，this 关键字用于区分，例如 this.sideLength 访问类字段，而 sideLength 代表参数。
eg:
class Square {
    private int sideLength;

    // 构造方法1
    public Square() {
        this(0);  // 调用另一个构造方法
    }

    // 构造方法2
    public Square(int sideLength) {
        this.sideLength = sideLength;  // 区分参数和成员变量
    }

    // 成员方法
    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;  // 使用 this 区分类成员和参数
    }

    public int getSideLength() {
        return this.sideLength;
    }
}
eg:
ShapeSquare.java:
public class ShapeSquare {
   // Private fields
   private double sideLength;

   // Public methods
   public void setSideLength(double sideLength) {
      this.sideLength = sideLength;
      // Field member    Parameter
   }

   public double getArea() {
      return sideLength * sideLength; // Both refer to field
   }
}

ShapeTest.java:
public class ShapeTest {
   public static void main(String[] args) {
      ShapeSquare square1 = new ShapeSquare();

      square1.setSideLength(1.2);
      System.out.println("Square's area: " + square1.getArea());
   }
}

// this() 默认构造方法
默认构造方法 中，程序员可以直接给字段赋值，比如 this.field = 0;。然而，使用 this(0, 0); 可以直接调用另一个带有两个参数的构造方法，这个构造方法负责初始化所有字段。通过这种方式，可以避免在每个构造方法中重复写相同的初始化代码
eg:
class Rectangle {
    private int length;
    private int width;

    // 默认构造方法，调用重载构造方法
    public Rectangle() {
        this(0, 0);  // 调用有参构造方法，将长和宽初始化为0
    }

    // 带参数的构造方法
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
}


// primitive type and reference type 原始类型和引用类型
基本类型(Primitive types): 直接存储数据值，例如 int、double、char, 例如: int numStudents = 20;，变量 numStudents 直接存储值 20。
引用类型(Reference types): 引用一个类的实例(对象 object), 而不是直接存储数据。例如: Integer maxPlayers = 10; maxPlayers 引用了 Integer 类的一个实例，该实例存储值 10。

// Wrapper classes 
包装类是 Java 提供的内置引用类型，用于增强基本类型
例如，Integer 是 int 的包装类
Wrapper class objects can be initialized in the same manner as variables of primitive types.
eg:
Integer gameScore = 81; // Ok recommand
Integer gameScore = new Integer(81);  // also Ok

作用:
1. 允许将基本类型作为对象使用。使得像 ArrayList 等只能存储对象的类可以处理基本类型的包装类。例如：ArrayList<Integer> 可以存储 Integer 对象，但不能存储 int 基本类型
eg: 
Integer maxPlayers = 10;  // 创建 Integer 对象
ArrayList<Integer> scores = new ArrayList<>();  // 使用 Integer 包装类创建 ArrayList
2. 提供类型转换:
a. 将基本类型与字符串之间相互转换的方法。
b. 支持不同进制转换（如十进制转二进制）
c. 提供了基本类型之间的转换（如 int 转 double）
----------------------------------------------
| Reference type | Associated primitive type |
|----------------|---------------------------|
| Character      | char                      |
| Integer        | int                       |
| Double         | double                    |
| Boolean        | boolean                   |
| Long           | long                      |
----------------------------------------------

A wrapper class object (as well as a String object) is immutable, meaning a programmer cannot change the object via methods or variable assignments after object creation.
When the result of an expression is assigned to an Integer reference variable, memory for a new Integer object with the computed value is allocated, and the reference (or address) of this new object is assigned to the reference variable.
A new memory allocation occurs every time a new value is assigned to an Integer variable, and the previous memory location to which the variable referred, remains unmodified.
不可变性：包装类对象（例如 Integer）是不可变的，意味着在对象创建后，无法通过方法或变量赋值来更改该对象。
新对象分配：当表达式结果赋值给 Integer 引用变量时，系统为带有计算值的 Integer 对象分配新的内存，并将该新对象的引用（地址）赋给变量。
重复分配：每次给 Integer 变量赋新值时，都会进行新的内存分配，之前的value内存位置不受影响，不会被修改(会被系统自动回收)。

// Limits on initialization values 初始化值的限制
数值范围：使用字面量进行初始化时，程序员必须确保字面量的值在合适的数值范围内，例如 int 的范围是 -2,147,483,648 到 2,147,483,647。
最大值与最小值：包装类（除了 Character 和 Boolean）声明了 MAX_VALUE 和 MIN_VALUE 静态字段，分别表示该类型可以表示的最大值和最小值。
访问方式：程序员可以通过类名加点操作符访问这些字段，例如 Integer.MIN_VALUE 返回 -2,147,483,648。


// 比较包装类对象 compare wrapper class object (equality and relational operators)
// 注意事项:
1. 避免使用 == 和 !=：对于包装类（如 Integer、Double、Boolean），使用 == 或 != 来比较两个引用变量会导致逻辑错误。== 比较的是两个引用是否指向同一个对象，而不是比较对象的内容。
2. 包装类与基本类型或常量的比较：在比较包装类对象与基本类型或常量时，可以使用 == 和 !=，这不会导致问题，因为自动拆箱会将包装类转换为基本类型进行比较。
3. 关系运算符：包装类对象可以使用 <、<=、> 和 >= 进行比较，但这些运算符通常不适用于其他引用类型(除了wrapper class的其他class)。
4. 使用 equals() 和 compareTo()：包装类对象之间的比较应使用 equals() 方法（用于相等比较）和 compareTo() 方法（用于排序比较）。虽然这些方法比关系运算符稍显繁琐，但它们更适合不想记忆运算符细节的程序员，并且避免了错误。
// 小表格总结: 
| Comparison                   | Description                                                      |
|-------------------------------|------------------------------------------------------------------|
| `objectVar == objectVar`       | DO NOT USE. Compares references to objects, not the value of the objects. |
| *(also applies to !=)*         |                                                                  |
| `objectVar == primitiveVar`    | OK. Compares value of object to value of primitive variable.      |
| *(also applies to !=)*         |                                                                  |
| `objectVar == 100`             | OK. Compares value of object to literal constant.                |
| *(also applies to !=)*         |                                                                  |
| `objectVar < objectVar`        | OK. Compares values of objects.                                  |
| *(also applies to <=, >, and >=)*|                                                               |
| `objectVar < primitiveVar`     | OK. Compares values of object to value of primitive.             |
| *(also applies to <=, >, and >=)*|                                                               |
| `objectVar < 100`              | OK. Compares values of object to literal constant.               |
| *(also applies to <=, >, and >=)*|                                                               |


// 比较包装类对象 compare wrapper class object (equals, compareTo)
使用 equals() 和 compareTo()：包装类对象可以使用 equals() 方法来检查对象是否相等，使用 compareTo() 方法进行大小比较。
适用于所有包装类：这些方法不仅适用于 Integer，也适用于其他包装类如 Double、Boolean、String 等。
方法的优点：虽然 equals() 和 compareTo() 的使用比关系运算符稍显繁琐，但它们提供了明确的比较规则，适合不想记忆具体运算符行为的程序员。
总结：相比直接使用 == 和 <，这些方法避免了包装类对象比较中的潜在错误，并且在对象比较中更加可靠。
eg:
Integer num1 = 10;
Integer num2 = 8;
Integer num3 = 10;
int regularInt = 20;
num1.equals(num2) // Evaluates to false
num1.equals(10)   // Evaluates to true
!(num2.equals(regularInt)) // Evaluates to true because 8 != 20
num1.compareTo(num2) // Returns value greater than 0, because 10 > 8 
num2.compareTo(8)    // Returns 0 because 8 == 8
num1.compareTo(regularInt)   // Returns value less than 0, because 10 < 20

// autoboxing, unboxing
是指Java在需要时自动地在基本数据类型（primitive types）和它们对应的包装类（Wrapper classes）之间进行转换的过程。以下是这两个概念的总结：
Java为每种基本数据类型提供了一个对应的包装类。例如：
int 对应 Integer
double 对应 Double
boolean 对应 Boolean
// autoboxing是指基本类型自动转换为其对应的包装类。例如：
int a = 10;
Integer b = a; // 自动装箱
// unboxing是指包装类对象自动转换为对应的基本类型。例如：
Integer a = 10;
int b = a; // 自动拆箱
// Java允许在表达式中混合使用基本类型和包装类，自动进行转换。例如：
Integer x = 5;
int y = 10;
int z = x + y; // x自动拆箱为int

// wrapper class object convert to primitive types (包装类转换成primitive) (其实不用intValue这种手动转换，直接用autoboxing/unboxing 也行, 例如： int pinScore = totalPins.intValue(); 也可以: int pinScore = totalPins; )
Given: 
Integer num1 = 14;
Double num2 = 6.7643;
Double num3 = 5.6e12;
// intValue()       Returns the value of the wrapper class object as a primitive int value, type casting if necessary.
num2.intValue() // Returns 6
// doubleValue()   Returns the value of the wrapper class object as a primitive double value, type casting if necessary.
num1.doubleValue() // Returns 14.0
// longValue()     Returns the value of the wrapper class object as a primitive long value, type casting if necessary.
num3.longValue() // Returns 5600000000000
// charValue()     similar function as above
// booleanValue()  similar function as above

// convert to and from String
// btw: what does static method to be called?  answer: To call a static method, the name of the class and a '.' must precede the static method name, as in  Integer.toString(16);.
eg:
Given: 
Integer num1 = 10;
Double num2 = 3.14;
String str1 = "32";
int regularInt = 20;
// toString() 
num1.toString() // Returns "10"
num2.toString() // Returns "3.14"
// Integer.toString(someInteger) and other similar type
Returns a String containing the decimal representation of the value of someInteger. someInteger may be an Integer object, a int variable, or an integer literal. This static method is also available for the other wrapper classes (e.g.,  Double.toString(someDouble)).
Integer.toString(num1)       // Returns "10"
Integer.toString(regularInt) // Returns "20"
Integer.toString(3)          // Returns "3"
// Integer.parseInt(someString) and other similar type
Parses someString and returns an int representing the value encoded by someString. This static method is also available for the other wrapper classes (e.g., Double.parseDouble(someString)), returning the corresponding primitive type.
Integer.parseInt(str1)    // Returns int value 32
Integer.parseInt("2001") // Returns int value 2001
// Integer.valueOf(someString) and other similar type
Parses someString and returns a new Integer object with the value encoded by someString. This static method is also available for the other wrapper classes (e.g., Double.valueOf(someString)), returning a new object of the corresponding type.
Integer.valueOf(str1)    // Returns Integer object with value 32
Integer.valueOf("2001") // Returns Integer object with value 2001
// Integer.toBinaryString(someInteger) and other similar type
Returns a String containing the binary representation of someInteger. someInteger may be an Integer object, a int variable, or an integer literal. This static method is also available for the Long classes (e.g.,  Long.toBinaryString(someLong)).
Integer.toBinaryString(num1)       // Returns "1010"
Integer.toBinaryString(regularInt) // Returns "10100"
Integer.toBinaryString(7)          // Return "111"

// 所以我总结下: 
// toString() 和 Integer.toString           1. 结果来说没有什么区别，只是实现方式的不同：toString() 是实例方法; Integer.toString()是静态方法
//                                          2. Integer.toString只接受int，或Integer类型(其他类double啥的啊，以此类推), 但是可以指定进制
// Integer.parseInt() 和 Integer.valueOf()  parseInt 返回 primitive 类型 int; valueOf 返回wrapper class Integer(其他类double啥的啊，以此类推)


// ArrayList
ArrayList 是 Java 提供的一个有序列表，能够存储引用类型的元素。
每个存储在 ArrayList 中的元素称为 元素（element）。
ArrayList 可以动态增长或缩小，适合在需要灵活处理元素数量的场景中使用。
ArrayList 只能存储 引用类型（如 Integer, String 等），而不能存储 基本类型（如 int, char）。
// import
import java.util.ArrayList;
// declare
ArrayList<Integer> vals = new ArrayList<Integer>(); // vals 是一个 ArrayList 的引用变量，引用一个包含 Integer 对象的 ArrayList 实例。
// common ArrayList methods:
// 1. add(element)      Create space for and add the element at the end of the list.
valsList.add(31); // List now: 31 
valsList.add(41); // List now: 31 41
// 2. get(index)
// List originally: 31 41 59. Assume x is an int. 
x = valsList.get(0);  // Assigns 31 to x
x = valsList.get(1);  // Assigns 41
x = valsList.get(2);  // Assigns 59
x = valsList.get(3);  // Error: No such element
// 3. set(index, element) 
// List originally: 31 41 59 
valsList.set(1, 119);  // List now 31 119 59
// 4. size()           
// List originally: 31 41 59. Assume x is an int. 
x = valsList.size();  // Assigns x with 3

// code example:
Review.java:
public class Review {
   private int rating = -1;
   private String comment = "NoComment";
   
   public void setRatingAndComment(int revRating, String revComment) {
      rating = revRating;
      comment = revComment;
   }
   public int getRating() { return rating; }
   public String getComment() { return comment; }
}

Reviews.java:
import java.util.ArrayList;
import java.util.Scanner;

public class Reviews {
   private ArrayList<Review> reviewList = new ArrayList<Review>();
   
   public void inputReviews(Scanner scnr) {
      Review currReview;
      int currRating;
      String currComment;
   
      currRating = scnr.nextInt();
      while (currRating >= 0) {
         currReview = new Review();
         currComment = scnr.nextLine(); // Gets rest of line
         currReview.setRatingAndComment(currRating, currComment);
         reviewList.add(currReview);
         currRating = scnr.nextInt();
      }
   }
   
   public void printCommentsForRating(int currRating) {
      Review currReview;
      int i;
   
      for (i = 0; i < reviewList.size(); ++i) {
         currReview = reviewList.get(i);
         if (currRating == currReview.getRating()) {
            System.out.println(currReview.getComment());
         }
      }
   }
   
   public int getAverageRating() {
      int ratingsSum;
      int i;
   
      ratingsSum = 0;
      for (i = 0; i < reviewList.size(); ++i) {
         ratingsSum += reviewList.get(i).getRating();
      }
      return (ratingsSum / reviewList.size());
   }
}

ReviewSystem.java:
import java.util.ArrayList;
import java.util.Scanner;

public class ReviewSystem {
 
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      Reviews allReviews = new Reviews();
      String currName;
      int currRating;
   
      System.out.println("Type rating + comments. To end: -1");
      allReviews.inputReviews(scnr);
   
      System.out.println("\nAverage rating: ");
      System.out.println(allReviews.getAverageRating());
   
      // Output all comments for given rating
      System.out.println("\nType rating. To end: -1");
      currRating = scnr.nextInt();
      while (currRating != -1) {
         allReviews.printCommentsForRating(currRating);
         currRating = scnr.nextInt();
      }
   }
}
//上述code如何借鉴:
// 职责分离与封装：
每个类应专注于完成一个明确的任务。Review 负责单个评价的表示，Reviews 负责管理多个评价，而 ReviewSystem 负责用户交互。你可以在开发中通过这种方法，使每个类更容易理解和维护。
封装字段（将类的字段声明为 private），并通过 get 和 set 方法来访问它们，这样可以保护类的内部数据。
// 高内聚、低耦合：
高内聚意味着类的职责明确、专注，使得修改某个类的实现不会影响其他类。低耦合意味着类之间的依赖尽量少，通过接口或方法调用来沟通，而不是依赖于内部细节。在设计类时，尽量减少类之间的紧密联系，使系统更加模块化和灵活。
// 聚合与组合：
Reviews 类使用 ArrayList 来管理多个 Review 对象，这是聚合的一种形式。组合和聚合是面向对象编程中的关键设计模式，通过这种模式可以灵活地将多个对象组合在一起。
// 可扩展性：
当你在设计类时，考虑未来可能会增加哪些功能。比如在 Reviews 类中，你可以轻松添加新的方法来排序评论或过滤评论，而不需要修改已有的方法。这种设计提高了系统的可扩展性。
// 用户交互与逻辑分离：
在 ReviewSystem 中，用户交互与逻辑处理分开。交互代码只在主类中，逻辑处理都封装在业务类中。这种分离使得你可以更轻松地修改用户交互部分（比如换成图形界面）而不需要更改底层的逻辑代码。

// another example code
public class CallProducts {
   public static void main(String[] args) {
      Products allProducts = new Products();

      allProducts.inputProducts();
      allProducts.printAfterDiscount(3);
   }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Products {
   private ArrayList<Product> productList;

   public Products() {
      productList = new ArrayList<Product>();
   }

   public void inputProducts() {
      Scanner scnr = new Scanner(System.in);
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

         System.out.println(productList.get(i).getName() + ": " + currDiscountPrice);
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

// Java Collections Framework
ArrayList：
适合频繁的访问操作，允许通过索引高效地获取元素。
插入和删除操作较慢，因为在插入或删除时可能需要移动大量元素。
LinkedList：
适合频繁的插入和删除操作，插入/删除的效率较高，因为只需调整指针。
访问操作相对较慢，尤其是需要访问中间元素时，必须遍历列表。
Set：
不允许存储重复元素。
常见的实现有 HashSet 和 TreeSet。HashSet 基于哈希表，存取速度快，但无序；TreeSet 按照自然顺序排序。
Queue：
一种先进先出（FIFO）的数据结构，适合队列操作。
常用的实现有 LinkedList 和 PriorityQueue。
Map：
存储键值对，允许通过键快速检索值。
常见的实现有 HashMap 和 TreeMap。HashMap 基于哈希表，存取速度快；TreeMap 基于红黑树，按键排序。
// 任务需求决定集合类型：程序员会根据任务的需求选择最适合的集合。
如果需要高效的元素随机访问，选择 ArrayList。
如果频繁需要插入或删除，选择 LinkedList。
如果需要存储唯一元素，选择 Set。
如果需要存储键值对，选择 Map。
如果需要队列操作，选择 Queue。


// Java Collection Framework (JCF)
JCF 定义了常见 ADT（抽象数据类型）的接口和类，这些称为集合（Collections）。
Collection 是一组通用对象的集合，称为元素。Java 中支持几种不同类型的集合，包括 List、Queue、Map 等。
每种集合类型都是一个接口，定义了程序员可以访问的方法。


// ArrayList common method
// 1. get()     // Returns element at specified index.
x = teamNums.get(3); // Assigns element 3's value 11 to x
// 2. set()     // Replaces element at specified index with newElement. Returns element previously at specified index.
teamNums.set(0, 25);     // Assigns 25 to element 0
x = teamNums.set(3, 88); // Assigns 88 to element 3. Assigns previous element's value of 11 to x.
// 3. size()    // Returns the number of elements in the ArrayList.
teamNums.size()
// 4. isEmpty() // Returns true if the ArrayList does not contain any elements. Otherwise, returns false.
teamNums.isEmpty()
// 5. clear()   // Removes all elements from the ArrayList.
teamNums.clear()
// 6. add()     // Adds newElement to the end of the ArrayList. ArrayList's size is increased by one.
                // Adds newElement to the ArrayList at the specified index. Elements at that specified index and higher are shifted over to make room. ArrayList's size is increased by one.
teamNums.add(77);   
teamNums.add(0, 23);
// 7. remove()  // boolean remove(T existingElement)                // Removes the first occurrence of an element which refers to the same object as existingElement. Elements from higher positions are shifted back to fill gap. ArrayList size is decreased by one. Return true if specified element was found and removed.
boolean result = list.remove("Banana");                             // 返回 true，移除了 "Banana"
System.out.println(result);                                         // 输出 true
                // T remove(int index)                              // Removes element at specified index. Elements from higher positions are shifted back to fill gap. ArrayList size is decreased by one. Returns reference to element removed from ArrayList.
String removedElement = list.remove(1);                             // 移除索引1处的 "Banana"
System.out.println(removedElement);                                 // 输出 "Banana"


// arrayList 易错点: 
// Given:  ArrayList<Integer> itemsList = new ArrayList<Integer>(); 
// After itemsList.set(0, 99), what is the ArrayList's size?
// The ArrayList has no elements yet, so trying to access element 0 yields an error.


// javadoc 工具和java类文档 (见 useful_example_code.java)
Javadoc 是一个工具，用来解析源代码及特别格式化的注释，并生成文档，称为 API 文档。API 文档用于描述类及类成员的编程接口（API，Application Programming Interface）。
Doc 注释 是多行注释，格式为 /** 开始，*/ 结束。
注释中包含 "标签" 部分（block tags），例如：
@author：指定类的作者。
@version：指定类的版本号。
@param：用于描述方法的参数。
@return：用于描述方法的返回值。
@see：用于引用其他方法或类，例如 @see ElapsedTime#getTimeMinutes()。

类、方法、字段的 Doc 注释：
类的注释：位于类定义之前，主要描述类的目的和功能。
方法的注释：描述方法参数、返回值及其功能。
字段的注释：没有常见的特定标签，但可以使用通用标签如 @see。

API 文档的范围：
Javadoc 默认只生成公共成员的文档，不包括私有成员，因为 API 文档是为外部应用程序提供的接口说明。
私有成员（private）是类的内部实现，不会被外部类访问，因而通常不包含在 API 文档中。
如果需要生成包含私有成员的文档，可以使用 -private 标志，如 javadoc -private -d destination class1.java class2.java。
| Block tag  | Compatibility          | Description                                               |
|------------|------------------------|-----------------------------------------------------------|
| @author    | classes                | Used to specify an author.                                |
| @version   | classes                | Used to specify a version number.                         |
| @param     | methods, constructors  | Used to describe a parameter.                             |
| @return    | methods                | Used to describe the value or object returned by the method.|
| @see       | all                    | Used to refer reader to relevant websites or class members.|


// 易错点 String, Integer 等的不可变性 immutable(所以作为parameter passing into method之后，无法对这个object改变; 但是数组是可以的，是mutable，虽然数组的引用本身在方法中不可修改（即不能让原始数组引用指向一个新的数组），但数组的内容是可以修改的)
public class StringExample {
    
    public static void modifyString(String str) {
        System.out.println("Inside method, before modification: " + str);
        str = "New String"; // Creates a new String object, doesn't change the original
        System.out.println("Inside method, after modification: " + str);
    }

    public static void main(String[] args) {
        String originalStr = "Original String";
        System.out.println("Before method call: " + originalStr);
        
        modifyString(originalStr); // Passing originalStr by reference
        
        System.out.println("After method call: " + originalStr); // originalStr is unchanged
    }
}


// Static Fields（静态字段）
使用 static 关键字声明的字段是静态字段，表示该变量在程序执行期间只会在内存中分配一次。
静态变量位于程序的静态内存区域，具有全局作用域，因此可以从程序中的任何地方访问。
静态字段是属于类的，而不是属于类的每个对象。
静态字段独立于类的对象，可以不通过创建对象来访问。
静态字段在类定义中声明并初始化。
在类方法中，静态字段可以直接通过字段名访问。
// 静态字段的访问：
类内部：在类的方法中可以通过字段名直接访问静态字段。
类外部：通过类名和点符号的方式访问（ClassName.fieldName）。
// class variable (static fields) and instance variable(non static)
静态字段也称为类变量（class variables）。
非静态字段则称为实例变量（instance variables），每个对象有自己的一份副本。

// static method 静态成员方法
静态方法是独立的，属于类本身，而不是类的对象。
静态方法通常用于访问和修改私有静态字段，从而允许外部访问或操作类的静态数据。（其实非静态方法也可以更改, 区别就在于要不要通过创建实例来修改）
静态方法可以在不创建类对象的情况下调用。
由于静态方法独立于类对象，this 参数不传递给静态方法。
静态方法只能访问类的静态字段和静态方法，不能访问实例字段或实例方法。（实例方法可以通过创建对象来访问，例如在static main里）
A public static method can be used to access or mutate a private static field.
eg:
public class Example {
    public static int publicStaticVar = 100;
}

// 在其他类中可以直接访问
System.out.println(Example.publicStaticVar);  // 输出 100

public class Example {
    private static int privateStaticVar = 100;

    public static void printVar() {
        System.out.println(privateStaticVar);  // 只能在类内访问
    }
}

// 在其他类中无法访问
// System.out.println(Example.privateStaticVar);  // 编译错误，无法访问

eg: Static member method used to access a private static field.
Store.java:
public class Store {   
   // Declare and initialize private static field
   private static int nextId = 101;   

   // Define private fields 
   private String name;
   private String type;
   private int id;

   public Store(String storeName, String storeType) {
      name = storeName;
      type = storeType;
      id = nextId;

      ++nextId;   // Increment each time a Store object is created
   }

   public int getId() {
      return id;
   }
   
   public static int getNextId() {
      return nextId;
   }
}

NewStores.java:
public class NewStores {
   public static void main(String[] args) {
      Store store1 = new Store("Macy's", "Department");
      Store store2 = new Store("Albertsons", "Grocery");
      Store store3 = new Store("Ace", "Hardware");
    
      System.out.println("Store 1's ID: " + store1.getId());
      System.out.println("Store 2's ID: " + store2.getId());
      System.out.println("Store 3's ID: " + store3.getId());
      System.out.println("Next ID: " + Store.getNextId());
   }
}

public static int nextId = 30;：
nextId 是一个静态字段，属于类 FoodType，而不是特定的对象。
所有 FoodType 类的实例共享同一个 nextId 值，意味着对 nextId 的修改会影响所有的 FoodType 实例。
静态字段在内存中只分配一次，类的所有实例访问的都是同一个 nextId。
public int nextId = 30;：
nextId 变为实例字段，这意味着每个 FoodType 对象都有自己独立的 nextId 副本。
对一个实例的 nextId 的修改不会影响其他实例的 nextId。


// common java packages
| Package         | Sample package members              | Description                                                  |
|-----------------|-------------------------------------|--------------------------------------------------------------|
| `java.lang`     | `String`, `Integer`, `Double`, `Math` | Contains fundamental Java classes. Automatically imported by Java. |
| `java.util`     | `Collection`, `ArrayList`, `LinkedList`, `Scanner` | Contains the Java collections framework classes and miscellaneous utility classes. |
| `java.io`       | `File`, `InputStream`, `OutputStream` | Contains classes for system input and output.                |
| `javax.swing`    | `JFrame`, `JTextField`, `JButton`  | Contains classes for building graphical user interfaces.      |


// 使用包成员的方式 
1. 使用完全限定名（Fully Qualified Name）：
包含包名和类名，通过句点连接形成的名称。
示例：java.util.Scanner 是 java.util 包中 Scanner 类的完全限定名
java.util.Scanner scanner = new java.util.Scanner(System.in);

2. 使用导入语句（Import Statement）导入包成员：
通过导入语句可以将特定的包成员引入文件，允许直接使用该成员，而不必使用完全限定名。
示例：import java.util.Scanner; 导入 Scanner 类，使程序员可以直接使用 Scanner。
import java.util.Scanner;
Scanner scanner = new Scanner(System.in); // 直接使用 Scanner

3.使用导入语句导入整个包中的所有成员：
使用通配符 * 来导入包中的所有成员，允许直接使用包中的所有类。
示例：import java.util.*; 导入 java.util 包中的所有类，使程序员可以直接使用 Scanner 和 ArrayList 等。
import java.util.*;
Scanner scanner = new Scanner(System.in); // 直接使用 Scanner
ArrayList<String> list = new ArrayList<>(); // 直接使用 ArrayList

//Linked List：元素可以存储在任何内存位置，每个元素包含一个指向下一个元素的引用。
eg: A basic example to introduce linked lists.
IntNode.java:
public class IntNode {
   private int dataVal;         // Node data
   private IntNode nextNodeRef; // Reference to the next node

   public IntNode() {
      dataVal = 0;
      nextNodeRef = null;
   }

   // Constructor
   public IntNode(int dataInit) {
      this.dataVal = dataInit;
      this.nextNodeRef = null;
   }

   /* Insert node after this node.
    Before: this -- next
    After:  this -- node -- next
    */
   public void insertAfter(IntNode nodeLoc) {
      IntNode tmpNext;

      tmpNext = this.nextNodeRef;
      this.nextNodeRef = nodeLoc;
      nodeLoc.nextNodeRef = tmpNext;
   }

   // Get location of nextNodeRef
   public IntNode getNext() {
      return this.nextNodeRef;
   }

   public void printNodeData() {
      System.out.println(this.dataVal);
   }
}

CustomLinkedList.java:
public class CustomLinkedList {
   public static void main(String[] args) {
      IntNode headObj;  // Create IntNode reference variables
      IntNode nodeObj1;
      IntNode nodeObj2;
      IntNode nodeObj3;
      IntNode currObj;

      // Front of nodes list
      headObj = new IntNode(-1); 
      
      // Insert more nodes
      nodeObj1 = new IntNode(555);
      headObj.insertAfter(nodeObj1);

      nodeObj2 = new IntNode(999);
      nodeObj1.insertAfter(nodeObj2);

      nodeObj3 = new IntNode(777);
      nodeObj1.insertAfter(nodeObj3);

      // Print linked list
      currObj = headObj;
      while (currObj != null) {
         currObj.printNodeData();
         currObj = currObj.getNext();
      }
   }
}

eg: Managing many new items using just a few reference variables.
IntNode.java:
public class IntNode {
   private int dataVal;         // Node data
   private IntNode nextNodeRef; // Reference to the next node

   public IntNode() {
      dataVal = 0;
      nextNodeRef = null;
   }

   // Constructor
   public IntNode(int dataInit) {
      this.dataVal = dataInit;
      this.nextNodeRef = null;
   }

   /* Insert node after this node.
    Before: this -- next
    After:  this -- node -- next
    */
   public void insertAfter(IntNode nodeLoc) {
      IntNode tmpNext;

      tmpNext = this.nextNodeRef;
      this.nextNodeRef = nodeLoc;
      nodeLoc.nextNodeRef = tmpNext;
   }

   // Get location of nextNodeRef
   public IntNode getNext() {
      return this.nextNodeRef;
   }

   public void printNodeData() {
      System.out.println(this.dataVal);
   }
}

CustomLinkedList.java:
public class CustomLinkedList {
   public static void main(String[] args) {
      IntNode headObj; // Create IntNode reference variables
      IntNode currObj;
      IntNode lastObj;
      int i;           // Loop index
      
      headObj = new IntNode(-1); // Front of nodes list
      lastObj = headObj;
      
      for (i = 0; i < 20; ++i) { // Append 20 rand nums
         int rand = (int)(Math.random() * 100000); // random int (0-99999)
         currObj = new IntNode(rand);
         
         lastObj.insertAfter(currObj); // Append curr
         lastObj = currObj;
      }
      
      currObj = headObj; // Print the list
      while (currObj != null) {
         currObj.printNodeData();
         currObj = currObj.getNext();
      }
   }
}


// Java 程序的内存区域总结
在 Java 程序的内存使用中，通常包含以下四个不同的区域：
1. 代码区域 (Code)
存储程序指令和执行代码。
静态内存 (Static Memory)
2. 存储静态字段（static 变量），这些变量在程序运行期间只分配一次，生命周期贯穿程序的整个执行过程。
名称“静态”意味着这些变量的地址在运行期间保持不变。
3. 栈区域 (Stack)
存储方法的局部变量，局部变量在方法调用时分配，并在方法返回时自动释放。
这种内存分配和释放的方式类似于“堆栈”，因此称为栈。因为它是自动管理的，所以也被称为自动内存。
4. 堆区域 (Heap)
使用 new 操作符为对象分配内存。
此区域也称为自由存储区，用于动态分配的对象。


// 基本垃圾回收（Garbage Collection）
1. 内存有限性：
程序可用的内存是有限的，堆中分配的对象在不再需要时必须被释放。
2. 垃圾回收机制：
Java 使用垃圾回收机制自动管理内存，定期查找所有不可达（即未使用）已分配的内存位置，并自动释放这些内存，以便实现内存重用。
3. 程序员的幻觉：
垃圾回收机制使程序员感觉几乎拥有无限的内存供应，但这会带来运行时开销。
4. 引用计数：
Java 虚拟机（JVM）通过维护一个称为引用计数的机制来跟踪程序当前使用的对象。
引用计数是指向对象的引用变量的数量。如果某个对象的引用计数为零，说明没有变量指向该对象，此时该对象被视为不可达对象，并有资格进行垃圾回收。
5. 垃圾回收过程：
JVM 标记不可达对象，并在下次调用垃圾回收器时进行内存回收。


//垃圾回收与变量作用域总结
1. 变量作用域与垃圾回收：
程序员不需要显式地将引用变量设置为 null 来表明变量不再引用某个对象。**Java 虚拟机（JVM）**可以通过变量超出作用域（不再可见）自动推断为 null 引用。
当局部变量超出作用域（例如方法返回时），JVM 会自动减少与该变量引用的对象相关的引用计数。
2. 方法中局部变量的回收：
当方法内声明的局部引用变量（如 binaryStr）超出作用域时，JVM 会减少该引用变量所引用对象的引用计数。如果引用计数为零，JVM 会将该对象标记为可回收对象。
对象在垃圾回收器下次运行时会被回收。
3. main 方法的情况：
main() 也是一个方法，当 main() 返回时，所有在 main() 中声明的局部变量也会超出作用域，JVM 将减少与这些变量相关的对象的引用计数。


// 输出流和输入流
// PrintStream 和 System.out
PrintStream类提供了几种将数据写入输出的方法。在内部， PrintStream通常将数据放入临时存储内存区域（称为缓冲区），然后系统在不同时间输出缓冲区。
System.out是一个预定义的 PrintStream 对象，它与系统的标准输出（通常是计算机屏幕）相关联。System 类的out变量在 System 类中声明为PrintStream out;。请注意，由于 System 类是预定义的，因此程序员无需导入 System 类即可使用 System.out。
// InputStream、System.in 和 throws 子句
InputStream类提供了几种 read() 方法，用于从输入源提取数据字节。
System.in是一个预定义的 InputStream 对象，它与系统的标准输入（通常是键盘）相关联。System.in 输入流会自动从操作系统用输入数据填充的缓冲区中读取标准输入。
使用 InputStream 时，程序员必须将子句附加throws IOException到 main() 的定义中，throws子句表示在运行时，相应的方法可能由于异常而意外退出。
import java.io.IOException;

public class InputStreamReader {
  public static void main (String[] args)
  throws IOException {
     int usrInput;    // input value: Amy\n

     // Read 1st byte
     usrInput = System.in.read();
     // Read 2nd byte
     usrInput = System.in.read();
     // Read 3rd byte
     usrInput = System.in.read();
     // Read 4th byte
     usrInput = System.in.read();
     // Read 5th byte (empty buffer)
     usrInput = System.in.read();
  }
}
调用 System.in.read() 会导致操作系统读取标准输入并用输入数据填充缓冲区。当用户按下 Enter 键时，缓冲区会被填满，同时还会向缓冲区添加一个换行符。
read() 方法从操作系统的缓冲区读取第一个可用的 8 位 ASCII 值。
当缓冲区为空时，System.in.read() 会等待更多键盘输入。用户输入“more”并按下回车键，缓冲区将充满更多数据。
System.in.read() 返回缓冲区中的第一个字节。main() 方法完成时数据仍在缓冲区中。

// 扫描器 Scanner
程序员经常需要从 InputStream 中提取整数或字符串。程序通常使用 Scanner 类来增强 System.in，而不是直接从 System.in 读取字节，该类通过自动扫描字节序列并将其转换为所需的数据类型来增强 System.in。要初始化 Scanner 对象，程序员可以将 InputStream（例如 System.in）作为参数传递给构造函数。例如：Scanner scnr = new Scanner(System.in);


// output formatting
printf() 和 format() 都是 System.out 提供的用于输出格式化的方法
printf() 的第一个参数是格式字符串，它指定了要输出的文本格式，并包含若干个用于打印值的占位符。
占位符是用来指定将要输出的值的类型，通常称为格式说明符。
| Format specifier | Data type(s)            | Notes                                                  |
|------------------|-------------------------|--------------------------------------------------------|
| %c               | char                    | Prints a single Unicode character                      |
| %d               | int, long, short         | Prints a decimal integer value.                        |
| %o               | int, long, short         | Prints an octal integer value.                         |
| %h               | int, char, long, short   | Prints a hexadecimal integer value.                    |
| %f               | float, double            | Prints a floating-point value.                         |
| %e               | float, double            | Prints a floating-point value in scientific notation.  |
| %s               | String                   | Prints the characters in a String variable or literal. |
| %%               |                         | Prints the "%" character.                              |
| %n               |                         | Prints the platform-specific new-line character.       |

// 子说明符 subspecifier
控制输出的精度、宽度、以及其他格式化选项。例如：
%(flags)(width)(.precision)specifier
ploating point 浮点数是最经常用到 subspecifier的
flags：可选，用于控制对齐、填充等格式。
width：可选，指定最小的输出宽度。
.precision：可选，用于指定小数点后的位数（精度）。
specifier：必须，指定数据类型（如 %f 表示浮点数）。

//浮点数格式：
宽度width: 如果格式化的值包含的字符多于宽度，则不会截断该值。如果格式化的值包含的字符少于宽度，则输出将用空格填充（如果指定了“0”标志，则用 0 填充）
精度precision: 指定小数点后要打印的位数。如果未指定精度，则使用默认精度 6。
flag: -：根据指定的宽度左对齐输出，并用空格填充输出。
      +：为正值打印前加“+”号。负数始终打印“-”号。
      0: 当格式化值的字符数少于宽度时，用 0 填充输出。
      space: 为正值打印前加空格。
eg:
float myFloat = 12.34f;
System.out.printf("Value: %7.2f", myFloat);  // Value:   12.34 // 格式说明符 %7.2f 指定最小宽度为 7，保留 2 位小数。如果数字的长度小于 7，默认情况下会在左侧用空格填充。 // 因为flag没有 - ，所以是右对齐，补的空格在左边.

float myFloat = 123456.78f;
System.out.printf("Value: %7.2f", myFloat);  // Value: 123456.78   //虽然指定了最小宽度为 7，但由于数字 123456.78 本身占用了 9 个字符（包括小数点），因此不会被截断。

float myFloat = 12.34f;
System.out.printf("Value: %07.2f", myFloat); // Value: 0012.34     // %07.2f 指定了最小宽度为 7，并且使用 0 进行填充，而不是空格。

float myFloat = 12.34f;
System.out.printf("%.4f", myFloat);               // 12.3400
System.out.printf("%3.4e", myFloat);              // 1.2340e+01
System.out.printf("%.f", myFloat);                // 12
System.out.printf("%f", myFloat);                 // 12.340000
System.out.printf("%+f", myFloat);                // +12.340000
System.out.printf("%08.2f", myFloat);             // 00012.34
System.out.printf("%-10.2f\n", myFloat);          // 12.34      // 12.34 左对齐，后面用空格补充至宽度 10。
System.out.printf("%010.2f\n", myFloat);          // 0000012.34
System.out.printf("% 10.2f\n", myFloat);          //      12.34 //     

// 整数格式:
width: 指定要打印的最小字符数。如果格式化的值包含的字符多于宽度，则不会截断该值。如果格式化的值包含的字符少于宽度，则输出将用空格填充（如果指定了“0”标志，则用 0 填充）。
flags: -：根据指定的宽度左对齐输出，并用空格填充输出。
       +：为正值打印前面的 + 号。负数始终打印 - 号
       0: 当格式化值的字符数少于宽度时，用 0 填充输出。
       space: 为正值打印前面的空格。
eg: 
myInt = 301;
System.out.printf("Value: %7d", myInt);               // Value:     301
System.out.printf("%+d", myInt);                      // +301
System.out.printf("%08d", myInt);                     // 00000301
System.out.printf("%+08d", myInt);                    // +0000301

int myInt = -713;
System.out.printf("%+04d", myInt);                    // -713       myInt is a negative value, so the + sign is not printed. A - sign is printed for all negative values.
System.out.printf("%+02d", myInt);                    // -713       

// String格式:
width: 指定要打印的最小字符数。如果字符串的字符数超过宽度，则不会截断该值。如果格式化的值的字符数少于宽度，则输出将用空格填充。
precision: 指定要打印的最大字符数。如果字符串的字符数超过精度，则字符串将被截断。
flag:  -：根据指定的宽度将输出左对齐，并用空格填充输出。
eg:
myString = "Formatting";
System.out.printf("%20s String", myString);  //           Formatting String
System.out.printf("%.6s", myString);         // Format


// flushing output 
// 输出缓冲机制:
输出字符通常先被存储在一个缓冲区中，然后再写入输出设备（如屏幕）。因为将字符从缓冲区移动到输出设备需要占用大量处理器资源，系统会等到缓冲区满了或累积到一定数量的字符后，再将这些字符写入输出设备。
缓冲区可以提高效率，因为移动较多字符（如 50 个字符）所花费的资源和移动少量字符（如 1 个字符）的资源是相近的。
// 延迟输出的原因:
如果缓冲区中的字符较少，或者系统资源繁忙，系统可能会等待更合适的时机再将缓冲区中的字符输出。
在某些处理器密集型程序中，等待可能导致延迟或输出不流畅（如抖动）。
// flush()
flush() 方法强制将缓冲区中的内容立即写入输出设备，避免延迟。示例：System.out.flush(); 立即将 System.out 的缓冲区内容写到屏幕上。
println() 方法或输出换行符通常会自动触发缓冲区的flush。


// input string stream
通过将 Scanner 对象与字符串关联，程序员可以从字符串而不是键盘（标准输入）读取数据。从字符串初始化的 Scanner 对象通常称为 input string stream
eg:
Scanner inSS = new Scanner(userInfo);
该语句使用字符串 userInfo 的副本创建一个新的 Scanner 对象。然后，程序可以使用 next()、nextInt()、nextDouble() 等方法从 Scanner inSS 流中提取数据。

// Line-by-Line Input Processing
逐行处理输入是字符串流的常见用途，程序可以逐行读取用户输入并进行处理。
scnr.nextLine() 用于从标准输入中读取一行数据，并将其存储到一个字符串变量中，
inSS = new Scanner(lineString); 创建一个基于字符串 lineString 的 Scanner 对象（即输入字符串流）。
一旦 Scanner 对象关联到输入字符串流，程序可以使用 next() 方法逐个提取单词，使用 nextInt() 方法提取整数，等等
eg: Using a string stream to process a line of input text.
import java.util.Scanner;

public class ProcessInputText {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); // Input stream for standard input
      Scanner inSS = null;                   // Input string stream
      String lineString;                     // Holds line of text
      String firstName;                      // First name
      String lastName;                       // Last name
      int userAge;                           // Age
      boolean inputDone;                     // Flag to indicate next iteration

      inputDone = false;

      // Prompt user for input
      System.out.println("Enter \"firstname lastname age\" on each line");
      System.out.println("(\"Exit\" as firstname exits).\n");

      // Grab data as long as "Exit" is not entered
      while (!inputDone) {

         // Entire line into lineString
         lineString = scnr.nextLine();

         // Create new input string stream
         inSS = new Scanner(lineString);

         // Now process the line
         firstName = inSS.next();

         // Output parsed values
         if (firstName.equals("Exit")) {
            System.out.println("   Exiting.");

            inputDone = true;
         }
         else {
            lastName = inSS.next();
            userAge = inSS.nextInt();

            System.out.println("   First name: " + firstName);
            System.out.println("   Last name: " + lastName);
            System.out.println("   Age: " + userAge);
            System.out.println();
         }
      }
   }
}


// Output string stream 
是一种可以写入String而不是standard output, Output string stream允许程序员在输出到文件或屏幕之前构建和格式化字符串
Output string stream 是使用 StringWriter 和 PrintWriter 类创建的：
import java.io.StringWriter; 
import java.io.PrintWriter;
StringWriter 类提供String stream来输出字符，
PrintWriter 增强了String stream的功能，提供了 print() 和 println() 方法来输出不同的数据类型（如 int、double 和 String），类似于 System.out。
Output string stream 通常用于在输出到文件或屏幕之前构建和格式化字符串，这样可以灵活地处理输出内容。
eg:
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.StringWriter;

public class StringOutputStream {
  public static void main(String[] args) {
     Scanner scnr = new Scanner(System.in);

     // Basic character stream for age
     StringWriter ageStream = new StringWriter();
     // Augments character stream with print()
     PrintWriter ageOSS = new PrintWriter(ageStream);

     int userAge;           // Age (int)

     // Gets user's age from input
     userAge = scnr.nextInt();

     // Writes userAge as characters to
     // output string stream buffer (PrintWriter)
     ageOSS.print(userAge);

     // Appends " (minor)" to stream buffer
     // if the user's age is less than 21
     if (userAge < 21) {
        ageOSS.print(" (minor)");
     }

     // Copies the stream's buffer to a String
     // and outputs string to the screen
     System.out.println("User's age: " + ageStream.toString());
  }
}


// File input
有时程序需要从文件获取输入，而不是从键盘输入。要读取文件输入，程序员可以创建一个来自文件的输入流，类似于从标准输入（System.in）获取输入。
通过文件输入流，可以像使用 Scanner 和 System.in 那样从文件读取数据
语句 fileByteStream = new FileInputStream(str); 创建了一个文件输入流，并打开由 str 变量表示的文件进行读取。str 是表示文件路径或文件名的字符串。
也可以通过直接传递字符串字面值来指定文件名: fileByteStream = new FileInputStream("numFile.txt");
eg:
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadNums {
   public static void main (String[] args) throws IOException {
      FileInputStream fileByteStream = null; // File input stream
      Scanner inFS = null;                   // Scanner object
      int fileNum1;                       // Data value from file
      int fileNum2;                       // Data value from file

      // Try to open file
      System.out.println("Opening file numFile.txt.");
      fileByteStream = new FileInputStream("numFile.txt");
      inFS = new Scanner(fileByteStream);
      
      // File is open and valid if we got this far 
      // (otherwise exception thrown)
      // numFile.txt should contain two integers, else problems
      System.out.println("Reading two integers.");
      fileNum1 = inFS.nextInt();
      fileNum2 = inFS.nextInt();

      // Output values read from file
      System.out.println("num1: " + fileNum1);
      System.out.println("num2: " + fileNum2);
      System.out.println("num1+num2: " + (fileNum1 + fileNum2));

      // Done with file, so try to close it
      System.out.println("Closing file numFile.txt.");
      // close() may throw IOException if fails
      fileByteStream.close(); 
   }
}


//Reading Until the End of the File
程序可以通过循环读取文件，直到文件中没有有效数据可供读取，或者达到了文件的末尾。
hasNextInt() 方法用于检查文件中是否有下一个可供读取的整数。如果有整数可读取，返回 true。
如果下一个数据项不是整数，或者流操作已经到达文件末尾，则返回 false。
Scanner 类提供了多个 hasNext() 方法，用于不同的数据类型，例如 hasNextInt()（整数）、hasNextDouble()（双精度数）、hasNextLine()（字符串）。
这些方法可以帮助程序在读取不同类型的数据时检查文件的有效性，并防止读取超出文件末尾。
在处理文件时，程序员常常会使用 while 循环，结合 hasNext() 方法来逐个读取文件中的数据，直到文件末尾。
// eg: Counting instances of a specific word
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class CountingWords {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      FileInputStream fileByteStream = null; // File input stream
      Scanner inFS = null;                   // Scanner object
      String userWord;
      int wordFreq = 0;
      String currWord;

      // Try to open file
      System.out.println("Opening file wordFile.txt.");
      fileByteStream = new FileInputStream("wordFile.txt");
      inFS = new Scanner(fileByteStream);

      // Word to be found
      System.out.print("Enter a word: ");
      userWord = scnr.next();

      while (inFS.hasNext()) {
         currWord = inFS.next();
         if(currWord.equals(userWord)) {
            ++wordFreq;
         }
      }

      System.out.println(userWord + " appears in the file " +
                         wordFreq + " times.");

      // Done with file, so try to close it
      fileByteStream.close(); // close() may throw IOException if fails
   }
}

// 需要 IOException 的原因：
I/O 操作的不可预测性：
读取文件、写入文件、网络通信等操作涉及硬件或外部设备，这些操作是不可预测的，可能会出现设备未响应、文件损坏或不存在等情况。
例如：
试图读取不存在的文件。
试图从无法访问的网络资源读取数据。
磁盘读取错误。
程序员必须显式地捕获并处理 IOException，或者在方法签名中声明 throws IOException。
eg:
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        FileInputStream fileByteStream = null;
        try {
            fileByteStream = new FileInputStream("numFile.txt");
            // 执行文件读取操作
        } catch (IOException e) {
            // 捕获并处理IOException
            System.out.println("I/O error occurred: " + e.getMessage());
        } finally {
            // 关闭文件流，确保资源释放
            if (fileByteStream != null) {
                try {
                    fileByteStream.close();
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }
}


// file output
FileOutputStream 是一个用于向文件写入数据的类，继承自 OutputStream。
FileOutputStream 仅包含用于写入字节的方法。因此，无法直接使用它来写入字符串或其他常见的数据类型。
为了写入字符串和其他常见的数据类型，通常会使用 PrintWriter 类。
PrintWriter 包含 print() 和 println() 方法，这些方法支持写入字符串和其他数据类型。
| Action                                      | Sample code                                                 |
|---------------------------------------------|--------------------------------------------------------------|
| Open the file `helloWorld.txt` for writing  | `FileOutputStream fileStream = new FileOutputStream("helloWorld.txt");` |
| Create a PrintWriter to write to the file   | `PrintWriter outFS = new PrintWriter(fileStream);`           |
| Write the string "Hello World!" to the file | `outFS.println("Hello World!");`                             |
| Close the file after writing all desired data | `outFS.close();` 
                                          |
eg: write HTML
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class HTMLFileWriteSample {
  static void writeHTMLFile(PrintWriter printer, String innerHTML) {
     printer.println("<!DOCTYPE html>");
     printer.println("<html>");
     printer.println("  <body>");
     printer.println("    <p>" + innerHTML + "</p>");
     printer.println("  </body>");
     printer.println("</html>");
  }
  public static void main(String[] args) throws IOException {
     // Open an output file stream and create a PrintWriter
     FileOutputStream fileStream = new FileOutputStream("simple.html");
     PrintWriter filePrinter = new PrintWriter(fileStream);
  
     // Write the HTML file, then close filePrinter
     writeHTMLFile(filePrinter, "Hello <b>HTML</b> world!");
     filePrinter.close();

     // Use the same function, writeHTMLFile, to write to the console
     PrintWriter systemOutPrinter = new PrintWriter(System.out);
     writeHTMLFile(systemOutPrinter, "Hello <b>HTML</b> world!");     
     systemOutPrinter.close();
  }
}


// Derived Classes 和 Inheritance 
// Derived Class 概念：
有时一个类和另一个类相似，但有一些额外的功能或变化。比如，一个商店库存系统可能有一个通用的 GenericItem 类，它包含 itemName 和 itemQuantity 成员；但对于生鲜产品，可能还需要 ProduceItem 类，它除了前两个数据成员外，还有 expirationDate 数据成员。
// Inheritance（继承）：
Derived Class（派生类）（或称为子类）是从另一个类（称为 Base Class 或基类/超类）派生的类。
派生类继承了基类的属性，这一概念称为继承（inheritance）。
派生类的对象可以访问all the members of the derived class，as well as the public and protected members of the base class (private member访问不了)
// 派生类是通过在类名后使用 extends 关键字来声明的，格式如下
class DerivedClass extends BaseClass { ... }
// 使用 extends 关键字来声明派生类，这使得代码更具重用性和可扩展性，同时保护base class 的private member
eg: Class ProduceItem is derived from class GenericItem.
GenericItem.java:
public class GenericItem {
   private String itemName;
   private int itemQuantity;

   public void setName(String newName) {
      itemName = newName;
   }

   public void setQuantity(int newQty) {
      itemQuantity = newQty;
   }

   public void printItem() {
      System.out.println(itemName + " " + itemQuantity);
   }
}

ProduceItem.java:
public class ProduceItem extends GenericItem { 
   private String expirationDate;

   public void setExpiration(String newDate) {
      expirationDate = newDate;
   }

   public String getExpiration() {
      return expirationDate;
   }  
}

//Inheritance Scenarios
1. derived class 可以作为另一个类的base class。
2. 一个base class可以有多个derived class
3. 一个类只能直接继承一个base class


//Access by Members of Derived Classes
不能访问基类的私有成员。这样确保了私有成员的封装性，即使派生类也无法直接访问基类的私有成员。
除了 public 和 private，还有第三种access specifier：protected
protected 成员 可以被派生类和同一个包（package）中的所有类访问，但其他类无法访问。
这意味着派生类可以访问基类的 protected 成员，而包中的其他类也可以访问这些成员，但包外的类不能访问。

public：任何类都可以访问。
protected：派生类和同一包中的类可以访问，其他类不能访问。
private：只有定义该成员的类可以访问，派生类和其他类都无法访问。
no specifier: 只有定义该成员的类, 和同一包中的类可以访问
| Specifier     | Description                                                                 |
|---------------|-----------------------------------------------------------------------------|
| private       | Accessible by self.                                                         |
| protected     | Accessible by self, derived classes, and other classes in the same package. |
| public        | Accessible by self, derived classes, and everyone else.                     |
| no specifier  | Accessible by self and other classes in the same package.                   |

eg:
Business.java:
public class Business{
   protected String name;    // Member accessible by self and derived classes
   private String address;   // Member accessible only by self

   public void printMembers() { // Member accessible by anyone
      // Print information ...
   }
   
}

Restaurant.java:
public class Restaurant extends Business{
   private int rating; 

   public void displayRestaurant() {
      // Attempted accesses
      printMembers();             // OK
      name = "Gyro Hero";         // OK    ("protected" above made this possible)
      address = "5 Fifth St";    // ERROR
   }

   // Other class members ...
}

InheritanceAccessEx.java
public class InheritanceAccessEx {
   public static void main(String[] args) {
      Business business = new Business();
      Restaurant restaurant = new Restaurant();
    
      // Attempted accesses
      business.printMembers();          // OK
      business.name = "Gyro Hero";      // OK (protected also applies to other classes in the same package)
      business.address = "5 Fifth St";  // ERROR
      
      restaurant.printMembers();        // OK
      restaurant.name = "Gyro Hero";    // OK (protected also applies to other classes in the same package)
      restaurant.rating = 5; // ERROR
      
      // Other instructions ...
   }
}

// class definition
// Separately, the keyword "public" in a class definition like public class DerivedClass {...} specifies a class's visibility in other classes in the program:
public : A class can be used by every class in the program regardless of the package in which either is defined.
no specifier : A class can be used only in other classes within the same package, known as package-private.


// Overriding Member Methods
// 方法重写（Overriding）：
当派生类定义了一个与基类中具有相同名称和参数的方法时，称为**重写（overriding）**了基类的方法。
派生类的该方法将覆盖基类中的相同方法。
// @Override 注解：
@Override 是一个注解，用于标识某个方法重写了基类中的方法。
该注解是可选的，但推荐使用，因为它让编译器能够检测并验证基类中是否存在相同签名的方法。
如果派生类的方法的参数与基类方法不同，或者方法名称有误，使用 @Override 将导致编译器报错，从而帮助程序员及时发现错误。
// Business.java
public class Business {
   protected String name;
   protected String address;
   ... 

   public String getDescription() {
      return name + " -- " + address;
   }
}
// Restaurant.java
public class Restaurant extends Business {
   private int rating;
   ...
   
   @Override
   public String getDescription() {
      return name + " -- " + address +
         "\n  Rating: " + rating;
   }
}


// Overriding vs. Overloading 总结
// 1. Overriding（重写）：
重写 是指派生类中的方法与基类中的方法具有相同的名称、参数类型、参数个数和返回类型，用于覆盖基类中的方法。
// 重写的特点：
派生类的方法完全覆盖基类的同名方法。
使用 @Override 注解可以帮助确认方法是正确重写的。
目的是为了在派生类中提供基类方法的特定实现。
// 2. Overloading（重载）：
重载 是指同一个类中方法名称相同，但参数类型或参数个数不同的情况。
// 重载的特点：
方法的参数必须不同（参数类型或参数个数），可以有不同的返回类型。
方法同名但功能不同，用于处理不同的输入参数。
重载的方法不会隐藏基类中的同名方法。
// 3. 区别：
重写：派生类中方法必须与基类中的方法名称、参数和返回类型都相同，是为了提供新的实现。
重载：在同一个类中使用相同的方法名称，但参数类型或个数不同，方法功能不同。


// Calling a Base Class Method 
super 是一个引用变量，用于在派生类中调用基类（父类）的成员方法或构造函数。
super 的用途：
调用基类的构造函数：使用 super() 来调用基类的构造函数。
调用基类的成员方法：使用 super.methodName() 来调用被重写的基类方法。
// ps 一个用法是 假如 想在derived class 里方法里调用 base class 里的private fields， 就可以用super，从而就有权限来调用
eg: 
class Business {
    public String getDescription() {
        return "This is a business";
    }
}

class Restaurant extends Business {
    @Override
    public String getDescription() {
        return super.getDescription() + " and a restaurant.";
    }
}

