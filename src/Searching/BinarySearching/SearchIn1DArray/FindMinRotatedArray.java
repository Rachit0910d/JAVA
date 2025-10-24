package Searching.BinarySearching.SearchIn1DArray;

public class FindMinRotatedArray {
    public static void main(String[] args) {
        int[] arr = {2,1};
        System.out.println(findMin(arr));
    }

    private static int findMin(int[] nums) {
        int pivot = findPivot(nums);
        if(pivot == nums.length){
            return nums[0];
        } else{
            return nums[pivot + 1];
        }
    }

    private static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        if(nums.length == 0) return -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            } else if( mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            } else if(nums[start] >= nums[mid]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
