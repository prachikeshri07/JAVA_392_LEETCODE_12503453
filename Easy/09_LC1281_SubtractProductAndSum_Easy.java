// LeetCode 1281 - Subtract the Product and Sum of Digits of an Integer (Easy)
// Return the product of the digits minus their sum.
// Time: O(d) | Space: O(1), where d is the number of digits

class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }

        return product - sum;
    }
}
