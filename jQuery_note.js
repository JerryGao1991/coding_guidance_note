// document.querySelector("h1") = query("h1") = $("h1")

//如何引入：
eg:

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>jQuery</title>
    <link rel="stylesheet" href="style.css"/>
  </head>
  
  <body>
    <h1>hello.</h1>
    <button></button>
    <button></button>
    <button></button>
    <button></button>
    <button></button>    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script src="index.js" charset="utf-8"></script>
  </body>  

</html>


// 如果jQuery script 放在head里， 你想测试是否真的连上了, 可以用如下代码。
$(document).ready(function() {
  $("h1").css("color", "red");
});

$("h1").css("font-size");  // one param, check the value.
$("h1").css("font-size", "32px"); // two param, set the value

$("h1").addClass("big-title");
$("h1").removeClass("big-title");
$("h1").hasClass("big-title");  // true or false

$("h1").text("Bye"); // change text, 即使是里面有html tags， <em>Hey</em> 也会被转换成纯文本
$("h1").html("<em>Hey</em>"); change text, 类似于 innerHTML

$("h1").attr("src"); // get the attribute value.
$("h1").attr("href", "https://www.yahoo.com"); // change attribute value.


// add event listener method:
// 第一种：
$("h1").click(function() {
  $("h1").css("color", "purple");
});                      // add event listener

$("input").keypress(function(event) {
  console.log(event.key);    
}); // add event listener
// 第二种：
$("h1").on("mouseover", function() {
  $("h1").css("color", "purple");
});



// 循环写法: 一般写法和jQuery写法。 (可以看到在选取上， jQuery 选取完不用在后面加选择array的序号？)
for (var i = 0; i < 5; i++) {
  document.querySelectorAll("button")[i].addEventListener("click", function() {
    document.querySelector("h1").style.color = "purple";
  });
}

==

$("button").click(function() {
  $("h1").css("color", "purple");
});


// 增加元素在相应的位置：
$("h1").before("<button>New</button>"); // 在匹配元素前增加
$("h1").after("<button>New</button>");  // 在匹配元素后增加
$("h1").prepend("<button>New</button>"); // 在匹配元素的内部开头处增加
$("h1").append("<button>New</button>");  // 在匹配元素的内部结尾处增加

// 删除元素：
$("button").remove();

// jQuery effect method: 
$("button").hide();
$("button").toggle();
$("button").fadeOut();
$("button").fadeIn();
$("button").fadeToggle();
$("button").slideUp();
$("button").slideDown();
$("button").slideToggle();
$("button").animate({opacoty: 0.5}); // animate 里的CSS属性只能用 value是数字类型的
$("button").slideUp().slideDown().animate({opacoty: 0.5}); // chained together





