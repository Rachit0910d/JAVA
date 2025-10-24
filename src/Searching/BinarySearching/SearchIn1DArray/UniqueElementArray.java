package Searching.BinarySearching.SearchIn1DArray;

public class UniqueElementArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        int ans = unique(arr);
        System.out.println(ans);
    }

    private static int unique(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            if(start < end && nums[start] == nums[start + 1]){
                start += 2;
            } else{
                return nums[start + 1];
            }
        }
        return -1;
    }
}
