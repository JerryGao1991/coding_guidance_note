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


// 固定头部导航栏：
设置 body 的 margin-top 为 var(--header-height) 是为了在页面内容与固定头部（header）之间留出空间。这种做法通常用于拥有固定头部导航栏的网站布局中，以确保页面内容不会被固定头部遮挡。
在许多网页设计中，头部导航栏是固定在页面顶部的。当用户滚动页面时，头部导航栏保持在视口的顶部，而页面内容在其下方滚动。为了确保页面内容不会被固定头部遮挡，需要在 body 或主要内容容器的顶部留出与头部相同高度的空间。
eg：
假设你的头部导航栏高度是 3rem，并且是固定定位的：
/*
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Fixed Header Example</title>
<style>
  :root {
    --header-height: 3rem;
  }

  body {
    margin: var(--header-height) 0 0 0;
    font-family: Arial, sans-serif;
  }

  .header {
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    height: var(--header-height);
    background-color: #333;
    color: white;
    display: flex;
    align-items: center;
    justify-content: center;
    z-index: 1000;
  }

  .main {
    padding: 1rem;
  }
</style>
</head>
<body>
  <header class="header">
    Fixed Header
  </header>
  <main class="main">
    <p>This is the main content of the page. Scroll down to see more content.</p>
    <p>More content...</p>
    <p>Even more content...</p>
    <p>And more...</p>
    <p>Keep scrolling...</p>
    <p>Almost there...</p>
    <p>Reached the end!</p>
  </main>
</body>
</html>
*/

// box-shadow
是一个 CSS 属性，用于在元素的框周围添加阴影效果。该属性可以创建内阴影或外阴影，并且可以控制阴影的颜色、模糊半径、扩展半径以及阴影的位置。下面是 box-shadow 属性的详细说明和使用示例：
box-shadow: [inset] offset-x offset-y blur-radius spread-radius color;
参数说明
inset（可选）：指定为内阴影。如果不使用 inset，则为外阴影。
offset-x：阴影相对于元素框的水平偏移。正值表示向右，负值表示向左。
offset-y：阴影相对于元素框的垂直偏移。正值表示向下，负值表示向上。
blur-radius（可选）：模糊半径。值越大，阴影越模糊。默认为 0，表示阴影是锐利的。
spread-radius（可选）：扩展半径。正值使阴影扩大，负值使阴影缩小。
color（可选）：阴影的颜色。如果不指定，默认使用元素的文本颜色。
eg: 
.box {
  width: 200px;
  height: 200px;
  background-color: #fff;
  border: 1px solid #ccc;
  box-shadow: 10px 10px 5px rgba(0, 0, 0, 0.3);
}
此示例中，阴影向右和向下偏移 10 像素，模糊半径为 5 像素，颜色为半透明的黑色


/* transition 用法 */
用于控制元素属性变化时的过渡效果。它可以使元素的属性变化变得更加平滑
transition: property duration timing-function delay;
eg:
过度单个属性：
  .box {
    width: 100px;
    height: 100px;
    background-color: blue;
    transition: background-color 0.5s ease;
  }

  .box:hover {
    background-color: red;
  }
过度多个属性：
  .box {
    width: 100px;
    height: 100px;
    background-color: blue;
    transition: width 0.5s ease, height 0.5s ease, background-color 1s ease;
  }

  .box:hover {
    width: 200px;
    height: 200px;
    background-color: red;
  }

// grid layout
// default setup will try to take up the full width, but only content-height for height, so normally no need to set height, or you can set the height as 100vh  
一些常见的参数和它可能对应的values:
for grid container:
display: grid;
grid-template-columns: 1fr 2fr;   (can be fraction, can be pixels(not responsive), or em、rem(not responsive))
grid-template-rows: 1fr 1fr;
gap: 10px;
grid-template: 100px 200px / 400px 800px;  (100px 200px is for rows, 400px 800px stands for columns)
grid-template-columns: 100px auto; (给予了一些responsiveness， 因为default width会尝试占据full width)
grid-template-rows: 100px auto;     (给予了一些responsiveness， 因为 height会尝试fit content)
grid-template-columns: 200px minmax(400px, 800px);
grid-template-columns: repeat(2, 200px);
// warning: eg: 如果你定义了 2*2 的grid, 但是你实际有五个div，那么最后一个div的显示方式会为：width和设定的column保持一致，row的height为content height.
// 所以，你可以设置 eg: grid-auto-rows: 200px; 这样的话，一旦你有新的div进来，那么你便可以很好地控制他的大小。

for grid items:
// 如果想控制每个item的位置，例如居中，我们可以在 grid item里引入 flex。grid + flex 是很好的排列方法。
// 最左上角的“坐标” 为 (1, 1)
grid-column: span 2;// equals to grid-column: span 2 / auto; equals to grid-column-start: span 2; grid-column-end: auto;从自动分配的网格线开始， 跨越 2 列。 负数 -1 代表 最右边（针对column）
                    // 反过来也没问题，表示的面积是一致的。 eg: grid-column-start: 2; grid-column-end: 4;  ==   grid-column-start: 4; grid-column-end: 2;
                                                      eg: grid-column-start: span 2; grid-column-end: auto;  ==   grid-column-start: auto; grid-column-end: span 2;
order: 1;   // 这个order 决定了 grid item的顺序， default 所有的items都为0, 设为1，则在后面，设为-1 则在前面。 这个数值是相对的，最大的在最后，最小的在最前。
grid-area: 2 / 1 / 3 / 3;   ==   grid-column-start: 1; grid-column-start: 3; grid-row-start: 2; grid-row-end: 3;


