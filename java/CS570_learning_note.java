| 应用程序域  | 计算问题                                                      | 常用算法                                                                                                                                                    |
|------------|-------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------|
| DNA 分析   | 给定来自不同个体的两个 DNA 序列，最长的共享核苷酸序列是多少？ | 最长公共子串问题：最长公共子串算法确定两个输入字符串中存在的最长公共子串。序列可以使用由字母 A、C、G 和 T 组成的字符串来表示四种不同的核苷酸。                   |
| 搜索引擎   | 给定一个产品 ID 和所有有库存产品的排序数组，该产品是否有库存以及该产品的价格是多少？ | 二分查找：二分查找算法是一种高效的列表搜索算法。列表的元素必须是有序的，且可直接访问（如数组）。                                                             |
| 导航       | 给定用户的当前位置和期望位置，步行到目的地的最快路线是什么？  | Dijkstra 最短路径：Dijkstra 最短路径算法确定从起始顶点到图中每个顶点的最短路径。两个位置之间的可能路径可以用图表示，其中顶点表示特定位置，连接边指示在这两个位置之间行走所需的时间。|

算法效率最常见的衡量标准是算法运行时间，而有效的算法是指运行时间相对于输入大小的增加不超过多项式的算法。

// NP complete problem
NP complete problem是一组尚无已知有效算法的问题。NP complete problem具有以下特点：
1. 目前尚未发现解决 NP complete problem的有效算法。
2. 没有人能够证明解决 NP complete problem的有效算法是不可能的。
3. 如果一个 NP complete problem存在有效算法，那么所有 NP complete problem都可以得到有效解决。
通过了解问题是 NP complete 的，程序员可以专注于寻找一种算法来有效地找到一个好的但非最优的解决方案，而不是试图找到一种有效的算法来解决该问题。

// abstract data type
抽象数据类型（ADT）是一种由预定义用户操作描述的数据类型，例如“在末尾插入数据”，但不具体说明每个操作是如何实现的。ADT 可以使用不同的底层数据结构来实现，但程序员在使用 ADT 时不需要了解其底层实现。
例如：列表（List）是一种常见的 ADT，用于存储有序数据，支持操作包括：添加数据项、移除数据项、查找数据项是否存在以及打印列表。列表 ADT 通常用数组或链表数据结构来实现。
总结来说，ADT 提供了一个操作接口，隐藏了具体实现细节，使得程序员可以在不知道底层结构的情况下使用这些数据类型。

// common ADTs
| Abstract data type | Description                                                                                     | Common underlying data structures           |
|--------------------|-------------------------------------------------------------------------------------------------|--------------------------------------------|
| List               | A list is an ADT for holding ordered data.                                                      | Array, linked list                         |
| Dynamic array      | A dynamic array is an ADT for holding ordered data and allowing indexed access.                 | Array                                      |
| Stack              | A stack is an ADT in which items are only inserted on or removed from the top of a stack.       | Linked list                                |
| Queue              | A queue is an ADT in which items are inserted at the end of the queue and removed from the front of the queue. | Linked list                          |
| Deque              | A deque (pronounced "deck" and short for double-ended queue) is an ADT in which items can be inserted and removed at both the front and back. | Linked list |
| Bag                | A bag is an ADT for storing items in which the order does not matter and duplicate items are allowed. | Array, linked list                    |
| Set                | A set is an ADT for a collection of distinct items.                                             | Binary search tree, hash table             |
| Priority queue     | A priority queue is a queue where each item has a priority, and items with higher priority are closer to the front of the queue than items with lower priority. | Heap                    |
| Dictionary (Map)   | A dictionary is an ADT that associates (or maps) keys with values.                              | Hash table, binary search tree             |

// ADTs in standard libraries
| Programming language | Library                               | Common supported ADTs                       |
|----------------------|---------------------------------------|---------------------------------------------|
| Python               | Python standard library               | list, set, dict, deque                      |
| C++                  | Standard template library (STL)       | vector, list, deque, queue, stack, set, map |
| Java                 | Java collections framework (JCF)      | Collection, Set, List, Map, Queue, Deque    |


