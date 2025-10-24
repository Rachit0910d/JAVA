import java.util.Arrays;
import java.util.Scanner;

public class Tic_Tac_Toe_Game {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        // to first print the empty board
        for (char[] chars : board) {
            Arrays.fill(chars, ' ');
        }

        char player = 'X'; // first player X will start the game by placing X
        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);

        while(!gameOver){
            printBoard(board); // print board everytime
            System.out.println("Player " + player + " enter: ");
            int row = sc.nextInt(); // taking row and col input for to place the player's symbol (O | X)
            int col = sc.nextInt();

            if(board[row][col] == ' '){
                board[row][col] = player; // place the element
                gameOver = haveWon(board, player); // checking function
                if(gameOver){
                    System.out.println("Player "+player+" has won: ");
                } else{
                    if(player == 'X'){
                        player = 'O';
                    } else{
                        player = 'X';
                    }
                }
            } else{
                System.out.println("Invalid Move. Try Again!");
            }
        }
        printBoard(board);
    }

    private static boolean haveWon(char[][] board, char player) {
        for (char[] chars : board) {
            if (chars[0] == player && chars[1] == player && chars[2] == player) {
                return true;
            }
        }

        for (int col = 0; col < board[0].length; col++) {
            if(board[0][col] == player && board[1][col] == player && board[2][col] == player){
                return true;
            }
        }

        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }

        return board[2][0] == player && board[1][1] == player && board[0][2] == player;
    }

    private static void printBoard(char[][] board) {
        for (char[] chars : board) {
            for (int col = 0; col < board.length; col++) {
                System.out.print(chars[col] + " | ");
            }
            System.out.println();
        }
    }
}
