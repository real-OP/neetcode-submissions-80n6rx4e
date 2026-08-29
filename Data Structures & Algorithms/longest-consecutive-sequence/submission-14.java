class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        HashSet <Integer> set = new HashSet<>();

        for(int num : nums){set.add(num);}

        for(int num : set){
            if(!set.contains(num - 1)){
                int streak = 1;
                while(set.contains(num+streak)){streak++;}

                result = Math.max(result,streak);
            }

        }
        return result;
        
    }
}
