const person = { firstName: "John", lastName: "Smith", age: 50, occupation: "engineer" };

// 1
console.log(person["firstName"])

// 2

console.log(person.firstName)




/////////////////
// string method:
/////////////////

let text = "king James, James harden"
console.log(text.length)
// console.log(text.charAt(0), text.charAt(1))  perfer to use at
console.log(text.at(0), text.at(1), text.at(-2)) // can also use method as same as array does, text[0], text[1], but text[-2] will return undefined.
console.log(text.slice(5, 10), text.slice(5))
console.log(text.substring(5, 10), text.substring(5))
console.log(text.toUpperCase(), text.toLowerCase())

var text1 = "Hello";
var text2 = "world!";
var text3 = text1.concat(text2, "Jerry", "Smith");
console.log(text3);

var text4 = "  Jerry    ";
console.log(text4.trim(), text4.trim().length); 
console.log(text4.trimStart(), text4.trimStart().length); 
console.log(text4.trimEnd(), text4.trimEnd().length); 


var text5 = "Jerry";
console.log(text5.padStart(7, "0"));
console.log(text5.padEnd(9, "n"));
console.log(text5.repeat(2), text5.repeat(5));


console.log(text.replace("James", "kevin"));
console.log(text.replace(/JAMES/i, "kevin")); // turn on the regular expression by add //i to activate case insensitive mode.
console.log(text.replace(/James/g, "Kevin"));
console.log(text.replace(/[a-z]*,/, "im"));

console.log(text5.split(""));
console.log(text5.split("r"));

console.log(text5.indexOf("J"), text5.indexOf("P"));  // indexOf cannot take regular expression, whereas search cannot take second argument (positioning).
console.log(text.lastIndexOf("James"));
console.log(text.indexOf("James"), text.indexOf("James", 10));

console.log(text.search("James"), text.search(/[a-z]*,/));

console.log(text.match("James"));

console.log(text.includes("James"), text.includes("Kevin"), text.includes("James", 15));

console.log(text.startsWith("king"), text.startsWith("king", 10));

console.log(text.endsWith("James"));



//  numbers property

console.log(100/"10")
console.log(100/"apple") // do arithmetic with a non-numeric string will result in NaN.
console.log(100+"10") // because + could be seen as both arithmetic and concatenation.


/////////////////
// number method:
/////////////////
var x = 15.566 ;
console.log(typeof(x));
console.log(x.toString(), typeof(x.toString()));

console.log(x.toFixed(0), x.toFixed(2), x.toFixed(4));

console.log(Number("John"), typeof(Number("John")), Number("10"), Number("  10"));

console.log(Number.isInteger(x), Number.isInteger(10));





