package Recursion.Arrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        int target = 7;
        System.out.println(binarySearching(arr, target, 0, arr.length - 1));
    }

    private static int binarySearching(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] >= arr[start]){
            if(target >= arr[start] && target <= arr[mid]){
                return binarySearching(arr, target, start, mid - 1);
            } else{
               return binarySearching(arr, target, mid + 1, end);
            }
        }
        if(target >= arr[mid] && target <= arr[end]){
            return binarySearching(arr, target, mid + 1, end);
        }

        return binarySearching(arr, target, start, mid - 1);
    }
}
