class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // find min and max
        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        // store elements in set
        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        // check missing numbers
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }
}