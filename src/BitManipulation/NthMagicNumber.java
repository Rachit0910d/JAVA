package BitManipulation;

public class NthMagicNumber {
    public static void main(String[] args) {
        int n = 31;
        int ans = 0;
        int base = 5;

        // this loop is running until the bits of number n = 6 is not completed
        while(n > 0){
           int  lastDigit = n & 1;
            n = n >> 1;
            ans += lastDigit * base;
            base *= 5;
        }
        System.out.println(ans);
    }
}
