class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] result = new int[2*n];
        int start = 0;
        int i=0;

        while(i< 2*n){
            result[i] = nums[start];
            i += 1;
            start += 1;
            if(start == n) start = 0;
        }
        return result;
        
    }
}