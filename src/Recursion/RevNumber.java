package Recursion;

public class RevNumber {
    static int ans = 0;

    static void Rev1(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        ans = ans * 10 + rem;
        Rev1(n / 10);
    }

    private static int Rev2(int n) {
        // sometimes we need some additional variables in the argument
        // in that case, make another function
        int digits =(int)(Math.log(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if(n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10,digits - 1)) + helper(n/10, digits-1);
    }

    public static void main(String[] args) {
        System.out.println(Rev2(1234));;
    }


}
