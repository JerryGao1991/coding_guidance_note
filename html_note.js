// inline, inline-block, block

inline: 没有换行符， 相邻元素会在同一行显示。
        只占据内容所需宽度。
        对高度，宽度，垂直方向内外边距没有影响。只能影响水平方向。
        eg: span, a, strong, em

block:  默认独占一行。宽度默认占满父元素全部宽度。
        可以设置宽度，高度，内外边距。
        eg: div, p, h1-h6, ul, ol

inline-block: 没有换行符， 相邻元素会在同一行显示。
              可以设置宽度，高度，内外边距。
        eg: img，input



// margin-block-start, margin-block-end,  margin-inline-start, margin-inline-end 

水平书写中：
margin-block-start： 上边距
margin-block-end：下边距
margin-inline-start：左边距
margin-inline-end：右边距



// body 一般会默认给 8px 的margin

// h1 - h6 一般会有默认的上下边距
/* 
   <h1>: 上下边距约为 0.67em
   <h2>: 上下边距约为 0.83em
   <h3>: 上下边距约为 1em
   <h4>: 上下边距约为 1.33em
   <h5>: 上下边距约为 1.67em
   <h6>: 上下边距约为 2.33em
*/
// 字体大小默认为
/*
   <h1>: 2em
   <h2>: 1.5em
   <h3>: 1.17em
   <h4>: 1em
   <h5>: 0.83em
   <h6>: 0.67em
*/

// p 一般会有的默认上下边距为：1em， 字体大小默认值一般为16px， 也是google chrome 的默认值
// 而且行高一般会在 1.2 - 1.5 em 

// 边距塌陷 margin collapse
当两个或多个相邻元素或父子元素的垂直外边距（即 margin-top 和 margin-bottom）合并在一起时，
实际显示的外边距值是这些外边距中的最大值，而不是它们的总和。这通常发生在块级元素之间。

// em 的解释：
1. em的值是相对于当前元素的字体大小进行计算。
2. em单位具有继承性。如果一个元素的字体大小是相对于其父元素设置的，em 的值会根据父元素的字体大小进行计算。
3. google chrome的默认字体大小为16px


// text-shadow:
// 四个参数依次分别为： 水平偏移量，垂直偏移量，模糊半径，阴影颜色
eg: text-shadow: 5px 0 0 #232931; 

/* 可以用 width: {百分比}; margin: auto; 来替代定义 margin-left 和margin-right
   margin: auto 存在的意思就是让块状元素在设定了宽度的前提下，边距自动计算，从而可以实现居中对齐。 比如 margin: 10% auto; 意思就是 上下10%的margin， 而左右自动计算，从而居中对齐。
*/

// 类似的百分比的表示，一般是指相对于其父元素的百分比。eg： margin: 5%;

//div 和其他块状元素，高度会随着其中内容增多而扩张。如果人为减少或增加高度， 会影响到相邻元素的位置。
//body 好像不一样。如果人为减少或增加高度， 不会影响到相邻元素的位置。？

//body 的background-color 面积好像不会根据 height 而变， 而是总会覆盖整个视口 viewport

//<link />, <img />

// FlexBox, flexbox里的所有element 自身的dispaly 将被替换成 display: flex, 那么这个container将会类似block 100%占据一行，如果你想控制这个container的大小或让只take up 其中element的面积，那么可以改为 inline-flex。
// container里所有元素将会类似inline 来表示。(注意，当你flex-direction为column的时候，所有堆叠起来的element会各自占满一行，如果你只想让它占据其内容的大小而已，则可以将 display改为 inline-flex)
// 一些常见的参数和它可能对应的values:
/* flex-direction:     {row, column};
   gap:  {10px};
   flex-basis:  （1、根据主轴来改变方向。当主轴是row时，增加宽度；是column时，增加高度。
                  2、在子元素上设置。    
   order:   
   flex-wrap:  {wrap, nowrap, wrap-reverse?}(default value 是 nowrap, 这就意味着如果空间排满了，不会自动移到下一行。所以你可以改为wrap)                          
   justify-content: {flex-start, flex-end, center, space-between, space-around, space-evenly}(根据主轴来)
   align-items: {flex-start, flex-end, center, baseline, stretch} (根据主轴垂直的轴来)
   align-content:  {flex-start, flex-end, center, space-between, space-around, space-evenly} (根据主轴垂直的轴来; 并且当flex-wrap 为 wrap的时候，才会起作用)
   align-self:
   flex-grow:   （默认为 0，也就是不增长。如果为1， 会增大至 max-width(如果设定了的话)， 否则就是all the way to the right）
   flex-shrink:  （默认为1， 也就是会缩小。缩小至 min-width(如果设定了的话)， 否则就是缩小至content width(内容中最大的单词长度)）
   flex: 1 (equvilant to flex-grow：1 and flex-shrink: 1; similarly flex: 2 equvilant to flex-grow: 2 and flex-shrink)
          （这一定程度上也代表了各个子元素在父元素里的面积比）
*/
//   size rules priorty: content width < width < flex-basis < min-width/max-width
//   默认情况下(当上面四个值没有设定， 并且flex-grow和shrink是default的时候): 缩小至content width(内容中最大的单词长度),扩大至(内容铺平的长度) 

