class Solution {
    public int majorityElement(int[] nums) {
        int target = 0;
        int count = 0;

        for(int num : nums){
            if(count == 0) target = num;
            if(num == target) count += 1;
            else count -= 1;

        }
        return target;
        
    }
}