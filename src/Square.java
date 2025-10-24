import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        pattern(n);
    }

    private static void pattern(int n){
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = min(row, col,n-row,n-col);
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }

    private static int min(int a, int b, int c, int d){
        if(a <= b && a <= c && a <= d){
            return a;
        } else if(b <= a && b <= c && b <= d){
            return b;
        } else if(c <= a && c <= b && c <= d){
            return c;
        } else{
            return d;
        }
    }
}
