document.firstElementChild;
document.lastElementChild;
document.querySelector();      // return the first element. can select element, class, or ID.
document.querySelectorAll();    // return an array, get all the elements satisfy the condition.
document.getElementsByTagName(); // return an array.
document.getElementsByClassName(); // return an array.
document.getElementsById(); // return the first element. Actually only one element. because it is id. 

document.querySelector().classList.add(); // add a class to an selected element.
document.querySelector().classList.remove(); // remove a class from an selected element.
document.querySelector().classList.toggle(); // if not activate related CSS, then activate. Vice versa
document.querySelector().innerHTML; // get all the values within the selected element. including other tags, elements etc.
document.querySelector().textContent; // get only the text values.

document.querySelector().attributes; // get all the attributes that attached to the element.
document.querySelector().getAttribute(); // get a specific attribute's value.
document.querySelector().setAttribute("href", "https://www.bing.com");

document.querySelector().addEventListener("{function.eg: click}", {function});
eg : 1. document.querySelector().addEventListener("click", handleClick);
        function handleClick() {
          alert("I got clicked");  
        } 
     2. document.querySelector().addEventListener("click", function () {
          alert("I got clicked!");
        });

// create an audio object and play it:
eg : var audio = new Audio("sounds/tom-1.mp3");
     audio.play();       

// this; switch;
eg : var buttonInnerHTML = this.innerHTML;
     switch (buttonInnerHTML) {
       case "w":
         var tom1 = new Audio("sounds/tom-1.mp3");
         tom1.play();
         break;
         
       case "a":
         var tom2 = new Audio("sounds/tom-2.mp3");
         tom2.play();
         break;

       default: console.log(buttonInnerHTML);
     } 


// constructor Function 构造函数
eg:   function BellBoy (name, age, hasWorkPermit, languages) {
        this.name = name;
        this.age = age;
        this.hasWorkPermit = hasWorkPermit;
        this.languages = languages;
      }     
      var bellBoy1 = new BellBoy("Timmy", 19, true, ["French", "English"]);

    1. 函数名的第一个字母必须大写。
    2. 调用的时候前面要加关键字 new。


// object method function:
eg:   var bellboy1 = {
        name: "Timmy",
        age: 19,
        hasWorkPermit: true,
        languages: ["French", "English"],
        moveSuitcase: function() {
          alert("May I take your suitcase?");
          pickUpSuitcase();
          move();    
        }
      }   
      bellboy1.moveSuitcase();


// constructor Function with method
eg:   function BellBoy (name, age, hasWorkPermit, languages) {
        this.name = name;
        this.age = age;
        this.hasWorkPermit = hasWorkPermit;
        this.languages = languages;
        this.moveSuitcase = function() {
          alert("May I take your suitcase?");
          pickUpSuitcase();
          move();    
        }
      }     