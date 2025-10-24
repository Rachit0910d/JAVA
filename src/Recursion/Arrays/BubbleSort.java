package Recursion.Arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,-3,3,4,4,2,4,10,1,0};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int i, int j){
        if(j == 0){
            return;
        }
        if(i < j){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            sort(arr, i+1, j);
        }else{
            sort(arr, 0, j - 1);
        }
    }
}
