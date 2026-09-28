import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        Integer[] idx = new Integer[n];

        // Store indices
        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }

        // Sort indices according to scores
        Arrays.sort(idx, (a, b) -> score[b] - score[a]);

        String[] ans = new String[n];

        // Assign ranks
        for (int i = 0; i < n; i++) {
            int originalIndex = idx[i];

            if (i == 0)
                ans[originalIndex] = "Gold Medal";
            else if (i == 1)
                ans[originalIndex] = "Silver Medal";
            else if (i == 2)
                ans[originalIndex] = "Bronze Medal";
            else
                ans[originalIndex] = String.valueOf(i + 1);
        }

        return ans;
    }
}