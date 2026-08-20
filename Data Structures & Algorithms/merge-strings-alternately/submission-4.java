class Solution {
    public String mergeAlternately(String word1, String word2) {
        if(word1 == null || word2 == null )return "";

        StringBuilder result = new StringBuilder();

        int s=0,p=0;
        int l1 = word1.length();
        int l2 = word2.length();

        while(s < word1.length() || p < word2.length()){
            if(s < l1){result.append(word1.charAt(s++));}
            if(p < l2){result.append(word2.charAt(p++));}
        }
        return result.toString();

        


        
    }
}