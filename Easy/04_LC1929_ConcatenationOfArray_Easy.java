// LeetCode 1929 - Concatenation of Array (Easy)
// Return an array containing nums followed by nums again.
// Time: O(n) | Space: O(n) for the result

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] answer = new int[2 * n];

        for (int i = 0; i < n; i++) {
            answer[i] = nums[i];
            answer[i + n] = nums[i];
        }

        return answer;
    }
}
