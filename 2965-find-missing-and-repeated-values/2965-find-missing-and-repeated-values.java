class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n*n;

        int[] freq = new int[size + 1];


        for(int[] row: grid){
            for(int num: row){
                freq[num]++;
            }
        }

        int x = -1; // repeated
        int y = -1; // missing

        for(int i =1; i<= size; i++){
            if(freq[i] == 2){
                x = i;
            } else if(freq[i] == 0){
                y = i;
            }
        }
        return new int[]{x,y};
    }
}