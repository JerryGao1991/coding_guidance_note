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


// 链表中的虚拟节点（Dummy Nodes）
// 什么是虚拟节点（Dummy Nodes）？
虚拟节点，也叫头节点，是一个在链表中始终存在但不包含有效数据的节点，通常放在链表的头部或尾部。
虚拟节点的作用是简化链表的操作，因为它确保了链表的头指针和尾指针始终不会为 null，从而减少了特殊情况下的边界处理。
// 单向链表的虚拟节点实现
当创建一个带虚拟节点的 单向链表 时，虚拟节点被分配并且链表的 头指针和尾指针 都指向该虚拟节点。
常见的链表操作（如追加、前插、插入、删除等）由于虚拟节点的存在而变得更简单：
追加（Append）、前插（Prepend） 和 插入（Insert After） 不再需要判断链表的头指针是否为空，因为头节点总是存在且指向虚拟节点。
删除（Remove After） 操作无需针对删除第一个节点进行特殊处理，因为第一个有效节点总是在虚拟节点之后。
// eg: Singly-linked list with dummy node: append, prepend, insert after, and remove after operations.    ---- please check CS570_example_code.java
// 双向链表的单个虚拟节点实现
双向链表 也可以使用虚拟节点。
在双向链表中，虚拟节点的 prev 指针设置为 null，且链表的头指针总是指向虚拟节点。
删除操作（ListRemove） 不允许删除虚拟节点，因为它始终存在，用于简化链表的结构和操作逻辑。
// eg: Doubly-linked list with dummy node: append, prepend, insert after, and remove operations.          ---- please check CS570_example_code.java
// 双向链表的头尾虚拟节点（Dummy Head and Tail Nodes）
在 双向链表 中，可以使用两个虚拟节点，一个在链表头部，另一个在链表尾部。
这样做可以进一步简化链表的实现，特别是可以消除更多的边界条件判断，例如在插入或删除时无需判断当前节点是否在链表的首位或末尾。
移除 ListInsertAfter 和 ListRemove 中的 if 语句
如果使用头尾虚拟节点，链表的许多操作可以通过移除边界条件的 if 语句来简化。
在 ListInsertAfter 中，可以移除判断条件，假设前提是 curNode 不能指向虚拟尾节点。
在 ListRemove 中，可以移除判断条件，假设前提是 curNode 不能指向任何一个虚拟节点（头或尾）。
通过这些假设，链表操作不再需要复杂的边界条件判断，从而简化了代码实现。
// eg: Doubly-linked list with 2 dummy nodes: append, prepend, insert after and remove operations.        ---- please check CS570_example_code.java
// 总结
虚拟节点的作用：通过在链表的头或尾部设置虚拟节点，使链表的操作更加简化，尤其是在添加或删除节点时。
单向链表中的应用：虚拟节点消除了链表为空或在头部进行插入/删除时的特殊处理。
双向链表中的应用：可以使用一个或两个虚拟节点，分别位于链表的头和尾部，来简化链表的双向操作。
减少边界条件判断：虚拟节点的存在可以消除链表操作中的特殊情况，减少 if 语句的使用，使代码更简洁易懂。


// 链表（Linked List）数据结构 
// 链表通常通过两种数据结构来实现：
列表数据结构（List Data Structure）：这个结构包含链表的头（head）和尾（tail）指针，可能还包含其他信息，比如链表的大小（size）。
链表节点数据结构（List Node Data Structure）：这个结构维护链表中每个元素的实际数据和指向其他节点的指针。
// 列表数据结构的作用
列表数据结构 并不是实现链表的必要条件，但它为链表的管理提供了便利。
头和尾指针管理：通过将头和尾指针封装在一个列表数据结构中，操作链表时更方便，尤其是访问链表的头部和尾部。
存储附加信息：还可以存储一些附加信息，比如链表的大小，从而为链表的操作提供更多便利（例如快速获取链表的长度）。
// 函数的简化
使用 列表数据结构 后，操作链表的函数只需要接受一个参数，即包含头尾指针的列表结构，从而简化了函数调用和链表管理。
而不使用列表数据结构时，函数可能需要独立的节点指针变量来跟踪链表的头节点和尾节点，这会让管理变得更加复杂。


// 循环链表（Circular Linked List） 的知识点总结：
// 1. 什么是循环链表？
循环链表 是一种特殊的链表，其中尾节点的 next 指针指向链表的头节点，而不是 null。
这种设计使得链表的节点形成一个循环，从尾节点可以直接回到头节点，链表没有明确的终点。
// 2. 循环链表的用途
表示循环过程：循环链表适用于表示重复发生的过程，比如自然界中的水循环（海洋水蒸发形成云，云降雨落在陆地上，水流通过河流再返回到海洋）。
在这些场景中，循环链表可以很好地模拟这个循环关系，便于理解和实现重复性过程。
// 3. 循环链表的头节点
循环链表的头节点通常被称为起始节点（start node），从该节点开始可以遍历整个链表，并且在到达尾节点后会重新返回到起始节点。
// 4. 遍历循环链表
遍历方法：遍历循环链表类似于遍历普通链表，但需要注意，遍历时不会到达 null。相反，遍历结束的条件是再次到达头节点。
终止条件：与标准链表的遍历不同，循环链表的遍历必须在到达头节点第二次时终止，而不是在遇到 null 时终止。这可以防止进入无限循环。



// 栈抽象数据类型（Stack Abstract Data Type, Stack ADT）
// 1. 什么是栈（Stack）？
栈 是一种抽象数据类型（Abstract Data Type, ADT），它的特点是元素只能在栈的顶端插入或移除。
栈的操作分为两种：
压入（Push）：将一个元素插入栈顶。
弹出（Pop）：移除并返回栈顶的元素。
// 2. 栈的工作方式
栈按照**后进先出（Last-In, First-Out, LIFO）**的原则进行操作。
// 3. 栈的特性
后进先出（LIFO）：栈中的元素遵循后进先出的顺序，这意味着最后压入栈中的元素最先被弹出。
栈的这种操作顺序使得它非常适合实现递归、函数调用栈等需要逆序操作的场景。
// 4. 栈的实现
// 栈可以通过多种方式实现：
链表（Linked List）：使用链表实现栈时，通常通过在链表的头部插入和删除元素来实现栈的 push 和 pop 操作。
数组（Array）：使用数组实现栈时，可以使用一个变量来跟踪栈顶位置，操作比较简单但需要固定的数组大小。
向量（Vector）：类似于数组，但向量的大小可以动态调整，因此更灵活一些。
// 常见的栈 ADT 操作
操作	描述	示例（初始栈为：99, 77，栈顶为 99）
Push(stack, x)	将 x 插入栈顶	Push(stack, 44) 后栈变为：44, 99, 77
Pop(stack)	返回并移除栈顶元素	Pop(stack) 返回 99，栈变为：77
Peek(stack)	返回但不移除栈顶元素	Peek(stack) 返回 99，栈保持不变：99, 77
IsEmpty(stack)	如果栈没有元素则返回 true	IsEmpty(stack) 返回 false
GetLength(stack)	返回栈中元素的个数	GetLength(stack) 返回 2


// Stacks using linked lists  使用链表实现栈
使用链表来实现栈时，链表的头节点（head）作为栈的栈顶（top）。
这样，每次压入（push）或者弹出（pop）操作都只涉及链表头部节点，非常高效，时间复杂度为 O(1)。
// Push 操作：
创建一个新的链表节点。
将新节点的数据设置为要压入栈的值。
将新节点添加到链表的头部（Prepend 操作）。
这样新节点成为链表的头节点，即栈的栈顶。
// Pop 操作：
将链表头节点的数据保存到一个局部变量中。
移除链表的头节点（Remove Head 操作）。
返回保存的数据，表示栈顶元素被弹出。
// 
// 使用链表实现栈，动态分配内存，栈的大小可以灵活扩展，不会像数组实现一样存在固定大小的限制。
// 在链表的头部进行插入和删除操作的时间复杂度都是 O(1)，非常高效。
// eg: Stack implementation using a linked list.
StackPush(stack, item) {
   newNode = Allocate new linked list node
   newNode⇢next = null
   newNode⇢data = item

   // Insert as list head (top of stack)
   ListPrepend(stack, newNode)
}

StackPop(stack) {
   headData = stack⇢head⇢data
   ListRemoveAfter(stack, null)
   return headData
}
// StackPush(stack, 45)
// StackPush(stack, 56)
// StackPush(stack, 11)
// poppedValue = StackPop(stack)



// Array-based stacks 数组实现的栈
// 栈的数组实现
// 栈（Stack） 可以使用数组来实现，用来存储元素。
// 需要两个额外的变量来跟踪数组和栈的状态：
allocationSize：表示数组的分配大小（容量）。
length：表示栈当前的长度（即栈中元素的数量）。
栈底元素 存储在 array[0]，栈顶元素 存储在 array[length - 1]。
如果栈为空，则 length 为 0。
// 无界栈（Unbounded Stack）
无界栈 是没有长度上限的栈，栈的长度可以无限增长。
对于无界栈，栈的数组分配大小（allocationSize）可以根据需要不断增加。
// 有界栈（Bounded Stack）
有界栈 的长度不能超过设定的最大值（通常为初始的数组分配大小）。
例如，有界栈的 allocationSize = 100，则最多只能包含 100 个元素。
当栈的长度等于最大长度时，栈被称为满栈。
// 支持有界和无界的单一实现
数组实现的栈可以通过使用 maxLength 来支持有界和无界的栈操作。
如果 maxLength 为负数，则表示栈是无界的，长度可以无限增加。
如果 maxLength 为非负数，则表示栈是有界的，最大长度为 maxLength。
// Push 操作的逻辑：
当 length == maxLength 时，不允许再进行 Push 操作。
如果 maxLength 为负数：
条件 length == maxLength 永远不会为真，因此所有的 Push 操作都被允许，这使得栈是无界的。
如果 maxLength 为非负数：
当栈的长度达到 maxLength 时，条件为真，因此不允许再 Push，这样栈就是有界的。
//eg: Stack push, resize, and pop operations.                          ---- please check CS570_example_code.java



// 队列（Queue）
// 定义和特点：
队列（Queue） 是一种 先进先出（FIFO, First In First Out） 的数据结构。
入队（Enqueue） 操作：将元素插入到队列的末尾。
出队（Dequeue） 操作：从队列的前端移除并返回一个元素。
例子：
如果先执行 "Enqueue 7"，"Enqueue 14"，"Enqueue 9"，接着执行 "Dequeue"，会返回 7，因为它是最早入队的元素。
再次执行 "Dequeue"，会返回 14。
// 队列的实现：
链表实现队列：可以使用链表来实现队列，链表的头节点是队列的前端，尾节点是队列的末尾。
数组实现队列：也可以使用数组来实现队列，通过维护前端和尾端索引来进行入队和出队操作。

