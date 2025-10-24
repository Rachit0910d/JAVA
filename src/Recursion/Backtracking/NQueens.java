package Recursion.Backtracking;

public class NQueens {
    public static void main(String[] args) {
        boolean[][] board = new boolean[5][5];
        System.out.println(PlacingQueens(0, board));
    }

    // FOR PLACING THE QUEENS
    private static int PlacingQueens(int row, boolean[][] board){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count += PlacingQueens(row + 1, board);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // IN THE ROW OR IN THE COLUMN
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }

        // LEFT DIAGONAL
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row - i][col - i]){
                return false;
            }
        }

        // RIGHT DIAGONAL
        int maxRight = Math.min(row, board.length - 1- col);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row - i][col + i]){
                return false;
            }
        }
        return true;
    }

    // USED TO DISPLAY THE POSITION OF THE QUEENS
    private static void display(boolean[][] board){
        for(boolean[] row : board){
            for(boolean ele : row){
                if(ele){
                    System.out.print("Q ");
                } else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
