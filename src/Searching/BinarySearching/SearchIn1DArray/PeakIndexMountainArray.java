package Searching.BinarySearching.SearchIn1DArray;

public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        int ans = findingPosition(arr);
        if(ans != -1) System.out.println(ans);
        else System.out.println("Error occurred.");

    }

    private static int findingPosition(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        if(arr.length == 0) return -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                if(arr[mid] > arr[mid - 1]){
                    return mid;
                }
                else{
                    end = mid - 1;
                }
            } else if(arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;
    }
}
