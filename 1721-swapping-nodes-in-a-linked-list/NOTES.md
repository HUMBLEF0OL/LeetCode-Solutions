The problem can be solved by maintaining the 2 pointes, one for starting and second for ending. Following are the steps
* Initialize currentNode(the iterator), startPointer and endPointer with head of the linkedList
* Maintain a counter with initial value of 1
* loop over the current node with exit condition as being null
* if the counter is less than k i.e we are looking for starting node, update the starting node to next
* if the counter becomes greater than counter i.e we are looking for ending node, update the ending node
* in the end swap their values