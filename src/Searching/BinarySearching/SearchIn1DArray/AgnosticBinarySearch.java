package Searching.BinarySearching.SearchIn1DArray;

public class AgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-12,-7,-1,0,23,45,56,778,56576};
        int target = -7;
        int ans = binarySearching(arr, target);
        if(ans != -1){
            System.out.printf("Number exists in the array at the index of : %d", ans);
        }
        else{
            System.out.println("number is not exist in the array.");
        }
    }

    static int binarySearching(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = 0;

        if(arr[start] < arr[end]){
            System.out.println("Array is in Ascending order.");
             ans = AscendingOrderBinarySearching(arr, target);
        } else if(arr[start] > arr[end]){
            System.out.println("Array is in Descending order.");
             ans = DescendingOrderBinarySearching(arr, target);
        } else{
            System.out.println("All the elements in the Array is Same.");
        }
        return ans;
    }

    static int DescendingOrderBinarySearching(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            //find the middle element
            // it is possible that (start + end) may exceed the value of int in java then by using start + (end - start)/2 formula we avoid that problem
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                start = mid + 1;
            } else if(target > arr[mid]){
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int AscendingOrderBinarySearching(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            //find the middle element
            // it is possible that (start + end) may exceed the value of int in java then by using start + (end - start)/2 formula we avoid that problem
            int mid = start + (end - start)/2;

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
