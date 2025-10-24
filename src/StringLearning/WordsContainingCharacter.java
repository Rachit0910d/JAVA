package StringLearning;

import java.util.ArrayList;
import java.util.List;

public class WordsContainingCharacter {
    public static void main(String[] args) {
        String[] arr = {"leet", "code"};
        char x = 'e';

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].indexOf(x) != -1){
                ans.add(i);
            }
        }
    }




}
