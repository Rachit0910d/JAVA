package Recursion;

public class CountSpecificNumber {
    public static void main(String[] args) {
        int n = 10000;
        System.out.println(countNumber(n));
    }

    private static int countNumber(int n){
        return helper(n,0);
    }

    private static int helper(int n, int count){
        if(n == 0) {
            return count;
        }
        int rem = n % 10;
        if(rem == 0){
            count++;
        }
        return helper(n/10, count);
    }
}
