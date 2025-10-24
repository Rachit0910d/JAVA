package StringLearning;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        String s = "abc";
        permutation1(s, "");
        ArrayList<String> list = permutation2(s, "");
        System.out.println(list);
    }

    private static void permutation1(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        int n = ans.length();
        for (int i = 0; i <= n; i++) {
            String first = ans.substring(0,i);
            String second = ans.substring(i, n);
            permutation1(str.substring(1),first + ch + second );
        }
    }

    private static ArrayList<String> permutation2(String str, String ans){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> res = new ArrayList<>();
        char ch = str.charAt(0);
        int n = ans.length();
        for (int i = 0; i <= n; i++) {
            String first = ans.substring(0,i);
            String second = ans.substring(i, n);
            res.addAll(permutation2(str.substring(1),first + ch + second ));
        }
        return res;
    }
}
