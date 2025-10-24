package Array2D;

import java.util.Scanner;

public class SearchingElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] arr = Array.ArrayUtility.input2DArray();
        System.out.println("Enter the element you want to search in you 2D-Array : ");
        int x = sc.nextInt();

        boolean isFound = Searching(arr, x);
        if(isFound) System.out.println("The no. is found in the Array.");
        else System.out.println("The no. is not found in the 2D-Array.");
    }

    public static boolean Searching(int[][] arr, int x){
        int i = 0;
        while(i<arr.length){
            int j = 0;
            while(j<arr[i].length){
                if(arr[i][j] == x){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
