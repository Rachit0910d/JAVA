package Recursion.Maze;

import java.util.ArrayList;

public class SimpleMaze {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(totalCount(matrix.length, matrix[0].length));
        PathPrint(3,3,"");

        ArrayList<String> list = path(matrix.length, matrix[0].length, "");
        System.out.println(list);

        ArrayList<String> DiagonalList = DiagonalPath(matrix.length, matrix[0].length, "");
        System.out.println(DiagonalList);
    }

    private static int totalCount( int row, int col) {
        if(row == 1 || col == 1){
            return 1;
        }

        int left = totalCount(row - 1, col);
        int right = totalCount(row, col - 1);

        return left + right;
    }

    private static void PathPrint(int row, int col, String up){
        if(row == 1 && col == 1){
            System.out.println(up);
            return;
        }

        if(row > 1){
            PathPrint(row - 1, col, up + 'D');
        }
        if(col > 1){
            PathPrint(row, col - 1, up + 'R');
        }
    }

    private static ArrayList<String> path(int row, int col, String up){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(up);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
         if(row > 1){
            list.addAll(path(row - 1, col, up + 'D'));
        }
         if(col > 1){
             list.addAll(path(row, col - 1, up + 'R'));
         }

         return list;
    }

    private static ArrayList<String> DiagonalPath(int row, int col, String up){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(up);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(row > 1 && col > 1){
            list.addAll(DiagonalPath(row - 1, col - 1, up + 'D'));
        }
        if(row > 1){
            list.addAll(DiagonalPath(row - 1, col , up + 'V'));
        }
        if(col > 1){
            list.addAll(DiagonalPath(row, col - 1, up + 'H'));
        }

        return list;
    }


}
