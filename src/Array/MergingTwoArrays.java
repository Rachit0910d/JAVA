package Array;

public class MergingTwoArrays {

        public static void main(String[] args) {
            int[] arr1 = ArrayUtility.inputArray();

            int[] arr2 = ArrayUtility.inputArray();

            int[] ans = mergeTwoArrays(arr1, arr2);

            ArrayUtility.displayArray(ans);
        }

        public static int[] mergeTwoArrays(int[] arr1, int[] arr2){
            int[] ans = new int[arr1.length + arr2.length];
            int i = 0,j=0, k = 0;
            while(i<arr1.length || j<arr2.length) {

                if (j==arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {
                    ans[k] = arr1[i];
                    k++;
                    i++;
                }
                else{
                    ans[k] = arr2[j];
                    j++;
                    k++;
                }
            }
            return ans;
        }
    }

