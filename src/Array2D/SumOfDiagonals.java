package Array2D;

public class SumOfDiagonals {
    public static void main(String[] args) {
        int[][] arr = Array.ArrayUtility.input2DArray();
        long leftSum = LeftDiagonalSum(arr);
        long rightSum = RightDiagonalSum(arr);
        long sum = SumOfTwoDiagonals(leftSum, rightSum, arr);

        System.out.println("The Sum of the elements of both diagonals is : "+sum);
    }

    public static long SumOfTwoDiagonals(long leftSum, long rightSum, int[][] arr){
        long sum = leftSum + rightSum;
        if(arr.length%2!=0){
            sum = sum - arr[arr.length/2][arr.length/2];
        }
        return sum;
    }

    public static long LeftDiagonalSum(int[][] arr){
        int leftSum = 0;
        int i = 0;

        while(i<arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                if (i == j) {
                    leftSum += arr[i][j];
                }
                j++;
            }
            i++;
        }
        return leftSum;
    }

    public static long RightDiagonalSum(int[][] arr){
        long rightSum = 0;
        int i = 0;

        while(i<arr.length){
            int j = 0;
            while(j< arr[i].length){
                if(j==(arr[i].length - 1)-i){
                    rightSum += arr[i][j];
                }
                j++;
            }
            i++;
        }

        return rightSum;
    }

}