// 抽象（Abstraction）：抽象是指用户以高层次的方式与某个项交互，隐藏底层的实现细节。抽象数据类型（ADT）通过隐藏底层实现并提供一组明确的操作来支持这种抽象。
// ADT 的优势：使用 ADT 使程序员或算法设计者能够专注于高层次的操作和算法，从而提高编程效率。
// 优化需要底层知识：虽然 ADT 支持抽象，但在分析或优化运行时效率时，需要了解其底层实现。

运行时间复杂度（T(N)）表示算法在输入大小为N时所执行的常数时间操作数。
空间复杂度（S(N)）表示算法在输入大小为N时所需的固定大小内存单元数量。
辅助空间复杂度（auxiliary space complexity）：空间复杂度中不包括输入数据的部分。例如，查找列表中最大数的算法的空间复杂度为 S(N) = N + k，但辅助空间复杂度为 S(N) = k。
In the best case, the input list contains only odd numbers and the output size is 0, whether the list has 10 odd numbers or 1000 odd numbers. A constant output size of zero corresponds to an auxiliary space complexity of k.

// eg: Linear search algorithm    --- 详见 CS570_example_code.java


//Binary search
二分搜索：适用于已排序的列表，通过首先检查中间元素并逐步缩小搜索范围，每一步将搜索空间减半，时间复杂度为 O(log N)，比线性搜索更快。
// eg: Binary search algorithm   --- 详见 CS570_example_code.java


// constant time operation
常数时间操作（Constant Time Operation）指的是在某处理器上，不受输入值影响且在固定时间内完成的操作。
算法分析理论上更关注操作次数，而非绝对时间（如纳秒），因为实际运行时间受处理器速度影响。
// 一些通常被认为是常数时间的操作包括：
基本的算术操作（如加、减、乘、除）
位操作（如按位与、按位或、移位）
赋值操作


// function growth and complexity 函数增长与复杂度
 **上界和下界的概念**
  - **下界（Lower Bound）**：一个函数 \( f(N) \)，在所有 \( N \geq 1 \) 时，满足 \( f(N) \leq \) 最佳情况运行时间 \( T(N) \)。
  - **上界（Upper Bound）**：一个函数 \( f(N) \)，在所有 \( N \geq 1 \) 时，满足 \( f(N) \geq \) 最坏情况运行时间 \( T(N) \)。

- **无限数量的上界和下界**
  - 给定一个函数 \( T(N) \)，可以有无限多的下界和上界。例如，如果算法的最佳情况运行时间是 \( T(N) = 5N + 4 \)，则减去任意非负整数都会产生一个下界，如 \( 5N + 3 \)、\( 5N + 2 \) 等。

- **选择首选上界和下界的标准**
  - **单项多项式**：理想的上界或下界应该是一个单项多项式。
  - **尽可能紧密地界定 \( T(N) \)**：首选的上界和下界应尽量接近 \( T(N) \)，以更准确地描述算法的复杂度。


//   ## 增长率与渐进符号
- **增长率的定义**  
  为简化算法的复杂度分析，可以将常数从边界函数中提取出来，只留下描述算法增长率的函数。例如，算法的运行时间上界可用其最坏情况下的增长率来描述。

- **渐进符号**  
  渐进符号（Asymptotic Notation）用于分类算法的时间复杂度，表示边界函数的增长率。以下是复杂度分析中常用的三种渐进符号：
  
  - **O 表示法（Big O Notation）**：表示算法的上界增长率。
  - **Ω 表示法（Big Omega Notation）**：表示算法的下界增长率。
  - **Θ 表示法（Big Theta Notation）**：表示算法的上下界增长率，即上界和下界相同。

这些符号帮助我们描述算法在不同情况（最坏情况、最佳情况等）下的增长率，从而更有效地评估算法的性能。


