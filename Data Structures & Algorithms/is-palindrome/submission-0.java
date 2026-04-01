class Solution {
    public boolean isPalindrome(String s) {
        if( s == null || s.length() == 0) return false;

        StringBuilder str = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                str.append(Character.toLowerCase(c));
            }
        }

        int start = 0;
        int end = str.length() - 1;

        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start += 1;
            end -= 1;
        }
        return true;


        
        
    }
}
