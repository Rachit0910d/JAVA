package Array;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        ReversingArray(arr);
        System.out.println("The reverse array is : ");
        ArrayUtility.displayArray(arr);
    }

    public static int[] ReversingArray(int[] arr){
        for(int i = 0, j = arr.length - 1; i<j;  i++, j--){
            int swap = arr[i];
            arr[i] = arr[j];
            arr[j] = swap;
        }
        return arr;
    }
}
