package Recursion.Maze;

public class MazeWithRestriction {
    public static void main(String[] args) {
        System.out.println(pathRestrictions(3,3));
        boolean[][] rocksArray = {
                {true, true, true},
                {true, true, false},
                {true, true, true}
        };

        PathRestriction(0,0, "", rocksArray);
    }

    private static int pathRestrictions(int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }
        int left = pathRestrictions(row - 1, col);
        int right = pathRestrictions(row, col - 1);
        return left + right;
    }

    private static void PathRestriction(int row, int col, String up, boolean[][] maze){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(up);
            return;
        }

        if(!maze[row][col]){
            return;
        }

        if(row < maze.length - 1){
            PathRestriction(row + 1, col, up + 'D', maze);
        }
        if(col < maze[0].length - 1){
            PathRestriction(row, col + 1, up + 'R', maze);
        }
    }
}
