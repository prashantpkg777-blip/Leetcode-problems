class Solution {
    public int[][] transpose(int[][] matrix) {
        if(matrix == null || matrix.length == 0 ){
            return new int[0][0];
        }
        // Original Array
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;
        // Transpose Array
        int ans[][] = new int[totalCol][totalRow];

        for(int i =0; i<totalRow; i++){
            for(int j=0; j<totalCol; j++){
                ans[j][i] = matrix[i][j];
            }
        }
    return ans;    
    }
}