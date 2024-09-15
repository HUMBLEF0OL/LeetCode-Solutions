class Solution {
    public String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 && j >= 0) {
            int first = a.charAt(i) - '0';
            int second = b.charAt(j) - '0';
            int result = first + second + carry;
            char save = Character.forDigit(result%2,10);
            str.insert(0, save);
            carry = result / 2;
            i--;
            j--;
        }

        while (i >= 0) {
            int value = a.charAt(i) - '0';
            int result = value + carry;
            char save = Character.forDigit(result%2,10);
            str.insert(0, save);
            carry = result / 2;
            i--;
        }

        while (j >= 0) {
            int value = b.charAt(j) - '0';
            int result = value + carry;
            str.insert(0, (char) (result % 2 + '0'));
            carry = result / 2;
            j--;
        }
        if (carry == 1) {
            char ch = Character.forDigit(carry, 10);
            str.insert(0, ch);
        }
        return str.toString();
    }
}