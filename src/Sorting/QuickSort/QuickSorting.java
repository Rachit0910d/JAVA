package Sorting.QuickSort;

import java.util.Arrays;

public class QuickSorting {
    public static void main(String[] args) {
        int[] arr = { 5,3,6,2,7,3,7,1,3};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] nums, int i, int j){
        if(i >= j) return;

        int start = i;
        int end = j;
        int mid = start + (end - start) / 2;
        int pivot = nums[mid];

        while(start <= end){
            while(nums[start] < pivot){
                start++;
            }
            while(nums[end] > pivot){
                end--;
            }

            if(start <= end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        sort(nums, i, end);
        sort(nums, start, j);
    }
}
