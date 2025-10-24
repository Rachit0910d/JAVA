package Sorting.CyclicSort;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {8,7,1,10,17,15,18,11,16,9,19,12,5,14,3,4,2,13,18,18};
        int ans = findingNumber(arr);
        System.out.println(ans);
    }

    private static int findingNumber(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int num = arr[i] - 1;
            if(arr[i] != arr[num] && arr[i] < arr.length){
                int temp = arr[i];
                arr[i] = arr[num];
                arr[num] = temp;
            }else{
                i++;
            }
        }
        int j = 0;
        while(j < arr.length){
            if(arr[j] != j + 1){
                break;
            }
            j++;
        }
        return arr[j];
    }
}
