// javascript 作用域的类型
// 全局作用域（Global Scope）：在代码中任何地方都可以访问的变量。全局变量在整个程序的生命周期内都存在。
// 函数作用域（Function Scope）：在函数内部定义的变量只能在该函数内部访问。函数作用域内的变量在函数执行结束后被销毁。
// 块级作用域（Block Scope）：在代码块（如 if 语句、for 循环、while 循环等）内部定义的变量只能在该代码块内部访问。使用 let 和 const 关键字可以创建块级作用域。

// variables let, const have Block Scope.
// variables let, const cannot be redeclared in the same scope.

// 如何理解函数作用域:
var, let, const 假如定义在外部，那么内部的block scope 都可以继承。（外部定义，内部始终能继承）
var, let, const 假如定义在外部，那么在内部的block scope 的 redeclare， 只有var 可以生效。 
var, let, const 假如定义在内部，那么外部都无法继承。


//代码实例解析:
第一段代码
javascript
复制代码
function showBlockScope() {
    if (true) {
        let blockVar = 'I am a block variable';
        console.log(blockVar); // 
    }
    console.log(blockVar); // 
}

showBlockScope();
在这段代码中，blockVar 使用 let 声明，它在 if 代码块内有块级作用域。块级作用域意味着 blockVar 只能在 if 代码块内部访问，出了 if 代码块就不能访问了。因此，代码运行时会如下：

console.log(blockVar); 在 if 块内可以访问，输出 'I am a block variable'。
console.log(blockVar); 在 if 块外部会报错，因为 blockVar 在这个范围内是未定义的。

第二段代码

function showBlockScope() {
    if (true) {
        var blockVar = 'I am a block variable';
        console.log(blockVar); // 
    }
    console.log(blockVar); // 
}

showBlockScope();

在这段代码中，blockVar 使用 var 声明，它在函数内部有函数作用域。函数作用域意味着 blockVar 可以在整个函数内部访问。因此，代码运行时会如下：

console.log(blockVar); 在 if 块内可以访问，输出 'I am a block variable'。
console.log(blockVar); 在 if 块外部仍然可以访问，因为 blockVar 在整个函数作用域内都是定义的，输出 'I am a block variable'。

let 和 const 声明的变量有块级作用域，只在声明它们的代码块内部有效。
在第一段代码中，blockVar 只能在 if 块内访问，出了 if 块后，blockVar 是未定义的。
函数作用域（var）：

var 声明的变量有函数作用域，在函数内部任何地方都可以访问。
在第二段代码中，blockVar 可以在整个 showBlockScope 函数内部访问，包括 if 块外部。


//break 只能用于以下两种情况：
1. 在循环结构中 (for, while, do...while).
2. 在 switch 语句中。



箭头函数：简洁且可以避免this 绑定的问题。
const getRandomColor = () => {
  // 函数体
};
上面的箭头函数实际等价于： 传统函数：
function getRandomColor() {
  // 函数体
}


// 函数表达式 vs 函数声明
// 有两种定义函数的方法：函数声明和函数表达式。
函数声明：
function getRandomColor() {
  const randomNum = Math.floor(Math.random() * colorList.length);
  return colorList[randomNum];
}
这是一个传统的函数声明方式。它在 JavaScript 解析代码时被提升（hoisting），意味着它在定义之前就可以被调用。

函数表达式：
const getRandomColor = function() {
  const randomNum = Math.floor(Math.random() * colorList.length);
  return colorList[randomNum];
};
这里，我们使用一个匿名函数并将其赋值给一个变量 getRandomColor。这个函数表达式在定义之前不能被调用。

箭头函数
箭头函数是一种简写的函数表达式，语法更加简洁，并且在处理 this 关键字时有一些不同的行为。

const getRandomColor = () => {
  const randomNum = Math.floor(Math.random() * colorList.length);
  return colorList[randomNum];
};

为什么使用 const
使用 const 声明函数表达式（包括箭头函数）有几个好处：
不可重新赋值：确保函数不会被意外地重新赋值。这对于代码的稳定性和可预测性非常重要。
代码风格一致：当我们希望某个变量或函数在整个代码生命周期中保持不变时，使用 const 可以明确表达这一意图。

forEach: 只可以用于数组。
eg: const array = [1, 2, 3, 4, 5];
    array.forEach(function(element, index, array) {
      console.log('Element:', element);
      console.log('Index:', index);
      console.log('Array:', array);
    });

在使用 forEach 方法时，这三个参数 (element, index, array) 并不是必须的，名字也可以改变。你可以根据需要选择性地使用它们。以下是对这三个参数的详细说明：
element（必须）：当前数组元素，这是必须的参数。通常用来执行主要操作。
index（可选）：当前元素的索引位置，这是可选的。
array（可选）：当前被遍历的数组本身，这是可选的。

如果你想跳过index，只用element 和array， 那你可以在index参数的位置上，用 占位符 _ 或者 undefined 来替代之。

// if false value：
false
0 (数字零)
-0 (负零)
0n (BigInt 零)
"" (空字符串)
null
undefined
NaN (Not a Number)

// event loop 事件循环
事件循环的工作流程
调用栈（Call Stack）：存放要执行的函数调用。当函数调用完成，它会从调用栈中移除。
消息队列（Message Queue）：存放异步操作完成后需要执行的回调函数。
事件循环（Event Loop）：不断检查调用栈是否为空。如果调用栈为空，它会将消息队列中的第一个回调函数推入调用栈执行。
以下是一个简单的事件循环示例：

console.log('Start'); // 1. 调用栈中执行

setTimeout(() => {
  console.log('Timeout callback'); // 4. 消息队列中的回调函数被推入调用栈执行
}, 0);

console.log('End'); // 2. 调用栈中执行
// 3. 调用栈为空，事件循环检查消息队列，将回调函数推入调用栈
