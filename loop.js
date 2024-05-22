// for:


for (var i = 0; i < 10 ; i++) {
    console.log(i);
}

// expression 1, expression 2, expression 3 are all optional.  warning: if you omit expression 2, you probably need to provide a break inside the loop, otherwise the loop will never end.


// for in:

var stars = ["james", "kevin", "nash", "jordan"];
for (let x in stars) {
    console.log(x);
}

const player = {star1: "james", star2: "kevin", star3: "nash", star4: "jordan" };
for (let x in player) {
    console.log(x);
}


var lname = "jerry";
for (let x in lname) {
    console.log(x);
}


// for of:

var stars = ["james", "kevin", "nash", "jordan"];
for (let x of stars) {
    console.log(x);
}

//warning: doesn’t working on non-iteration object below: 
// for (let x of player) {
//     console.log(x);
// }


var lname = "jerry";
for (let x of lname) {
    console.log(x);
}



// while:
var num = 0;
while (num < 5) {
    console.log(num);
    num++;
}



// do while:

// do {
//     let seq = 0;
//     let text = "";
//     text = "the number is " + seq;
//     console.log(text);
//     seq
// }
// while (seq < 10);


