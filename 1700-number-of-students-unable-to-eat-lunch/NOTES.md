**Approach #1**
The question states that "This(the queue) continues until none of the queue students want to take the top sandwich and are thus unable to eat.". And that's what you might want to do!!!
Create a queue and run a loop until
1). either all the sandwiches are taken up (then return zero) or
2). no one in the queue is ready to take the top sandwich (then return the number of students left in the queue).
​
**Approach #2**
Diving a bit into the question, the repetition of the queue indicates a circular fashion. So to check if the sandwich at the top of the stack is going to be consumed we only need to check that if there is a student anywhere in the queue who wants a sandwich of the same type or not.
​
Also, thinking about the above explanation in Approach#1, the point at which we are going to meet the 2nd condition is when there is no student in the queue who wants the sandwich at the top of the stack i.e. either the condition that sandwich of type 1 is at the top and all students in the queue want a sandwich of type 0 or vice versa is true.
​
Keeping the above two in mind, all we need to do is calculate the no. of students who need the sandwich of type0 and type1 separately, then for every sandwich[i] check if there is a student in the queue who need the sandwich of the same type. If yes allocate the sandwich to him and decrease the count of students who want the sandwich of the same type. Else as there is no one in the queue who wants the sandwich, all the remaining students will not be able to eat lunch!
Inspired from @pratham1807