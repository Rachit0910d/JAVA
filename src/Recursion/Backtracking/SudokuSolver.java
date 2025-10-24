package Recursion.Backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if(solve(board)){
            display(board);
        } else{
            System.out.println("cannot solved");
        }

    }

    private static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if(!emptyLeft){
                break;
            }
        }

        if(emptyLeft){
            return true;
            // sudoku is solved
        }

        for (int number = 1; number <= 9; number++) {
            if(isSafe(board, row, col, number)){
                board[row][col] = number;
                if(solve(board)){
                    // found ans
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    private static void display(int[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isSafe(int[][] board, int row, int col, int num){
        // check for the row
        for (int i = 0; i < board.length; i++) {
            if(board[row][i] == num){
                return false;
            }
        }

        // check for the column
        for (int[] nums : board) {
            if(nums[col] == num){
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int i = rowStart; i < rowStart + sqrt; i++) {
            for (int j = colStart; j < colStart + sqrt; j++) {
                if(board[i][j] == num){
                    return false;
                }
            }
        }

        return true;
    }
}