// 列表抽象数据类型（List ADT）
列表 ADT 定义了一些操作，让用户可以轻松管理和操作列表中的数据，而无需了解其内部实现。
// 列表 ADT 提供了多个常见的操作，以下是表格中的总结：
| 操作                     | 描述                                           | 示例（以列表 99, 77 为起始）                  |
|--------------------------|------------------------------------------------|-----------------------------------------------|
| `Append(list, x)`        | 将 x 添加到列表末尾                             | `Append(list, 44)` → 列表变为 99, 77, 44      |
| `Prepend(list, x)`       | 将 x 添加到列表开头                             | `Prepend(list, 44)` → 列表变为 44, 99, 77     |
| `InsertAfter(list, w, x)`| 在元素 w 之后插入 x                             | `InsertAfter(list, 99, 44)` → 列表变为 99, 44, 77 |
| `Remove(list, x)`        | 删除列表中的 x                                 | `Remove(list, 77)` → 列表变为 99              |
| `Search(list, x)`        | 返回 x 的位置，如果不存在则返回 null            | `Search(list, 99)` 返回 99；`Search(list, 22)` 返回 null |
| `Print(list)`            | 顺序打印列表中的元素                           | `Print(list)` 输出 99, 77                     |
| `PrintReverse(list)`     | 逆序打印列表中的元素                           | `PrintReverse(list)` 输出 77, 99              |
| `Sort(list)`             | 按升序排序列表中的元素                         | 排序后列表变为 77, 99                         |
| `IsEmpty(list)`          | 如果列表为空，返回 true                        | 对于 99, 77，`IsEmpty(list)` 返回 false       |
| `GetLength(list)`        | 返回列表中元素的数量                           | `GetLength(list)` 返回 2                      |


// 单链表（Singly-Linked List）
// 1. 定义
单链表是一种链式数据结构，每个节点包含数据和一个指向下一个节点的指针。
链表通常有指向第一个节点（头节点）和最后一个节点（尾节点）的指针。
单链表是一种位置链表（positional list），因为元素之间通过指针连接，形成有序结构。
// 2. 追加节点（Append）
操作目标：将一个新节点插入到链表的尾部。
操作方式：
空链表：如果 head 为 null（链表为空），则将 head 和 tail 都指向新节点。
非空链表：如果 head 不为 null，将尾节点的 next 指针指向新节点，并更新 tail 指向新节点。

ListAppend(list, newNode) {
   if (list⇢head == null) { // List empty
      list⇢head = newNode
      list⇢tail = newNode
   }
   else{
      list⇢tail⇢next = newNode
      list⇢tail = newNode
   }
}

// 3. 前置节点（Prepend）
操作目标：将一个新节点插入到链表的头部。
操作方式：
空链表：如果 head 为 null（链表为空），则将 head 和 tail 都指向新节点。
非空链表：如果 head 不为 null，将新节点的 next 指针指向当前的 head，然后更新 head 指向新节点。
ListPrepend(list, newNode) {
   if (list⇢head == null) { // list empty
      list⇢head = newNode
      list⇢tail = newNode
   }
   else {
      newNode⇢next = list⇢head
      list⇢head = newNode
   }
}


// 单链表插入操作（InsertAfter）
InsertAfter 操作将一个新节点插入到单链表中指定节点 curNode 之后。
curNode 是一个指向现有节点的指针，可能为 null（在链表为空时插入）。
// InsertAfter 操作有三种可能的插入场景：
// 1. 作为链表的第一个节点插入
条件：head 为 null（链表为空）。
操作：将 head 和 tail 都指向新节点，将其作为链表的第一个节点。
// 2. 在尾节点之后插入
条件：链表非空，且 curNode 指向 tail。
操作：将 tail 的 next 指针指向新节点，同时更新 tail 指向新节点。
// 3. 在链表的中间位置插入
条件：链表非空，且 curNode 不指向 tail。
操作：将新节点的 next 指针指向 curNode 的下一个节点，然后将 curNode 的 next 指针指向新节点。
ListInsertAfter(list, curNode, newNode) {
   if (list⇢head == null) { // List empty
      list⇢head = newNode
      list⇢tail = newNode
   }
   else if (curNode == list⇢tail) { // Insert after tail
      list⇢tail⇢next = newNode
      list⇢tail = newNode
   }
   else {
      newNode⇢next = curNode⇢next
      curNode⇢next = newNode
   }
}