操作	描述	示例（队列初始状态：43, 12, 77，43 为队首）
Enqueue(queue, x)	在队列末尾插入元素 x	Enqueue(queue, 56). 队列：43, 12, 77, 56
Dequeue(queue)	移除并返回队列前端的元素	Dequeue(queue) 返回：43. 队列：12, 77
Peek(queue)	返回但不移除队列前端的元素	Peek(queue) 返回：43. 队列仍然是：43, 12, 77
IsEmpty(queue)	如果队列为空，则返回 true	IsEmpty(queue) 返回：false
GetLength(queue)	返回队列中的元素数量	GetLength(queue) 返回：3


// 链表实现队列 Queues using linked lists
// 队列通常可以用链表来实现。
**头节点（head node）表示队列的前端，负责出队（dequeue）**操作。
**尾节点（tail node）表示队列的末端，负责入队（enqueue）**操作。
// 入队（Enqueue）操作：
创建一个新的链表节点，节点的数据部分存储待入队的元素。
将该节点追加到链表的尾部，使它成为新的尾节点。
尾节点用于确保新元素被添加到队列的末尾，从而维持队列的顺序。
// 出队（Dequeue）操作：
将队列头节点的数据存储到一个局部变量中。
移除头节点，使下一个节点成为新的头节点。
返回之前保存的局部变量值，即队列前端的元素。
这确保队列遵循**先进先出（FIFO）**原则。
// eg: Queue implemented using a linked list.
QueueEnqueue(queue, item) {
   newNode = Allocate new linked list node
   newNode⇢next = null
   newNode⇢data = item

   // Insert node as list tail (end of queue)
   ListAppend(queue, newNode)
}

QueueDequeue(queue) {
   headData = queue⇢head⇢data
   ListRemoveAfter(queue, null)
   return headData
}


// 数组的队列实现 Array-based Queues
// 1. 队列的数组存储
// 队列可以用数组实现，除了数组本身，还需要以下三个变量：
allocationSize：整数，表示数组的分配大小。
length：整数，表示队列中元素的数量。
frontIndex：整数，表示队列前端元素的索引。
// 队列的内容从 array[frontIndex] 开始，连续存储 length 个元素。如果数组末尾存储满了，剩余的元素会从索引 0 开始存储（即循环数组）。
// 2. 有界队列 vs 无界队列
// 有界队列：
队列的长度不能超过指定的最大值，需要额外的变量 maxLength。
maxLength 通常在队列创建时赋值，并在整个队列生命周期内保持不变。
当队列长度等于 maxLength 时，队列被认为是满的。
// 无界队列：
队列的长度可以无限增长，因此不需要指定最大长度。
如果 maxLength 为负数，则表示队列为无界队列。
// 3. 灵活的实现和调整大小操作
// 数组实现的队列可以支持有界和无界两种操作，通过设置 maxLength 来控制：
如果 maxLength 为负数，则为无界队列。
如果 maxLength 为非负数，则为有界队列。
调整大小操作：在需要时分配一个更大的数组，一般是当前大小的两倍。对于有界队列，分配的新数组大小是 maxLength 和当前大小的两倍中的较小值，保证队列不会超过最大长度。
所有现有的数组元素都会被复制到新的数组中，并将 frontIndex 重置为 0。
// 4. 入队和出队操作
// 入队操作（enqueue）：
比较 length 和 maxLength，如果两者相等，则队列已满，入队失败，返回 false。
比较 length 和 allocationSize，如果相等，则执行调整大小操作。
计算要入队元素的索引为 (frontIndex + length) % allocationSize，并将元素存储到该位置。例如，在 frontIndex = 2，length = 3，allocationSize = 8 的情况下，入队元素 42 会被存储在索引 (2 + 3) % 8 = 5 处。
length 加 1，然后返回 true。
// 出队操作（dequeue）：
复制 frontIndex 位置的数组元素。
length 减 1。
frontIndex 增加 1，如果增加后的值等于 allocationSize，则将其重置为 0。
返回复制的元素。
// 5. 最坏情况下的时间复杂度
无论是有界队列还是无界队列，在最坏情况下的时间复杂度是：
入队操作：O(N)（需要调整数组大小时）。
出队操作：O(1)。
另一种有界队列实现方式是将 maxLength 设置为初始分配大小，这样的实现永远不需要调整大小，因此入队操作的最坏情况下的时间复杂度为 O(1)。
// eg: Array-based queue resize operation.
ArrayQueueResize(queue) {
   newSize = queue⇢allocationSize * 2
   if (queue⇢maxLength >= 0 && newSize > queue⇢maxLength) {
      newSize = queue⇢maxLength
   }
   newArray = Allocate new array of size newSize
   for (i = 0; i < queue⇢length; i++) {
      itemIndex = (queue⇢frontIndex + i) % queue⇢allocationSize
      newArray[i] = queue⇢array[itemIndex]
   }
   queue⇢array = newArray
   queue⇢allocationSize = newSize
   queue⇢frontIndex = 0
}

// eg: Array-based queue enqueue and dequeue operations.
ArrayQueueEnqueue(queue, item) {
   if (queue⇢length == queue⇢maxLength) {
      return false
   }
   if (queue⇢length == queue⇢allocationSize) {
      ArrayQueueResize(queue)
   }

   itemIndex = (queue⇢frontIndex + queue⇢length) % queue⇢allocationSize
   queue⇢array[itemIndex] = item
   queue⇢length += 1
   return true
}
  
ArrayQueueDequeue(queue) {
   toReturn = queue⇢array[queue⇢frontIndex]
   queue⇢length -= 1
   queue⇢frontIndex = (queue⇢frontIndex + 1) % queue⇢allocationSize
   return toReturn
}


// Deque 双端队列
// 双端队列（Deque，读作 "deck"，全称为 double-ended queue）是一种抽象数据类型（ADT），其特点是可以在前端和后端同时进行插入和删除。
// 基本操作
Push-front：在双端队列的前端插入一个元素。
Push-back：在双端队列的后端插入一个元素。
Pop-front：移除并返回双端队列前端的元素。
Pop-back：移除并返回双端队列后端的元素。
// 实现方式
链表：双端队列可以使用双向链表来实现，这样可以很方便地在前端和后端进行插入和删除操作。
数组：双端队列也可以使用数组来实现，可以通过循环数组的方式支持前后双向插入和删除。
// 用途和优势
双端队列是一种灵活的数据结构，支持从两端进行插入和删除，提供比单向队列或栈更灵活的操作方式，适合用于需要双端访问的场景。
例如，在一些需要保持双端动态的场景（如滑动窗口、缓存管理等）中，双端队列是非常有用的数据结构。

// Common deque ADT operations
| Operation           | Description                                           | Example starting with deque: 59, 63, 19 (front is 59)     |
|---------------------|-------------------------------------------------------|-----------------------------------------------------------|
| PushFront(deque, x) | Inserts x at the front of the deque                   | PushFront(deque, 41). Deque: 41, 59, 63, 19                |
| PushBack(deque, x)  | Inserts x at the back of the deque                    | PushBack(deque, 41). Deque: 59, 63, 19, 41                 |
| PopFront(deque)     | Returns and removes item at front of deque            | PopFront(deque) returns 59. Deque: 63, 19                  |
| PopBack(deque)      | Returns and removes item at back of deque             | PopBack(deque) returns 19. Deque: 59, 63                   |
| PeekFront(deque)    | Returns but does not remove the item at front of deque| PeekFront(deque) returns 59. Deque is still: 59, 63, 19    |
| PeekBack(deque)     | Returns but does not remove the item at back of deque | PeekBack(deque) returns 19. Deque is still: 59, 63, 19     |
| IsEmpty(deque)      | Returns true if the deque is empty                    | IsEmpty(deque) returns false.                              |
| GetLength(deque)    | Returns the number of items in the deque              | GetLength(deque) returns 3.                                |



// 递归算法的核心
// 递归算法的核心在于将问题分解为更小的子问题，并在子问题上应用相同的解决方案。以下是递归算法的核心要素：
分解问题：将复杂问题拆解成更小、结构相似的子问题，递归地调用自身来解决每个子问题。
递归调用：递归算法在每一步都调用自身，将问题逐步缩小，直到满足特定条件。
基本情况（Base Case）：递归必须在某个点停止，这个停止条件称为“基本情况”。一旦到达基本情况，递归停止，返回结果。这是递归算法防止无限循环的关键。
组合结果：当所有子问题都解决后，递归调用返回的结果将组合起来，构成问题的最终解。

// 递归的方式：递归可以是直接递归（方法f()调用自身f()），也可以是间接递归（方法f()调用g()，然后g()再调用f()），即多层递归调用。

递归：由于每次递归调用会创建新的方法副本并占用调用栈空间，因此可能带来较高的内存开销和调用开销。如果递归深度过大，还可能导致栈溢出错误。
循环：循环的内存开销较小，通常更高效，尤其是对大型数据集或简单重复操作，循环的性能更优。
// 理论上，递归和循环是可以相互转换的。



// 递归搜索算法 Recursive algorithm: Search
// 二分查找算法的递归实现：
二分查找算法适合使用递归方法。递归方法 guessNumber(lowVal, highVal, scnr) 使用 lowVal 和 highVal 表示当前的猜测范围。
该方法在当前范围的中点进行猜测，如果猜测值偏小，则在上半区（midVal + 1 到 highVal）递归调用；若偏大，则在下半区（lowVal 到 midVal）递归调用。
递归方法通常包含 if-else 结构，其中 if 分支为基本情况（停止条件），else 分支包含递归调用。这种结构在递归方法中很常见。
// eg: A recursive method carrying out a binary search algorithm.                                     ---- please check CS570_example_code.java     

// 递归搜索排序列表中的元素：
递归搜索可以应用于已排序的列表（例如一个按字母顺序排列的与会者名单），以便快速查找某个元素。
findMatch() 方法用于查找特定元素，它将搜索范围限制在 lowVal 到 highVal 之间。main() 方法最初传入整个列表的范围：0 到 list size - 1。
findMatch() 方法执行以下步骤：
基本情况：检查中间元素是否匹配，如果匹配则返回其位置。
边界条件：若搜索范围仅包含一个元素且不匹配，则返回 -1，表示未找到。
递归搜索：如果上述两种情况均不满足，则根据中间值递归地搜索上半区或下半区。
// eg: Recursively searching a sorted list.                                                           ---- please check CS570_example_code.java  

// 递归搜索算法的核心要点
二分法思想：每次猜测通过中间值将范围缩小一半。
递归结构：包含基本情况（停止条件）和递归情况（分治搜索）。
高效性：二分查找在已排序的列表中效率高，通过递归或循环均可实现。

