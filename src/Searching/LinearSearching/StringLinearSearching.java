package Searching.LinearSearching;

import java.util.Arrays;

public class StringLinearSearching {
    public static void main(String[] args) {
        String str = "Rachit";
        char target = 't';
        System.out.println(Arrays.toString(str.toCharArray())); // convert string to character array

        boolean ans = stringSearching(str,target);
        if(ans){
            System.out.println("Character exists in the String.");
        } else{
            System.out.println("Character does not exist.");
        }
    }

    private static boolean stringSearching(String str, char target){
        if(str.isEmpty()){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
