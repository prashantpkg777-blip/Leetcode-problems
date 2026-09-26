class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s = 0;
        int e = nums.length -1;

        while(s < e){
            int mid = s + (e-s)/2;

            // make mid even
            if(mid % 2 == 1){
                mid--;
            }

            if(nums[mid] == nums[mid + 1]){
                // pair is correct , move right side
                s = mid +2;
            }
            else{
                // element is on left side or mid
                e = mid;
            }
        }
        return nums[s];
    }
}