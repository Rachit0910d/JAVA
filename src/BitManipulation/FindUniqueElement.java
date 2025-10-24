package BitManipulation;

public class FindUniqueElement {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,0,3,4};
        int num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            num ^= arr[i];
        }
        System.out.println(num);


    }
}
