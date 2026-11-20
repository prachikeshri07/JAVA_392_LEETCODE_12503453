// LeetCode 231 - Power of Two (Easy)
// Check whether n is a positive power of two.
// Time: O(1) | Space: O(1)

class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
