package Searching.BinarySearching.SearchIn2DArray;

import java.util.Arrays;

public class SortMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}
        };
        int target = 19;
        System.out.println(Arrays.toString(SortSearch(matrix, target)));
    }

    // in any case, if matrix contain only one row then this will run and also for individual rows provided by the SortSearch code
    private static int[] SingleSearch(int[][] matrix,int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if(target == matrix[row][mid]){
                return new int[] {row, mid};
            } else if(target < matrix[row][mid]){
                cEnd = mid - 1;
            } else{
                cStart = mid + 1;
            }
        }
        return new int[] {-1,-1};
    }


    private static int[] SortSearch(int[][] matrix, int target){
        int rows = matrix.length;
        int col = matrix[0].length;
        if(rows == 1){
            return SingleSearch(matrix, 0,0, col - 1, target);
        }


        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = col / 2;

        // this loop run until the 2 rows remain
        while(rStart < (rEnd - 1)){
            int mid = rStart + (rEnd - rStart) / 2;

            if(matrix[mid][cMid] == target){
                return new int[] {mid,cMid};
            } else if(target < matrix[mid][cMid] ){
                rEnd = mid;
            } else{
                rStart = mid;
            }
        }
        // now for the next 2 rows which contain the target element
        // check whether the middle column contains the target element or not.
        if(matrix[rStart][cMid] == target){
            return new int[] {rStart,cMid};
        }
        if(matrix[rStart + 1][cMid] == target){
            return new int[] {rStart + 1, cMid};
        }


        // now check for the four blocks

        // first block
        if(target <= matrix[rStart][cMid - 1]){
            return SingleSearch(matrix, rStart, 0, cMid - 1, target);
        }

        // second block
        if(target >= matrix[rStart][cMid + 1] && target < matrix[rStart][col - 1]){
            return SingleSearch(matrix,rStart,cMid + 1, col - 1, target);
        }

        // third block
        if(target <= matrix[rStart + 1][cMid - 1]){
            return SingleSearch(matrix,rStart + 1, 0, cMid - 1, target);
        }

        // last block
        else{
            return SingleSearch(matrix, rStart + 1, cMid + 1, col - 1, target);
        }
    }
}


// complexity is (logN + logM)