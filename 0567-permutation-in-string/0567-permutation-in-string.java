class Solution {

    private boolean matches(int[] a, int[] b) {

        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() > s2.length()){
            return false;
        }

        int[] freq1 = new int[26];
        int[] window = new int[26];

        // freq of s1
        for(char ch : s1.toCharArray()){
            freq1[ch - 'a']++;
        }

        // first window
        for(int i = 0; i < s1.length(); i++){
            window[s2.charAt(i) - 'a']++;
        }

        if(matches(freq1, window)){
            return true;
        }

        // slide the window
        for(int i = s1.length(); i < s2.length(); i++){
            // add new char
            window[s2.charAt(i) - 'a']++;

            // remove old char
            window[s2.charAt(i - s1.length()) - 'a']--;

            if(matches(freq1, window)){
            return true;
            }
        }
        return false;
    }
}