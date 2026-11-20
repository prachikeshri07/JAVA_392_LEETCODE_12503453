// LeetCode 1672 - Richest Customer Wealth (Easy)
// Find the maximum row sum in the accounts 2D array.
// Time: O(m * n) | Space: O(1) extra

class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;

        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            richest = Math.max(richest, wealth);
        }

        return richest;
    }
}
