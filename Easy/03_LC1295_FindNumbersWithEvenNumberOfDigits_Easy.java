// LeetCode 1295 - Find Numbers with Even Number of Digits (Easy)
// Count numbers that contain an even number of digits.
// Time: O(n * d) | Space: O(1), where d is the number of digits

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int digits = 0;
            do {
                digits++;
                num /= 10;
            } while (num != 0);

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
