class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];
        int count =0;

        for(char c: sentence.toCharArray()){
            int idx = c - 'a';
            if(!seen[idx]){
                count++;
                seen[idx] = true;

                if(count == 26){
                    return true;
                }
            }
        }
        return false;
    }
}