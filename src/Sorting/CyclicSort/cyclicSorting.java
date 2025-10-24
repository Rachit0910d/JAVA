package Sorting.CyclicSort;

import java.util.Arrays;

public class cyclicSorting {
    public static void main(String[] args) {
        int[] arr = {3};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sorting(int[] arr){
        int i = 0;
        while(i < arr.length){
            int num = arr[i] - 1;
            if(arr[i] != arr[num]){
                int temp = arr[i];
                arr[i] = arr[num];
                arr[num] = temp;
            }else{
                i++;
            }
        }
    }
}
