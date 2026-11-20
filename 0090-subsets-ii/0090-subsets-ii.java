
import java.util.*;

class Solution {

    static void solve(int start, int[] nums,
                      List<Integer> op,
                      List<List<Integer>> ans) {

        // Store current subset
        ans.add(new ArrayList<>(op));

        for (int i = start; i < nums.length; i++) {

            // Skip duplicates at the same level
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            // Include
            op.add(nums[i]);

            solve(i + 1, nums, op, ans);

            // Backtracking
            op.remove(op.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        solve(0, nums, new ArrayList<>(), ans);

        return ans;
    }
}
