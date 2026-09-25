class Solution {
    public void moveZeroes(int[] nums) {
        // index
        int putIndex = 0;

        // for non zero number
        for(int num: nums){
            if(num != 0){
            nums[putIndex++] = num;
            }
        }

        // for zeros
        while(putIndex < nums.length){
            nums[putIndex++] = 0;
        }
        
    }
}