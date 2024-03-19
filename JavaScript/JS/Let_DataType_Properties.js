// Let are block scoped
// let can be updated but  not reassigned.
// let  is hoisted to the top of its containing function or script,
// so it’s available from the beginning of that function/script up until the end.
// let variables are not initialised.

let num1 = 3423;
console.log(num1);
// let num1 = 5645; error same variable is not  allowed to be declared again in the same scope.
console.log(num1);
let num2;
console.log(num2)