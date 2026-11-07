class Solution {

    static void solve(int start, int k, int target,
                      List<List<Integer>> ans,
                      List<Integer> op) {

        // Base case
        if(k == 0) {
            if(target == 0) {
                ans.add(new ArrayList<>(op));
            }
            return;
        }

        // Try numbers from start to 9
        for(int i = start; i <= 9; i++) {

            // Optimization
            if(i > target) {
                break;
            }

            // Include
            op.add(i);

            solve(i + 1, k - 1, target - i, ans, op);

            // Backtracking
            op.remove(op.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> ans = new ArrayList<>();

        solve(1, k, n, ans, new ArrayList<>());

        return ans;
    }
}