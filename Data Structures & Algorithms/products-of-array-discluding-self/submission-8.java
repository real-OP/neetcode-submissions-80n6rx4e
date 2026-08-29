class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] result = new int[n];
        Arrays.fill(result , 1);

        int left = 1;
        for(int i=1; i<n; i++){
            left = left * nums[i-1];
            result[i] = result[i] * left;
        }

        int right = 1;
        for(int i=n-2; i>=0; i--){
            right = right * nums[i+1];
            result[i] = result[i] * right;
        }

        return result;
    }
}  
