// Initialize an empty array
let array_user = [];

// Prompt for the number of elements
let numElements = parseInt(prompt("Enter the number of elements to add:"));

for (let i = 0; i < numElements; i++) {
  let num = prompt("Enter element " + (i) + ":");
  array_user.push(num); // Add the element to the array
}

console.log(array_user);