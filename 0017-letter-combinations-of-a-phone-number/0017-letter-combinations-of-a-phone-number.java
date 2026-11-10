class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return new ArrayList<>();
        }

        String[] map = {
            "", "", "abc", "def", "ghi", "jkl","mno","pqrs","tuv","wxyz"
        };

        List<String> result = new ArrayList<>();

        solve(digits, 0, map, result, new StringBuilder());

        return result;
    }

    static void solve(String digits, int index, String[] map, List<String> result, StringBuilder current){
        // base case
        if(index >= digits.length()){
            result.add(current.toString());
            return;
        }

        // cases
        String letter = map[digits.charAt(index) - '0'];

        for(char ch : letter.toCharArray()){
            // add
            current.append(ch);

            solve(digits, index +1, map, result, current);

            // backtrack
            current.deleteCharAt(current.length() -1);
        }
    }
}