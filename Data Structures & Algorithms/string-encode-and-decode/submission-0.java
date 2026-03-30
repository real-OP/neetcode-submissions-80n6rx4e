class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder ();

        for(String st : strs){
            sb.append(st.length());
            sb.append("#");
            sb.append(st);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i=0;
        while( i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j +=1;
            }

            int length = Integer.parseInt(str.substring(i , j));

            String word = str.substring(j+1 , j+1+length);
            result.add(word);
            i = j+1+length;

        }
        return result;

    }
}
