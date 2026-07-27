class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder result = new StringBuilder();
        
        for(int i=sb.length()-1; i>-1; i--){
            while(i>=0 && sb.charAt(i)==' '){
                i--;
            }
            if(i<0) break;
            int end =i;
            while(i>=0 && sb.charAt(i)!=' '){
                i--;
            }
            int start =i;
            if(result.length()>0) result.append(" ");
            result.append(sb.substring(start+1, end+1));
        }
        return result.toString();
    }
}