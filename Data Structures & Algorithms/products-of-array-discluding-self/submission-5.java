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
        for(int j = n-2; j>=0; j--){
            right = right * nums[j+1];
            result[j] = result[j] *right;
        }

        return result;

        
    }
}  
