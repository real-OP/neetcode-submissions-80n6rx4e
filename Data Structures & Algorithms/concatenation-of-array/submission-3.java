class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] result = new int[2*n];
        int a = 0;
        for(int i=0 ; i < 2*n ; i++ ){
            if(a == n ) a = 0;
            result[i] = nums[a];
            a += 1;

        }
        return result;
        
    }
}