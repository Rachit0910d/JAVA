package Searching.BinarySearching.SearchIn1DArray;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;

        System.out.println(findingNumber(nums, target));
    }

    private static int findingNumber(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            } else if(target < nums[mid]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }

        int i = 0;
        while(i < nums.length) {
            if(nums[i] < target){
                if(nums[i+1] > target){
                    return i+1;
                } else{
                    if(i >= nums.length){
                        break;
                    }
                    i = i + 2;
                }
            }
        }
        return start;
    }
}
