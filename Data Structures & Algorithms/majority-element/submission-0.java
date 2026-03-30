class Solution {
    public int majorityElement(int[] nums) {
        int counter = 0;
        int change = 0;
        for(int i=0; i<nums.length; i++ ){
            if(counter == 0){
                change = nums[i];
            } 
            if(nums[i] == change ){
                counter += 1;
            }
            else{
                counter -= 1;
            }
        }
        return change;
        
    }
}