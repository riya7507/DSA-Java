/*
Problem: Move Zeroes
Platform: LeetCode

Approach:
- Move all non-zero elements to the front.
- Fill remaining positions with zeroes.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int index = 0;

        for(int i = 0; i < n; i++) {
            if(nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        while(index < n) {
            nums[index] = 0;
            index++;
        }
    }
}
