package Recursion.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MultipleOccurrences {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,6,6,8,9,4,2,3};
        int target = 6;
        List<Integer> list = new ArrayList<>();
        System.out.println(findingNumber2(arr, target, 0));

    }

    // list as a argument
    private static List<Integer> findingNumber1(int[] arr, int target, int i, List<Integer> list){
        if(arr[i] == target){
            list.add(i);
        }
        if(i == arr.length - 1){
            return list;
        }
        return findingNumber1(arr, target, ++i, list);
    }

    // list as a variable
    // don't use this approach because it creates a new list in each recursion call
    private static List<Integer> findingNumber2(int[] arr, int target, int i){
        List<Integer> list = new ArrayList<>();
        if(arr[i] == target){
            list.add(i);
        }
        if(i == arr.length - 1){
            return list;
        }
        ArrayList<Integer> ansFromBelowCalls = (ArrayList<Integer>) findingNumber2(arr, target, ++i);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
