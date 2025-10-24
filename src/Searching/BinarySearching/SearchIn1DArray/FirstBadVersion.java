package Searching.BinarySearching.SearchIn1DArray;

public class FirstBadVersion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(firstBadVersion(n));
    }

    private static int firstBadVersion(int n){
        int start = 0;
        int end = n;
        int ans = 0;
        while(start < end){
            int mid = start + (end - start) / 2;
            boolean isBad = isBadVersion(mid);
            if(isBad){
                if(isBadVersion(mid - 1) && mid > 1){
                    end = mid - 1;
                } else{
                    return mid;
                }
            } else{
                ans = start;
                start = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isBadVersion(int mid) {
        if(mid == 3) return true;
        else return false;
    }
}
