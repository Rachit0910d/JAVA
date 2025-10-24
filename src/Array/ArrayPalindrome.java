package Array;

public class ArrayPalindrome {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        boolean palindrome = isPalindrome(arr);
        if (palindrome) System.out.println("The array is Palindrome.");
        else System.out.println("The array is not Palindrome.");
    }

    public static boolean isPalindrome(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}



