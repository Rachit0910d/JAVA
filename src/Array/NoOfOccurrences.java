package Array;

import java.util.Scanner;

public class NoOfOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the No. of Occurrences : ");
        System.out.print("Enter the no. you want to find in the given array : ");
        int x = sc.nextInt();
        int[] arr = ArrayUtility.inputArray();

        int ans = noOfOccurrence(arr, x);
        if(ans == 0){
            System.out.println("The no. is not present in the given array.");
        }
        else{
            System.out.println("The no. is Occurring in the array is : "+ans+".");
        }
        sc.close();
    }

    public static int noOfOccurrence(int[] arr, int x){
        int count = 0;
        int i = 0;
        while(i<arr.length){
            if(arr[i]==x){
                count++;
            }
            i++;
        }
        return count;
    }
}
