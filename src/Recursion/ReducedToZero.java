package Recursion;

public class ReducedToZero {
    public static void main(String[] args) {
        int num = 123;
        System.out.println(reducing(num));
    }

    private static int reducing(int num){
        return helper(num, 0);
    }

    private static int helper(int num, int count){
        if(num % 2 != 0){
            count++;
            num--;
        }
        if(num == 0){
            return count;
        }
        return helper(num / 2, ++count);
    }
}
