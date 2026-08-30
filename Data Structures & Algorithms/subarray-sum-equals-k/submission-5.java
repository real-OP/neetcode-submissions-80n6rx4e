class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;


        for(int slow = 0; slow < nums.length ; slow++){
            int sum = 0;

            for(int fast = slow ; fast < nums.length ; fast++){
                sum += nums[fast];
                if(sum == k) count ++;

            }
        }
        return count;
        
    }
}