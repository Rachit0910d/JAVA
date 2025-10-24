package Searching.BinarySearching.SearchIn1DArray;

public class SquareRoot {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(sqrt(num));
    }

    private static int sqrt(int num){
        int start = 0;
        int end = num;
        int ans = 0;
        if(num == 0){
            return 0;
        }

        if(num <= 2){
            return 1;
        }

        while(start <= end){
            int mid = start + (end - start) / 2;
            if((long)mid*mid == num){
                return mid;
            } else if((long)mid*mid > num){
                end = mid - 1;
            } else{
                ans = start;
                start = mid + 1;
            }
        }
        return ans;
    }
}
