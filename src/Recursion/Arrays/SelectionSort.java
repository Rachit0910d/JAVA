package Recursion.Arrays;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,5,6,7,3,2,1};
        sort(arr, 1 , arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int i, int j,  int max){
        if(j == 0){
            return;
        }
        if(i <= j){
            if(arr[max] < arr[i]){
                max = i;
            }
            sort(arr, ++i, j, max);
        } else{
            int temp = arr[max];
            arr[max] = arr[j];
            arr[j] = temp;
            sort(arr, 1, --j, 0);
        }
    }
}
