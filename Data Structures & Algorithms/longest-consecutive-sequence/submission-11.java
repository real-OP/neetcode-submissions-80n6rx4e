class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set = new HashSet <>();
        int result = 0;

        for(int num : nums){
            set.add(num);
        }

        for(int num : set){
            if(!set.contains(num - 1)){//start counting from here
                int streak = 1; // reset streak each time we encounter a new starting point. 
                while(set.contains(num + streak)){
                    streak ++;
                }
                result = Math.max(streak , result);
            }
        }
        return result;

        
    }
}
