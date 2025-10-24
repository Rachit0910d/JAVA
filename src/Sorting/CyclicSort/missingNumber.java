package Sorting.CyclicSort;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {};

        System.out.println(findNumber(arr));
    }

    private static int findNumber(int[] arr){

        int i = 0;
        while(i < arr.length){
            int num = arr[i];
            if(arr[i] < arr.length && arr[i] != i){
                int temp = arr[i];
                arr[i] = arr[num];
                arr[num] = temp;
            } else{
                i++;
            }
        }

        int j = 0;
        for (j = 0; j < arr.length; j++) {
            if(arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }
}
