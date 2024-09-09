for (i = 0; i < n; i++) {    // 执行 n + 1 次, 但是不用管, 主要看循环里的statement;
  stmt                       // 执行 n 次
}
// 所以最终时间复杂度为 O(n) 
// 1. **最高次项主导复杂度**：在分析算法的时间复杂度时，我们主要关注最高次项（例如，如果时间复杂度是 \(O(n^2 + n)\)，我们会忽略 \(n\) 项，而只关注 \(n^2\) 项）。因为当输入规模 \(n\) 变得非常大时，最高次项对运行时间的贡献远远超过其他项。
// 2. **忽略常数与低次项**：为了简化复杂度分析，我们通常会忽略常数系数和低次项，因为它们对大规模输入的影响相对较小。例如，时间复杂度为 \(O(2n^2 + 3n + 4)\) 的算法通常简化为 \(O(n^2)\)。
// 3. **反映算法性能**：最高次项反映了算法在处理大型输入时的性能表现。例如，线性时间复杂度 \(O(n)\) 的算法比二次时间复杂度 \(O(n^2)\) 的算法在处理大规模数据时要更有效率。

for (i = 0; i < n; i++) {      // 执行 n + 1 次
  for (j = 0; j < n; j++) {    // 执行 n(n + 1) 次
    stmt                       // 执行 n^2次
  }
}  
// 所以最终时间复杂度为 O(n^2)


for (i = 0; i < n; i++) {      
  for (j = 0; j < i; j++) {    
    stmt                       
  }
}  
你的理解有一些问题，但你的思路基本是正确的。我们来一起看看你的理解并纠正一些关键点。

### 你的理解
```cpp
for (i = 0; i < n; i++) {      // 外层循环执行 n 次
  for (j = 0; j < i; j++) {    // 内层循环执行 n - 1 次
    stmt                       // 执行的语句
  }
}
// 外层循环执行 `n` 次。
// 内层循环在每次外层循环迭代中分别执行 `0, 1, 2, ..., n-1` 次。
// `stmt` 的总执行次数是这些次数的总和，即 \(frac{n(n-1)}{2}\)。
// 最终时间复杂度是 O(n^2)。

p = 0;
for (i = 1; p <= n; i++) {
  p = p + i;
}

// #### 1. **变量的含义**
// - `p` 是一个累加变量。
// - `i` 从 `1` 开始，每次循环都会增加，并将当前的 `i` 加到 `p` 上。
// - 循环在 `p` 超过 `n` 时结束。

// #### 2. **循环的行为**
// - 每次迭代中，`p` 累加上当前的 `i` 值。
// - 因此，`p` 的值变化如下：
//   - 第一次迭代：`p = 1` （`p = 0 + 1`，`i = 1`）
//   - 第二次迭代：`p = 3` （`p = 1 + 2`，`i = 2`）
//   - 第三次迭代：`p = 6` （`p = 3 + 3`，`i = 3`）
//   - 依此类推。

// #### 3. **确定迭代次数**
// - 我们可以看到，`p` 的值在每次迭代中形成了一个**累加和**（即等差数列的和）：
//   \[
//   p = \frac{i \times (i + 1)}{2}
//   \]
// - 循环结束的条件是 `p > n`，也就是说：
//   \[
//   \frac{i \times (i + 1)}{2} > n
//   \]
// - 这是一个二次方程，我们可以通过近似方法来估计 `i` 的大小。为了简化分析，我们可以忽略低次项 `i`，所以：
//   \[
//   \frac{i^2}{2} \approx n
//   \]
//   \[
//   i^2 \approx 2n
//   \]
//   \[
//   i \approx \sqrt{2n}
//   \]

// #### 4. **时间复杂度的计算**
// - `i` 大致为 \(\sqrt{2n}\)，因此循环会执行大约 \(\sqrt{n}\) 次（因为常数 `2` 可以忽略）。
// - 所以，这段代码的时间复杂度是 \(O(\sqrt{n})\)。

// ### 总结
// - 这段代码的时间复杂度是 \(O(\sqrt{n})\)，因为循环的迭代次数取决于 `i` 的增长，而 `i` 的增长导致累加和 `p` 最终超过 `n`。


for (i = 1; i < n; i = i * 2) {
  stmt
}
// 时间复杂度为log2^n

for ( i = 1; i <= n; i++) {
  stmt
}
// 时间复杂度为n

for ( i = 0; i * i < n; i++) {
  stmt
}
// 时间复杂度为根号n

for (i = 0; i < n; i++) {
  stmt
}
for (j = 0; j < n; j++) {
  stmt
}
让我们分析这段代码的时间复杂度。

### 代码结构
```cpp
for (i = 0; i < n; i++) {
  stmt
}
for (j = 0; j < n; j++) {
  stmt
}
// 总的时间复杂度是这两个独立循环的时间复杂度之和，即：
//   O(n) + O(n) = O(2n)
// 在大多数时间复杂度分析中，我们忽略常数系数，所以最终的时间复杂度为：
//   O(n)

p = 0;
for (i = 1; i < n; i = i * 2) {
  p++;
}
for (j = 1; j < p; j = j * 2) {
  stmt;
}
我们可以通过逐步分析代码的两个循环来确定这段代码的时间复杂度。

### 代码分析

```cpp
p = 0;
for (i = 1; i < n; i = i * 2) {  // 第一个循环
  p++;
}
for (j = 1; j < p; j = j * 2) {  // 第二个循环
  stmt;
}
```

