class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int result = 0;

        for(int num : set){
            if(!set.contains(num - 1)){
                int start = 1;  
                while(set.contains(num + start))start++;
                result = Math.max(start , result);
            }

        }

        return result;


        
    }
}
