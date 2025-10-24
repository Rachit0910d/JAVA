package Sorting.MergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,5,6,12,3,4,2};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    private static int[] mergeSort(int[] arr) {
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] arr1, int[] arr2){
        int i = 0, j = 0, k = 0;
        int[] ans = new int[arr1.length + arr2.length];
        while(i <  arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                ans[k] = arr1[i];
                i++;
            } else{
                ans[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i < arr1.length){
            ans[k] = arr1[i];
            i++;
            k++;
        }

        while(j < arr2.length){
            ans[k] = arr2[j];
            j++;
            k++;
        }
        return ans;
    }
}
