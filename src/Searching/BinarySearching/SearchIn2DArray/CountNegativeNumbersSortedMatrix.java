package Searching.BinarySearching.SearchIn2DArray;

public class CountNegativeNumbersSortedMatrix {
    public static void main(String[] args) {
        int[][] grid = {
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };

        System.out.println(countingNumbers(grid));
    }

    private static int countingNumbers(int[][] grid){
        int row = 0;
        int cols = grid[0].length - 1;
        int rows = grid.length;
        int count = 0;
        while(row < rows && cols >= 0){

            if(grid[row][cols] >= 0){
                row++;
            } else{
                count = count + (rows-row);
                cols--;
            }
        }
        return count;
    }
}
