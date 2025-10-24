package BitManipulation;

public class EvenOdd {
    public static void main(String[] args) {
        boolean ans = isOdd(0);
        if(ans) System.out.println("The no. is Odd.");
        else System.out.println("The no. is Even.");
    }

    private static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
