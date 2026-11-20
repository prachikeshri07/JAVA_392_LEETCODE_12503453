// LeetCode 50 - Pow(x, n) (Medium)
// Calculate x raised to the power n using exponentiation by squaring.
// Time: O(log |n|) | Space: O(1)

class Solution {
    public double myPow(double x, int n) {
        long exponent = n;
        if (exponent < 0) {
            x = 1.0 / x;
            exponent = -exponent;
        }

        double result = 1.0;

        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result *= x;
            }
            x *= x;
            exponent >>= 1;
        }

        return result;
    }
}
