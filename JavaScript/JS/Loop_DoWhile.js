let test = 1; 

do { 
	console.log(test); 
	test++; 
} while(test <= 5)

/*
The do-while loop starts with the execution of the statement(s). There is no checking of any condition for the first time.
After the execution of the statements and update of the variable value, the condition is checked for a true or false value.
If it is evaluated to be true, the next iteration of the loop starts.
When the condition becomes false, the loop terminates which marks the end of its life cycle.
It is important to note that the do-while loop will execute its statements at least once before 
any condition is checked and therefore is an example of the exit control loop.
*/