// RemoveAfter 操作概述
// 定义：RemoveAfter 操作用于删除单链表中指定节点之后的节点。
// 参数：需要提供一个已存在的节点 curNode 作为参数，表明在哪个节点之后进行删除操作。
特殊情况处理：在删除头节点时，若链表中只有一个节点，被删除后需将 tail 也更新为 null。
尾节点的处理：如果删除的节点是尾节点，需将 tail 更新为 curNode 以保持链表结构的完整。
sucNode 的作用：通过 sucNode 记录被删除节点的后继节点，以便在删除后重新连接链表。
// 我的总结如下:
// 1. 删头节点 同时list不为空:
a. 头节点不是唯一节点
b. 头节点是唯一节点
// 2. 现有节点后的节点不为空:
a. 删除的不是末节点
b. 删除的是末节点
ListRemoveNodeAfter(list, curNode) {
   // Special case, remove head
   if (curNode is null && list⇢head is not null) {
      sucNode = list⇢head⇢next
      list⇢head = sucNode

      if (sucNode is null) { // Removed last item
         list⇢tail = null
      }
   }
   else if (curNode⇢next is not null) {
      sucNode = curNode⇢next⇢next
      curNode⇢next = sucNode

      if (sucNode is null) { // Removed tail
         list⇢tail = curNode
      }
   }
}

// 链表查找操作（Search）
定义：链表的查找操作用于在链表中找到第一个匹配指定键（key）的节点。如果没有找到匹配的节点，则返回 null。
// 查找算法流程
初始化：从链表的头节点（head）开始，将当前节点指针 current 指向 head。
逐节点检查：
检查 current 节点的数据是否匹配指定的 key。
如果匹配，返回该节点。
如果不匹配，将 current 指向下一个节点，继续检查。
遍历结束条件：如果 current 为 null，说明已经到达链表尾部且没有找到匹配的节点，返回 null 表示未找到。
ListSearch(list, key) {
   curNode = list⇢head
   while (curNode is not null) {
      if (curNode⇢data == key) {
         return curNode
      }
      curNode = curNode⇢next
   }
   return null
}


// 基于数组的列表（Array-based List）
// 1. 定义
基于数组的列表是一种使用数组实现的列表抽象数据类型（ADT），支持常见的列表操作，如追加（append）、前置（prepend）、插入（insert after）、删除（remove）、搜索（search）等。
// 2. 动态数组分配
在许多编程语言中，数组大小固定，因此需要动态调整数组大小以适应元素数量变化。
实现时通常会为数组分配一个初始大小（一般为 1 到 10），并通过 length 变量跟踪当前使用的元素数量。
当数组满了时，进行追加、前置、或插入操作时，会分配一个更大的数组以容纳新元素。
// 3. 常见操作
// 追加操作（Append）
功能：将新元素添加到列表的末尾（索引 X 处，其中 X 为当前列表长度）。
动态调整：若数组已满，则在追加前重新分配更大的数组。
ArrayListAppend(list, newItem) {
   if (list⇢allocationSize == list⇢length) {
      ArrayListResize(list, list⇢length * 2)
   }
   list⇢array[list⇢length] = newItem
   list⇢length = list⇢length + 1
}

