class Solution {

    static void solve(int index, int[] candidates,
                      int target, List<List<Integer>> ans,
                      List<Integer> op) {

        // Base case
        if(target == 0) {
            ans.add(new ArrayList<>(op));
            return;
        }

        for(int i = index; i < candidates.length; i++) {

            // Skip duplicates
            if(i > index && candidates[i] == candidates[i-1]) {
                continue;
            }

            // Optimization
            if(candidates[i] > target) {
                break;
            }

            // Include
            op.add(candidates[i]);

            solve(i + 1, candidates,
                  target - candidates[i], ans, op);

            // Backtracking
            op.remove(op.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(
            int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();

        solve(0, candidates, target, ans, new ArrayList<>());

        return ans;
    }
}