package Searching.BinarySearching.SearchIn1DArray;

public class positionInInfiniteArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,22,33,34,55,77,89,345,678,890,1023,1234,2455};
        int target = 10;
        int ans = findingRange(arr,target);
        if(ans != -1) System.out.printf("The number exists in the infinite array at position : %d",ans);
        else System.out.println("Number not found.");
    }

    private static int findingRange(int[] arr, int target){
        // first finding the range
        // first start with box of size 2
        int start = 0;
        int end = 1;

        //condition for the target to lie inside the box
        //doubling the size of box until the condition met
        while(target > arr[end]){
            int newStart = end + 1;
            end += (end - start + 1)*2;
            start = newStart;
        }
        return findingPosition(arr,target,start,end);
    }

    private static int findingPosition(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]) end = mid - 1;
            else if(target > arr[mid]) start = mid + 1;
            else return mid;
        }
        return -1;
    }
}
