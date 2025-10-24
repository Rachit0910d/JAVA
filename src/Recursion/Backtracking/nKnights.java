package Recursion.Backtracking;

public class nKnights {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        placingKnight(board, 0, 0, 4);
    }

    private static void placingKnight(boolean[][] board, int row, int col, int knights){
        if(knights == 0){
            displayBoard(board);
            System.out.println();
            return;
        }

        if(row == board.length - 1 && col == board.length){
            return;
        }

        if(col == board.length){
            placingKnight(board, row + 1, 0, knights);
            return;
        }

        if(ifSafe(board, row, col)){
            board[row][col] = true;
            placingKnight(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }

        placingKnight(board, row, col + 1, knights);
    }

    private static boolean ifSafe(boolean[][] board, int row, int col) {
        if(isValid(board, row - 2, col - 1)){
            if(board[row - 2][col - 1]){
                return false;
            }
        }

        if(isValid(board, row - 1, col - 2)){
            if(board[row - 1][col - 2]){
                return false;
            }
        }

        if(isValid(board, row - 2, col + 1)){
            if(board[row - 2][col + 1]){
                return false;
            }
        }

        if(isValid(board, row - 1, col + 2)){
            if(board[row - 1][col + 2]){
                return false;
            }
        }

        return true;

    }

    private static boolean isValid(boolean[][] board, int row, int col){
        if(row >= 0 && row < board.length && col >= 0 && col < board.length){
            return true;
        }
        return false;
    }

    private static void displayBoard(boolean[][] board) {
        for(boolean[] row : board){
            for(boolean element : row){
                if(element){
                    System.out.print("K ");
                } else{
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}
