package StringLearning;
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "";

        boolean ans = isPalindrome(str);
        if(ans){
            System.out.println("String is Palindrome.");
        } else{
            System.out.println("String is not palindrome.");
        }
    }

    private static boolean isPalindrome(String str){
        Scanner sc = new Scanner(System.in);
        if(str.isEmpty()){
            System.out.println("String is empty. pls add something.");
             str = sc.next();
        }

        if(str.length() == 1) return true;
        str = str.toLowerCase();
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
