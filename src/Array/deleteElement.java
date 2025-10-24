package Array;

import java.util.Scanner;

public class deleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to code of deleting an element entered by the user from an array.");

        System.out.print("Enter the you want to delete : ");
        int x = sc.nextInt();

        int[] arr = ArrayUtility.inputArray();
        boolean element = isPresent(arr, x);

        if (element) {
            System.out.println("Element is present is the array.");

            int[] ans = DeletingElement(arr, x);
            System.out.println("The new array after deleting the element entered by user is : ");
            for (int j : ans) {
                System.out.print(j + " ");
            }
        }
        else {
            System.out.println("The element is not present in the array.");
        }
        sc.close();
    }

    public static boolean isPresent(int[] arr, int x) {
        for (int j : arr) {
            if (j == x) return true;
        }
        return false;
    }

    public static int[] DeletingElement(int[] arr, int x) {
        int count = NoOfOccurrences.noOfOccurrence(arr, x);
        int[] ans = new int[arr.length - count];
        int j = 0;
        for (int k : arr)
            if (k != x) {
                ans[j] = k;
                j++;
            }
        return ans;
    }
}






