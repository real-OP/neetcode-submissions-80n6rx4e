class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] result = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }

        List <Integer>[] buckets = new ArrayList[nums.length + 1];

        for(int i=0; i<buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }
        for(int num : map.keySet()){
            int frequency = map.get(num);
            buckets[frequency].add(num);
        }

        int idx = 0;

        for(int i=buckets.length - 1; i>0; i--){
            for(int num : buckets[i]){
                result[idx++] = num;
                if(idx == k)return result;
            }
        }
        return result;




        
    }
}
