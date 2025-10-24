package Sorting.CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicatesInArray {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        List<Integer> ans = new ArrayList<>();
        System.out.println(ans);
    }
    public  List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int num = nums[i] - 1;
            if(nums[i] != nums[num] && nums[i] < nums.length){
                int temp = nums[i];
                nums[i] = nums[num];
                nums[num] = temp;
            } else{
                i++;
            }
        }

        int j = 0;
        List<Integer> ans = new ArrayList<>();
        while(j < nums.length){
            if(nums[j] != j + 1){
                ans.add(nums[j]);
            }
            j++;
        }
        return ans;
    }
}