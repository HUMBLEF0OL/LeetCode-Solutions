### Steps to Solve Using `TreeMap`:
​
1. **Data Structure**:
- Use a `HashMap<String, TreeMap<Integer, String>>`:
- The outer `HashMap` maps keys to a `TreeMap` of timestamp-value pairs.
- The `TreeMap` stores timestamps as keys (automatically sorted) and values as the corresponding values.
​
2. **`set(String key, String value, int timestamp)`**:
- If the `key` is not present in the `HashMap`, initialize a new `TreeMap` for that key.
- Add the `timestamp` and `value` pair to the `TreeMap`.
​
3. **`get(String key, int timestamp)`**:
- If the `key` does not exist, return an empty string `""`.
- Use `TreeMap.floorKey(timestamp)` to find the largest timestamp less than or equal to the given `timestamp`.
- If a valid timestamp is found, return the associated value; otherwise, return `""`.
​
### Key Methods:
- `TreeMap.put(timestamp, value)`: Stores the value with a given timestamp.
- `TreeMap.floorKey(timestamp)`: Returns the largest key ≤ `timestamp`.
​
This approach ensures efficient insertion and retrieval with time complexity \(O(\log N)\).