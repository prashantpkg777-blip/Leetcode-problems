class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){

            if(sb.length() > 0 && sb.charAt(sb.length() - 1) == ch){
                // remove prev element
                sb.deleteCharAt(sb.length() - 1);
            }
            else{
                // add element
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}