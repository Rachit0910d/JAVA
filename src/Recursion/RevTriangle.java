package Recursion;

public class RevTriangle {
    public static void main(String[] args) {
        triangle(5, 0);
    }

    private static void triangle(int n, int i) {
        if(n == 0){
            return;
        }
        if(i < n){
            System.out.print("* ");
            triangle(n, ++i);
        } else{
            System.out.println();
            triangle(n-1, 0);
        }
    }
}
