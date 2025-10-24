package Exceptions;

import java.util.Scanner;

public class StackFlow {
    public static void main(String[] args) {
        a();
    }

    private static void a(){
        b();
    }

    private static void b(){
        c();
    }

    private static void c(){
        d();
    }

    private static void d(){
        Scanner sc = new Scanner(System.in);
        System.out.println("first no. = ");
        int a = sc.nextInt();
        System.out.println("Second no. = ");
        int b = sc.nextInt();

        try{
            // int result = a/b;
            // System.out.println(result);
            int[] arr = new int[5];
            System.out.printf("Element in arr[6] : %d",arr[6]);
            arr[6] = a / b;
            System.out.printf("Element in arr[6] : %d",arr[6]);
        } catch(ArithmeticException e){
            System.out.printf("Multiple Exception %s", e.getMessage());
        } catch(Throwable e){
            System.out.println("General Exception.");
            throw e;
        } finally{
            System.out.println("Run always");
        }
    }
}
