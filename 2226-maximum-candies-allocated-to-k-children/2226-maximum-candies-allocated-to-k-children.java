class Solution {
    public int maximumCandies(int[] candies, long k) {
        int s =1;
        int e =0;

        for(int c : candies){
            e = Math.max(e,c);
        }

        int ans =0;

        while(s <= e){
            int mid = s+(e-s)/2;

            long  children = 0;

            for(int c : candies){
                children += c/mid;
            }

            if(children >= k){
                ans = mid;
                s = mid +1;
            }
            else{
                e = mid-1;
            }
        }
        return ans;
    }
}