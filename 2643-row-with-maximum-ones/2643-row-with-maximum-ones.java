class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max1s =  0;
        int rowIdx = 0;

        for(int i = 0; i < mat.length; i++){
            int count = 0;
            for(int j = 0; j < mat[0].length; j++){
                
                if(mat[i][j] == 1){
                    count++;
                }
            }

            if(count > max1s){
                max1s = count;
                rowIdx = i;
            }
        }
        return new int[]{rowIdx,max1s};
    }
}