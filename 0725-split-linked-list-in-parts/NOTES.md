- find the length of the list
- find the base size of each group (baseSize = size/k)
- find the extra elements (extra = size%k)
- maintain previous and current pointer (prev and temp)
- start a loop that will run over the size of the k and temp!=null
- assign output[i] = temp;
- in the nested loop run for base elements
- if there are 'extra' is not 0 i.e one extra element should be added
- decrease the value of extra by 1
- make the next of prev as null to break the list