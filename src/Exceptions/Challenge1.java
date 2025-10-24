package Exceptions;

import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        try {
            int c = a / b;
            System.out.println(" result is : " + c);
        } catch (ArithmeticException e) {
            System.out.println("Caught : " + e.getMessage());
        } finally {
            System.out.println("Run Complete.");
        }
    }

}
