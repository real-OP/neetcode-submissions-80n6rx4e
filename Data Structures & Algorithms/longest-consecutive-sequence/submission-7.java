class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        for(int num : nums){
            set.add(num);
        }
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentStreakLength = 1;
                while (set.contains(num + currentStreakLength)) {
                    currentStreakLength++;
                }
                ans = Math.max(ans, currentStreakLength);
            }
        }
        return ans;
    }
}
