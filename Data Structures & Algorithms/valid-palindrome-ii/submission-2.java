class Solution {
    public boolean validPalindrome(String s) {
        int start =0;
        int end = s.length()-1;
        while(start<=end){
        if(s.charAt(start)==s.charAt(end))
        {
            start++;
            end--;
        }
        else
        {
            boolean flag1 = isPalindromeCheck(start,end-1,s);
            boolean flag2 = isPalindromeCheck(start+1,end,s);
            return flag1||flag2;
        }
        }
        return true;
        }
    boolean isPalindromeCheck(int start, int end, String s)
    {
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}