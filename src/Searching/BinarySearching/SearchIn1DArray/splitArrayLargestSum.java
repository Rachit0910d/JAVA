package Searching.BinarySearching.SearchIn1DArray;

public class splitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;
        int ans = splitArray(arr,k);
        System.out.println(ans);
    }
    private static int splitArray(int[] arr, int k) {
        int start = 0;
        int end = 0;
        for (int j : arr) {
            start = Math.max(start, j);
            end += j;
        }

        while (start < end){
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;
            for(int num : arr){
                if((sum + num) > mid){
                    // cannot fill the next element in the same subArray
                    // we have to create a new subArray to fill next element in that subArray
                    sum = num;
                    pieces++;
                } else{
                    sum += num;
                }
            }
            if(pieces > k) start = mid + 1;
            else end = mid;
        }
        return start;
    }
}
