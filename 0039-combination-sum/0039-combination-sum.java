class Solution {
    static void solve(int index, int[] candidates, int target, List<List<Integer>> ans, List<Integer> output){
        // base case 
        if(target == 0){
            ans.add(new ArrayList(output));
            return;
        }
        if(index >= candidates.length){
            return;
        }
        if(target < 0){
            return;
        }

        // include
        output.add(candidates[index]);
        solve(index,candidates,target - candidates[index],ans,output);

        // backtracking
        output.remove(output.size() -1);

        // exclude
        solve(index+1,candidates,target,ans,output);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index =0;
        solve(index,candidates,target,ans,output);

        return ans;
    }
}