ArrayListResize(list, newAllocationSize) {
   newArray = new array of size newAllocationSize
   Copy all elements from list⇢array to newArray
   list⇢array = newArray
   list⇢allocationSize = newAllocationSize
}
// 前置操作（Prepend）
功能：将新元素插入到列表的开头（索引 0 处）。
操作步骤：
若数组已满，则重新分配更大的数组。
将所有现有元素向后移动 1 个位置。
将新元素插入到索引 0 处。
时间复杂度：由于需要移动所有元素，时间复杂度为 O(N)。
ArrayListPrepend(list, newItem) {
   if (list⇢allocationSize == list⇢length) {
      ArrayListResize(list, list⇢length * 2)
   }
   for (i = list⇢length; i > 0; i--) {
      list⇢array[i] = list⇢array[i - 1]
   }
   list⇢array[0] = newItem
   list⇢length = list⇢length + 1
}
// 插入操作（InsertAfter）
功能：在指定索引后的下一个位置插入新元素。
示例：若 numbersList 的内容为 5, 8, 2，调用 ArrayListInsertAfter(numbersList, 1, 7) 将得到 5, 8, 7, 2。
操作步骤：
若数组已满，则重新分配更大的数组。
将指定索引后的所有元素向后移动 1 个位置。
在索引 指定索引 + 1 处插入新元素。
时间复杂度：最佳情况为 O(1)（插入到最后），最坏情况为 O(N)（移动多个元素）。
ArrayListInsertAfter(list, index, newItem) {
   if (list⇢allocationSize == list⇢length) {
      ArrayListResize(list, list⇢length * 2)
   }
   for (i = list⇢length; i > index + 1; i--) {
      list⇢array[i] = list⇢array[i - 1]
   }
   list⇢array[index + 1] = newItem
   list⇢length = list⇢length + 1
}
// 搜索操作（Search）
功能：根据指定的键值查找元素，返回匹配元素的索引，若未找到则返回 -1。
时间复杂度：最坏情况时间复杂度为 O(N)。
The search for 84 now returns 1.
ArrayListSearch(list, item) {
   for (i = 0; i < list⇢length; i++) {
      if (list⇢array[i] == item) {
         return i
      }
   }
   return -1 // not found
}

// 删除操作（Remove-at）
功能：删除指定索引处的元素。
删除元素后，将指定索引后的所有元素向前移动 1 个位置以填补空缺。
时间复杂度：最坏情况时间复杂度为 O(N)，因为可能需要移动多个元素。
ArrayListRemoveAt(list, index) {
   if (index >= 0 && index < list⇢length) {
      for (i = index; i < list⇢length - 1; i++) {
         list⇢array[i] = list⇢array[i + 1]
      }
      list⇢length = list⇢length - 1
   }
}


// 双向链表（Doubly-Linked List）
// 双向链表 是一种数据结构，每个节点包含三个部分：
数据：节点中存储的值。
指向下一个节点的指针（next 指针）。
指向上一个节点的指针（previous 指针）。
// 链表的结构通常包含两个指针：
头节点指针（head），指向链表的第一个节点。
尾节点指针（tail），指向链表的最后一个节点。
// 相比于单向链表，双向链表的每个节点多了一个指向前一个节点的指针，因此双向链表可以方便地在两个方向上进行遍历。

// 追加节点到双向链表的末尾（Append）
// 空链表：
如果链表为空（head 为空），那么新的节点成为链表的头节点和尾节点。
// 非空链表：
将当前尾节点的 next 指针指向新节点。
将新节点的 previous 指针指向当前尾节点。
将链表的 tail 指针更新为新的节点。
// eg: Doubly-linked list: Appending a node.   
ListAppend(list, newNode) {
   if (list⇢head == null) { // List empty
      list⇢head = newNode
      list⇢tail = newNode
   }
   else {
      list⇢tail⇢next = newNode
      newNode⇢prev = list⇢tail
      list⇢tail = newNode
   }
}

// 在双向链表开头添加节点（Prepend）
// 空链表：
如果链表为空（head 为空），新的节点成为链表的头节点和尾节点。
// 非空链表：
将新节点的 next 指针指向当前的头节点。
将当前头节点的 previous 指针指向新节点。
将链表的 head 指针更新为新的节点。
// eg: Doubly-linked list: Prepending a node.
ListPrepend(list, newNode) {
   if (list⇢head == null) { // List empty
      list⇢head = newNode
      list⇢tail = newNode
   }
   else {
      newNode⇢next = list⇢head
      list⇢head⇢prev = newNode
      list⇢head = newNode
   }
}
// 双向链表的优势在于可以方便地向前和向后遍历，因此在需要双向遍历和高效插入、删除的场景中很有用。相比于单向链表，双向链表虽然占用更多的内存（因为每个节点有两个指针），但是提供了更灵活的操作。


