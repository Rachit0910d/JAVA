package Sorting.CyclicSort;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(findingNumber(arr));
    }

    private static int findingNumber(int[] nums){
        int i = 0;
        while(i < nums.length){
            int num = nums[i] - 1;
            if(nums[i] != nums[num] && nums[i] <= nums.length && nums[i] > 0){
                int temp = nums[i];
                nums[i] = nums[num];
                nums[num] = temp;
            }
        }

        int j = 0;
        int count1 = 0;
        int count2 = 0;
        while(j < nums.length){
            if(nums[i] == nums[i+1]){
                count1++;
            }else{

            }
        }
        return -1;
    }
}
