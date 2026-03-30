class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap <String , List<String>> map = new HashMap <>();

        for(String st : strs){
            char [] word = st.toCharArray();
            Arrays.sort(word);
            String newst = new String(word);

            map.putIfAbsent(newst , new ArrayList<>());

            map.get(newst).add(st);

        }
        return new ArrayList<>(map.values());

        
    }
}
