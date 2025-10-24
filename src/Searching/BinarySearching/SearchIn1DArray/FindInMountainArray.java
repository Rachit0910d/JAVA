package Searching.BinarySearching.SearchIn1DArray;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 2, 1};
        int target = 1;
        System.out.println(findingNumber(arr, target));
    }

    // Step 1: Find the peak index
    private static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1; // go right
            } else {
                end = mid; // go left
            }
        }
        return start; // peak index
    }

    // Step 2: Binary search (order aware)
    private static int binarySearch(int[] arr, int target, int start, int end, boolean ascending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            if (ascending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    // Step 3: Combine
    private static int findingNumber(int[] arr, int target) {
        int peak = peakIndex(arr);

        // Search in ascending part
        int firstTry = binarySearch(arr, target, 0, peak, true);
        if (firstTry != -1) return firstTry;

        // Search in descending part
        return binarySearch(arr, target, peak + 1, arr.length - 1, false);
    }
}
