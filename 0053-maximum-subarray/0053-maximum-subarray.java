class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            // Step 1: Sum
            sum = sum + nums[i];
            // Step 2: update maxi
            maxi = Math.max(maxi,sum);
            // Step 3: check sum is not negative
            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
}