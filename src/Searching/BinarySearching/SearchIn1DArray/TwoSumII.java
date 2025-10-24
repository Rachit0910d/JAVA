package Searching.BinarySearching.SearchIn1DArray;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(findingIndices(arr,target)));
    }

    private static int[] findingIndices(int[] numbers, int target){
        int[] ans = {-1,-1};
        if(numbers.length == 0){
            return ans;
        }
        int start = 0;
        int end = numbers.length - 1;

        while(start < end){
            if(numbers[start] + numbers[end] == target){
                return new int[] {start+1, end+1};
            } else if(numbers[start] + numbers[end] < target){
                start++;
            } else{
                end--;
            }
        }
        return new int[] {-1,-1};
    }
}
