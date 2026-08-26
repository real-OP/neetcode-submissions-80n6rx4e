class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        int result = 0;
        for(int num : nums){
            set.add(num);
        }

        for(int num : set){
            if(!set.contains(num - 1)){
                int start = 1;
                while(set.contains(num + start)) start ++;

                result = Math.max(result , start);
                
            }
        }
        return result;
        
    }
}
