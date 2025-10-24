package StringLearning;

import java.util.ArrayList;

public class LetterCombinations {
    public static void main(String[] args) {
        String digits = "23";
        ArrayList<String> list = combinations(digits, "");
        System.out.println(list);

    }

    private static ArrayList<String> combinations(String digits, String up){
        if(digits.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(up);
            return list;
        }
        int digit = digits.charAt(0) - '0';
        int start = (digit - 1) * 3;
        int end = digit * 3;
        ArrayList<String> list = new ArrayList<>();
        for (int i = start; i < end; i++) {
            char ch = (char)('a' + i);
            list.addAll(combinations(digits.substring(1), up + ch));
        }
        return list;
    }
}