// 二分查找的常见问题
在递归实现中，当搜索“下半部分”时，为什么不使用 search(allLetters, letterMatch, lowerIndex, middleIndex - 1)，
而是使用 search(allLetters, letterMatch, lowerIndex, middleIndex)。
// 主要是出于边界条件考虑：
如果将下半部分设为 search(allLetters, letterMatch, lowerIndex, middleIndex - 1)，那么在某些情况下会导致下半部分中少一个元素，特别是在范围只有两个元素时。
举个例子，如果范围是 lowerIndex = 0 和 upperIndex = 1，middleIndex 计算结果为 0。此时，如果使用 middleIndex - 1，下半部分的范围会变成 (0, -1)，导致非法索引访问。



// 在递归方法中添加输出语句进行调试 Adding output statements for debugging
递归方法调试通常较难，通过添加输出语句可以观察方法的每次调用和返回，帮助跟踪递归过程。
在递归方法中添加一个额外的参数（例如 indent）用于控制输出的缩进。indent 表示当前递归的深度，可以是固定数量的空格。
每次递归调用时，增加 indent 的值，使得输出的缩进随递归深度而增加。这样可以清晰地显示每层递归的层级关系。
// eg: Output statements can help debug recursive methods, especially if indented based on recursion depth.                       ---- please check CS570_example_code.java



// Creating a recursive method 创建递归方法
// 创建递归方法的步骤：
编写基本情况（Base Case）：递归方法必须包含一个不调用自身的返回情况，即基本情况，通常先编写并测试基本情况。一个方法中可能存在多个基本情况。
编写递归情况（Recursive Case）：添加递归调用的情况，在满足特定条件时递归调用自身以缩小问题规模。
// 常见错误：
缺少所有可能的基本情况：没有涵盖所有基本情况可能导致无限递归。
无法达到基本情况：如果递归方法没有合理地缩小问题规模，可能无法最终到达基本情况，导致无限递归和程序崩溃。
// 外部和内部方法设计：
外部方法（如 calcFactorial）供程序其他部分调用，负责初步检查输入值是否合法。
内部方法（如 calcFactorialHelper）仅被外部方法调用，包含递归逻辑和递归中实际使用的参数，保持外部方法简洁直观。
// 递归解决方案的适用性：
问题是否自然适合递归解决。
递归方法是否优于非递归方法。


// Recursive exploration of all possibilities 递归探索所有可能性 
递归是一种强大的技术，用于系统性地探索所有可能的排列、组合或路径。
// eg: Scramble a word's letters in every possible way.                      ---- please check CS570_example_code.java
// eg: Shopping spree in which a user can fit 3 items in a shopping bag.     ---- please check CS570_example_code.java
// eg: Find distance of traveling to 3 cities.                               ---- please check CS570_example_code.java
// eg: BinarySearch recursive algorithm.                                     
BinarySearch(numbers, low, high, key) {
   if (low > high)
      return -1

   mid = (low + high) / 2
   if (numbers[mid] < key) {
      return BinarySearch(numbers, mid + 1, high, key)
   }
   else if (numbers[mid] > key) {
      return BinarySearch(numbers, low, mid - 1, key)
   }
   return mid
}



// binary tree 二叉树的基本概念
二叉树：一种每个节点最多有两个子节点的数据结构，分别叫做left child 左孩子和 right child右孩子。
leaf 叶子节点：没有子节点的节点。
internal node 内部节点：至少有一个子节点的节点。
parent 父节点：有子节点的节点称为子节点的父节点。
root 根节点：树中唯一没有父节点的节点，也叫“顶”节点。
ancestor 祖先节点：从根节点到某个节点路径上所有节点都是该节点的祖先。
// 深度、层级、高度
edge 边（Edge）：连接节点与其子节点的链接称为边。
depth 节点深度：从根节点到该节点路径上的边数。根节点的深度为 0。
level 层级：具有相同深度的所有节点组成一个层级。
height 树的高度：树中所有节点的最大深度。只有一个节点的树高度为 0。
// 特殊类型的二叉树
满二叉树（Full Binary Tree）：每个节点要么没有子节点，要么有两个子节点。
完全二叉树（Complete Binary Tree）：所有层次（除了可能的最后一层）都完全填满，最后一层的节点尽量靠左。
完美二叉树（Perfect Binary Tree）：所有内部节点都有两个子节点，所有叶子节点在同一层级。

// 树的应用
// 1. 文件系统
树结构常用于表示分层数据，例如文件系统中的文件和目录。文件系统本质上是一个层次结构，非常适合用树结构来表示。
// 2. 二元空间分割（BSP）
二元空间分割是一种将空间区域反复分成两部分，并对区域内的对象进行分类的方法。
BSP 树是一种用于存储二元空间分割信息的二叉树，每个节点包含关于空间区域的信息以及区域中包含的对象。
在图形应用中，BSP 树可以用来存储多维世界中的所有对象，然后用来高效地确定哪些对象需要在屏幕上渲染。通过使用观察者在空间中的位置来查找 BSP 树，可以快速排除大量不可见且无需渲染的对象。




// 二叉搜索树 (Binary Search Tree, BST)
// 二叉搜索树 (BST) 是一种具有排序属性的二叉树：
对于任意节点：
左子树中的所有键值 ≤ 当前节点的键值。
右子树中的所有键值 ≥ 当前节点的键值。

// BST 中的搜索
// 将目标键值与 currentNode 的键值进行比较：
如果目标键值更小，则移动到左子节点。
如果目标键值更大，则移动到右子节点。
如果没有子节点可访问，则目标节点不存在。

// BST 的时间复杂度
// 最坏情况下的时间复杂度：
需要进行 H + 1 次比较，其中 H 是 BST 的高度。
时间复杂度为 O(H)。
// 为了最小化高度：
尽量让所有层次都保持满，除最后一层外。
这样的树的高度约为 log₂(N)。

// 后继节点与前驱节点
在 BST 中，节点之间按照从小到大的顺序排列。
// 如何找到后继节点
// 1. 如果节点有右子树：
后继节点是右子树中最左的子节点。
从右子树的根节点开始，沿左子树遍历，直到找到没有左子节点的节点。
// 2. 如果节点没有右子树：
后继节点是第一个将当前节点包含在左子树中的祖先节点。
// 如何找到前驱节点：
紧接当前节点之前的节点（与后继节点逻辑类似)


// binary search tree (BST) insert algorithm 二叉搜索树插入操作
// BST 插入操作的步骤
1. 从根节点开始比较：
当前节点初始为树的根节点。
2. 插入为左子节点：
如果新节点的键值小于当前节点的键值，且当前节点的左子节点为空，则将新节点插入为当前节点的左子节点。
3. 插入为右子节点：
如果新节点的键值大于或等于当前节点的键值，且当前节点的右子节点为空，则将新节点插入为当前节点的右子节点。
4. 寻找插入位置：
如果左（或右）子节点不为空，则将当前节点更新为其左（或右）子节点，继续上述比较过程，直到找到适当的插入位置。

// 时间复杂度
最佳情况：树的高度最小（平衡二叉树），需要的比较次数为 O(log N)。
最差情况：树的高度最大（退化为链表），需要的比较次数为 O(N)。
// 空间复杂度
空间复杂度：O(1)。
仅使用一个指针在树中遍历寻找插入位置。
// eg: Binary search tree insertions.                                    ---- please check CS570_example_code.java



// binary search tree (BST) delete algorithm 二叉搜索树删除操作
// BST 删除操作的步骤
// 三种情况处理：
// 1. 叶子节点的删除：
如果 X 有父节点：将父节点指向 X 的指针（左或右子节点）设置为 null。
如果 X 是根节点：将根节点指针设置为 null，此时树为空。
// 2. 只有一个子节点的内部节点 internal node 删除：
如果 X 有父节点：将父节点指向 X 的指针设置为 X 的唯一子节点。
如果 X 是根节点：将根节点指针设置为 X 的唯一子节点。
// 3. 有两个子节点的内部节点删除：
找到 X 的后继节点（即 X 右子树的最左子节点）。
将后继节点的值复制到节点 X。
递归地从右子树中删除后继节点。

// 时间复杂度
// 最佳情况（平衡二叉树）：
删除操作遍历树的高度 log₂N。
时间复杂度为 O(log N)。
// 最差情况（退化为链表）：
删除操作可能遍历树的所有节点。
时间复杂度为 O(N)。
// 空间复杂度
空间复杂度：O(1)。
删除操作仅需两个指针遍历树，若涉及到递归，仅额外保存一个节点的数据。

// 注意点
// 1. 后继节点的选择：
当删除有两个子节点的节点时，选择右子树中最小的节点（后继）进行替换。
// 2. 平衡性问题：
在普通 BST 中，删除操作不会主动维护树的平衡性。可考虑使用 AVL 树或红黑树等平衡二叉树结构。




// BST 中序遍历（Inorder Traversal）
// 中序遍历是一种 二叉搜索树（BST）遍历方法，按照从小到大的顺序访问树中的所有节点。因此，它非常适合用来 输出树中节点的有序值。
// 中序遍历的特点
在 BST（Binary Search Tree） 中，中序遍历会按照节点的键值从 小到大 的顺序访问节点。
有序输出：这是中序遍历的一个重要性质，尤其对于 BST 来说。
// eg: BST inorder traversal algorithm.                                         ---- please check CS570_example_code.java



// BST高度与插入顺序总结  BST height and insertion order
// 树的高度是从 根节点 到 任意叶子节点 的 最长路径的边数。
单节点树：高度为 0（根节点即叶子节点）。
空树：高度为 -1。
// BST 的高度范围
最小高度：logn
这种情况发生在树的每一层（除了最后一层）都被填满时，称为 完全二叉树。
最大高度：n - 1
这种情况发生在所有节点形成一条单链时，树退化成链表。

// BSTGetHeight算法
该算法用于计算 BST 子树的高度，核心是递归比较左右子树的高度：
如果当前节点为空（null），返回高度 -1（空树）。
如果当前节点不为空：
递归计算左子树的高度。
递归计算右子树的高度。
// eg: BSTGetHeight algorithm.
BSTGetHeight(node) {
   if (node is null) {
      return -1
   }
   leftHeight = BSTGetHeight(node⇢left)
   rightHeight = BSTGetHeight(node⇢right)
   return 1 + max(leftHeight, rightHeight)
}




// BST 节点中的父指针（Parent Node Pointers）
// 父指针的作用
每个节点记录了它的直接父节点的地址或引用。
通过父指针，可以从任意节点向树的上层（祖先节点）进行遍历。
// 父指针的优势
// 1.向上遍历：
能快速访问节点的父节点、祖父节点或兄弟节点。
这在某些算法中（如平衡树的调整）非常重要。
// 2.支持平衡调整：
在 AVL树 和 红黑树 这样的平衡二叉树中，父指针被广泛用于调整树的平衡性。
在执行旋转操作时，父指针能快速定位需要调整的节点和其祖先节点。
// 3.辅助复杂操作：
在一些操作（如查找节点的后继或前驱节点）中，父指针可以减少某些计算的复杂性。

