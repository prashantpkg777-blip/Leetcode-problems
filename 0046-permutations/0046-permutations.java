class Solution {
    static void solve(int[] nums, List<List<Integer>> ans, List<Integer> op, boolean[] tick){
        // base case
        if(op.size() == nums.length){
            ans.add(new ArrayList<>(op));
            return;
        }

        //one case
        for(int i =0; i < nums.length; i++){
            if(!tick[i]){
                // choose
                tick[i] = true;
                op.add(nums[i]);

                // explore
                solve(nums,ans,op,tick);

                // backtracking
                op.remove(op.size() -1);
                tick[i] = false;

            }
            
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> op = new ArrayList<>();

        boolean[] tick = new boolean[nums.length];

        solve(nums,ans,op,tick);

        return ans;
    }
}