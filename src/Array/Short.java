package Array;

public class Short {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int[] ans = Shorting(arr);
        ArrayUtility.displayArray(ans);
    }

    public static int[] Shorting(int[] arr){
        for(int i = 0; i<arr.length-1;){
            if(arr[i+1]< arr[i]){
                int swap = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = swap;
                i=0;
            }
            else{
                i++;
            }
        }
        return arr;
    }
}