// 父指针的应用场景
// 1. 节点的后继与前驱查找：
通过父指针，可以快速找到节点的后继或前驱节点，尤其是在节点没有右子树或左子树的情况下。
// 2. 维护树的平衡性：
平衡二叉树（如 AVL树 或 红黑树）的插入和删除操作依赖于父指针，便于在子树调整后更新父节点的状态。
// 3. 路径查找：
在某些路径相关的操作中（如查找从某节点到根节点的路径），父指针可以显著简化实现。

// 总结
父指针是 BST 的重要扩展，它通过支持向上遍历简化了许多算法的实现，尤其是在平衡树中。
它虽然增加了一定的存储开销，但在路径查找、后继/前驱查找以及维护平衡性时显著提升了效率。
常见的使用父指针的场景包括 AVL树 和 红黑树 等平衡二叉搜索树。

// eg: BSTInsert algorithm for BSTs with nodes containing parent pointers.                              ---- please check CS570_example_code.java
// eg: BSTReplaceChild algorithm.                                                                       ---- please check CS570_example_code.java
// eg: BSTRemoveKey and BSTRemoveNode algorithms for BSTs with nodes containing parent pointers.        ---- please check CS570_example_code.java



// 二叉搜索树（BST）递归操作知识点总结
// 1. 递归搜索算法（Recursive Search Algorithm）
// 基本思路：
使用递归方法在 BST 中查找节点。
两种基准情况（Base Cases）：
当前节点为 null，则返回 null，表示没有找到目标值。
当前节点的键值与目标值相等，返回该节点。
如果目标值小于当前节点的键值，则递归调用左子节点。
如果目标值大于当前节点的键值，则递归调用右子节点。
// eg: BST recursive search algorithm.                                                                ---- please check CS570_example_code.java


// 2. 递归获取父节点算法（Recursive Get-Parent Algorithm）
// 基本思路：
与搜索算法类似，但不是直接比较当前节点的键值，而是比较目标值与当前节点子节点的键值。
如果目标值等于某个子节点的键值，返回当前节点（即父节点）。
如果目标值小于当前节点的键值，递归搜索左子树。
如果目标值大于当前节点的键值，递归搜索右子树。
用途：
在删除或更新节点时，快速找到目标节点的父节点。
// eg: BST get parent algorithm.                                                                      ---- please check CS570_example_code.java

// 3. 递归插入算法（Recursive Insertion Algorithm）
// 基本思路：
1. 递归遍历树，直到找到合适的插入位置。
2. 如果目标值小于当前节点的键值：
如果左子节点为空，插入到左子节点。
如果左子节点不为空，递归调用左子树。
3. 如果目标值大于当前节点的键值：
如果右子节点为空，插入到右子节点。
如果右子节点不为空，递归调用右子树。

// 4. 递归删除算法（Recursive Removal Algorithm）
// 基本思路：
使用递归方法找到目标节点和目标节点的父节点。
// 删除节点的不同情况：
1. 叶子节点： 直接将父节点指向目标节点的指针置为 null。
2. 只有一个子节点的内部节点： 将目标节点的父节点指针指向目标节点的唯一子节点。
3. 有两个子节点的内部节点：
找到目标节点的后继节点（右子树的最左节点）。
用后继节点的值替换目标节点的值。
递归删除后继节点。
// eg: Recursive BST insertion and removal.                                                     ---- please check CS570_example_code.java




// Tries 字典树 前缀树
Trie字典树（或前缀树prefix tree）是一棵表示一组字符串的树。
每个非根节点 non-root node 代表一个字符。每个节点最多有一个子节点来表示每个不同的字母字符。
terminal node 终端节点是表示终止字符的节点，即字典树中字符串的结尾。
字典树提供了高效的字符串存储和快速搜索，常用于实现自动完成和预测文本输入。

// Trie 插入算法
trie 插入操作会创建一条从根到终端节点terminal node的路径，该路径按顺序访问该字符串的所有字符。
当前节点指针最初指向根。然后循环遍历字符串的字符。对于每个字符 C：
仅当当前节点没有 C 的子节点时，才会添加新的子节点。
当前节点指针被分配给 C 的当前节点的子节点。
处理完所有字符后，添加并返回一个终端节点。
// eg: Trie insert algorithm.                ---- please check CS570_example_code.java

// Trie 搜索算法
trie 搜索操作将返回与该字符串对应的终端节点，如果该字符串不在 trie 中，则返回 null。

// Trie 删除算法
trie 删除操作将删除该字符串对应的终端节点和所有具有 0 个子节点的非根祖先。


// Trie 时间复杂度总结
// 核心结论：
Trie 的插入、删除和搜索操作的时间复杂度仅取决于字符串的长度，而与 Trie 的当前节点数量无关。
使用查找表（如数组或哈希表）存储每个节点的子节点，可以将子节点的检索时间优化为 O(1)。
// 具体操作的时间复杂度：
插入（Insert）： O(M)
遍历字符串的每个字符，每次操作找到或创建一个子节点。
搜索（Search）： O(M)
遍历字符串的每个字符，每次操作检查是否存在对应的子节点。
删除（Remove）： O(M)
查找到字符串对应的终止节点，并从终止节点向上删除无子节点的非根节点。




// 堆（Heap）
// 1. 堆的定义
堆是一种完全二叉树，用于快速访问和移除动态集合中的最大值或最小值。
// 最大堆（Max-Heap）：
每个节点的值大于或等于其子节点的值。
根节点的值是整个堆的最大值。
// 最小堆（Min-Heap）：
每个节点的值小于或等于其子节点的值。
根节点的值是整个堆的最小值。

// 2. 应用场景
// 2.1. 快速访问最大值或最小值：例如任务调度、优先队列等。
例：如果有优先级分别为 22、14、98 和 50 的四个任务，最大堆将优先执行任务 98，然后是 50、22 和 14。
// 2.2 避免不必要的排序：
堆只需要维护根节点（最大值或最小值），无需像排序数组那样维护整体顺序，从而减少操作成本。



// 3. 最大堆的操作
// 插入操作（Insert）
// 过程：
将新节点插入到树的最后一层的最右侧位置。
若插入后破坏了堆的性质，则与其父节点交换。
继续向上调整，直到恢复堆的性质。
// 特点：
插入时按从左到右的顺序填充一层，然后再开始新的一层。
上滤（Percolating up）：新节点向上移动以恢复堆的性质。
时间复杂度：logn

// 移除操作（Remove） (heap 移除始终是移除根节点)
// 过程：
移除堆顶（根节点，即最大值）。
用树的最后一层的最右节点替换根节点。
若替换后破坏了堆的性质，与其子节点中较大的节点交换。
继续向下调整，直到恢复堆的性质。
// 特点: 
移除堆顶后，堆仍然保持完全二叉树的结构。
下滤（Percolating down）：替换的节点向下移动以恢复堆的性质。
时间复杂度：O(logN)

// # 堆（Heap）时间复杂度总结
| 操作       | 时间复杂度   | 描述                                  |
|------------|--------------|---------------------------------------|
| 插入操作   | O(log N)     | 插入节点后需要调整堆的结构，最多调整到根节点。 |
| 移除堆顶   | O(log N)     | 移除根节点后需要重新调整堆的结构。        |
| 获取堆顶   | O(1)         | 根节点直接可得，无需调整堆结构。          |




// 堆使用数组存储（Heaps Using Arrays）
// 1. 堆存储结构（Heap Storage）
// 堆的数组表示：
堆通常使用数组来存储。给定一个堆的树形表示，可以通过按从左到右、从上到下的顺序遍历树的每一层来生成堆的数组表示。
根节点：在数组的索引 0 处。
根节点的左子节点：在数组的索引 1 处。
根节点的右子节点：在数组的索引 2 处。
          10
         /  \
       5     3
      / \   /
     2   4 1

[10, 5, 3, 2, 4, 1]

// 2. 父节点和子节点的索引公式（Parent and Child Indices）
由于堆是基于数组实现的，没有像传统的树结构那样使用节点结构和父子指针，因此需要通过索引来引用父节点和子节点。
// 父节点的索引公式：
给定一个节点的索引 i，父节点的索引为：
parent(i) = floor((i - 1) / 2)
如果 i = 0，即根节点，父节点没有，通常会返回 -1。
// 左子节点的索引公式：
给定一个节点的索引 i，左子节点的索引为：
leftChild(i) = 2 * i + 1
如果左子节点的索引超出了数组的长度，则该节点没有左子节点。
// 右子节点的索引公式：
rightChild(i) = 2 * i + 2
如果右子节点的索引超出了数组的长度，则该节点没有右子节点。

// 3. 上滤和下滤算法（Percolate Algorithm）
// 上滤（Percolate-Up）：
用于插入元素时，保持堆的性质。
当新元素插入到堆的最后一层时，可能会违反堆的性质（例如，最大堆中新节点的值大于其父节点的值）。此时，需要通过与父节点交换，直到堆的性质恢复。
// eg: Max-heap percolate up algorithm.
MaxHeapPercolateUp(nodeIndex, heapArray) {
   while (nodeIndex > 0) {
      parentIndex = (nodeIndex - 1) / 2
      if (heapArray[nodeIndex] <= heapArray[parentIndex])
         return
      else {
         swap heapArray[nodeIndex] and heapArray[parentIndex]
         nodeIndex = parentIndex
      }
   }
}

// 下滤（Percolate-Down）：
用于移除堆顶元素时，恢复堆的性质。
移除堆顶元素后，堆会被最后一个元素替换。此时需要将替换元素向下调整，直到堆的性质恢复。
// eg: Max-heap percolate down algorithm.
MaxHeapPercolateDown(nodeIndex, heapArray, arraySize) {
   childIndex = 2 * nodeIndex + 1
   value = heapArray[nodeIndex]

   while (childIndex < arraySize) {
      // Find the max among the node and all the node's children
      maxValue = value
      maxIndex = -1
      for (i = 0; i < 2 && i + childIndex < arraySize; i++) {
         if (heapArray[i + childIndex] > maxValue) {
            maxValue = heapArray[i + childIndex]
            maxIndex = i + childIndex
         }
      }

      if (maxValue == value) {
         return
      }
      else {
         swap heapArray[nodeIndex] and heapArray[maxIndex]
         nodeIndex = maxIndex
         childIndex = 2 * nodeIndex + 1
      }
   }
}




// 堆排序（Heapsort）知识点整理
// 1. 堆化操作（Heapify Operation）
// 定义： 堆排序利用最大堆的性质，通过反复移除最大元素，逐步构建一个逆序的已排序数组。为了开始堆排序，首先需要将一个无序的数组转化为堆，这一过程称为堆化（heapify）。
// 堆化过程：
叶节点本身已经满足最大堆属性。
对于每个非叶节点，从最后一个内部节点开始，逐个进行“下滤（percolate down）”操作，以确保每个子树满足最大堆的性质。
堆化的顺序是从数组的最后一个非叶节点开始，到根节点结束。对于数组长度为 N 的堆，最后一个非叶节点的索引是 (N / 2) - 1。

