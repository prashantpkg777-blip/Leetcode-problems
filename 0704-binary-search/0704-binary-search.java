class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;

        while (start <= end){
            int mid = start + (end - start)/2; // (start+end)/2

            if (nums[mid] == target){
                // target found
                return mid;
            }
            else if(nums[mid] < target){
                // go to right side
                start = mid + 1;
            }
            else{
                // go to left side
                end = mid - 1;
            }
        }
        // target not found
        return -1;
    }
}