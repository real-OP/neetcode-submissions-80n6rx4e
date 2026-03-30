class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int [] result = new int[n];
        int [] left = new int[n];
        int [] right = new int[n];

        for(int i=0; i<n; i++){
            if(i == 0) left[i] = 1;
            else{
                left[i] = left[i-1] * nums[i - 1];
    
            }
        }
        for(int j = n - 1; j >= 0 ; j--){
            if(j == n - 1) right[j] = 1;
            else{
                right[j] = right[j+1] * nums[j+1];
            }
        }
        for(int i=0 ; i<n; i++){
            result[i] = left[i] * right[i];
        }
        return result;
    }
}  
