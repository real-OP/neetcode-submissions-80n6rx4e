class Solution {
    public String mergeAlternately(String word1, String word2) {
        if(word1 == null || word2 == null )return "";

        StringBuilder result = new StringBuilder();

        int s=0,p=0;

        while(s < word1.length() && p < word2.length()){
            result.append(word1.charAt(s));
            result.append(word2.charAt(p));
            s++;
            p++;

        }
        while(s < word1.length()){
            result.append(word1.charAt(s));
            s++;
        }
        while(p < word2.length()){
            result.append(word2.charAt(p));
            p++;
        }

        return result.toString();


        
    }
}