import java.util.Arrays;

public class StringConcatenation {

    public static void main(String[] args) {
        String[] arr = new String[] {"You"," are ","the ","beloved ","person ","in ","the ","country"};
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
