
class Solution {

    static void solve(int index, List<List<Integer>> ans,
                      List<Integer> op, int[] nums) {

        // Base case
        if (index >= nums.length) {
            ans.add(new ArrayList<>(op));
            return;
        }

        // Include
        op.add(nums[index]);
        solve(index + 1, ans, op, nums);

        // Backtracking
        op.remove(op.size() - 1);

        // Exclude
        solve(index + 1, ans, op, nums);
    }

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> op = new ArrayList<>();

        solve(0, ans, op, nums);

        return ans;
    }
}