// 2. 堆排序概述（Heapsort Overview）
// 过程：
2.1 堆化： 将无序的数组转化为最大堆（max-heap）。
2.2 删除最大元素： 堆排序通过反复移除堆顶的最大值，将其放置在数组的末尾。
2.3 递减操作： 每移除一个最大元素，堆的大小减 1，并重新调整堆直到完成排序。

// 3. 堆排序算法（Heapsort Algorithm）
// 堆排序使用两个循环来对数组进行排序：
第一个循环（堆化）： 使用 MaxHeapPercolateDown 操作将数组转换为一个最大堆。
第二个循环（移除最大元素）： 移除堆顶的最大元素，将其放置到当前数组末尾，并调整剩余堆。
// 堆排序的步骤：
3.1 将整个数组转化为最大堆。
3.2 交换堆顶元素与数组末尾的元素，将堆的大小减 1。
3.3 通过“下滤”操作重新调整堆。
3.4 重复步骤 2 和 3，直到所有元素都排好序。

// 4. 堆排序的时间复杂度
堆化操作（Heapify）： 每次调整堆需要 O(log N) 时间，因此堆化整个数组的时间复杂度是 O(N)。
删除最大元素（移除堆顶）： 每次移除最大元素并调整堆的时间复杂度是 O(log N)，共进行 N 次操作。
// 总体时间复杂度：
时间复杂度： O(N log N)。
空间复杂度： O(1)（堆排序是原地排序，不需要额外的存储空间）。

// 5. 堆排序的优缺点
// 优点：
时间复杂度稳定：堆排序的最坏时间复杂度为 O(N log N)，是稳定的。
原地排序：堆排序不需要额外的存储空间，空间复杂度为 O(1)。
// 缺点：
不是稳定排序：堆排序会破坏相等元素的相对顺序，因此它不是稳定的排序算法。
不适合小规模数据：对于小规模数据，快速排序或插入排序更为高效。



// 优先队列（Priority Queue）
// 1. 优先队列抽象数据类型（ADT）
// 定义：
优先队列是一种特殊的队列，其中每个元素都有一个优先级，具有更高优先级的元素会被放置在队列前面，而优先级较低的元素排在后面。
// 操作：
Enqueue（入队）：插入一个元素到队列中，按照元素的优先级将其放到适当的位置。优先级较高的元素会排在队列前面，优先级相同的元素按插入顺序排列。
Dequeue（出队）：移除并返回队列中优先级最高的元素（队列头部的元素）。
// 常见操作：
Peek（窥视）：返回队列中优先级最高的元素，但不将其从队列中移除。
Length（查询长度）：查询队列中当前元素的数量。

// 2. 优先队列入队（Enqueueing Items）
// 优先级确定方式：
内建优先级：每个元素本身携带有优先级信息，例如客户对象包含客户的名字和服务优先级。
显式传入优先级：在入队操作时，显式指定每个元素的优先级，例如调用 EnqueueWithPriority 来将元素与指定的优先级一起入队。

// 3. 使用堆实现优先队列（Implementing Priority Queues with Heaps）
// 堆（Heap）作为实现：
// 优先队列通常通过堆来实现。
最大堆（Max-Heap）：堆的根节点总是具有最高优先级的元素，能够在 O(1) 时间内访问。
// 堆操作：
入队操作：将元素添加到堆中，并维持堆的性质，最坏情况下的时间复杂度是 O(log N)。
出队操作：移除并返回堆顶元素（即最大元素），时间复杂度为 O(log N)。
// 时间复杂度：
访问最大优先级元素：O(1)。
插入和移除操作：O(log N)，因为需要调整堆来保持优先队列的性质。

// 4. 优先队列的应用
// 常见应用场景：
任务调度：操作系统中常使用优先队列来调度任务，优先执行高优先级的任务。
路径搜索算法：如 Dijkstra 算法，用于寻找图中的最短路径，常使用优先队列来管理待处理的节点。
数据流管理：在实时数据流中，优先队列常用于按优先级处理事件或数据。
合并多个已排序的队列：优先队列可用于合并多个已排序的队列或流。

// 5. 优先队列的优缺点
// 优点：
高效：使用堆实现时，插入和删除操作的时间复杂度为 O(log N)，能够高效地管理优先级。
简洁性：可以通过堆结构实现并维护优先队列的性质，操作简便。
// 缺点：
不是稳定的排序：同优先级的元素会按照插入顺序进行排列，但可能没有严格的排序。
空间复杂度：堆的实现通常需要额外的存储空间。







// Treap（树堆）
Treap 是一种结合了二叉搜索树（BST）和堆（Heap）特性的数据结构。它使用两个关键字：
主键（Main Key）：维持二叉搜索树的顺序性质。
优先级键（Priority）：在插入时随机生成，维持堆的性质（假设为最大堆）。
// Treap的基本操作：
// 1. 搜索（Search）：
与二叉搜索树相同，通过主键进行搜索。
// 2. 插入（Insert）：
首先，按照主键插入节点，保持BST性质。
随后，随机分配一个优先级（Priority）。
使用旋转操作将节点“上浮”，直到堆的性质不再被破坏。旋转操作能够保持BST性质，而交换节点则无法做到这一点。
// 3. 删除（Delete）：
删除操作的简化方式是将删除节点的优先级设置为最小值（对于最大堆，设为-∞）。
然后，通过旋转操作将节点下沉直到成为叶节点，最后删除该节点。
旋转操作是基于优先级较低的子节点进行的，从而确保堆的性质。
// 删除的另一种方法：
可以先进行标准的BST删除（将节点的后继替换到要删除的节点，然后删除原先的后继）。
然后进行旋转操作，直到堆的性质不被破坏。







// 哈希表概述（Hash Table Overview）
定义：哈希表是一种通过将元素的键值映射到数组索引的方式来存储无序项的数据结构。
映射方式：通常使用哈希函数将键映射到数组的某个索引位置。例如，key % array_size。
优势：哈希表的插入、删除和查找操作的平均时间复杂度是 O(1)，相较于列表的 O(N) 或二分搜索的 O(log N)，效率更高。

// 哈希表的基本概念
// 1. 键（Key）：
哈希表中用于映射到索引的值。
理想情况下，每个键应该是唯一的，以避免冲突。
// 2. 桶（Bucket）：
哈希表数组中的每个元素称为一个桶，用于存储映射的值。
// 3. 哈希函数（Hash Function）：
根据键计算出桶的索引值的函数。
通常使用取模操作，例如 key % table_size。

// 哈希表操作（Hash Table Operations）
// 1. 插入（Insert）：
使用哈希函数计算键对应的桶索引。
将元素存储到该桶中。
// 2. 删除（Remove）：
计算键的桶索引，定位元素并删除。
// 3. 查找（Search）：
根据哈希函数计算出桶索引，定位并返回元素。

// 空单元格（Empty Cells）
// 标识空桶：
如果存储的是简单数据（如整数），可以用特殊值（如 -1）表示空。
如果存储的是复杂对象，常用指针，空单元格通常表示为 null。

// 碰撞（Collisions）
// 定义：不同的键映射到同一个桶时发生冲突。
// 解决技术：
// 1. 链地址法（Chaining）：
每个桶存储一个链表，用于存放所有映射到该桶的元素。
例如，索引 5 的链表中可能存储 55 -> 75。
// 2. 开放地址法（Open Addressing）：
在冲突发生时，查找其他空桶存储该值。
例如，冲突发生后尝试将 75 存储在索引 6。

// 常见问题
// 1. 冲突频率：
冲突频率由哈希函数的质量和表的装载因子（Load Factor）决定。
装载因子 = 已存储元素数 / 哈希表大小。
较高的装载因子可能导致更多冲突。
// 2. 性能：
在良好的哈希函数和适当的表大小下，哈希表的性能接近常数时间（O(1)）。
// 3. 动态扩展：
当装载因子超过阈值时，哈希表通常会重新调整大小并重新哈希（rehash）。

// 项通常表示为包含多个字段的对象，使用其中一个字段（如ID）作为键，通过哈希函数映射到哈希表的特定桶中。




// 链式存储（Chaining） 
是一种处理哈希表冲突的方法。它通过为每个桶分配一个链表（或其他数据结构），将多个映射到同一桶的项存储在同一个链表中。
// 具体操作如下：
插入操作：首先，使用项的键值来确定该项应插入的桶，然后将项插入该桶的链表中。
搜索操作：搜索时，先通过键值确定目标桶，然后在该桶的链表中进行查找。
删除操作：删除操作同样首先定位桶，然后在该桶的链表中删除目标项。
// 优点：
处理哈希冲突时不需要额外的复杂计算。
可以有效地管理和解决哈希冲突，尤其是在大量元素需要插入时。
// 缺点：
如果冲突较多，链表长度变长，查询和删除操作的性能会下降，最坏情况下退化为O(N)。
// eg: Hash table with chaining: Each bucket contains a list of items.                                     ---- please check CS570_example_code.java




// 线性探测 (linear probing)
// 基本原理：
在哈希表中处理冲突时，线性探测会从键映射到的桶开始，逐个向后检查，直到找到一个空桶为止。
// 特点：
// 桶可以是以下两种状态之一：
空自初始（Empty-since-start）：自哈希表创建以来一直为空。
删除后为空（Empty-after-removal）：某元素被移除后导致桶为空。
搜索时，遇到“空自初始”时终止；但遇到“删除后为空”时继续探测。

// 插入
1. 用键计算初始桶位置。
2. 如果桶已被占用，线性探测下一个桶，直到找到空桶。
3. 若到达最后一个桶，则从桶 0 开始循环。
4. 插入到第一个空桶中（无论是哪种空状态）。
5. 返回值：
插入成功返回 true。
如果所有桶都被占用，返回 false。
// eg: Insert with linear probing.

// 删除
1. 用键计算初始桶位置。
2. 从初始桶开始线性探测，直到：
   找到匹配项并将其移除，将桶标记为“删除后为空”。
   遇到“空自初始”终止（表示找不到该元素）。
   所有桶都被探测完。
3. 若遇到“删除后为空”，继续探测，因为目标可能在更远的桶中。
// eg: Remove with linear probing.

// 搜索
1. 用键计算初始桶位置。
2. 从初始桶开始线性探测，直到：
   找到匹配项并返回。
   遇到“空自初始”或探测完所有桶，返回 null（表示未找到）。
3. 若遇到“删除后为空”，继续探测，因为目标可能在后续桶中。
// eg: Search with linear probing.

// 缺点：
这种方法通过线性探测有效解决了哈希冲突问题，但可能会导致 聚集问题（Clustering），影响效率。




