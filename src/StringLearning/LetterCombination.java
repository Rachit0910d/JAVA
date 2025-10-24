package StringLearning;

public class LetterCombination {
    public static void main(String[] args) {
        String digits = "23";
        combination(digits, "");
    }

    private static void combination(String digits, String up) {
        if(digits.isEmpty()){
            System.out.println(up);
            return;
        }

        int digit = digits.charAt(0) - '0'; // this will convert '2' to 2
        int start = (digit - 1) * 3;
        int end = digit * 3;
        for(int i = start; i < end; i++){
            char ch = (char)('a' + i);
            combination(digits.substring(1), up + ch);
        }
    }
}
