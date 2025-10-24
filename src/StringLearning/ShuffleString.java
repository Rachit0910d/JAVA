package StringLearning;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String ans = Shuffling(s, indices);
        System.out.println(ans);
    }

    private static String Shuffling(String s, int[] indices) {
        char[] str = s.toCharArray();
        char[] ans = s.toCharArray();
        for (int i = 0; i < indices.length; i++) {
           ans[indices[i]] = str[i];
        }
        s = new String(ans);
        return s;
    }
}