// line-height
   line-height 代表行高，default value是 normal， 也是 1.2em。 如果行高大于字体高度， 会产生类似字体下沉的效果。 eg: line-height: 2; 代表行高是字体大小的2倍; line-height: 40px; 

// CSS for background image insert:  
   background-image: url("");

// ul 的default value:   margin-top: 1em; margin-bottom: 1em; padding-left: 40px; list-style-type: disc;
// 所以如果要清除格式， 一般可以:
   margin: 0;
   padding: 0;
   list-style-type: none;

// position 一般有：
   static: 按正常排列， 不受 top，right，bottom，left的影响。
   relative：相对其正常位置进行定位。
   absolute：相对于最近的非static的祖先元素进行定位，如果没有这样的祖先元素，则相对于根元素进行定位。
     // 实际操作中，可以将上一个元素设为 position: relative;
   fixed: 相对于浏览器窗口进行定位，即使滚动页面，元素也会保持在浏览器的相对位置。

// 箭头函数 和 常规函数 比较
const toggleButton = document.getElementById('toggle-theme');

toggleButton.addEventListener('click', () => {
  document.body.classList.toggle('dark-theme');
});

const toggleButton = document.getElementById('toggle-theme');

toggleButton.addEventListener('click', function() {
  document.body.classList.toggle('dark-theme');
});

适合使用箭头函数的场景：
回调函数：例如数组方法中的回调、事件处理程序等。
需要继承外部 this 的函数：例如在类的方法中访问实例的属性。

适合使用常规函数的场景：
需要自己的 this 绑定：例如对象的方法。
需要访问 arguments 对象：例如在需要传递可变参数的函数中。
作为构造函数使用：例如定义构造函数和创建实例。

// box-sizing 
content-box（默认）：宽度和高度不包括内边距和边框。
border-box：宽度和高度包括内边距和边框，有助于简化布局。
//通常开发者会在整个文档中设置 box-sizing: border-box 以简化布局管理
eg:  box-sizing: border-box;

//scroll-behavior
scroll-behavior: auto：默认行为，滚动立即发生。
scroll-behavior: smooth：滚动时有平滑过渡效果，提高用户体验。
eg:  html {
       scroll-behavior: smooth;
     }

// text-decoration: none;     

// cursor：
default：默认光标（通常是箭头）。
pointer：指针（通常是手形），表示该元素是可点击的。
text：文本光标（通常是 I 形），表示该元素是可编辑的文本区域。
move：移动光标（通常是十字箭头），表示该元素是可拖动的。
not-allowed：禁止光标（通常是一个带斜杠的圆圈），表示该元素是不可点击的。
wait：等待光标（通常是一个沙漏或旋转圆圈），表示程序正在处理。
crosshair：十字线光标，通常用于精确选择。
help：帮助光标（通常是一个问号），表示可以获得帮助。

eg:  cursor: pointer;

// class 的命名方法
BEM（Block Element Modifier）方法

Block：代表独立的功能块，例如 header、container。
Element：代表块内的组成部分，用双下划线连接，例如 header__logo、container__item。
Modifier：代表块或元素的变体，用双破折号连接，例如 button--primary、header__logo--large。
示例：
<div class="header">
    <div class="header__logo header__logo--large"></div>
    <nav class="header__nav">
        <a class="header__nav-item header__nav-item--active">Home</a>
        <a class="header__nav-item">About</a>
    </nav>
</div>

// z-index:
在具有position属性，且不为default的 static 时，才会生效。
较大 z-index 的元素会显示在 较小的 z-index的元素之上。


// 图片等比例增加或缩小方法：
1. 使用 max-width 和 height: auto
  .responsive-img {
    max-width: 100%;
    height: auto;
  }
2. 使用 width 和 height 设置百分比
  .responsive-img {
    width: 100%;
    height: 100%;
    object-fit: contain; /* 确保图片等比例缩放 */
  }
3. 使用 flexbox 和 align-items: center
  .container {
    display: flex;
    justify-content: center;
    align-items: center;
    width: 100%;
    height: 100vh; /* 高度为视口高度 */
  }
  .responsive-img {
    max-width: 100%;
    max-height: 100%;
    height: auto;
  }
4. 使用 aspect-ratio（现代浏览器（直接设定比例）
  .responsive-img {
    width: 100%;
    aspect-ratio: 16 / 9; /* 设置宽高比为 16:9 */
    object-fit: contain; /* 确保图片等比例缩放 */
  }