// color 
1. rgb:  #E58331 == R:58; G:83; B:31;      #E5833180 == R:58; G:83; B:31; Alpha:80; (这个80大概等于50%的透明度)
2. hsl:  hsl(171, 64%, 15%);  ==  hue:171; saturation: 64%; brightness:15%;     hsla(171, 64%, 15%, .15);  ==  hue:171; saturation: 64%; brightness:15%; Alpha: 15%; 


// 图片全屏布景图的实现 一个方法。
eg : .home__img {
       position: absolute;
       top: 0;
       left: 0;
       width: 100%;
       height: 100vh;
       object-fit: cover;
       object-position: 83%;
     }
position: absolute;：将 .home__img 元素的定位设置为绝对定位，使其脱离文档流，相对于其最近的定位祖先进行定位（如果没有，则相对于初始包含块）。
top: 0; 和 left: 0;：将元素定位在包含块的左上角。
width: 100%; 和 height: 100vh;：设置元素的宽度为其包含块的 100%，高度为视口高度的 100%（即全屏高度）。
object-fit: cover;：确保图像的内容覆盖整个元素的宽高，同时保持图像的宽高比。图像可能会被裁剪，以适应元素的宽高。
object-position: 83%;：调整图像在元素中的位置，将图像垂直偏移，使其中心位置位于元素高度的 83% 处。这个图像的内容会水平和垂直都偏移到容器的 83% 位置。
// ps: object-position: 50% 83%; 表示图像的内容在水平上居中（50%），在垂直上偏移到 83%。


// position: relative; 会创建了一个新的层叠上下文， 会让其类似于向上升一层的效果。
eg：   .home__img 的position: abosolute; 会让其脱离文档流（不会再推挤相邻元素），按父元素.home 定位（从而和父元素一级？）置于原来的同级的.home__container之上。
       当 .home__container 从position: static; 改为 position: relative; 会让其置于 .home__img 之上。
/*
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Position Relative Example</title>
<style>
  body, html {
    margin: 0;
    padding: 0;
    height: 100%;
  }

  .home {
    position: relative;
  }

  .home__img {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100vh;
    object-fit: cover;
    object-position: 83%;
  }

  .home__container {
    position: relative;       创建新的层叠上下文 
  }

  .home__data {
    position: relative;
    color: white;
    padding: 20px;
  } 
</style>
</head>
<body>
  <section class="home" id="home">
    <img src="https://via.placeholder.com/1920x1080" alt="Background Image" class="home__img">
    <div class="home__container container grid">
      <div class="home__data">
        <span class="home__data-subtitle">Discover your place</span>
        <h1 class="home__data-title">Explore The <br> Best <b>Beautiful <br> Beaches</b></h1>
        <a href="#" class="button">Explore</a>
      </div>
    </div>
  </section>
</body>
</html>
*/

// 文档流， 脱离文档流。
文档流： 在标准的文档流中，元素按照它们在 HTML 中出现的顺序从上到下，从左到右依次布局。
脱离文档流： 使其在布局时不再占据空间，也不影响其他元素的布局。常见的使元素脱离文档流的属性有 position、float 和 display
position里absolute 和 fixed 会脱离文档流。


// grid 也可以用 justify-content, align-items, 和 align-content：
在 CSS Grid 布局中，align-content、align-items 和 justify-content 这些属性同样可以起作用。尽管这些属性在 Flexbox 布局中也被广泛使用，但它们在 Grid 布局中的作用是类似的，用于控制网格容器内项目的对齐方式。
1. align-content
align-content 控制的是整个网格内容块在容器内的垂直对齐方式。当网格内容的总高度小于容器高度时，align-content 会生效。
可选值：start, end, center, stretch, space-around, space-between, space-evenly
2. align-items
align-items 控制的是网格项目（单元格）在网格区域内的垂直对齐方式。
可选值：start, end, center, stretch
3. justify-content
justify-content 控制的是整个网格内容块在容器内的水平对齐方式。当网格内容的总宽度小于容器宽度时，justify-content 会生效。
可选值：start, end, center, stretch, space-around, space-between, space-evenly

// width: max-content;
width: max-content;：使元素的宽度根据内容的最大宽度自动调整，不会换行。相反，假如设定了固定宽度例如， width: 100px; 那假如内容超出，则会超过元素的限制。
适用场景：适用于需要自适应内容宽度的情况，例如按钮、标签、导航菜单等。

// overflow 
visible：默认值，内容不会被剪裁，会溢出容器。
hidden：内容会被剪裁，溢出部分不可见。
scroll：内容会被剪裁，溢出部分可滚动查看。
auto：如果内容溢出，浏览器会自动提供滚动条查看溢出部分。
overflow: hidden; 是用于控制一个元素的内容在其容器中溢出时的显示方式。具体来说，它会隐藏溢出的内容，使其不显示在元素的边界之外。这个属性对于处理内容溢出的问题非常有用。

// scale
scale() 是一个用于变换（transform）的函数。它可以用于缩放元素，使元素在 X 和 Y 轴方向上按比例放大或缩小。
eg: scale(1.1);  scale(1.1) 表示将元素按 1.1 倍的比例缩放，即：宽度放大 1.1 倍。高度放大 1.1 倍。
用法eg:
  .image-container img {
    width: 100%;
    transition: transform 0.5s;
  }

  .image-container:hover img {
    transform: scale(1.1);
  }

//