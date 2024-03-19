array_1 = [33,432,653,65324];

// length of array
console.log(array_1.length);

// The at() method of Array instances takes an integer value and returns the item at that index,
// allowing for positive and negative integers. 
// Negative integers count back from the last item in the array

console.log(array_1.at(3));

// The concat() method of Array instances is used to merge two or more arrays.
// This method does not change the existing arrays,
// but instead returns a new array.
let array_2 = [101, 102, 103, 104,105];

let array_3 = array_1+ " " + array_2;
console.log(array_3);

// The copyWithin() method of Array instances shallow copies part of this array to
// another location in the same array and returns this array without modifying its length.
// copyWithin(target, start, end)
 
//console.log(array_2.copywithin(3, 0, 2));

// The every() method of Array instances tests whether all elements in the array pass the test
// implemented by the provided function. It returns a Boolean value.



// The fill() method of Array instances changes all elements within a range of indices in an array to a static value.
// It returns the modified array.

// // Fill with 0 from position 2 until position 4
console.log(array_2.fill(0,2,4));

// The filter() method of Array instances creates a shallow copy of a portion of a given array,
// filtered down to just the elements from the given array that pass the test implemented by the provided function.

const words = ['spray', 'elite', 'exuberant', 'destruction', 'present'];
const result = words.filter((word) => word.length > 6);
console.log(result);
// Expected output: Array ["exuberant", "destruction", "present"]

// The find() method of Array instances returns the first element in the provided array that
// satisfies the provided testing function. If no values satisfy the testing function, undefined is returned.
const found = array_2.find((value) => value > 104);
console.log(`The value ${found} was found`);

//  The findIndex() method of Array instances returns the index of the first element in an array
// that satisfies the provided testing function. If no elements satisfy the testing function,
//  -1 is returned.
const found1 = array_1.find((value) => value > 103);
console.log(`The value ${found1} was found`);
// console.log(array_1.findIndex(found1));

// The findLast() method of Array instances iterates the array in reverse order and returns
// the value of the first element that satisfies the provided testing function.
// If no elements satisfy the testing function, undefined is returned.
const found3 = array_1.findLast( (value)=> value <95 );
console.log(`The last value ${found3} was found`);

// The findLastIndex() method of Array instances iterates the array in reverse order
// and returns the index of the first element that satisfies the provided testing function.
// If no elements satisfy the testing function, -1 is returned.
//console.log(array_1.findLastIndex(found3));

// The flat() method of Array instances creates a new array with all sub-array elements concatenated
// into it recursively up to the specified depth.Try it
const arr1 = [0, 1, 2, [3, 4]];

console.log(arr1.flat());
// expected output: Array [0, 1, 2, 3, 4]

const arr2 = [0, 1, [2, [3, [4, 5]]]];
arr2.flat();
console.log(arr2);
arr2.flat(2);
console.log(arr2);
arr2.flat(Infinity);
console.log(arr2);
// expected output: Array [0, 1, 2, Array [3, Array [4, 5]]]

// The Array.from() static method creates a new, shallow-copied Array instance from an iterable
// or array-like object.

console.log(Array.from("vaibhav"));

// The includes() method of Array instances determines whether an array includes a certain value
// among its entries, returning true or false as appropriate.

console.log(array_1.includes(432));

// The indexOf() method of Array instances returns the first index at which a given element can be
// found in the array, or -1 if it is not present.
console.log(array_1.indexOf(432));

// he Array.isArray() static method determines whether the passed value is an Array.
console.log(array_1.isArray); // Outputs

//  The join() method of Array instances creates and returns a new string by concatenating all 
//of the elements in this array, separated by commas or a specified separator string.
//If the array has only one item, then that item will be returned without using the separator.

console.log(array_1.join("--"));

// The keys() method of Array instances returns a new array iterator object that contains
//the keys for each index in the array.
const iterator =  array_1.keys();
for (const key of iterator) {
    console.log(key);
}

// The lastIndexOf() method of Array instances returns the last index at which a given element
// can be found in the array, or -1 if it is not present. The array is searched backwards,
// starting at fromIndex.
console.log("-----------")
let array_4 = [23,653,1425,735,252,897,24,1,897];
console.log(array_4.lastIndexOf(897));

// The map() method of Array instances creates a new array populated with the results of calling
// a provided function on every element in the calling array.

const map1 = array_4.map((value)=>value*3);
console.log(map1);

// The Array.of() static method creates a new Array instance from a variable
// number of arguments, regardless of number or type of the arguments.
console.log(Array.of('foo', 2, 'bar', true));
// Expected output: Array ["foo", 2, "bar", true]

console.log(Array.of());

// The pop() method of Array instances removes the last element from an
// array and returns that element. This method changes the length of the array.
console.log(array_1.length);
// array_1.pop();
console.log(array_1.pop());
console.log(array_1.length);

// The push() method of Array instances adds the specified elements to the end of 
// an array and returns the new length of the array.
console.log("-----------")
console.log(array_1.length);
console.log(array_1.push(100,"hello"));

// The reverse() method of Array instances reverses an array in place and returns 
// the reference to the same array, the first array element now becoming the last,
// and the last array element becoming the first.
const reversed = array_1.reverse();
console.log('reversed:', reversed);

// The shift() method of Array instances removes the first element from an array
// and returns that removed element. This method changes the length of the array.

console.log(array_1.shift());
console.log(array_1);

// The slice() method of Array instances returns a shallow copy of a portion of
// an array into a new array object selected from start to end (end not included)
// where start and end represent the index of items in that array. The original
// array will not be modified.

console.log("-----");
console.log(array_1);
console.log(array_1.slice(2));



// The some() method of Array instances tests whether at least one element in the 
//array passes the test implemented by the provided function. It returns true if,
// in the array, it finds an element for which the provided function returns true;
/// otherwise it returns false. It doesn't modify the array.


const array = [1, 2, 3, 4, 5];

// Checks whether an element is even
const even = (element) => element % 2 === 0;

console.log(array.some(even))

// The sort() method of Array instances sorts the elements of an array in place and
// returns the reference to the same array, now sorted. The default sort order is ascending,
// built upon converting the elements into strings, then comparing their sequences of UTF-16
// code units values.
console.log(array_2.sort());

// The splice() method of Array instances changes the contents of an array by removing or
// replacing existing elements and/or adding new elements in place.

// syntax splice(start, deleteCount, item1, item2,...)

console.log(words);
console.log(words.splice(2, 1, 'vaibhav'));
console.log(words);

// The toLocaleString() method of Array instances returns
// a string representing the elements of the array. 
//The elements are converted to strings using their toLocaleString
// methods and these strings are separated by a locale-specific string
// (such as a comma ",").
const array1 = [1, 'a', new Date('21 Dec 1997 14:12:00 UTC')];
const localeString = array1.toLocaleString('en', { timeZone: 'UTC' });

console.log(localeString);
