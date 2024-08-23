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