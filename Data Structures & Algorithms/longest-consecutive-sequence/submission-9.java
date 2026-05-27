class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set = new HashSet <>();
        int result = 0;
        for(int num : nums){
            set.add(num);
        }
        
        for(int num : set){
            if(!set.contains(num - 1)){
                int currentstreak = 1;
                while(set.contains(num + currentstreak)){
                    currentstreak ++;
                }
                result = Math.max(result , currentstreak);
            }
        }
        return result;
    }
}
