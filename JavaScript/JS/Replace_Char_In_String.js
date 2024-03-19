
let string_Name = prompt('Enter a string');
let random_Char = prompt('Enter random char') ;
let string_Name_New = string_Name.replace(string_Name[3],random_Char.charAt());
alert("New String is : " + string_Name_New);