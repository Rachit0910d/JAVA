package Sorting.CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberDisappearedInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println();
    }

    private static List<Integer> findingNumbers(int[] arr){

        int i = 0;
        while(i < arr.length){
            int num = arr[i] - 1;
            if(arr[i] <= arr.length && arr[i] != arr[num]){
                int temp = arr[i];
                arr[i] = arr[num];
                arr[num] = temp;
            }else{
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(j !=  arr[j] - 1){
                ans.add(j+1);
            }
        }
        return ans;
    }
}
