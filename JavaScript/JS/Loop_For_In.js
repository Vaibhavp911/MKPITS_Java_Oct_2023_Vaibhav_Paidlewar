let myObj = { x: 1, y: 2, z: 3 }; 
for (let key in myObj) { 
	console.log(key, myObj[key]); 
}
// JS for-in loop is used to iterate over the properties of an object.
// The for-in loop iterates only over those keys of an object which have their enumerable property set to “true”.