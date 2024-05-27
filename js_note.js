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