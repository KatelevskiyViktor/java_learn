package seminar3HW;

import java.util.ArrayList;
import java.util.List;

public class FirstTask {
    public static void main(String[] args) {
        // new FirstTask().solveNQueens(4);
        new FirstTask().knightProbability(4, 2, 0, 0);
    }
    public double knightProbability(int n, int k, int r, int c) {
        double[][] dp1 = new double[n][n];
        double[][] dp2 = new double[n][n];
        
            int[][] moves = { { 1, 2 }, { 2, 1 }, { -1, 2 }, { 1, -2 }, { -2, 1 }, { 2, -1 }, {                             -1, -2 }, { -2, -1 } };
            
            dp1[r][c] = 1;
            double factor = 8.0;
            for (int i = 0; i < k; i++) {
                for (int row = 0; row < n; row++) {
                    for (int col = 0; col < n; col++) {
                        if (dp1[row][col] > 0.0) {
                            for (int move = 0; move < moves.length; move++) {
                                int nr = row + moves[move][0];
                                int nc = col + moves[move][1];
                                if (nr >= 0 && nr < n && nc >= 0 && nc < n) {
                                    dp2[nr][nc] += dp1[row][col] / factor;
                                    
                                }
                            }
                        }
                    }
                }
                dp1 = dp2;
                dp2 = new double[n][n];
            }

            double ans = 0.0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    ans += dp1[i][j];
                }
            }
        return ans;
    }
    // int[][] board; 
    // List<List<String>> ans = new ArrayList<>();

    // public List<List<String>> solveNQueens(int n){
    //     board = new int[n][n];
    //     backtrack(0);
    //     return ans;
    // }

    // private void backtrack(int col){
    //     if(col == board.length){
    //         addBoard();
    //         return;
    //     }

    //     for(int row = 0; row < board.length; row++){
    //         if(canPlace(col, row)){
    //             board[row][col] = col;
    //             backtrack(col + 1);
    //             board[row][col] = 0;
    //         }
    //     }
    // }

    // private boolean canPlace(int i, int j){
    //     //left
    //     for(int col = j - 1; col >= 0; col--){
    //         if(board[i][col] == 1) return false;
    //     } 

    //     //up ot diag
    //     for(int row = i - 1, col = j - 1; row >= 0 && col >=0; row--, col--){
    //         if(board[row][col] == 1) return false;
    //     }

    //     //down to diag
    //     for(int row = i + 1, col = j - 1; row < board.length && col >=0; row++, col--){
    //         if(board[row][col] == 1) return false;
    //     }

    //     return true;
    // }

    // private void addBoard(){
    //     List<String> b = new ArrayList<>();
    //     for(int i = 0; i < board.length; i++){
    //         StringBuilder sb = new StringBuilder();
    //         for(int j = 0; j < board.length; j++){
    //             sb.append(board[i][j] == 0 ? '.' : 'Q');
    //         }
    //         b.add(sb.toString());
    //     }
    //     ans.add(b);
    // }
}
