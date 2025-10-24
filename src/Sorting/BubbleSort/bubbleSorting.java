package Sorting.BubbleSort;

import java.util.Arrays;

public class bubbleSorting {
    public static void main(String[] args) {
        int[] arr = {};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sorting(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j + 1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
