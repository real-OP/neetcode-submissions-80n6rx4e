class Solution {
    public int longestConsecutive(int[] nums) {

        int result = 0;
        int start = 0;
        int maxlength = 0;

        HashSet <Integer> set = new HashSet <>();

        for(int num : nums){
            set.add(num);
        }
        
        for(int num : set){
           if(!set.contains(num - 1)){
            start = num;
            result = 1;
            while(set.contains(start + 1)){
                result ++;
                start ++;
            }
            maxlength = Math.max(maxlength,result);
           }
        }
        return maxlength;
        
    }
}
