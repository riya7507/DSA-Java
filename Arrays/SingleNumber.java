// LeetCode 136 - Single Number
// Approach 1: Sorting
// Time Complexity: O(n log n)
// Space Complexity: O(1)

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for (int num : nums) {
            ans ^= num;
        }

        return ans;
    }
}
