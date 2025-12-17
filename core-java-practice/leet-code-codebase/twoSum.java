import java.util.*;
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> map = new HashMap(); // creting a hashmap 
        for(int i = 0 ;i< nums.length;i++){
            int t = target-nums[i];
            if(map.containsKey(t)){ 
                return new int[] {map.get(t),i};// returning the resuting array
            }
            map.put(nums[i],i);
        }
        return null;// returning null if result not found 
    }
}