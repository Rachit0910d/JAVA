package Searching.BinarySearching.SearchIn1DArray;

public class RotatedArray1 {
    public static void main(String[] args) {
        int[] arr = {2};
        int target = 2;
        int ans = searchingWithoutDuplicates(arr,target);
        System.out.println(ans);
    }

    private static int searchingWithoutDuplicates(int[] arr, int target){

        int pivot = findingPivot(arr);   // find pivot element

        if(pivot == -1){    // if pivot is not found then do normal binary search
            return firstHalfTry(arr, target, 0, arr.length - 1);
        }

        if(arr[pivot] == target) return pivot; // if pivot element == to the target then return pivot

        int ans = firstHalfTry(arr, target, 0, pivot - 1);  // finding target element in the first half array
        if(ans != -1){
            return ans;   // if you find in first half array then return the index
        } else{
            return firstHalfTry(arr, target, pivot + 1, arr.length - 1);  // if you do not find in the first half array then check in the second half array
        }
    }

    private static int findingPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        if(arr.length == 0) return -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            } else if( mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            } else if(arr[start] >= arr[mid]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int firstHalfTry(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