// 双向链表中的插入操作（InsertAfter）
// InsertAfter 操作
// InsertAfter 操作用于将一个新节点插入到双向链表中指定节点（curNode）之后。插入操作涉及以下三种场景：
// 1. 插入为第一个节点（Insert as first node）
// 条件：
如果链表为空（即 head 指针为 null）。
// 操作：
将链表的 head 和 tail 指针都指向新节点。
因为链表之前是空的，所以新节点既是头节点也是尾节点。
// 2. 插入到链表尾节点之后（Insert after list's tail node）
// 条件：
链表不为空，并且 curNode 指向链表的尾节点。
// 操作：
将当前尾节点（tail 节点）的 next 指针指向新节点。
将新节点的 previous 指针指向当前尾节点。
更新链表的 tail 指针，使其指向新节点。
新节点现在是链表的尾节点。
// 3. 插入到链表中间（Insert in middle of list）
// 条件：
链表不为空，并且 curNode 不指向尾节点（表示 curNode 在链表中间）。
// 操作：
将新节点的 next 指针指向 curNode 的后继节点（sucNode）。
将新节点的 previous 指针指向 curNode。
将 curNode 的 next 指针更新为指向新节点。
将 sucNode 的 previous 指针更新为指向新节点。
这样，就完成了在 curNode 和 sucNode 之间插入新节点的操作，节点的顺序变成 {curNode -> newNode -> sucNode}。
// eg: Doubly-linked list: Inserting nodes.
ListInsertAfter(list, curNode, newNode) {
   if (list⇢head == null) { // List empty
      list⇢head = newNode
      list⇢tail = newNode
   }
   else if (curNode == list⇢tail) { // Insert after tail
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

// 双向链表的删除操作（Remove）
// Remove 操作用于移除链表中的一个节点（curNode）。算法首先确定要删除节点的前驱节点（predNode）和后继节点（sucNode），然后通过更新这些节点的指针来保持链表结构的完整性。
// Remove 操作需要通过四种情况来更新指针：
// 1. 后继节点存在（Successor exists）
条件：如果 sucNode（后继节点）存在（即 curNode.next 不为 null）。
操作：将后继节点的 previous 指针指向当前节点的前驱节点（predNode）。
结果：这样，后继节点知道它的新前驱节点是谁，从而保持链表的双向链接。
// 2. 前驱节点存在（Predecessor exists）
条件：如果 predNode（前驱节点）存在（即 curNode.previous 不为 null）。
操作：将前驱节点的 next 指针指向当前节点的后继节点（sucNode）。
结果：这样，前驱节点知道它的新后继节点是谁，从而保持链表的双向链接。
// 3. 删除头节点（Removing list's head node）
条件：如果 curNode 指向链表的头节点（head），说明我们正在移除链表的头。
操作：将链表的 head 指针更新为指向后继节点（sucNode）。
结果：链表的头节点更新为新的后继节点。如果链表只有一个节点，sucNode 将为 null，head 会变为 null。
// 4. 删除尾节点（Removing list's tail node）
条件：如果 curNode 指向链表的尾节点（tail），说明我们正在移除链表的尾。
操作：将链表的 tail 指针更新为指向前驱节点（predNode）。
结果：链表的尾节点更新为新的前驱节点。如果链表只有一个节点，predNode 将为 null，tail 会变为 null。


// 链表遍历（Linked List Traversal）
链表遍历是一种访问链表中所有节点的算法，每个节点只访问一次并执行某些操作（例如打印节点数据）。这种遍历算法适用于 单向链表 和 双向链表。
// 遍历步骤：
初始化指针：使用一个指针 curNode 指向链表的头节点（head）。
遍历条件：当 curNode 不为 null 时，执行遍历操作。
操作节点：对当前节点执行操作，例如打印节点数据。
移动指针：将 curNode 指向下一个节点（即 curNode = curNode.next）。
遍历结束：当到达链表尾节点并访问完后，指针会指向尾节点的 next，此时 curNode 变为 null，遍历结束。
双向链表反向遍历（Doubly-Linked List Reverse Traversal）
双向链表（Doubly-Linked List）支持反向遍历，也就是说可以从链表的 尾节点（tail） 开始，向前一直遍历到 头节点（head）。
// eg: Linked list traversal algorithm.
ListTraverse(list) {
   curNode = list⇢head // Start at head

   while (curNode is not null) { 
      Print curNode's data        
      curNode = curNode⇢next
   }
}
// 反向遍历步骤：
初始化指针：使用一个指针 curNode 指向链表的尾节点（tail）。
遍历条件：当 curNode 不为 null 时，执行反向遍历操作。
操作节点：对当前节点执行操作，例如打印节点数据。
移动指针：将 curNode 指向上一个节点（即 curNode = curNode.previous）。
遍历结束：当到达链表头节点并访问完后，指针会指向头节点的 previous，此时 curNode 变为 null，遍历结束。
// eg: Reverse traversal algorithm.
ListTraverseReverse(list) {
   curNode = list⇢tail // Start at tail

   while (curNode is not null) { 
      Print curNode's data        
      curNode = curNode⇢prev
   }
}


// Sorting linked lists 链表的排序
// 链表插入排序的概述
插入排序（Insertion Sort）是一种简单的排序算法，适用于对少量元素进行排序。对于链表，插入排序的实现方式根据链表是双向链表还是单向链表有所不同：
双向链表（Doubly-Linked List）：支持双向遍历，因此可以向前移动节点，容易找到合适的插入位置。
单向链表（Singly-Linked List）：仅支持向后遍历，因此插入时需要从头开始寻找正确的位置。
// 双向链表的插入排序（Insertion Sort for Doubly-Linked Lists）
插入排序对于双向链表的工作方式与对数组进行插入排序类似。
从第二个节点开始，遍历链表中的每个节点，将它们逐个移动到已排序部分的合适位置。
// 向后和向前移动：由于双向链表有指向前一个节点的指针，因此可以方便地从当前位置向前移动节点，直到找到正确的插入位置。
// 操作步骤：
从链表第二个元素开始，逐个遍历。
每个元素与前面的已排序部分比较，找到正确的插入位置。
通过双向指针操作进行节点的插入。
// 单向链表的插入排序（Insertion Sort for Singly-Linked Lists）
单向链表（Singly-Linked List） 的插入排序需要不同的策略，因为单向链表只能向前遍历，不能向后回溯。
对于单向链表的插入排序，通常通过从链表头遍历到当前节点，找到合适的插入位置。
// 插入位置查找（ListFindInsertionPosition）：
查找插入位置时，必须从链表头开始遍历，直到找到插入位置。
如果当前节点应插入链表头部，ListFindInsertionPosition 返回 null。
// 操作步骤：
从第二个节点开始遍历链表，逐个节点处理。
每次找到合适的插入位置时，将当前节点插入到已排序部分中。
由于单向链表没有前向指针，插入操作要注意使用前驱节点的引用。

// 链表排序与数组排序的对比
// 数组排序：
常见的排序算法如快速排序（Quicksort）、堆排序（Heapsort）等依赖于对数组中任意位置的常量时间（O(1)）访问。
数组的随机访问特性使得这些排序算法效率非常高。
// 链表排序的挑战：
链表不支持随机访问，因此无法像数组一样通过索引在常量时间内访问任意位置的元素。
链表只能通过遍历的方式找到插入位置或交换元素的位置，因此对于快速排序、堆排序等基于索引的算法来说，难以直接应用于链表。
链表适合使用插入排序，因为插入排序可以通过节点的移动实现，而不需要频繁访问链表中的随机位置。

// 比较适合链表的排序算法：
| 排序算法       | 适应链表的方式                  |
|----------------|--------------------------------|
| 插入排序       | 在双向链表上类似操作。对于单向链表，插入排序需要从链表头开始搜索元素的插入位置。 |
| 归并排序       | 查找链表的中间节点需要从链表头线性搜索。归并算法可以在不需要额外存储的情况下合并链表。 |
// 不太适合链表的排序算法：
| 排序算法     | 挑战                                                      |
|--------------|-----------------------------------------------------------|
| 希尔排序     | 链表中无法跨越元素之间的间隔，每个元素之间都必须逐一遍历。  |
| 快速排序     | 分区操作需要在数组的右部分进行反向遍历，单向链表不支持反向遍历。 |
| 堆排序       | 在下移过程中需要通过索引访问以常量时间找到子节点。          |
