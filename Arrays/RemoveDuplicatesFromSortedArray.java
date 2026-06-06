/*
Problem: Remove Duplicates from Sorted Array
Platform: LeetCode

Approach:
- Traverse the sorted array.
- Store each unique element at the next available position.
- Place the last element separately.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int count = 0;

        for(int i = 0; i < n - 1; i++) {
            if(nums[i] != nums[i + 1]) {
                nums[count] = nums[i];
                count++;
            }
        }

        nums[count] = nums[n - 1];

        return count + 1;
    }
}
