// LeetCode 229 - Majority Element II
// Approach: Sorting and Counting Frequencies
// Time Complexity: O(n log n)
// Space Complexity: O(1) (excluding output list)

import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int count = 1;
        List<Integer> arr = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count > n / 3) {
                    arr.add(nums[i - 1]);
                }
                count = 1;
            }
        }

        if (count > n / 3) {
            arr.add(nums[n - 1]);
        }

        return arr;
    }
}
