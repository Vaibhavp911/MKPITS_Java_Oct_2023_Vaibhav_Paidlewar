//type casting - convert one data type to another
let strNum = "10";
let intNum = Number(strNum); //use number function or parseInt()
console.log("Type Casting: "+intNum);

let strBool = "true";
let boolVal = Boolean(strBool); //use boolean function or (strBool == true || strBool == "true")
console.log("Type Casting: "+boolVal);

let x = null;
let y = undefined;
if(x === null){
    console.log("Value is Null");
}else if(y === undefined){
    console.log("Value is Undefined");  
}else{
    console.log("Value is neither Null nor Undefined");
}