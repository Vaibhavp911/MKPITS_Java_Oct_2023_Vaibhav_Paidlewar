let fName ="Vaibhav"; // global scope
function getDetails(){
    let lName = "Paidlewar";    // local variable
    console.log(fName+" "+lName);

}
getDetails();  // Output: Vaibhav Paidlewar
// calling global variable
console.log(fName);
// calling local variable of fn getDetails()
console.log(lName);  
// ReferenceError: lName is not defined as it is local.