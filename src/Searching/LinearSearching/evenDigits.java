package Searching.LinearSearching;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class evenDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(evenElements(arr));
    }

    // to count the even digit's elements in the array
    private static int evenElements(int[] arr){
        int count = 0;
        for (int j : arr) {
            if (digitsOfElement(j)) {
                count++;
            }
        }
        return count;
    }

    // to check whether the element of array contains even no. of digits or not
    private static boolean digitsOfElement(int element){
        if(element < 0) element = element*(-1);
        if(element == 0) return false;

        int count = 0;
        while(element > 0){
            element /= 10;
            count++;
        }
        return count % 2 == 0;
    }
}
