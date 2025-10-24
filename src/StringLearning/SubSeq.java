package StringLearning;

import java.util.ArrayList;
import java.util.List;

public class SubSeq {
    public static void main(String[] args) {
        SubSequence1("abc", "");
        System.out.println(subSeqRet1("abc", ""));
        System.out.println(Ascii("abc", ""));
    }

    private static void SubSequence1(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        SubSequence1(str.substring(1) ,ans + ch);
        SubSequence1(str.substring(1), ans);
    }

    private static ArrayList<String> subSeqRet1(String str, String ans){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);

        ArrayList<String> left = subSeqRet1(str.substring(1), ans + ch);
        ArrayList<String> right = subSeqRet1(str.substring(1), ans);

        left.addAll(right);
        return left;
    }

    private static ArrayList<String> Ascii(String str, String ans){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = str.charAt(0);

        ArrayList<String> first = Ascii(str.substring(1), ch + ans);
        ArrayList<String> second = Ascii(str.substring(1), ans);
        ArrayList<String> third = Ascii(str.substring(1), (int)(ch) + ans);
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
