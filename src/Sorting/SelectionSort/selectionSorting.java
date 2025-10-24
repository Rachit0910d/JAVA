package Sorting.SelectionSort;

import java.util.Arrays;

public class selectionSorting {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    private static void sorting(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-1-i;
            int max = getMaxIndex(arr, 0 , last);
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }



    }
}
