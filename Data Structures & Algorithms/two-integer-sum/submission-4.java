class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer , Integer > map = new HashMap <>();
        int a = 0 , b = 0; 
        for(int i = 0 ; i < nums.length ; i ++ ){
            map.put(nums[i] , i);
        }   
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i){
                a = i;
                b = map.get(target - nums[i]);
                break;
            }
        }
        int [] result = new int[]{a,b};
        return result;
        
    }
}
