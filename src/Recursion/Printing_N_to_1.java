package Recursion;

public class Printing_N_to_1 {
    public static void main(String[] args) {
        int n = 5;
        numbers(n);
    }

    private static void numbers(int n) {
        if(n == 0) return;
        System.out.println(n);
        numbers(n-1);
    }
}
