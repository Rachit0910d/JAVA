package Searching.BinarySearching.SearchIn1DArray;

public class BinarySearchDescendingOrder {

        // return the index of the target element
        public static void main(String[] args) {
            int[] arr = {455,23,12,7,5,3,2,0,-1,-1,-34,-45};
            int target = -1;
            int ans = DescendingOrderBinarySearching(arr, target);
            if(ans != -1){
                System.out.printf("Number exists in the array at the index of : %d", ans);
            }
            else{
                System.out.println("number is not exist in the array.");
            }
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
}