// 二次探测 （Quadratic probing） 
// 基本原理：
当发生冲突时，二次探测会从键映射到的桶开始，采用二次探测法（quadratic probing）在哈希表中查找空桶。具体而言，给定初始桶位置为 H，通过公式进行计算：
Index = (H + c_1 * i + c_2 * i^2) mod TableSize
其中 c1 和 c2 是程序员定义的常量，i 是探测次数，初始时 i = 0，每次探测时 i 增加。探测会按照序列搜索，直到找到空桶为止。

// 插入
1. 用键计算初始桶位置 H。
2. 使用二次探测公式，依次检查桶：
    初始时 i = 0，使用公式计算探测的桶位置。
    如果当前位置的桶已被占用，增加 i 并继续计算下一个桶的位置。
    重复此过程直到找到空桶。
3. 插入键到找到的空桶中。
// eg: HashInsert with quadratic probing

// 搜索
1. 用键计算初始桶位置 H。
2. 使用二次探测法依次检查桶的位置，直到找到匹配的键或者遇到“空自初始”桶（表示该键不在哈希表中）。

// 删除
1. 用键计算初始桶位置 H。
2. 使用二次探测法依次检查桶，直到找到匹配的键。
3. 如果找到匹配的键，则将该桶标记为“删除后为空”。
4. 如果没有找到匹配的键，搜索过程会继续直到遇到“空自初始”桶。
// eg: HashRemove and HashSearch with quadratic probing.

// 注意点
二次探测与线性探测：二次探测的优点是通过平方递增步长减少了聚集问题（clustering），相比于线性探测，它可以更均匀地分布元素。
常量选择：c1 和 c2 的选择对性能有很大影响，通常需要调整这两个常量以优化探测过程。






// double hashinbg 双哈希法
是一种开放地址法的哈希冲突解决技术，通过使用两个不同的哈希函数计算桶的索引，避免冲突时的聚集问题。
// 核心概念：
// 1. 双哈希公式：
index = (h1(key) + i * h2(key)) mod tableSize
其中 i 从 0 开始，表示探测序列的步数。
每次未找到空桶时，增加 i 并重新计算桶序列。
// 2. probing sequence 探测序列
按顺序通过 i 的变化计算新索引，直到找到空桶或匹配项。

// 插入：
1. 使用公式计算桶索引，按探测序列依次检查桶。
2. 将项插入第一个找到的空桶中。
// 搜索：
1. 按探测序列逐个检查桶，直到找到目标项（返回项）或遇到一个自始为空的桶（返回 null）。
2. 如果所有桶都检查完毕仍未找到，返回 null。
// 删除：
1. 首先通过搜索找到目标项。
2. 如果找到，则删除该项，并将桶标记为“删除后空”（Empty-after-removal）。

// 优点：
减少线性探测带来的聚集问题（Primary Clustering）。
探测序列均匀分布，提升冲突分布的性能。

// 缺点：
需要两个独立的哈希函数，设计复杂。
对于负载因子较高的表，可能需要多次探测。





// Hash Table Resizing
// Resize 操作：
扩展哈希表的桶数量，同时保留现有所有项。
通常将桶数量调整为下一个大于等于 2 * N 的素数
为扩展后的哈希表分配新数组，将旧数组中的所有元素重新插入新数组。
时间复杂度：O(N) , 其中 N 是哈希表中的项数。
// eg: Hash table resize operation.

// 触发 Resize 的条件：
// 1. 负载因子（Load Factor）：
负载因子 = 哈希表中项数 / 桶数
例如：18 个项和 31 个桶，负载因子为 18 / 31 = 18/31
当负载因子超过设定阈值时进行扩容。
// 2. 特定实现触发条件：
a. 开放地址法：插入时的冲突次数超过阈值。
b. 链式法：某个桶中的链表长度超过阈值。

// 优点：
防止负载因子过高导致性能退化。
保证哈希表操作的高效性。
// 缺点：
Resize 操作需要分配新数组，耗费大量时间和空间。
插入新桶时需要重新计算所有项的哈希值，增加开销。






// 哈希函数概述
// 1. 好的哈希函数的特点：
    最小化冲突：哈希表的性能好坏很大程度上依赖于哈希函数的设计，哈希函数应尽量减少不同元素映射到同一个桶中的冲突。 
    完美哈希函数：完美哈希函数能够将每个元素精确地映射到一个独立的桶中，避免冲突。在这种情况下，哈希表的插入、查找和删除操作的时间复杂度为O(1)。
    良好的哈希分布：好的哈希函数能均匀地将元素分配到各个桶中，减少桶内链表的长度或减少线性探测的平均长度，从而实现快速的插入、查找和删除操作。

// 2. 常见的哈希函数类型：
// a. 模哈希函数（Modulo Hashing）：
    通过将键值对哈希表大小N取模（key % N）来计算哈希值。
    优点：简单直观。
    缺点：对于某些特定的键分布（如键为10的倍数时），性能可能较差，因为容易发生冲突。
// eg: Modulo hash function.
HashRemainder(int key) {
   return key % N
}
// b. 中间平方哈希函数（Mid-Square Hashing）：
    将键值平方后，从中提取中间的R个数字，再对哈希表大小N取模。(注意： 例如 N 个 buckets, R 必须 >= log10N)
    示例：如果哈希表有100个桶，键值为453，计算453 * 453 = 205209，提取中间两位数字52，并将其对哈希表大小取模（如52 % 100）。
    优点：减少了哈希冲突的可能性，适用于数字类型的键值。
// c. 二进制中间平方哈希函数（Mid-Square Hashing in Base 2）：
    使用二进制进行实现，通过对平方值进行位移和位与操作来提取中间的R位，进一步进行取模运算。 (注意： 例如 N 个 buckets, R 必须 >= log10N)
    示例：对于哈希表大小为200，R = 8，则需要8个二进制位来表示0到199的桶索引。
    优点：相比十进制的实现，二进制方式计算更高效。
// eg: Mid-square hash function (base 2).
HashMidSquare(int key) {
   squaredKey = key * key
   
   lowBitsToRemove = (32 - R) / 2
   extractedBits = squaredKey >> lowBitsToRemove
   extractedBits = extractedBits & (0xFFFFFFFF >> (32 - R)) 

   return extractedBits % N
}

// d. 乘法字符串哈希函数（Multiplicative String Hashing）：
    通过重复地将当前哈希值乘以一个乘数（通常是质数）并加上字符串中每个字符的ASCII值来计算哈希值。最终返回计算结果对哈希表大小N取模。(注意： 例如 N 个 buckets, R 必须 >= log10N)
    Bernstein的乘法哈希函数使用初始值5381和乘数33，很适合用于哈希短字符串（如英文字符串）。
    举例: 计算字符串 hello 的哈希值。 假设乘数是 33，初始哈希值是 5381, 哈希表大小为 10
    stringHash = ((InitialValue * HashMultiplier + ASCII(h)) * HashMultiplier) + ASCII(e) ...
第一个字符 'h': stringHash=(5381×33)+104=177093+104=177197
第二个字符 'e': stringHash=(177197×33)+101=5857521+101=5857622
.
.
.
对哈希表大小取模: 211799723701%10 = 1
// eg: Multiplicative string hash function.
HashMultiplicative(string key) {
   stringHash = InitialValue 

   for (each character strChar in key) {
      stringHash = (stringHash * HashMultiplier) + strChar
   }

   return stringHash % N
}

// 3. 性能与局限：
完美哈希函数：如果已知所有键值并且数量固定，可以设计一个完美哈希函数，提供O(1)的插入、查找和删除效率。
一般哈希函数：良好的哈希函数能确保在大多数情况下哈希表的操作时间为O(1)，但在最坏情况下（如哈希冲突严重）可能退化到O(N)。
// 4. 总结：
哈希表的性能很大程度上依赖于哈希函数的设计，常见的哈希函数有模哈希、中间平方哈希和乘法哈希。
哈希函数应均匀分布数据，减少冲突，提升哈希表的操作效率。




// Direct Hashing (直接哈希)
// 概述： 
直接哈希（Direct Hashing）是一种哈希方法，其中每个项的键（key）直接用作哈希表中的桶索引。例如，如果键是937，则该项的索引就是937。使用直接哈希的哈希表称为直接访问表（Direct Access Table）。
在这种哈希表中，搜索算法根据键返回相应桶中的项（如果桶不为空），如果为空则返回null（表示未找到项）。
// eg: Direct hashing: Insert, remove, and search operations use item's key as bucket index.
HashInsert(hashTable, item) {
   hashTable[item⇢key] = item 
}

HashRemove(hashTable, item) {
   hashTable[item⇢key] = Empty
}

HashSearch(hashTable, key) {
   if (hashTable[key] is not Empty) {
      return hashTable[key]
   }
   else  {
      return null
   }
}
// 优点：
无冲突：每个键都直接映射到一个唯一的桶，因此不存在冲突的情况。
// 限制：
所有的键必须是非负整数，但在一些应用场景中，键可能是负数，这就限制了它的应用范围。
哈希表的大小等于最大键值加1，如果键的值很大，哈希表的大小也会非常庞大，导致浪费空间。
// 总结：
直接哈希表的优点是不存在冲突，但它的使用受限于键的范围（只能是非负整数），并且在键值较大时可能会导致哈希表占用大量内存。






密码学与哈希算法
1. 密码学概述
密码学是研究如何安全地传输数据的学科。加密是其中的一部分，通过改变数据的表示方式来隐藏原始信息。而解密则是从加密后的数据中恢复出原始数据的过程。

2. 哈希函数在数据中的应用
哈希函数不仅用于哈希表中，还广泛应用于数据验证等领域。通过哈希函数，我们可以生成一个哈希值，用于验证数据的完整性。
例如，MD5 算法会生成一个128位的哈希值，该值无法反向恢复原始数据，但可以用来验证数据是否被篡改或损坏。

3. 密码学哈希函数
密码学哈希函数是专门为密码学加密设计的哈希函数，常用于加密和解密数据。它们的主要作用是确保数据在传输和存储过程中保持完整和安全。

4. 密码哈希函数
密码哈希函数是密码学哈希函数的一个应用，专门用于生成密码的哈希值。许多在线服务的数据库不直接存储用户的密码，而是存储密码的哈希值。

当用户登录时，系统对输入的密码进行哈希计算，并将计算出的哈希值与数据库中的哈希值进行对比。
因为数据库中存储的不是密码本身，而是哈希值，所以即使数据库被攻破，攻击者也无法直接获得用户的密码。
总结：哈希算法和密码学的结合在保护数据安全，特别是密码保护方面，具有重要意义。通过哈希算法，密码哈希提供了一种有效的方式来防止密码泄露。






