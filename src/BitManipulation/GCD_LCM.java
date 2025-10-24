package BitManipulation;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(45,5));

        System.out.println(lcm(4,9));
    }

    private static int gcd(int a, int b){
        if(a==0) return b;
        return gcd(b % a, a);
    }

    private static int lcm(int a, int b){
        return (a*b) / gcd(a,b);
    }
}
