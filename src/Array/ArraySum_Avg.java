package Array;

public class ArraySum_Avg {
    public static void main(String[] args) {
        System.out.println("Welcome to the Sum and Average of the elements of Array : ");
        int[] arr = ArrayUtility.inputArray();

        double sum = Sum(arr);
        double avg = Average(arr, sum);
        System.out.println("The Sum is : "+sum);
        System.out.println("The Average is : "+avg);
    }

    public static double Sum(int[] arr){
        double sum = arr[0];
        int i = 1;
        while(i < arr.length){
            sum += arr[i];
            i++;
        }
        return sum;
    }

    public static double Average(int[] arr, double sum){
        return sum/arr.length;
    }
}
