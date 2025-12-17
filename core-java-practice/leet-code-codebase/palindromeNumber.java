
class Solution {
    public boolean isPalindrome(int x) {
        int reversed = 0;
        int original = x;
        if (x < 0 || (x != 0 && x % 10 == 0)) { // checking if the number is negative or ends with 0
            return false;
        }
        while (x != 0) {
            int digit = x % 10;// removing hte last digit of the number
            reversed = reversed * 10 + digit; // adding the digit to the reversed number
            x /= 10; // removing the last digit of the number
        }
        return original == reversed; // checking if the original number and the reversed number are equal
    }
}
