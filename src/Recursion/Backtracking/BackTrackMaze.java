package Recursion.Backtracking;

import java.util.Arrays;

public class BackTrackMaze {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        // allPathPrint(0,0, "", maze);
        int[][] path = new int[maze.length][maze[0].length];
        allPathPrinting(0, 0, "" , maze, path, 1);
    }

    private static void allPathPrint(int row, int col, String up, boolean[][] maze){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(up);
            return;
        }

        if(!maze[row][col]){
            return;
        }

        // marking all those block which are already visited
        maze[row][col] = false;

        if(row < maze.length - 1){
            allPathPrint(row + 1, col, up + 'D', maze);
        }

        if(col < maze[0].length - 1){
            allPathPrint(row, col + 1, up + 'R', maze);
        }

        if(row > 0){
            allPathPrint(row - 1, col, up + 'U', maze);
        }

        if(col > 0){
            allPathPrint(row, col - 1, up + 'B', maze);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the marking which is made to check the visited box checking
        maze[row][col] = true;
    }

    private static void allPathPrinting(int row, int col, String up, boolean[][] maze, int[][] path, int step){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            for(int[] arr : path){
                path[row][col] = step;
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(up );
            System.out.println();
            return;
        }

        if(!maze[row][col]){
            return;
        }

        maze[row][col] = false;
        path[row][col] = step;

        if(row < maze.length - 1){
            allPathPrinting(row + 1, col, up + 'D', maze, path, step + 1);
        }

        if(col < maze[0].length - 1){
            allPathPrinting(row, col + 1, up + 'R', maze, path, step + 1);
        }

        if(row > 0){
            allPathPrinting(row - 1, col, up + 'U', maze, path, step + 1);
        }

        if(col > 0){
            allPathPrinting(row, col - 1, up + 'L', maze, path, step + 1);
        }

        maze[row][col] = true;
        path[row][col] = 0;
    }
}
