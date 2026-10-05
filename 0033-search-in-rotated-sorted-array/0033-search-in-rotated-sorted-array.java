class Solution {
    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            // target found
            if (nums[mid] == target) {
                return mid;
            }

            // left side is sorted
            if (nums[s] <= nums[mid]) {
                if (nums[s] <= target && target < nums[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
            // right side is sorted
            else {
                if (nums[mid] < target && target <= nums[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }
}