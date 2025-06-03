public class ConcatenationStrings {

    String str1 ;
    String str2;

    public ConcatenationStrings(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(str1).append(str2);
        return sb.toString();
    }

    public static void main(String[] args) {
        ConcatenationStrings ct = new ConcatenationStrings("This is my ", "house");
        System.out.printf("%S", ct);
    }
}
