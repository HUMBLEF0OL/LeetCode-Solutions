We need to save the following information for each function
- its ID
- its startTime
- its child execution time
​
Now for each log if the current log is of:
- **start** then push the current log details into the stack as
- ID as defined in the log
- childExecution for now push 0 as currently it doesn't have any children
- startTime as defined in the log message
- **end** then do the following:
- pop its starting details
- find the interval by end-start(end is there in current log message and start is there in the popped message) +1
- now find the actual time by subtracting any childExecution time
- save the actul time in the array
- check if the stack isn't empty so that you can update its parent
- if not then update the parent childExecution time by subtracting the interval
​
In the end return the result array