// 集合抽象数据类型（Set ADT）
// 1. 集合的定义
集合是一个包含不同元素的集合。集合是无序的，这意味着集合内的元素没有特定的顺序。
例如，包含整数3、7、9的集合等同于包含整数9、3、7的集合，因为集合不关心元素的顺序。
// 2. 元素的添加与移除
添加操作：当向集合中添加元素时，如果该元素已经存在，则不进行添加。即集合中元素不能重复。
移除操作：给定一个元素的键，集合可以移除该元素。
在集合中，元素的键通常作为唯一标识，用于区分不同的元素。对于原始数据类型（如数字、字符串），元素本身就是键。对于对象，通常通过外部函数或预定义的规则来获取对象的唯一标识符。
3. 集合的搜索与子集操作
搜索操作：给定一个键，集合的搜索操作会返回对应键的元素，如果该元素不存在则返回null。
子集测试：集合X是集合Y的子集，当且仅当集合X中的每个元素都在集合Y中存在。这个测试可以通过搜索操作来实现。
// eg: SetIsSubset algorithm.
SetIsSubset(set, subsetCandidate) {
   for each (element in subsetCandidate) {
      if (SetSearch(set, element⇢key) == null) {
         // subsetCandidate is not a subset of set
         return false
      }
   }
   return true // subsetCandidate is a subset
}





// 集合操作
// 1. 集合的并集、交集与差集
// 并集（Union）：
集合X和Y的并集，记作 X ∪ Y，是包含集合X和集合Y中所有元素的集合，且不重复元素。
// 交集（Intersection）：
集合X和Y的交集，记作 X ∩ Y，是仅包含集合X和集合Y中共同存在的元素的集合。
// 差集（Difference）：
集合X和Y的差集，记作 X \ Y，是包含集合X中有但集合Y中没有的元素的集合。
// 交换律：
并集和交集操作满足交换律，即 X ∪ Y = Y ∪ X 和 X ∩ Y = Y ∩ X。
// eg: Set union, intersection, and difference.
SetUnion(set1, set2) {
   result = Create new, empty set
   for each (element in set1) {
      Add element to result
   }
   for each (element in set2) {
      Add element to result
   }
   return result
}

SetIntersection(set1, set2) {
   result = Create new, empty set
   for each (element in set1) {
      if (SetSearch(set2, element⇢key) != null) {
         Add element to result
      }
   }
   return result
}

SetDifference(set1, set2) {
   result = Create new, empty set
   for each (element in set1) {
      if (SetSearch(set2, element⇢key) == null) {
         Add element to result
      }
   }
   return result
}

// 2. 过滤与映射操作
// 过滤（Filter）：
集合X的过滤操作生成一个子集，只包含满足特定条件的元素。过滤条件通常通过过滤谓词表示：一个函数，接收元素作为参数，并返回布尔值，指示该元素是否会出现在过滤后的子集中。
// 映射（Map）：
集合X的映射操作生成一个新的集合，通过对每个元素应用某个函数F来转换元素。
X = {18, 44, 38, 6} 且 F 是一个将值除以2的函数，那么映射操作的结果是：
SetMap(X,F)={9,22,19,3}
// eg: SetFilter and SetMap algorithms.
SetFilter(set, predicate) {
   result = Create a new, empty set
   for each (element in set) {
      if (predicate(element) == true)
         Add element to result
   }
   return result
}

SetMap(set, mapFunction) {
   result = Create new, empty set
   for each (element in set) {
      newElement = mapFunction(element)
      Add newElement to result
   }
   return result
}

EvenPredicate(element) {
   if (element is even)
      return true
   return false
}

Above90Predicate(element) {
   return (element > 90)
}

OnesDigit(element) {
   return element % 10
}

StringifyElement(element) {
   return (Convert element to string)
}







// 静态集合与动态集合操作总结：
// 1. 静态集合（Static Set）：
静态集合在构建后不可更改。
在创建时，集合会包含一组指定的元素，并且这些元素不可修改。
例如，使用整数列表 (19, 67, 77, 67, 59, 19) 构建的静态集合为 {19, 67, 77, 59}，重复的元素被自动去除。
// 2. 动态集合（Dynamic Set）：
动态集合在构建后可以继续修改，元素可以被添加、删除或更新。
动态集合支持更多的操作，如增删元素。
// 3. 静态集合的操作：
静态集合支持大多数集合操作，但这些操作返回的结果是一个新的集合，而不是直接修改原集合。
常见的静态集合操作包括：并集、交集、差集等，这些操作会生成一个新的集合。
// 总结： 
静态集合在创建后无法修改，适用于只需要初始化并进行查询的场景；而动态集合则适用于需要频繁更新、添加和删除元素的场景。

// Static and dynamic set operations.
| Operation                                | Dynamic set support? | Static set support? |
|------------------------------------------|----------------------|---------------------|
| Construction from a collection of values | Yes                  | Yes                 |
| Count number of elements                | Yes                  | Yes                 |
| Search                                   | Yes                  | Yes                 |
| Add element                              | Yes                  | No                  |
| Remove element                           | Yes                  | No                  |
| Union (returns new set)                 | Yes                  | Yes                 |
| Intersection (returns new set)          | Yes                  | Yes                 |
| Difference (returns new set)            | Yes                  | Yes                 |
| Filter (returns new set)                | Yes                  | Yes                 |
| Map (returns new set)                   | Yes                  | Yes                 |






// Shell sort 希尔排序
Shell 排序是一种对数组进行分组并逐步排序的算法。它通过将数组分成若干个间隔为固定 gap 值的子列表，并对每个子列表分别进行排序来实现。最终，通过 gap 值的递减，数组会逐步接近有序状态。
// 工作原理
间隔（Gap）：Shell 排序通过 gap 值将数组划分为若干个子列表。对于一个索引为 i 的元素，其后续元素为索引 i + gap 的元素。
插入排序变体：在每个 gap 值下，Shell 排序使用插入排序变体对间隔子列表进行排序。
插入排序中，"前一个"元素定义为索引 i - gap，"下一个"元素为 i + gap。
逐步减小 gap：算法从较大的 gap 值开始，逐步减小 gap，直到 gap 为 1，此时进行标准插入排序。
// 算法步骤
1. 确定 gap 值集合，例如：63, 31, 15, 7, 3, 1。
2. 对每个 gap 值：
根据 gap 将数组划分为若干个子列表。例如： gap值为5， 就划分为5个子列表
使用插入排序变体对每个子列表进行排序。
3. 当 gap 为 1 时，完成标准插入排序，数组最终有序。
// Gap 值的选择
常用策略：选择以 2 的幂减 1 的 gap 值序列（如：63, 31, 15, 7, 3, 1）。
灵活性：任何正整数 gap 值都可用于 Shell 排序，只要最终包含 gap 为 1。
性能优化：选择递减的 gap 值可以更快地使数组接近有序。
// 性能
时间复杂度：在最佳 gap 序列选择下，Shell 排序的时间复杂度可以达到 O(n^3/2)。
特点：对几乎有序的数据表现出色，gap 值较小时插入排序的效率较高。






// Quicksort 算法总结
// 1. 算法简介
Quicksort 是一种基于分治思想的排序算法，通过递归地对数据进行划分（partition），然后对每个部分进行排序来实现。
// 2. 核心步骤
// 选择主元（Pivot）：
通常选择数组的中间元素作为主元。
例如，数组 (4, 34, 10, 25, 1)，中间元素为索引 2 对应的值 10。
// 划分数组：
将数组分为两个部分：
低区（Low Partition）：所有元素 ≤ 主元。
高区（High Partition）：所有元素 ≥ 主元。
例如，数组 (4, 34, 10, 25, 1) 以 10 为主元，划分为低区 (4, 1, 10) 和高区 (25, 34)。
// 3. 划分算法
初始化两个指针：lowIndex 指向左侧，highIndex 指向右侧。
不断调整指针位置：
如果 lowIndex 的值小于主元，向右移动 lowIndex。
如果 highIndex 的值大于主元，向左移动 highIndex。
当 lowIndex >= highIndex 时，划分完成，返回 highIndex。
否则，交换 lowIndex 和 highIndex 的值，然后继续调整。
// 4. 递归排序
完成划分后，对低区和高区分别递归调用 quicksort 进行排序。递归终止条件是区间长度为 0 或 1，此时区间已排序。
// 5. 算法时间复杂度
// 平均情况： O(N log N)
每一层划分最多进行 N 次比较，共有 log N 层。
// 最坏情况： O(N²)
当主元选择极端（最小值或最大值）时，会出现严重不平衡的划分，此时递归深度达到 N，导致运行时间为 O(N²)。
// 实际表现：
最坏情况较少发生，平均性能优异，因此 Quicksort 在实际应用中表现良好。
// eg: Quicksort algorithm.





// Merge Sort 算法总结
// 1. 算法简介
Merge Sort 是一种基于分治思想的排序算法，主要通过以下步骤完成排序：
1. 将列表递归地划分为两部分。
2. 对每部分分别排序。
3. 将两个已排序部分合并为一个有序列表。
// 2. 核心步骤
// 划分（Partitioning）：
使用三个索引变量：
i 表示当前部分的起始索引。
k 表示当前部分的结束索引。
j 表示中间索引，用于将列表划分为左右两部分。
划分继续递归，直到列表中的每个部分只剩 1 个元素（长度为 1 的列表本身是有序的）。
// 合并（Merging）：
比较左右两个已排序部分的最小元素，将较小的元素加入临时列表。
当一个部分的元素全部加入临时列表后，直接将另一部分剩余的元素加入临时列表。
最后将临时列表复制回原列表。
// 3. 时间复杂度
平均和最坏情况： O(N log N)
需要 log N 次划分，列表每次分为两半。
每层划分需要约 N 次比较和复制操作，用于合并左右部分。
// 4. 空间复杂度
需要额外的 O(N) 空间：
用于存储合并时的临时数组。
在最终合并阶段，临时数组的大小与输入数组相同。
与需要额外空间的 Merge Sort 相比，有些算法（如 Quicksort）可以原地排序，不需要额外内存，但实现起来更复杂。
// 5. 实现优化
// 动态内存分配：
在合并操作中，动态分配临时数组大小为当前需要合并的元素个数。
// 共享临时数组：
在整个递归过程中可以传递一个大小与原数组相同的临时数组，避免多次分配和释放内存。
// 6. 特点总结
稳定排序：合并操作不会改变相等元素的相对位置。
适用于大数据集，性能稳定，时间复杂度始终为 O(N log N)。
需要额外内存，因此在内存使用受限的场景下可能不适用。

// eg：Merge sort algorithm.





// Radix Sort 算法总结
1. 算法简介
Radix Sort 是一种专门用于整数排序的算法，它基于“桶（Bucket）”的概念实现排序，是桶排序的一种变体。
Radix Sort 通过逐位处理整数，从最低有效位到最高有效位，依次排序。
2. 核心步骤
// 按位划分桶（Buckets）：
    每一位的数值决定元素所属的桶。例如：
    按个位划分，57、97、77 和 17 都会被放入桶 7，因为个位数字是 7。
