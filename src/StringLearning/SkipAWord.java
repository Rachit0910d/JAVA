package StringLearning;

public class SkipAWord {
    public static void main(String[] args) {
        String str = "dfgappldfg";
        System.out.println(skip1(str));
    }

    private static String skip(String str){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("apple")){
            return skip(str.substring(5));
        }else{
            return str.charAt(0) + skip(str.substring(1));
        }
    }

    private static String skip1(String str){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("app") && !str.startsWith("apple")){
            return skip1(str.substring(3));
        }else{
            return str.charAt(0) + skip1(str.substring(1));
        }
    }

}
