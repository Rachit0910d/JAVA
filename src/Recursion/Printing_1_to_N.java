package Recursion;

public class Printing_1_to_N {
    public static void main(String[] args) {
//        numbers1(5);
        numbers2(5);
    }

    private static void numbers1(int n) {
        if(n == 0) return;
        numbers1(n - 1);
        System.out.println(n);
    }

    private static void numbers2(int n) {
        if(n == 0) return;
        System.out.println(n);
        numbers2(n - 1);
        System.out.println(n);
    }


}
