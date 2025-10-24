package Sorting.CyclicSort;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {};
        boolean ans = isDuplicate(arr);
        System.out.println(ans);
    }

    private static boolean isDuplicate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if(nums[j+1] < nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }

        return false;
    }
}
