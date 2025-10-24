package Recursion.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {0,3,6,5,7,34,67,78};
        int target = 4;
        System.out.println(search(arr, target, 0));
    }

    private static int search(int[] arr,int target, int i){
        if(arr[i] == target){
            return i;
        }
        if(i == arr.length - 1){
            return -1;
        }
        return search(arr, target, ++i);
    }
}
