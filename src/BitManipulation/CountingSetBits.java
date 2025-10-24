package BitManipulation;

public class CountingSetBits {
    public static void main(String[] args) {
        int n = 454;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(SetBits(n));
    }

    private static int SetBits(int n) {
        int count = 0;
        while(n > 0){
            count++;
//            n -= (n & (-n));   // also we can use this. time complexity --> O{log(n)}
            n = n & (n-1);
        }
        return count;
    }
}
