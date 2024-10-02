Here are the steps to solve the **Dutch National Flag problem** (sorting an array of `0`s, `1`s, and `2`s) using the three-pointer approach:
​
### Steps:
​
1. **Initialize three pointers**:
- `low = 0`: Tracks the boundary between `0`s (red).
- `mid = 0`: The current pointer that traverses through the array.
- `high = n - 1`: Tracks the boundary between `2`s (blue), where `n` is the length of the array.
​
2. **Traverse the array using `mid` pointer**:
- Continue the process while `mid` is less than or equal to `high`.
- At each step, check the value at `nums[mid]` and do the following:
​
### 3. Conditions:
- **If `nums[mid] == 0`**:
- Swap `nums[low]` and `nums[mid]`.
- Increment both `low` and `mid`, because the swapped `0` is correctly placed at the front.
- **If `nums[mid] == 1`**:
- Simply move the `mid` pointer to the next element, because `1` is already in the correct region.
- **If `nums[mid] == 2`**:
- Swap `nums[mid]` and `nums[high]`.
- Decrement `high`, but **do not increment `mid`** yet, because the swapped value from `high` still needs to be processed.
​
4. **End condition**:
- The loop continues until `mid` surpasses `high`, at which point the array is sorted.
​
### Time and Space Complexity:
- **Time Complexity**: \(O(n)\), where `n` is the number of elements. Each element is processed once.
- **Space Complexity**: \(O(1)\), as the sorting is done in-place without additional memory.