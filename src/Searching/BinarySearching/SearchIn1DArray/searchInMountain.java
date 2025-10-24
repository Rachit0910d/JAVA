package Searching.BinarySearching.SearchIn1DArray;

public class searchInMountain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    private static int search(int[] arr, int target){
        int peak = findingPeak(arr);
        int ans = firstTry(arr, target, 0, peak);
        if (ans != -1) {
            return ans;
        }
        return firstTry(arr, target, peak + 1, arr.length - 1);
    }

    private static int findingPeak(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                if(arr[mid] > arr[mid - 1]){
                    return mid;
                } else{
                    end = mid - 1;
                }
            } else if(arr[mid] < arr[mid - 1]){
                return mid - 1;
            } else{
                start = mid +1;
            }
        }
        return -1;
    }

    private static int firstTry(int[] arr, int target, int start, int end){
        while(start <= end){
            //find the middle element
            // it is possible that (start + end) may exceed the value of int in java then by using start + (end - start)/2 formula we avoid that problem
            int mid = start + (end - start)/2;

            if(target == arr[mid]) return mid;
            if(arr[start] < arr[end]) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            } else{
                if(target < arr[mid]){
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
