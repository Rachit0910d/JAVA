package BitManipulation;

public class FindPowerOfTwo {
    public static void main(String[] args) {
        int n = 4;
        int ans = n & (n-1);
        if(ans == 0){
            System.out.println("number is the in the power of 2.");
        } else{
            System.out.println("not");
        }
    }
}
