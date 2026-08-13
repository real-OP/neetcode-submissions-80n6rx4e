class Solution {
    public void sortColors(int[] nums) {
        int red = 0 , white = 0 , blue = 0;
        for(int num : nums){
            if(num == 0)red +=1;
            else if(num == 1)white +=1;
            else blue+=1;
        }
        for(int i=0;i<nums.length;i++){
            while(red >0){
                nums[i] = 0;
                red --;
                i+=1;
            }
            while(white > 0){
                nums[i] = 1;
                white--;
                i+=1;
            }
            while(blue > 0){
                nums[i] = 2;
                blue--;
                i+=1;
            }
            
        }
        
    }
}