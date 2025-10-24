package Searching.LinearSearching;

public class searchingIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,10,11}, {4,5}, {7,8,9,6}};
        int target = 5;
        boolean ans = searchIn2DArray(arr, target);
        if(ans) System.out.println("Element found in the array.");
        else System.out.println("Element does not found.");
    }

    static boolean searchIn2DArray(int[][] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt == target) { 
                    return true;
                }
            }
        }
        return false;
    }
}
