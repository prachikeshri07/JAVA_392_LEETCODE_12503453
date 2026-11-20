// LeetCode 75 - Sort Colors (Medium)
// Sort an array containing only 0, 1, and 2 in-place.
// Time: O(n) | Space: O(1)

class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int middle = 0;
        int high = nums.length - 1;

        while (middle <= high) {
            if (nums[middle] == 0) {
                int temp = nums[low];
                nums[low] = nums[middle];
                nums[middle] = temp;
                low++;
                middle++;
            } else if (nums[middle] == 1) {
                middle++;
            } else {
                int temp = nums[middle];
                nums[middle] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
