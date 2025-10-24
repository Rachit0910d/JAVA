package Searching.BinarySearching.SearchIn1DArray;

public class RotatedArray2 {
    public static void main(String[] args) {
        int[] arr = {2,2,2,9,9,10,2,2};
        int target = 2;
        int ans = searchingWithDuplicates(arr, target);
        System.out.println(ans);
    }

    private static int searchingWithDuplicates(int[] arr, int target){
        return FindingPivot(arr);
    }

    private static int FindingPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            } else if( mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            } else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                if(arr[start] > arr[start + 1]){
                    return start;
                } else{
                    start++;
                }

                if(arr[end] > arr[end - 1]){
                    return end - 1;
                } else{
                    end--;
                }
            }
            if(arr[start] <= arr[mid]){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return -1;
    }
}

