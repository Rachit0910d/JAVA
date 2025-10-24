package Sorting.MergeSort;

import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,6,7,9,1};
        mergeSortInPlace(arr, 0 , arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSortInPlace(int[] arr, int start, int end) {
        if(end - start == 1){
            return;
        }
        int  mid = (end + start)/ 2;

        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end){
        int[] ans = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;
        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                ans[k] = arr[i];
                i++;
            } else{
                ans[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < mid){
            ans[k] = arr[i];
            i++;
            k++;
        }

        while(j < end){
            ans[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < ans.length; l++) {
            arr[start + l] = ans[l];
        }
    }
}
