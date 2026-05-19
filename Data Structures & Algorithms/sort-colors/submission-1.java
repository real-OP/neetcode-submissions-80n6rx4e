class Solution {
    public void sortColors(int[] nums) {

        int zeros = 0;
        int ones = 0;
        int twos = 0;
        
        for(int num : nums){
            if(num == 0) zeros ++;
            else if(num == 1) ones ++;
            else twos ++;
        }
        int pointer = 0;
        while(zeros-- > 0) nums[pointer++] = 0;
        while(ones-- > 0) nums[pointer++] = 1;
        while(twos-- > 0) nums[pointer++] = 2;
    }
}