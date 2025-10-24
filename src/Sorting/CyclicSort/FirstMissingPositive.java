package Sorting.CyclicSort;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {7,8,9,11,12};
        System.out.println(findingNumber(nums));
    }

    private static int findingNumber(int[] nums){
        int i = 0;
        while(i < nums.length){
            int num = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[num]){
                int temp = nums[i];
                nums[i] = nums[num];
                nums[num] = temp;
            } else{
                i++;
            }
        }

        int j = 0;
        while(j < nums.length){
            if(nums[j] != j+1) {
                break;
            }
            j++;
        }
        return j+1;
    }
}
