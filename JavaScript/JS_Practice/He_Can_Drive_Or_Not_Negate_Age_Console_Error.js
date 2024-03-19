checkDrivingAge(); // Call the function to start the age check process

function checkDrivingAge() {
    let response = prompt("Do you want to recheck the age?").toLowerCase(); // Convert to lowercase for case-insensitive comparison
  
    if (response === 'yes') {
      let age = parseInt(prompt("How old are you?"));
      if (age<0) {
        if (age >= 18 && age>0) {
            alert("You Can Drive");
          } else {
            alert("You can't drive yet!");
          }
          // Optionally, call the function again to allow rechecking (consider a loop or a different structure for multiple rechecks)
          // checkDrivingAge();
        } else if (response === 'no') {
          alert("You can close the tab");
        } else {
          alert("Invalid input. Please answer 'yes' or 'no'.");
        }
      } else {
        console.error('Invalid input');
        // alert("Invalid input. Please answer 'yes' or 'no'.");
      }
    checkDrivingAge(); // Call the function to start the age check process

  }