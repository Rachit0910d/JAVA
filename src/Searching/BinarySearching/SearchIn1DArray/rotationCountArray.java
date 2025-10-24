package Searching.BinarySearching.SearchIn1DArray;

public class rotationCountArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7};
        int ans = FindingPivot(arr);
        if(ans == 0) System.out.println("The array contain only one element.");
        else if(ans != -1) System.out.printf("The array is rotated %d times.",ans+1);
        else System.out.println("The array is not rotated.");
    }

    private static int FindingPivot(int[] arr){
        if(arr.length == 0) return -1;
        if(arr.length == 1) return 0;

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid+1])
                return mid;
            if( mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;
            if(arr[start] <= arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }


}
