package Searching.LinearSearching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of an array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target elements you want to search in the array : ");
        int target = sc.nextInt();

        int ans = linearSearching(arr, target);
        System.out.println("The index of the element is : "+ans);
    }

    static int linearSearching(int[] arr, int target) {

        // search in array : return the index if item is found
        // otherwise if item is not found return a large number
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        // run a loop
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            // comparing each element of array to target to find the target element in the array
            if(arr[i] == target){
                System.out.println("Element is found.");
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }


}
