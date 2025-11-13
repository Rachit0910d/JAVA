package Inheritance.PracticeChallenge2;

import java.util.Arrays;

public class ArrayOperations {
    private int[] arr;

    public ArrayOperations(int[] arr) {
        this.arr = arr;
    }

    public class Statistics{
        double mean(){
            double sum = 0;
            for (int i : arr) {
                sum+= i;
            }
            return  sum/arr.length;
        }

        double median(){
            Arrays.sort(arr);
            double med;
            if(arr.length % 2 == 0 ){
                med = (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2.0;
            }
            else{
                med = arr[arr.length / 2];
            }
            return med;

        }
    }
}
