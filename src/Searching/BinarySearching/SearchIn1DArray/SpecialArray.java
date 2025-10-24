package Searching.BinarySearching.SearchIn1DArray;

public class SpecialArray {
    public static void main(String[] args) {
        int[] arr = {0,4,3,0,4};
        System.out.println(special(arr));
    }

    private static int special(int[] nums){
        sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] != nums[i + 1] && nums[i] >= 1){
                count++;
            }
        }
        return count;
    }

    private static void sort(int[] nums) {

    }
}
