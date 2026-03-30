class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set = new HashSet <>();
        int count = 0;
        int start = 0;
        int maxlength = 0;
        for(int num : nums){
            set.add(num);
        }

        for(int num : set){
            if(!set.contains(num - 1)){
                start = num;
                count = 1;
                while(set.contains(start + 1)){
                    count += 1;
                    start += 1;
                }

                maxlength = Math.max(count ,maxlength );
            }
           
        }
        return maxlength;
    }
}