#### 第一个循环分析
```cpp
for (i = 1; i < n; i = i * 2) {
  p++;
}
```
- `i` 从 `1` 开始，每次迭代都乘以 `2`。这意味着 `i` 的值依次为 `1, 2, 4, 8, 16, ...`，直到 `i >= n` 时结束。
- 这个循环的每次迭代 `p` 的值增加 `1`。

我们要计算这个循环运行的次数。假设循环运行了 `k` 次，那么 `i` 的值将在第 `k` 次迭代时变为 `2^k`，并且循环结束条件是 `2^k >= n`。

所以我们有：
\[
2^k \geq n
\]

取对数得：
\[
k \geq \log_2{n}
\]

因此，这个循环执行了大约 \(\log_2{n}\) 次。此时 `p` 的值大约为 \(\log_2{n}\)，即 `p = \log_2{n}`。

#### 第二个循环分析
```cpp
for (j = 1; j < p; j = j * 2) {
  stmt;
}

#### 总的时间复杂度
第一个循环的时间复杂度是 O(log{n})。
第二个循环的时间复杂度是 O(log{log{n}})。

这两个循环是顺序执行的，因此总的时间复杂度为两者之和：
O(log{n}) + O(log{log{n}}) = O(log{n})
这段代码的时间复杂度最终是 \(O(\log{n})\)。第二个循环的复杂度虽然是 \(O(\log{\log{n}})\)，但与第一个循环的 \(O(\log{n})\) 相比，在大多数实际情况下是相对较小的，所以我们取最大的时间复杂度作为总的时间复杂度。


for (i = 0; i < n; i++) {
  for (j = 1; j < n; j = j * 2) {
    stmt;
  }
}

// 时间复杂度总结: 
for (i = 0; i < n; i++)             ----O(n)
for (i = 0; i < n; i = i + 2)       ----O(n)
for (i = n; i > 1; i--)             ----O(n)
for (i = 1; i < n; i = i * 2)       ----O(log2{n})
for (i = 1; i < n; i = i * 3)       ----O(log3{n})
for (i = n; i > 1; i = i / 2)       ----O(log2{n})

i = 1;
k = 1;
while (k < n) {
  stmt;
  k = k + 1;
  i++;
}
// 时间复杂度为 O(根号n)

while (m != n) {
  if (m > n) {
    m = m - n;
  } else {
    n = n - m;
  }
}
min O(1), max O(n)

if (n < 5) {
  stmt
} else {
  for (i = 0; i < n; i++) {
    stmt
  }
}
min O(1) max O(n)

// types of time functions
O(1)       ---- constant                 
O(logn)    ---- logrithemic               
O(n)       ---- linear            
O(n^2)     ---- Quadratic              
O(n^3)     ---- Cubic              
O(2^n)     ---- Exponential  

function 递增关系比较
1 < log{n} < 根号n < n < nlog{n} < n^2 < n^3 ... < 2^n < 3^n < n^n       

// best and worst and average case analysis
// 1. linear search 
   best case : search key element present at first index;
   best case time: B(n) = O(1)
   worst case: search ket element at last index;
   best case time: W(n) = O(n)
   average case: all possible case time / numbers of cases
   average case time:(n + 1)/ 2

// 2. binary search tree
   best case  --- search root element
   best case time  --- B(n) = 1
   worst case --- search for leaf element  // the worst case time depends on the height of the tree
   worst case time --- W(n) = logn   
                       min W(n) = logn  // when the tree is balanced and minimun height
                       max W(n) = n     // when the tree is not balanced and maximun height like a chain



// Divide and conquer:
1. 将大问题分解成小问题， 解决小问题。 将每个小问题的solution combine到一起，从而解决大问题。
2. 分解出的小问题, 这个问题的类型需要和大问题保持一致。 例如大问题是sort， 小问题也要是sort
3. 要有一个method 来combine solutions
4. 整个处理的方法往往是 recursive

// recurrance relation T(n) = T(n - 1) + 1
void Test(int n) {                  //  ---   T(n)
  if (n > 0) {
    printf("%d", n);                //  ---   1
    Test(n - 1);                    //  ---   T(n-1)
  }
}

T(n) = { 1                       n = 0
       { T(n-1) + 1              n > 0

T(n) = T(n - k) + k
assume  n - k = 0
n = k
T(n) = T(0) + n = 1 + n
theta(n)
所以是线性的复杂度

// recurrance relation T(n) = T(n - 1) + n
void Test(int n) {                  //  ---   T(n)
  if (n > 0) {                      //  ---   1
    for (i = 0; i < n; i++) {       //  ---   n + 1
        printf("%d", n);            //  ---   n 
    }
    Test(n - 1);                    //  ---   T(n-1)
  }
}
T(n) = T(n-1) + 2n + 2
round to 
T(n) = T(n-1) + n

T(n) = { 1                       n = 0
       { T(n-1) + n              n > 0

T(n) = n(n+1)/2
theta(n^2)
所以是平方的复杂度

// recurrance relation T(n) = T(n - 1) + logn
void Test(int n) {                  
  if (n > 0) {                      
    for (i = 0; i < n; i = i * 2) {       
        printf("%d", n);            //  ---   logn 
    }
    Test(n - 1);                    //  ---   T(n-1)
  }
}

T(n) = { 1                       n = 0
       { T(n-1) + logn           n > 0

O(nlogn)

// summary of recurrance relation complexity
T(n) = T(n-1) + 1           O(n)                       
T(n) = T(n-1) + n           O(n^2)                        
T(n) = T(n-1) + logn        O(nlogn)                          
T(n) = T(n-1) + n^2         O(n^3)                         
T(n) = T(n-2) + 1           O(n)                       
T(n) = T(n-100) + n         O(n^2)
T(n) = 2T(n-1) + 1          O(2^n)
T(n) = 3T(n-1) + 1          O(3^n) 
T(n) = 2T(n-1) + n          O(n2^n)
T(n) = 2T(n-2) + 1          O(2^(n/2))                  

T(n) = aT(n-b) + f(n)
if a < 1        O(f(n))
if a = 1        O(n*f(n))
if a > 1        O(f(n)*a^(n/b))



// 空链表 empty linked list
// 示意图
head -> null
// 空链表往往需要特殊处理 ： 1. 首次插入 2. 检查是否为空

// 非空单链表 non empty linked list
// 示意图
head -> [data1 | next] -> [data2 | next] -> [data3 | next] -> null






// 数组属性
1. 连续的内存地址， 相同的数据类型
2. 随机访问高效, 插入删除低效
3. 大小固定，需要预先声明。 原数组拷贝耗时
4. 相应的容器类支持动态扩容




// 链表属性 
1. 非连续内存地址
2. 随机访问为O(n), 插入和删除为O(1)
3. 节点储存消耗空间

// 链表代码编写
// C
// 单链表插入节点（非空链表）
new_node->next = p->next
p->next = new_node

// 单链表插入节点（空链表）
if (head == null) {
  head = new_node;
}

// 单链表删除节点(非最后一个节点)
p->next = p->next->next

// 单链表删除节点(最后一个节点)
if (head->next == null) {
  head = null;
}

// 代码练习: 在单链表末尾插入新节点
// C
#include <stdio.h>
#include <stdlib.h>

struct Node {
  int data;
  struct Node* next;
}

// python
class Node:
  def __init__(self, data):
    self.data = data
    self.next = None

def insert_at_end(head, value):
  new_node = Node(value) 

  if head is None:
    return new_node

  current = head
  while current.next:
    current = current.next
  
  current.next = new_code
  return head

def print_list(head):
  current = head 
  while current:
    print(current.data, end=" -> ")
    current = current.next
  print("None")

if __name__ == "__main__":
  head = None  // 初始化空链表

  // 插入节点
  head = insert_at_end(head, 1)
  head = insert_at_end(head, 2)
  head = insert_at_end(head, 3)

  print_list(head) // 输出 1 -> 2 -> 3 -> None

  head = insert_at_end(head, 4)
  print_list(head) // 输出 1 -> 2 -> 3 -> 4 -> None

// Java
// (BTW: java 构造函数: 构造函数：构造函数的名字必须与类名完全相同，而且不能有返回类型（甚至不能有void）。)
public class Node {
  int data;  // 数据域
  Node next; // 指针域， 指向下一个节点
  
  public Node(int data) {
    this.data = data;
    this.next = null;  // 初始时， 指向 null
  }

  @Override
  public String toString() {
    return "Node{" + "data=" + data + '}';
  }
}


public class LinkedList {
  public Node insertAtEnd(Node head, int value) {
    Node newNode = new Node(value);

    if (head == null) {
      return newNode;
    }

    Node current = head;
    while (current.next != null) {
      current = current.next;
    }

    current.next = newNode;
    return head;
  }

  public void printList(Node head) {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + " -> ");
      current = current.next;
    }
    System.out.println("null");
  }
}

public class Main {
  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    Node head = null;
    
    head = linkedList.insertAtEnd(head, 1);
    head = linkedList.insertAtEnd(head, 2);
    head = linkedList.insertAtEnd(head, 3);

    linkedList.printList(head);

    head = linkedList.insertAtEnd(head, 4);
    linkedList.printList(head);        
  }
}


// 栈 stack
后进者先出，先进者后出。 只允许在一段插入和删除数据。插入和删除的时间复杂度 均为 O(1)
分为 顺序栈 和 链式栈

// 顺序栈代码
// 基于数组实现的顺序栈
public class ArrayStack {
  private String[] items;  // 数组
  private int count;       // 栈中元素个数
  private int n;           //栈的大小

  // 初始化数组，申请一个大小为n的数组空间
  public ArrayStack(int n) {
    this.items = new String[n];
    this.n = n;
    this.count = 0;
  }

  // 入栈操作
  public boolean push(String item) {
    // 数组空间不够了，直接返回false，入栈失败。
    if (count == n) return false;
    // 将item放到下标为count的位置，并且count加一
    items[count] = item;
    ++count;
    return true;
  }
  
  // 出栈操作
  public String pop() {
    // 栈为空，则直接返回null
    if (count == 0) return null;
    // 返回下标为count-1的数组元素，并且栈中元素个数count减一
    String tmp = items[count-1];
    --count;
    return tmp;
  }
}


public class Main {
    public static void main(String[] args) {
        // 创建一个栈，容量为 5
        ArrayStack stack = new ArrayStack(5);

        // 测试入栈操作
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");

        // 打印栈中的所有元素
        System.out.println("栈中的元素：");
        stack.printStack();  // 输出栈的内容

        // 测试出栈操作
        System.out.println("出栈元素：" + stack.pop());  // E
        System.out.println("出栈元素：" + stack.pop());  // D

        // 打印栈中的所有元素
        System.out.println("栈中的元素：");
        stack.printStack();  // 输出栈的内容

        // 尝试再次入栈
        if (!stack.push("F")) {
            System.out.println("栈满，无法入栈");
        }

        // 打印栈中的所有元素
        System.out.println("栈中的元素：");
        stack.printStack();  // 输出栈的内容
    }
}


// 队列 queue
先进先出。队尾插入元素，队头删除元素
// 顺序队列 和 链式队列
// eg 顺序队列代码
// 用数组实现的队列
public class ArrayQueue {
  // 数组：items，数组大小：n
  private String[] items;
  private int n = 0;
  // head表示队头下标，tail表示队尾下标
  private int head = 0;
  private int tail = 0;

  // 申请一个大小为capacity的数组
  public ArrayQueue(int capacity) {
    items = new String[capacity];
    n = capacity;
  }

  // 入队
  public boolean enqueue(String item) {
    // 如果tail == n 表示队列已经满了
    if (tail == n) return false;
    items[tail] = item;
    ++tail;
    return true;
  }

  // 出队
  public String dequeue() {
    // 如果head == tail 表示队列为空
    if (head == tail) return null;
    // 为了让其他语言的同学看的更加明确，把--操作放到单独一行来写了
    String ret = items[head];
    ++head;
    return ret;
  }
}
// 循环队列


// 递归
// 递归的前提条件
1. 一个问题的解可以分解为几个子问题的解
2. 这个问题与分解之后的子问题，除了数据规模不同，求解思路完全一样
3. 存在递归终止条件
//递归代码 转非递归
int f(int n) {
  if (n == 1) return 1;
  return f(n-1) + 1;
}

转

int f(int n) {
  int ret = 1;
  for (int i = 2; i <= n; ++i) {
    ret = ret + 1;
  }
  return ret;
}

// 递归到非递归的转化步骤：
// 1. 识别递归模式：递归函数中 f(n) = f(n-1) + 1 表示在每次递归时都对结果加 1。
// 2. 初始条件：递归的基础条件 if (n == 1) return 1; 可以作为非递归的初始值设置（ret = 1）。
// 3. 循环替代递归：递归中的递减（f(n-1)）替换为循环中的递增，从 2 到 n，每次循环都将 ret 加 1，类似于递归中的每一步。

// 注意 防止堆栈溢出的话， 可以限制递归深度，当次数达到一定限制后，抛出异常


// 排序算法
|------------------------------------------------------|
|     排序算法     |    时间复杂度     |    是否基于比较    |                                                              
|-------------------------------------------------------                           
| 冒泡、插入、选择  |      O(n^2)      |       是         |  
|------------------------------------------------------|      
| 快排、归并       |      O(nlogn)    |       是         |  
|------------------------------------------------------|          
| 桶、计数、基数    |      O(n)        |        否        |                      
|------------------------------------------------------|           

// 如何分析一个排序算法
1. 执行效率（主要是时间复杂度）
a. 最好情况、最坏情况、平均情况时间复杂度



b. 时间复杂度的系数、常数 、低阶
实际开发中往往是规模小的数据，这种情况下要把系数，常数，低阶都考虑进来。
c. 比较次数和交换（或移动）次数

2. 内存消耗（空间复杂度）
原地排序算法: 特指空间复杂度为 O(1) 的排序算法

3. 稳定性
如果待排序的序列中存在值相等的元素，经过排序之后，相等元素之间原有的先后顺序不变。则具有排序的稳定性

// 冒泡排序 bubble sort
冒泡排序的核心思想是：
每一轮遍历，都会将未排序部分中最大的元素“冒泡”到数组的末尾。在每一轮的末尾，当前最大元素已经在正确的位置上，因此下一轮的比较范围可以缩小。
// 外层循环：外层循环决定要进行几轮冒泡操作。对于一个长度为 n 的数组，最多需要 n-1 轮冒泡操作（因为最后一轮只剩下一个元素，无需再比较）。
// 内层循环：内层循环负责实际的元素比较和交换。在每一轮操作中，内层循环遍历未排序的部分，将最大的元素移动到末尾，并逐步减少未排序部分的范围。
//eg: 冒泡排序代码
public class BubbleSortExample {

    // 冒泡排序方法
    public void bubbleSort(int[] a, int n) {
        if (n <= 1) return;

        for (int i = 0; i < n; ++i) {
            // 提前退出冒泡循环的标志位
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {
                if (a[j] > a[j + 1]) { // 交换
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    flag = true;  // 表示有数据交换      
                }
            }
            if (!flag) break;  // 没有数据交换，提前退出
        }
    }

    // 主方法，用于测试冒泡排序
    public static void main(String[] args) {
        BubbleSortExample sorter = new BubbleSortExample();
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("排序前的数组：");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        sorter.bubbleSort(array, array.length);

        System.out.println("排序后的数组：");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

// 冒泡排序是原地排序算法吗？
冒泡的过程只涉及相邻数据的交换操作，只需要常量级的临时空间，所以它的空间复杂度为 O(1)，是一个原地排序算法。
// 冒泡排序是稳定的排序算法吗？
在冒泡排序中，只有交换才可以改变两个元素的前后顺序。为了保证冒泡排序算法的稳定性，当有相邻的两个元素大小相等的时候，我们不做交换，相同大小的数据在排序前后不会改变顺序，所以冒泡排序是稳定的排序算法。
// 冒泡排序的时间复杂度是多少？
最好情况下，要排序的数据已经是有序的了，我们只需要进行一次冒泡操作，就可以结束了，所以最好情况时间复杂度是 O(n)。而最坏的情况是，要排序的数据刚好是倒序排列的，我们需要进行 n 次冒泡操作，所以最坏情况时间复杂度为 O(n^2)。
// 时间复杂度关注的是随输入规模 n 增长而变化的速度 !!!!!


// 插入排序
// 我们将数组中的数据分为两个区间，已排序区间和未排序区间。初始已排序区间只有一个元素，就是数组的第一个元素。插入算法的核心思想是取未排序区间中的元素，在已排序区间中找到合适的插入位置将其插入，并保证已排序区间数据一直有序。重复这个过程，直到未排序区间中元素为空，算法结束。
// 代码实现：
public class InsertionSortExample {

  // 插入排序方法
  public void insertionSort(int[] a, int n) {
    if (n <= 1) return;

    for (int i = 1; i < n; ++i) {
      int value = a[i];
      int j = i - 1;
      // 查找插入的位置
      for (; j >= 0; --j) {
        if (a[j] > value) {
          a[j + 1] = a[j];  // 数据移动
        } else {
          break;
        }
      }
      a[j + 1] = value; // 插入数据
    }
  }

  // 主方法，用于测试插入排序
  public static void main(String[] args) {
    InsertionSortExample sorter = new InsertionSortExample();
    int[] array = {45, 23, 124, 34, 1, 5, 17};
    int n = array.length;

    // 执行插入排序
    sorter.insertionSort(array, n);

    // 输出排序后的数组
    for (int num : array) {
      System.out.print(num + " ");
    }
  }
}

// 插入排序是原地排序算法吗？
不需要额外的储存空间，所以它的空间复杂度为 O(1)，是一个原地排序算法。
// 插入排序是稳定的排序算法吗？
在插入排序中，对于值相同的元素，我们可以选择将后面出现的元素，插入到前面出现元素的后面，这样就可以保持原有的前后顺序不变，所以插入排序是稳定的排序算法。
// 插入排序的时间复杂度是多少？
如果要排序的数据已经是有序的，我们并不需要搬移任何数据。如果我们从尾到头在有序数据组里面查找插入位置，每次只需要比较一个数据就能确定插入的位置。所以这种情况下，最好是时间复杂度为 O(n)。注意，这里是从尾到头遍历已经有序的数据。
如果数组是倒序的，每次插入都相当于在数组的第一个位置插入新的数据，所以需要移动大量的数据，所以最坏情况时间复杂度为 O(n^2)。
还记得我们在数组中插入一个数据的平均时间复杂度是多少吗？没错，是 O(n)。所以，对于插入排序来说，每次插入操作都相当于在数组中插入一个数据，循环执行 n 次插入操作，所以平均时间复杂度为 O(n^2)。

// 选择排序 Selection sort
选择排序算法的实现思路有点类似插入排序，也分已排序区间和未排序区间。但是选择排序每次会从未排序区间中找到最小的元素，将其放到已排序区间的末尾(意味着同时末尾的元素和其交换位置, 这个位置交换是该算法稳定性不足的原因)。
// 选择排序是原地排序算法吗？
选择排序空间复杂度为 O(1)，是一种原地排序算法
// 选择排序是稳定的排序算法吗？
在插入排序中，对于值相同的元素，我们可以选择将后面出现的元素，插入到前面出现元素的后面，这样就可以保持原有的前后顺序不变，所以插入排序是稳定的排序算法。
// 选择排序的时间复杂度是多少？
选择排序的最好情况时间复杂度、最坏情况和平均情况时间复杂度都为 O(n^2)

-------------------------------------------------------------------------------------
           |     是原地排序？    |    是否稳定？     |    最好    |    最坏   |    平均   |                                                            
-----------|-------------------------------------------------------------------------                           
   冒泡排序 |        是          |       是         |   O(n)    |   O(n^2) |   O(n^2) 
-----------|-------------------------------------------------------------------------      
   插入排序  |       是          |       是         |   O(n)    |   O(n^2) |   O(n^2)
-----------|------------------------------------------------------------------------- 
   选择排序  |       是          |       否         |   O(n^2)  |   O(n^2) |   O(n^2)                 
-----------|-------------------------------------------------------------------------        


// 归并排序 merge sort
如果要排序一个数组，我们先把数组从中间分成前后两部分，一直分成单个数组，然后对前后两部分分别排序，再将排好序的两部分合并在一起，这样整个数组就都有序了。
归并排序使用的就是分治思想
归并排序算法是一种在任何情况下时间复杂度都比较稳定的排序算法 O(nlogn)，这也使它存在致命的缺点，即归并排序不是原地排序算法，空间复杂度比较高，是 O(n)。正因为此，它也没有快排应用广泛。
// 归并排序主要步骤
分割（Divide）：将数组从中间分成两部分。
递归排序（Conquer）：对这两部分分别进行递归排序。
合并（Combine）：将两个已排序的子数组合并成一个有序数组。

假设我们要对数组 [38, 27, 43, 3, 9, 82, 10] 进行归并排序。
我们将数组不断分割，直到每个子数组中只有一个元素为止：
第一步分割：
[38, 27, 43, 3]  和  [9, 82, 10]
第二步分割：
[38, 27]  和  [43, 3]  |  [9, 82]  和  [10]
第三步分割：
[38]  和  [27]  |  [43]  和  [3]  |  [9]  和  [82]  |  [10]

接下来我们从最小的子数组开始进行合并，并在合并的同时进行排序：
合并 [38] 和 [27]：
[27, 38]
合并 [43] 和 [3]：
[3, 43]
合并 [9] 和 [82]：
[9, 82]
[10] 不需要合并，因为它是单个元素。
合并 [27, 38] 和 [3, 43]：
  比较 27 和 3，将 3 放入新数组。
  比较 27 和 43，将 27 放入新数组。
  比较 38 和 43，将 38 放入新数组。
  将 43 放入新数组。
[3, 27, 38, 43]
...... 以此类推， 经过分割和合并，最终的有序数组为
[3, 9, 10, 27, 38, 43, 82]
//合并具体步骤
假设有两个已经排序的子数组：
左子数组： [3, 27, 38]
右子数组： [9, 10, 82]
创建临时数组：准备两个指针分别指向两个子数组的起始位置，并创建一个临时数组，用于存放合并后的结果。
i = 0 （指向左子数组的第一个元素）
j = 0 （指向右子数组的第一个元素）
k = 0 （指向合并后数组的第一个位置）
比较元素并放入结果数组：从左子数组和右子数组的起始位置开始，比较两个元素，将较小的元素放入结果数组中，并移动对应子数组的指针。
比较左子数组的 3 和右子数组的 9，因为 3 小于 9，所以将 3 放入结果数组，并将指针 i 向右移动一个位置。
结果数组：[3]
i = 1, j = 0, k = 1

比较左子数组的 27 和右子数组的 9，因为 9 小于 27，所以将 9 放入结果数组，并将指针 j 向右移动一个位置。
结果数组：[3, 9]
i = 1, j = 1, k = 2

比较左子数组的 27 和右子数组的 10，因为 10 小于 27，所以将 10 放入结果数组，并将指针 j 向右移动一个位置。
结果数组：[3, 9, 10]
i = 1, j = 2, k = 3

比较左子数组的 27 和右子数组的 82，因为 27 小于 82，所以将 27 放入结果数组，并将指针 i 向右移动一个位置。
结果数组：[3, 9, 10, 27]
i = 2, j = 2, k = 4

比较左子数组的 38 和右子数组的 82，因为 38 小于 82，所以将 38 放入结果数组，并将指针 i 向右移动一个位置。
结果数组：[3, 9, 10, 27, 38]
i = 3, j = 2, k = 5

处理剩余元素：当一个子数组的所有元素都被处理完后，可能会有另一个子数组的元素还没有被处理完。这时候，我们直接将剩余的元素全部放入结果数组中。

在这个例子中，左子数组的所有元素已经处理完毕，而右子数组的元素 82 还没有被处理完，所以我们直接将 82 放入结果数组中。
结果数组：[3, 9, 10, 27, 38, 82]

// 归并排序的代码实现
public class MergeSortExample {

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // 递归地对左半部分进行排序
            mergeSort(array, left, mid);
            // 递归地对右半部分进行排序
            mergeSort(array, mid + 1, right);

            // 合并两部分
            merge(array, left, mid, right);
        }
    }

    public static void merge(int[] array, int left, int mid, int right) {
        // 创建临时数组
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // 拷贝数据到临时数组
        for (int i = 0; i < n1; ++i) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = array[mid + 1 + j];
        }

        // 合并临时数组到原始数组
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // 拷贝剩余的元素
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(array, 0, array.length - 1);

        System.out.println("排序后的数组:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}







// 快速排序
快速排序算法虽然最坏情况下的时间复杂度是 O(n2)，但是平均情况下 和 最好情况下 时间复杂度都是 O(nlogn)。不仅如此，快速排序算法时间复杂度退化到 O(n2) 的概率非常小，我们可以通过合理地选择 pivot 来避免这种情况。
// 快速排序的基本步骤：
1. 选择基准元素：从数组中选择一个元素作为基准（通常是第一个元素、最后一个元素或随机选择的元素）。
2. 划分数组：将数组分为两个子数组，使得基准元素左边的所有元素都小于基准，右边的所有元素都大于基准。
3. 递归排序：对基准元素左边和右边的两个子数组分别递归地进行快速排序。
4. 合并结果：由于快速排序是就地排序，最后的结果自动合并在一起。

假设我们有数组 array = [34, 7, 23, 32, 5, 62, 32, 34, 5, 4]，并选择最右边的元素 4 作为基准。
pivot 为 4 
初始化 i = -1; j = 8 (倒数第二个元素的下标，用于遍历数组)
从 j = 0 开始，遍历到 j = 8:
对于每个 array[j]，如果 array[j] <= pivot，将 i 加 1 并交换 array[i] 和 array[j] 的值。
详细遍历步骤：
j = 0：array[0] = 34，不做交换（因为 34 > 4）。
j = 1：array[1] = 7，不做交换（因为 7 > 4）。
j = 2：array[2] = 23，不做交换（因为 23 > 4）。
j = 3：array[3] = 32，不做交换（因为 32 > 4）。
j = 4：array[4] = 5，不做交换（因为 5 > 4）。
j = 5：array[5] = 62，不做交换（因为 62 > 4）。
j = 6：array[6] = 32，不做交换（因为 32 > 4）。
j = 7：array[7] = 34，不做交换（因为 34 > 4）。
j = 8：array[8] = 5，不做交换（因为 5 > 4）。
最后，将 i+1 与 high（j=9，即最后一个元素 4）的位置进行交换：
交换 array[0] 和 array[9]，数组变为 [4, 7, 23, 32, 5, 62, 32, 34, 5, 34]。


// 桶排序 bucket sort
核心思想是将要排序的数据分到几个有序的桶里，每个桶里的数据再单独进行排序。桶内排完序之后，再把每个桶里的数据按照顺序依次取出，组成的序列就是有序的了。
桶排序的时间复杂度为 O(n)
如果要排序的数据有 n 个，我们把它们均匀地划分到 m 个桶内，每个桶里就有 k=n/m 个元素。每个桶内部使用快速排序，时间复杂度为 O(k * logk)。m 个桶排序的时间复杂度就是 O(m * k * logk)，因为 k=n/m，所以整个桶排序的时间复杂度就是 O(n*log(n/m))。当桶的个数 m 接近数据个数 n 时，log(n/m) 就是一个非常小的常量，这个时候桶排序的时间复杂度接近 O(n)。
// 桶排序的要求比较苛刻
1. 要排序的数据需要很容易就能划分成 m 个桶
2. 桶与桶之间有着天然的大小顺序
这样每个桶内的数据都排序完之后，桶与桶之间的数据不需要再进行排序。
3. 数据在各个桶之间的分布是比较均匀的
如果数据经过桶的划分之后，有些桶里的数据非常多，有些非常少，很不平均，那桶内数据排序的时间复杂度就不是常量级了。在极端情况下，如果数据都被划分到一个桶里，那就退化为 O(nlogn) 的排序算法了。





// 计数排序 
可以说是一种特殊的桶排序
1. 找到最大值和最小值：首先找到数组中的最大值和最小值，确定计数数组的大小。
2. 统计出现次数：创建一个计数数组（count），用于统计每个元素在原始数组中出现的次数。计数数组的索引表示元素的值，数组的值表示该元素的出现次数。
3. 累加计数：对计数数组进行累加操作，以便确定每个元素在排序后数组中的正确位置。
4. 生成排序数组：根据累加后的计数数组，将原数组的元素放到正确的位置，生成排序后的数组。

// 假设我们有一个数组 [4, 2, 2, 8, 3, 3, 1]，我们希望对其进行计数排序。
// 第一步：找到最大值和最小值
最大值为 8，最小值为 1。
// 第二步：统计出现次数
创建一个计数数组 count，其大小为最大值减最小值加一，即 8 - 1 + 1 = 8。
初始化计数数组：
count = [0, 0, 0, 0, 0, 0, 0, 0]
遍历原始数组，并记录每个元素的出现次数：

count = [1, 2, 2, 1, 0, 0, 0, 1]
// 第三步：累加计数
对计数数组进行累加，使其表示元素在排序数组中的最后位置：
从第二个元素开始累加，
count[1] += count[0] → count = [1, 3, 2, 1, 0, 0, 0, 1]
count[2] += count[1] → count = [1, 3, 5, 1, 0, 0, 0, 1]
count[3] += count[2] → count = [1, 3, 5, 6, 0, 0, 0, 1]
count[4] += count[3] → count = [1, 3, 5, 6, 6, 0, 0, 1]
count[5] += count[4] → count = [1, 3, 5, 6, 6, 6, 0, 1]
count[6] += count[5] → count = [1, 3, 5, 6, 6, 6, 6, 1]
count[7] += count[6] → count = [1, 3, 5, 6, 6, 6, 6, 7]
累加完成后，count 数组为：
count = [1, 3, 5, 6, 6, 6, 6, 7]
// 第四步：生成排序数组
从右到左遍历原数组：为了保证排序的稳定性，从原数组的最后一个元素开始处理。
更新 count 数组：在每次放置元素后，更新 count 数组，以确保如果有相同的元素，它们在排序后也会保持正确的顺序。

### 公式

对于每个元素 `a[i]`，它在排序数组 `sortedArray` 中的位置由以下公式确定：

\[ \text{sortedArray}[\text{count}[a[i]] - 1] = a[i] \]

同时，放置该元素后，需要更新 `count` 数组：

\[ \text{count}[a[i]] = \text{count}[a[i]] - 1 \]

### 解释

- **`count[a[i]]`**：表示元素 `a[i]` 在排序后数组中应该插入的位置的下一个位置。
- **`sortedArray[count[a[i]] - 1]`**：在计数数组中的位置减 1 是因为数组索引从 0 开始，因此元素的正确位置是 `count[a[i]] - 1`。
- **`count[a[i]] = count[a[i]] - 1`**：插入后，我们将 `count[a[i]]` 减 1，因为下一个相同的元素应该插入在它前面的位置。

### 示例应用公式

假设我们有以下原始数组和累加后的 `count` 数组：
- **原始数组**：`[4, 2, 2, 8, 3, 3, 1]`
- **累加后的 `count` 数组**：`[1, 3, 5, 6, 6, 6, 6, 7]`

使用公式逐步处理：
1. **处理元素 `1`**：
   \[ \text{sortedArray}[count[1] - 1] = \text{sortedArray}[0] = 1 \]
   然后更新 `count[1]`：
   \[ \text{count}[1] = 0 \]
   结果：`sortedArray = [1, _, _, _, _, _, _]`

2. **处理元素 `3`**：
   \[ \text{sortedArray}[count[3] - 1] = \text{sortedArray}[4] = 3 \]
   然后更新 `count[3]`：
   \[ \text{count}[3] = 4 \]
   结果：`sortedArray = [1, _, _, _, 3, _, _]`

3. **处理元素 `3`（再次出现）**：
   \[ \text{sortedArray}[count[3] - 1] = \text{sortedArray}[3] = 3 \]
   然后更新 `count[3]`：
   \[ \text{count}[3] = 3 \]
   结果：`sortedArray = [1, _, _, 3, 3, _, _]`

4. **处理元素 `8`**：
   \[ \text{sortedArray}[count[8] - 1] = \text{sortedArray}[6] = 8 \]
   然后更新 `count[8]`：
   \[ \text{count}[8] = 6 \]
   结果：`sortedArray = [1, _, _, 3, 3, _, 8]`

5. **处理元素 `2`**：
   \[ \text{sortedArray}[count[2] - 1] = \text{sortedArray}[2] = 2 \]
   然后更新 `count[2]`：
   \[ \text{count}[2] = 2 \]
   结果：`sortedArray = [1, _, 2, 3, 3, _, 8]`

6. **处理元素 `2`（再次出现）**：
   \[ \text{sortedArray}[count[2] - 1] = \text{sortedArray}[1] = 2 \]
   然后更新 `count[2]`：
   \[ \text{count}[2] = 1 \]
   结果：`sortedArray = [1, 2, 2, 3, 3, _, 8]`

7. **处理元素 `4`**：
   \[ \text{sortedArray}[count[4] - 1] = \text{sortedArray}[5] = 4 \]
   然后更新 `count[4]`：
   \[ \text{count}[4] = 5 \]
   结果：`sortedArray = [1, 2, 2, 3, 3, 4, 8]`

最终结果为：`sortedArray = [1, 2, 2, 3, 3, 4, 8]`

//计数排序的优缺点
//优点
时间复杂度：计数排序的时间复杂度为 \(O(n + k)\)，其中 \(n\) 是输入数组的大小，\(k\) 是数组中元素的取值范围。在 \(k\) 远小于 \(n\) 时，计数排序非常高效。
空间复杂度：空间复杂度为 \(O(k)\)，因为需要额外的计数数组来存储每个元素的计数。
稳定性：计数排序是一种稳定的排序算法，具有相同值的元素在排序后保持相对位置不变。
//缺点
数据范围受限：计数排序适用于数据范围较小且可枚举的情况。如果元素的取值范围过大，计数数组的大小会导致高额的空间开销。
不能处理浮点数：计数排序通常只适用于非负整数排序，无法直接处理

// 为什么说计数排序是一种特殊的桶排序？
1. 固定桶内排序：在计数排序中，桶的划分是非常细粒度的，每个桶只存储一个具体值的元素，并记录其数量。这使得每个桶内的排序过程被“固化”成了简单的计数操作，而不再需要显式的排序。
2. 精确桶划分：在桶排序中，桶的划分通常是基于范围的，而在计数排序中，桶的划分精确到每个具体的数值。这种精确的划分方式使得计数排序能够直接利用数组索引来进行操作。
3. 直接映射关系：在计数排序中，元素值与计数数组的索引之间存在直接的映射关系，而桶排序中的桶通常覆盖一段范围的值，没有这种直接的映射关系。
4. 应用场景不同：计数排序更适用于数据范围较小且可枚举的情况，而桶排序适用于数据范围较大但分布较均匀的情况。

// 选择合适的算法
| 排序算法 | 时间复杂度                  | 是否稳定排序 | 是否原地排序 |
| -------- | --------------------------- | ------------ | ------------ |
| 冒泡排序 | O(n²)                        | 是           | 是           |
| 插入排序 | O(n²)                        | 是           | 是           |
| 选择排序 | O(n²)                        | 否           | 是           |
| 快速排序 | O(n log n)                   | 否           | 是           |
| 归并排序 | O(n log n)                   | 是           | 否           |
| 计数排序 | O(n + k) (k 是数据范围)        | 是           | 否           |
| 桶排序   | O(n)                         | 是           | 否           |
| 基数排序 | O(dn) (d 是维度)              | 是           | 否           |

如果是小规模数据， 可以选择时间复杂度为 O(n^2) 的算法
如果是大规模数据， 可以选择时间复杂度为 O(nlogn) 的算法
如果为了兼顾任意规模的数据， 首选时间复杂度为 O(nlogn) 的算法

// 优化快速排序
1.优化快速排序，核心是合理选择分区点
a.三数取中法
从区间的首、尾、中间，分别取出一个数，然后对比大小，取这 3 个数的中间值作为分区点
如果数量较大，则可能要多数取中(五数取中，十数取中)
b.随机法
2.避免递归过深，导致堆栈溢出

// 注意： 在小规模数据面前，O(n2) 时间复杂度的算法并不一定比 O(nlogn) 的算法执行时间长。时间负责度表示的是增长趋势。

// 二分查找 binary search
二分查找针对的是一个有序的数据集合，查找思想有点类似分治思想。每次都通过跟区间的中间元素对比，将待查找的区间缩小为之前的一半，直到找到要查找的元素，或者区间被缩小为 0。
二分查找的时间复杂度为 O(logn)

// 二分查找的实现: 递归代码
public int bsearch(int[] a, int n, int val) {
  return bsearchInternally(a, 0, n - 1, val);
}

private int bsearchInternally(int[] a, int low, int high, int value) {
  if (low > high) return -1;

  int mid =  low + ((high - low) >> 1);
  if (a[mid] == value) {
    return mid;
  } else if (a[mid] < value) {
    return bsearchInternally(a, mid+1, high, value);
  } else {
    return bsearchInternally(a, low, mid-1, value);
  }
}

// 二分查找的实现: 非递归代码
public int bsearch(int[] a, int n, int value) {
  int low = 0;
  int high = n - 1;

  while (low <= high) {
    int mid = (low + high) / 2;
    if (a[mid] == value) {
      return mid;
    } else if (a[mid] < value) {
      low = mid + 1;
    } else {
      high = mid - 1;
    }
  }

  return -1;
}

// 二分查找局限性
1. 依赖数组(顺序表结构)
主要原因是二分查找算法需要按照下标随机访问元素。我们在数组和链表那两节讲过，数组按照下标随机访问数据的时间复杂度是 O(1)，而链表随机访问的时间复杂度是 O(n)。所以，如果数据使用链表存储，二分查找的时间复杂就会变得很高。
2. 依赖有序数据
如果我们针对的是一组静态的数据，没有频繁地插入、删除，我们可以进行一次排序，多次二分查找。这样排序的成本可被均摊，二分查找的边际成本就会比较低。
但是，如果我们的数据集合有频繁的插入和删除操作，要想用二分查找，要么每次插入、删除操作之后保证数据仍然有序，要么在每次二分查找之前都先进行排序。
3. 不适用于数据量较小的查找
如果要处理的数据量很小，完全没有必要用二分查找，顺序遍历就足够了。
4. 不适用于数据量过大的查找
二分查找依赖于数组，因为需要支持随机访问，所以需要连续的内存空间。