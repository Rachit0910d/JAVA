package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> ans = SubSetDuplicating(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }

    private static List<List<Integer>> SubSetDuplicating(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for(int i = 0; i < arr.length; i++){
            int n = outer.size();
            start = 0;
            if(i > 0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            end = outer.size() - 1;

            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }



}
