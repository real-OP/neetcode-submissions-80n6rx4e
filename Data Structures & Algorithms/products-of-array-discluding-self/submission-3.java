class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] result = new int [n];
        Arrays.fill(result , 1);//res = [1,1,1,1]
        
        //nums = [1,2,4,6]
        //expected Output: [48,24,12,8]
        int left = 1;
        for(int i=1; i < n ; i++){
            left = left * nums[i-1];
            result[i] = left;
        }//res = [1,1,2,8]

        int right = 1;
        for(int i = n - 2 ; i>=0 ; i-- ){
            right = right*nums[i+1];
            result[i] = result[i] * right;
        }
        return result;
        
    }
}  
