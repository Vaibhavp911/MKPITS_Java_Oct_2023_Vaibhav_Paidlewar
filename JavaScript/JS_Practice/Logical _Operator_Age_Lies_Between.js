// use logical operator to find whether the age of a person lies between 10 and 20?

// let age = prompt("Welcome \n Enter your Age \n we have find your age range");
// if (age >=10 && age<=20)
//     console.log("Age lies between the range of 10  to 20");
//   elseif(age<10)
//     console.log("age os less than  10");
//   elseif (age>20)
//         console.log("age is greater than 20");  
//   else console.log("Invalid input, please enter numeric value.");
   
let age1 = prompt("Welcome!\n Enter your age to find your age range:\n");

// Validate user input: Check for both numeric value and being within a reasonable age range
if (isNaN(age) || age < 0 || age > 120) {
  console.log("Invalid input. Please enter a valid age between 0 and 120.");
} else {
  age = parseInt(age); // Convert to a number if valid

  if (age >= 10 && age <= 20) {
    console.log("Your age lies between the range of 10 to 20.");
  } else if (age < 10) {
    console.log("Your age is less than 10.");
  } else {
    console.log("Your age is greater than 20.");
  }
}

