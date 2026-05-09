class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        //count Frequency
        for(int n:nums){
            freq.put(n, freq.getOrDefault(n,0)+1);
        }

        HashMap<Integer, Integer> freqCount = new HashMap<>();
        //count frequencies of frequency
        for (int f : freq.values()) {
            freqCount.put(f, freqCount.getOrDefault(f, 0) + 1);
        }

        for (int n : nums) {
            if (freqCount.get(freq.get(n)) == 1) {
                return n;
            }
        }    
        return -1;
    }
}