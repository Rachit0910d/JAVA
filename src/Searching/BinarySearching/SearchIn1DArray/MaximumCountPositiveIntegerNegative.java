package Searching.BinarySearching.SearchIn1DArray;

public class MaximumCountPositiveIntegerNegative {
    public static void main(String[] args) {
        int[] nums = {-3,-2,0,0,1,2};
        int ans = findingMax(nums);
        System.out.println(ans);
    }

    private static int findingMax(int[] nums){
        int NegMax = 0;
        int PosMax = 0;
        int start = 0;

        while(start < nums.length){
            if(nums[start] < 0){
                NegMax++;
            }
            if(nums[start] > 0){
                PosMax++;
            }
            start++;
        }
        return Math.max(NegMax, PosMax);
    }
}
