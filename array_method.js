
// create array :
// 1.
const names = ["Jerry", "James", "Kevin"];
console.log(names);

// 2.
const lnames = [];
lnames[0] = "Jerry";
lnames[1] = "James";
lnames[2] = "Kevin";
console.log(lnames, typeof(lnames));




/////////////////
// array method:
/////////////////

const stars = ["Jerry", "James", "Kevin", "Kyrie", "Curry"];
console.log(stars.length);
console.log(stars.toString());

console.log(stars[1], typeof(stars[1]));

console.log(stars.join("*"), typeof(stars.join("*"))); // change array into string as a whole.

console.log(stars.pop()); // remove the last element within the array, returned value will the removed element. 
console.log(stars)


console.log(stars.push("Duncan")); // add a new element in the end, the returned value us the new array length.
console.log(stars); 
// another common way to add a new element at the end of an array: stars[stars.length] = "Nash".


console.log(stars.shift()); // remove first element within array, returned value us the removed element. functionally similar to pop().
console.log(stars);

console.log(stars.unshift("Jordan")); // add a new element at the beginning, the returned value us the new array length.
console.log(stars);

const elites = ["Park", "Yaoming", "Francis", "Carter", "Mcgrady"];
console.log(stars.concat(elites), stars.concat(elites).length);


console.log(elites.splice(2, 0, "Smith", "Tatum"), elites); // 2 specifies the position where new element should be added, 0 defines how many elements should be removed, the rest of elements defines the new elements to be added. the returned value is deleted items in array format.
console.log(elites.splice(2, 4, "Smith", "Tatum"), elites);
console.log(elites.splice(0, 1), elites) // splice can be used to add new items, but also can be used to delete items.(without leaving blank holes)

const months = ["Jan", "Feb", "Mar", "Apr", "Apr"]; // spliced created a new changed array without altering the original array.
const spliced = months.toSpliced(0, 1);
console.log(spliced, months);

console.log(months.slice(1)) // slice will slice out a part of original array and create a new array thus without altering original array.
console.log(months.slice(1, 3)) // second argument mentioned element will not be included in the new array.  

console.log(months.indexOf("Jan"), months.indexOf("May")); // indexOf() returns -1 if no values found in array.
console.log(months.indexOf("Jan", 1)) // second argument means where the start position for the index search.

console.log(months.lastIndexOf("Apr"));

console.log(months.includes("May"));

// find(), findIndex(), findLast(), findLastIndex()


// the similar method both string and array shares:
// 1. get value : []  (string can use at()) .
// 2. concat
// 3. indexOf, lastIndexOf
// 4. slice
// 5. length 
// 6. includes
//  
// the main different method under same functionality:
// 1. search, findIndex （both have indexOf function as substitution if no regular expression is required. PS: string has replace method if you want change it by value.）
// 










