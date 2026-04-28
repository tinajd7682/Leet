class Solution {
    public boolean isPalindrome(int x) {

        // Negative numbers are never palindromes
        if (x < 0) return false;

        int original = x;
        int reversed = 0;

        // Step 1: Reverse the number
        while (x > 0) {
            int digit = x % 10;       // Get last digit
            reversed = reversed * 10 + digit;  // Build reversed number
            x /= 10;                  // Remove last digit
        }

        // Step 2: Compare original vs reversed
        return original == reversed;
    }
}