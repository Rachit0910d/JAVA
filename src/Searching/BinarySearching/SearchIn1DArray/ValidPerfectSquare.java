package Searching.BinarySearching.SearchIn1DArray;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 2147483647;
        boolean isSquare = sqrt(num);
        if(isSquare) System.out.println("Perfect Square.");
        else System.out.println("not one");
    }

    private static boolean sqrt(int num){
        if(num == 0){
            return false;
        }
        if(num <= 2){
            return false;
        }
        int start = 0;
        int end = Math.min(num / 2, 46340);
        while(start <= end){
            int mid = start + (end - start) / 2;
            if((long)(mid*mid) == num){
                return true;
            } else if((long)(mid*mid) < num){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return false;
    }
}

