class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];

        for(int n: nums){
            count[n]++;
        }

        int index =0;

        for(int n =0; n <=2; n++){

            while(count[n] > 0){
                nums[index] = n;
                index++;
                count[n]--;
            }
        }
    }
}