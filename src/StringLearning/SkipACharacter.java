package StringLearning;

public class SkipACharacter {
    public static void main(String[] args) {
        String s = "Rachit";
        System.out.println(skip1(s));
    }

    private static void skip(String str, String p){
        if(str.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = str.charAt(0);

        if(ch == 'a'){
            skip(str.substring(1), p);
        } else{
            skip(str.substring(1), p + ch);
        }
    }

    private static String skip1(String str){
        if(str.isEmpty()){
            return "";
        }

        char ch = str.charAt(0);

        if(ch == 'a'){
           return skip1(str.substring(1));
        } else{
           return ch + skip1(str.substring(1));
        }
    }
}
