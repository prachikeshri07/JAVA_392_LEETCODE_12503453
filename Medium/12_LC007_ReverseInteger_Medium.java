// LeetCode 7 - Reverse Integer (Medium)
// Reverse the digits; return 0 if the reversed value overflows 32-bit signed int.
// Time: O(log |x|) | Space: O(1)

class Solution {
    public int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            if (reversed > Integer.MAX_VALUE / 10 ||
                (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (reversed < Integer.MIN_VALUE / 10 ||
                (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            reversed = reversed * 10 + digit;
        }

        return reversed;
    }
}
