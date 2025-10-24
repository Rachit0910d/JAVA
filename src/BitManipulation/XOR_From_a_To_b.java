package BitManipulation;

public class XOR_From_a_To_b {
    public static void main(String[] args) {
        int a = 1;
        int b = 6;
        int ans = 0;
        System.out.println(RangeXOR(a,b));
    }

    // XOR from 0 to a
    private static int xor(int a){
        if(a % 4 == 0) return a;
        if(a % 4 == 1) return 1;
        if(a % 4 == 2) return a+1;
        return 0;
    }

    // range XOR for a,b = xor(b) ^ xor(a-1)
    private static int RangeXOR(int a, int b) {
        return xor(b) ^ xor(a-1);
    }
}
