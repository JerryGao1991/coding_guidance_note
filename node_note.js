// check version:
node -v
// into node REPL:
node
// exit node REPL:
.exit or ctrl+c
// run javascript file:
eg: node index.js

// write and save a file:
const fs = require("fs");
fs.writeFile("message.txt", "Hello from NodeJS!", (err) => {
  if (err) throw err; 
  console.log("the file has been saved!")
} );

// read file:
fs.readFile("message.txt", "utf8", (err, data) => {
  if (err) throw err;
  console.log(data)
});
