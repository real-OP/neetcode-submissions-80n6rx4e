class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap <String, List <String>> map = new HashMap<>(); 
        for(String str : strs){
            char[] word = str.toCharArray();
            Arrays.sort(word);
            String key = new String(word);
            map.putIfAbsent(key , new ArrayList<>());
            map.get(key).add(str);
            
        }
        return new ArrayList<>(map.values());
        // List<List<String>> result = new ArrayList<>();

        // for(String str : map.keySet()){
        //     result.add(map.get(str));
        // }
        // return result;

        
        
        
    }
}
