package Searching.BinarySearching.SearchIn1DArray;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

public class SmallestLetter {

    public static void main(String[] args) {
        char[] arr = {'x','x','y','y'};
        char target = 'z';

        char ans = findSmallestNumber(arr, target);
        System.out.println(ans);
    }

    private static char findSmallestNumber(char[] arr, char target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(target < arr[mid]) end = mid - 1;
            else start = mid + 1;

        }
        return arr[start % arr.length];
    }

}
