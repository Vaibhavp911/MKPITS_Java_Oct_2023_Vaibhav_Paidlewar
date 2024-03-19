/*
While loop starts with checking the condition.
If it is evaluated to be true, then the loop body statements are executed otherwise first statement following the loop is executed.
For this reason, it is also called the Entry control loop
Once the condition is evaluated to be true, the statements in the loop body are executed.
Normally the statements contain an updated value for the variable being processed for the next iteration.
When the condition becomes false, the loop terminates which marks the end of its life cycle.
*/
let val = 1; 

while (val < 6) { 
	console.log(val); 
	val += 1; 
}
