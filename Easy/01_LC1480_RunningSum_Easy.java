// LeetCode 1480 - Running Sum of 1D Array (Easy)
// Given an array nums, return its running sum.
// Time: O(n) | Space: O(1) extra (modifies the input array)

class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
