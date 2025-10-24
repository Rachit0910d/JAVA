package Searching.BinarySearching.SearchIn1DArray;

public class firstAndLastPositionOfTarget {
    public static void main(String[] args) {
        int[] nums = {};
        int target = 7;
        int[] ans = new int[2];
        ans = searchRange(nums,target);
        System.out.println(ans[0]+","+ ans[1]);
    }

    private static int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};
        ans[0] = search(nums, target, true);
        if(ans[0] != -1) ans[1] = search(nums, target, false);

        return ans;
    }

    private static int search(int[] nums, int target, boolean findFirstIndex){
        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < nums[mid]){
                end = mid - 1;
            } else if(target > nums[mid]){
                start = mid + 1;
            } else{
                ans = mid;
                if(findFirstIndex){
                     end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
