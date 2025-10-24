package Inheritance.PracticeChallenge2;

public class ArrayOperations {
    private int[] arr;

    public ArrayOperations(int[] arr) {
        this.arr = arr;
    }

    public class Statistics{
        double mean(){
            double sum = 0;
            for (int i : arr) {
                sum+= i;
            }
            return  sum/arr.length;
        }

        double median(){
            for (int i = 0, j = arr.length-1; i<j; i++, j--){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            double med;
            if(arr.length / 2 == 0 ){
                med = arr[(arr.length / 2) - 1];
            }
            else{
                med = arr[(arr.length / 2)];
            }
            return med;

        }
    }
}
