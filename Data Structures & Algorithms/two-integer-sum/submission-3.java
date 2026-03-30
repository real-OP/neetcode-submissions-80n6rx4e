class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int sp = 0;
        int ep = 0;

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i){
                sp = i;
                ep = map.get(target - nums[i]);
                break;
            }
        }
        int[] ans = new int[]{sp, ep};
        return ans;
    }
}