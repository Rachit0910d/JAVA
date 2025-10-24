package StackAndQueue.Queue;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSum {
    static int twoStacks(int x, int[] a, int[] b){
        return helper(x, a, b, 0, 0) - 1;
    }

    private static int helper(int x, int[] a, int[] b, int sum, int count){
        if(sum > 10) return count;
        if(a.length ==0 || b.length == 0) return count;

        int ans1 = helper(x, Arrays.copyOfRange(a,1, a.length), b, sum + a[0], count + 1);
        int ans2 = helper(x, a, Arrays.copyOfRange(b,1, b.length), sum + b[0], count + 1);
        return Math.max(ans1, ans2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of test cases: ");
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.print("Enter the size of first Array1: ");
            int n = sc.nextInt();

            System.out.print("Enter the size of Array2: ");
            int m = sc.nextInt();

            System.out.print("Enter the Maximum Sum: ");
            int x = sc.nextInt();

            int[] a = new int[n];

            int[] b = new int[m];

            System.out.println("Enter the first array's element: ");
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }

            System.out.println("Enter the second array's element: ");
            for (int j = 0; j < m; j++) {
                b[j] = sc.nextInt();
            }
            System.out.println(twoStacks(x, a, b));
        }
    }
}
