// LeetCode 2149 - Rearrange Array Elements by Sign
// Approach: Use separate indices for positive and negative numbers
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        int positiveIndex = 0;
        int negativeIndex = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                arr[negativeIndex] = nums[i];
                negativeIndex += 2;
            } else {
                arr[positiveIndex] = nums[i];
                positiveIndex += 2;
            }
        }

        return arr;
    }
}
