package Recursion.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7};
        int target = 2;
        System.out.println(findingIndex(arr, target, 0, arr.length - 1));
    }

    private static int findingIndex(int[] arr, int target, int st, int end){
        if(st > end) return -1;
        int mid = st + (end - st) / 2;
        if(target == arr[mid]) return mid;
        if(target < arr[mid]) return findingIndex(arr, target, st, mid - 1);
        return findingIndex(arr, target, mid + 1, end);
    }
}
