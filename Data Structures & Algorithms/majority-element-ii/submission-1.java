class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int cand1 = 0;
        int c1 = 0;
        int cand2 = 0;
        int c2 = 0;

        List <Integer> result = new ArrayList<>();

        for(int num : nums){
            if(num == cand1) c1 += 1;
            else if(num == cand2) c2 += 1;
            else if(c1 == 0) {cand1 = num; c1 += 1;}
            else if(c2 == 0) {cand2 = num; c2 += 1;}
            else {c1 -= 1; c2 -= 1;}

        }

        int freq1 = 0, freq2 = 0;
        for(int num : nums){
            if(num == cand1) freq1++;
            if(num == cand2) freq2++;
        }
        if(freq1 > n/3) result.add(cand1);
        if(freq2 > n/3) result.add(cand2);
        return result;

        
    }
}