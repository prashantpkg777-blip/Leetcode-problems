class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board){
        for(int rol =0;rol <9; rol++){
            for(int col=0; col<9; col++){

                if(board[rol][col] == '.'){
                    for(char num ='1'; num <= '9'; num++){
                        if(isValid(board,rol,col,num)){

                            board[rol][col] = num;

                            if(solve(board)){
                                return true;
                            }

                            // backtrack
                            board[rol][col] = '.';

                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board,int rol, int col, char num){
        for(int i=0; i<9; i++){

            // check row
            if(board[rol][i] == num){
                return false;
            }

            // check col
            if(board[i][col] == num){
                return false;
            }

            // check 3x3 box
            int boxRow = 3* (rol/3) + i/3;
            int boxCol = 3* (col/3) + i%3;

            if(board[boxRow][boxCol] == num){
                return false;
            }

        }
        return true;
    }
}