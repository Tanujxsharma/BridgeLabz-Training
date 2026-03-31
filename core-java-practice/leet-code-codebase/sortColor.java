class SortColor {
    public void switchThem(int[] nums, int x, int y) { // function to swap elements
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    public void sortColors(int[] nums) {
        int read = 0;
        int zeroes = 0;
        int twos = nums.length - 1;
        while (read <= twos) { // read pointer should not cross the twos pointer
            if (nums[read] == 0) { // if current element is 0
                switchThem(nums, read, zeroes); // swap it with the element at zeroes pointer
                read++;
                zeroes++;
            } else if (nums[read] == 2) { // if current element is 2
                switchThem(nums, read, twos); // swap it with the element at twos pointer
                twos--;
            } else { // if current element is 1
                // do nothing
                read++;
            }
        }
    }
}