package Recursion;

public class DigitsSum {
    public static void main(String[] args) {
        System.out.println(digitsSum1(1254));
    }

    private static int digitsSum1(int n){
        int rem = n % 10;
        if(n == 0){
            return rem;
        }
        return rem + digitsSum1(n / 10);
    }
}
