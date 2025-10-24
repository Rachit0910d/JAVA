package Array;

import java.util.Scanner;

public class ArrayUtility {
    public static Scanner sc = new Scanner(System.in);
    public static int[] inputArray() {

        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            System.out.print("Enter the " + (i + 1) + " element of array : ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void displayArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static int[][] input2DArray() {

        System.out.print("Enter the rows of Array : ");
        int rows = sc.nextInt();
        System.out.print("Enter the columns of Array : ");
        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];
        int i = 0;
        while( i<rows) {
            int j = 0;
            while(j<columns){
                System.out.print("Enter the element of "+(i+1)+" rows and "+(j+1)+" columns : ");
                arr[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }
        return arr;
    }
}

