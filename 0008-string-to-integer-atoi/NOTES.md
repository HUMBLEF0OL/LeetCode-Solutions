### Steps:
​
1. **Initialize variables** (`index`, `sign`, `result`).
2. **Skip leading whitespace**.
3. **Check for optional sign** (`'+'` or `'-'`).
4. **Process digits**:
- Convert characters to digits.
- Build the integer using `result = result * 10 + digit`.
- Check for overflow and stop if necessary.
5. **Handle overflow/underflow** by returning `Integer.MAX_VALUE` or `Integer.MIN_VALUE` if necessary.
6. **Return the result** with the appropriate sign.
​