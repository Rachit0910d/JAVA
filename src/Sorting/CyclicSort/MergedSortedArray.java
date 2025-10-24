package Sorting.CyclicSort;

import java.util.Arrays;

public class MergedSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        sorting(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }

    private static void sorting(int[] nums1, int m, int[] nums2, int n){
        int k = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[k];
            k++;
        }

        int i = 0;
        while(i < m+n){
            int num = nums1[i] - 1;
            if((nums1[i] != nums1[num]) && (nums1[i] <= m + n) && (nums1[i] > 0)){
                int temp = nums1[i];
                nums1[i] = nums1[num];
                nums1[num] = temp;
            } else{
                i++;
            }
        }
    }
}
