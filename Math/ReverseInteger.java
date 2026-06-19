// LeetCode 7 - Reverse Integer
// Approach: Digit Extraction with Overflow Check
// Time Complexity: O(log10(n))
// Space Complexity: O(1)

class Solution {
    public int reverse(int x) {
        int num = x;
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;

            if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE / 10 ||
                (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            rev = rev * 10 + digit;
            num = num / 10;
        }

        return rev;
    }
}
