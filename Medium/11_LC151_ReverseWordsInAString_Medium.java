// LeetCode 151 - Reverse Words in a String (Medium)
// Reverse the order of words and remove extra spaces.
// Time: O(n) | Space: O(n)

class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder answer = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            answer.append(words[i]);
            if (i > 0) {
                answer.append(" ");
            }
        }

        return answer.toString();
    }
}
