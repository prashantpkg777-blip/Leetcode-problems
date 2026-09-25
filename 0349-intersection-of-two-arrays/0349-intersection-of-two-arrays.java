class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        for(int n : nums1){
            s1.add(n);
        }

        Set<Integer> res = new HashSet<>();
        for(int n : nums2){
            if(s1.contains(n)){
                res.add(n);
            }
        }

        // convert set into array
        int[] result = new int[res.size()];
        int i =0;
        for(int n: res){
            result[i++] = n;
        }
        return result;
    }
}