package Recursion.Arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = { 1,2,2,3,4,5};
        boolean isSort = isSorted(arr,1);
        System.out.println(isSort);
    }

    private static boolean isSorted(int[] arr, int i) {
        if(arr[i] < arr[i-1]){
            return false;
        }
        if(i == arr.length - 1){
            return true;
        }
        return isSorted(arr, ++i);
    }
}