// 算法过程：
    逐位处理：
    从整数的最低有效位（个位）开始，依次到最高有效位（如百位、千位），对所有元素进行排序。
    两步操作：
    根据当前位的数值将数组中的元素分配到对应的桶中。
    从低位桶到高位桶依次取出元素，重新构建数组。
3. 处理负数的扩展
// 原始算法适用于非负整数，直接按位排序即可。
// 负数排序扩展：
    负数和非负数需要分开处理：
        1. 遍历数组，将负数放入一个“负数桶”，非负数放入一个“非负数桶”。
        2. 反转负数桶中的元素顺序（负数从大到小排列）。
        3. 将负数桶与非负数桶合并，得到最终的有序数组。
4. 时间和空间复杂度
// 时间复杂度： O(N × d)
N 为数组大小，d 为整数的位数。
对每一位（d）执行分桶操作和重新构建数组。
// 空间复杂度： O(N + b)
N 为数组大小，b 为桶的数量（通常为 10，分别对应 0-9）。
5. 特点总结
// 优点：
对非负整数排序性能高效。
稳定排序：相同数值的元素在排序后相对位置不变。
// 缺点：
仅适用于整数排序，不适合小数或通用数据类型。
空间复杂度较高，需要额外的桶存储元素。
// 扩展支持负数：
通过额外的负数桶和非负数桶实现。
// eg: Radix sort algorithm (for non-negative integers).
// eg: RadixGetMaxLength and RadixGetLength functions.
// eg: RadixSort algorithm (for negative and non-negative integers).






// Overview of Fast Sorting Algorithms
1. 什么是快速排序算法？
快速排序算法是平均时间复杂度为 O(N log N) 或更优的排序算法。这类算法在大多数情况下能够高效地完成排序任务。
3. 比较排序算法
比较排序 是指基于元素之间的比较操作进行排序的算法。适用于可以通过 <, =, > 比较的元素类型。例如：字符串、数字等。
// 常见的比较排序算法：
选择排序（Selection Sort）
插入排序（Insertion Sort）
希尔排序（Shell Sort）
快速排序（Quicksort）
归并排序（Merge Sort）
堆排序（Heap Sort）
// 非比较排序算法：
基数排序（Radix Sort）：通过处理数字的每一位进行排序，不需要直接比较两个元素的大小。
4. 最优和最差时间复杂度
快速排序算法的最优或最差时间复杂度可能与其平均时间复杂度不同。例如：
Quicksort：
平均情况和最好情况：O(N log N)。
最差情况：O(N²)（当每次划分产生的两个子数组高度不平衡时）。
快速排序算法在实际应用中通常表现较好，但需要注意最差情况的发生，例如输入数组接近有序时，可能需要选择改进的划分方法（如随机选择主元）。
// Table 1: Sorting algorithms' average runtime complexity
| Sorting algorithm | Average case runtime complexity | Fast? |
|-------------------|---------------------------------|-------|
| Selection sort    | O(N²)                          | No    |
| Insertion sort    | O(N²)                          | No    |
| Shell sort        | O(N¹·⁵)                        | No    |
| Quicksort         | O(N log N)                     | Yes   |
| Merge sort        | O(N log N)                     | Yes   |
| Heap sort         | O(N log N)                     | Yes   |
| Radix sort        | O(N)                           | Yes   |

// Table 2: Identifying comparison sorting algorithms
| Sorting algorithm | Comparison? |
|-------------------|-------------|
| Selection sort    | Yes         |
| Insertion sort    | Yes         |
| Shell sort        | Yes         |
| Quicksort         | Yes         |
| Merge sort        | Yes         |
| Heap sort         | Yes         |
| Radix sort        | No          |

// Table 3: Fast sorting algorithms' best, average, and worst case runtime complexity
| Sorting algorithm | Best case runtime complexity | Average case runtime complexity | Worst case runtime complexity |
|-------------------|-----------------------------|---------------------------------|------------------------------|
| Quicksort         | O(N log N)                 | O(N log N)                     | O(N²)                       |
| Merge sort        | O(N log N)                 | O(N log N)                     | O(N log N)                  |
| Heap sort         | O(N log N)                 | O(N log N)                     | O(N log N)                  |
| Radix sort        | O(N)                       | O(N)                           | O(N)                        |









// Bubble Sort 算法总结
1. 算法简介
Bubble Sort 是一种简单的排序算法，通过比较和交换相邻元素，将较大的元素逐步移动到列表的末尾。其核心思想是“冒泡”，每次迭代将当前未排序部分中的最大元素冒泡到正确的位置。
2. 算法过程
// 外层循环（i-loop）：
列表包含 N 个元素，外层循环执行 N - 1 次，每次将当前第 i 大的元素放到正确的位置。
// 内层循环（j-loop）：
比较相邻的两个元素：如果前一个元素大于后一个元素，则交换它们的位置。
随着外层循环的推进，后面的 i 个元素逐渐进入正确的排序位置，因此内层循环逐渐减少比较次数。
3. 时间复杂度
最坏/平均时间复杂度： O(N²)
由于嵌套循环的存在，总共需要约 N² 次比较和交换操作。
最好时间复杂度： O(N)（当列表已经有序时）
如果优化加入检测机制（如无交换直接退出循环），可以减少不必要的迭代。
4. 实用性
优点： 简单易实现，适合用作教学演示算法。
缺点：
    性能较差，即使对小型数据集，也有许多更高效的排序算法可用（如快速排序、归并排序等）。
    不适合实际场景的大规模数据排序。
5. 特点总结
稳定性： 稳定排序，相等的元素排序后相对位置不变。
适用场景： 虽然不实用，但因其直观的交换过程，适合学习排序算法的基础知识。

// eg: Bubble sort algorithm.
BubbleSort(numbers, numbersSize) {
   for (i = 0; i < numbersSize - 1; i++) {
      for (j = 0; j < numbersSize - i - 1; j++) {
         if (numbers[j] > numbers[j+1]) {
            temp = numbers[j]
            numbers[j] = numbers[j + 1]
            numbers[j + 1] = temp
         }
      }
   }
}







// Quickselect 算法总结
1. 算法简介
Quickselect 是一种用于在列表中选择第 K 小元素 的算法，基于快速排序的划分（partition）方法实现。它通过部分排序找到目标元素，而无需对整个列表进行完全排序。
例如：对于列表 (15, 73, 5, 88, 9)，k=0，Quickselect 返回最小元素 5。
2. 核心步骤
// 划分（Partitioning）：
使用快速排序的划分方法，将列表分为两个部分：
低区（Low Partition）： 包含较小的 X 个元素。
高区（High Partition）： 包含较大的 N-X 个元素。
// 递归查找：
如果第 K 小的元素位于低区（k ≤ 低区的最后索引），递归调用 Quickselect 在低区查找。
如果第 K 小的元素位于高区，在高区递归调用 Quickselect。
当划分的列表大小为 1 时，即找到目标元素。
3. 时间复杂度
最优/平均情况： O(N)
每次划分后只需要处理一个子区间，减少了处理规模。
最坏情况： O(N²)
当划分严重不平衡（如每次选择的主元总是最大或最小值）时，会退化为 O(N²)。
4. 特点总结
// 优点：
在平均情况下性能优异，特别适合大规模数据的第 K 小元素查找。
相比完全排序，减少了不必要的计算，效率更高。
// 缺点：
最坏情况下性能较差（O(N²)），但通过随机选择主元可以减少最坏情况的发生概率。
// 应用场景：
查找中位数或任意第 K 小元素的高效方法。
部分排序的快速解决方案。
// Quickselect 是 QuickSort 的高效变体，结合了部分排序和划分的思想，常用于需要快速定位特定排名元素的场景。
// eg: Quickselect algorithm.
// Selects kth smallest element, where k is 0-based
Quickselect(numbers, first, last, k) {
   if (first >= last)
      return numbers[first]

   lowLastIndex = Partition(numbers, first, last)

   if (k <= lowLastIndex)
      return Quickselect(numbers, first, lowLastIndex, k)
   return Quickselect(numbers, lowLastIndex + 1, last, k)
}






// Bucket Sort 算法总结
// 1. 算法简介
Bucket Sort 是一种基于分桶思想的数值排序算法。它通过将数据分配到不同的桶中，对每个桶内的元素分别排序，然后按桶的顺序合并，得到排序后的结果。适合用于处理非负整数数组。
// 2. 核心步骤
// 分桶（Bucketing）：
根据数据范围，创建若干个桶，每个桶代表一定范围的数值。
对于最大值为 M，分 N 个桶，每个桶的范围为 (M + 1) / N。
例如，最大值为 49，分成 10 个桶，每个桶的范围为 5：第 1 个桶存储 [0, 4]，第 2 个桶存储 [5, 9]，依此类推。
将每个数组元素分配到相应的桶中，桶索引计算公式为：
BucketIndex = Number * N / (M + 1)
// 桶内排序（Sorting within buckets）：
使用额外的排序算法（如插入排序、快速排序等）对每个桶内的元素进行排序。
// 合并结果（Concatenation）：
按桶的顺序依次将桶内的元素合并，得到完整的排序结果。
// 3. 时间复杂度
平均时间复杂度： O(N + K)，其中 N 是数组大小，K 是桶的数量。
最坏时间复杂度： O(N²)，当所有元素集中到一个桶中时，需要对整个桶内排序。
空间复杂度： O(N + K)，需要额外的空间存储桶。
// 4. 特点总结
// 优点：
在数据分布均匀的情况下效率高，适合用于大规模数值排序。
可轻松与其他排序算法结合（如快速排序或插入排序作为桶内排序）。
// 缺点：
需要额外的存储空间分配桶。
对输入数据分布有依赖：如果数据分布不均匀，会导致性能退化。
// 应用场景：
数据范围明确、数据分布较为均匀的排序任务。
适合用于非负整数的高效排序。
// Bucket Sort 的效率取决于数据的分布情况和桶内排序算法的性能，是一种结合分治和分桶思想的灵活排序算法。
// eg: Bucket sort algorithm.
BucketSort(numbers, numbersSize, bucketCount) {
   if (numbersSize < 1)
      return

   buckets = Create list of bucketCount buckets

   // Find the maximum value
   maxValue = numbers[0]
   for (i = 1; i < numbersSize; i++) {
      if (numbers[i] > maxValue)
         maxValue = numbers[i]
   }

   // Put each number in a bucket
   for each (number in numbers) {
      index = floor(number * bucketCount / (maxValue + 1))
      Append number to buckets[index]
   }

   // Sort each bucket
   for each (bucket in buckets)
      Sort(bucket)

   // Combine all buckets back into numbers list
   result = Concatenate all buckets together
   Copy result to numbers
}