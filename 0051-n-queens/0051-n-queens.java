class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];

        for(int i =0; i<n; i++){
            Arrays.fill(board[i],'.');
        }

        solve(0,board,ans,n);

        return ans;
    }

    static void solve(int row, char[][] board, List<List<String>> ans, int n){
        // base case
        if(row == n){
            List<String> temp = new ArrayList<>();

            for(int i=0; i<n; i++){
                temp.add(new String(board[i]));

            }

            ans.add(temp);
            return;
        }

        // cases
        for(int col=0; col <n; col++){
            if(isSafe(row,col,board,n)){
                board[row][col] = 'Q';

                solve(row+1,board,ans,n);

                // backtrack
                board[row][col] = '.';
            }
        }
    }

    static boolean isSafe(int row, int col, char[][] board, int n){

        // Check upper column
        int i = row - 1;

        while(i >= 0){
            if(board[i][col] == 'Q'){
                return false;
            }
            i--;
        }

        // Check upper-left diagonal
        i = row - 1;
        int j = col - 1;

        while(i >= 0 && j >= 0){
            if(board[i][j] == 'Q'){
                return false;
            }
            i--;
            j--;
        }

        // Check upper-right diagonal
        i = row - 1;
        j = col + 1;

        while(i >= 0 && j < n){
            if(board[i][j] == 'Q'){
                return false;
            }
            i--;
            j++;
        }

        return true;
    }
}