class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int result =1;
        for(int num : nums){
            if(num > 0 && result == num){
                result ++;
            }
        }
        return result;
        
    }
}