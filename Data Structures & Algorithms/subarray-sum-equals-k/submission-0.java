class Solution {
    public int subarraySum(int[] nums, int k) {
//nums = [1, -1, 1, 2], k = 3
        int n = nums.length;
        int result = 0;
        int sum = 0;

        for(int i=0; i<n ; i++ ){
            sum = 0;
            for(int j=i; j<n; j++){
                sum += nums[j];
                if(sum == k) result += 1;
            }
        }

        return result;
    }
}