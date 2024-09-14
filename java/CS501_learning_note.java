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
replace()        // char 也能用 ！ 
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