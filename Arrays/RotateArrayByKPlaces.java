/*
Problem: Rotate Array by K Places
Platform: LeetCode

Approach:
- Compute k % n to handle large rotations.
- Copy the last k elements into a temporary array.
- Copy the remaining elements after them.
- Copy the temporary array back to the original array.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] num1 = new int[n];
        int k1 = 0;

        for(int i = n - k; i < n; i++) {
            num1[k1++] = nums[i];
        }

        for(int i = 0; i < n - k; i++) {
            num1[k1++] = nums[i];
        }

        for(int i = 0; i < n; i++) {
            nums[i] = num1[i];
        }
    }
}
