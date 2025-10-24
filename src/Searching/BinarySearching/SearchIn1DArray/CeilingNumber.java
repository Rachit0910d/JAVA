package Searching.BinarySearching.SearchIn1DArray;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {-18,-5,-1,0,45,67,67,78,89};
        int target = 64;

        int ans = ceiling(arr, target);
        System.out.println(ans);

    }

    private static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[end]) return -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            // Ascending order
                if(target < arr[mid]){
                    end = mid - 1;
                } else if(target > arr[mid]){
                    start = mid + 1;
                } else {
                    return mid;
                }

        }

        return start;
    }
}
