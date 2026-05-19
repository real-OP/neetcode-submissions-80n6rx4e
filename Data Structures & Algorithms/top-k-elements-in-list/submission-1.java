class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer , Integer > map = new HashMap<>();

        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }

        List <Integer> [] buckets = new ArrayList [nums.length + 1];

        for(int i=0; i< nums.length + 1 ; i++ ){
            buckets[i] = new ArrayList <>();
        }

        for(int num : map.keySet()){
            int freq = map.get(num);
            buckets[freq].add(num);
        }

        int [] result = new int[k];

        int index = 0;

        for(int i = buckets.length - 1; i>= 0; i-- ){
            for(int num : buckets[i]){
                result[index++] = num;
                if(index == k) return result;
            }
        }
        return result;
    }

}
