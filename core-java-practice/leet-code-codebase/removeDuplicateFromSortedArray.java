class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        int count = 0;
        while (i < j && j < nums.length) { // checking both pointers within bounds
            if (nums[i] != nums[j]) { // if elements at both pointers are not equal
                nums[i + 1] = nums[j];// place the unique element at the next position of i
                j++;
                i++;
                count++;
            } else {
                j++;
            }
        }
        return count + 1; // return the count of unique elements
    }
}
