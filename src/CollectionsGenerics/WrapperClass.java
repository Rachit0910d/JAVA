package CollectionsGenerics;

public class WrapperClass {
    public static void main(String[] args) {
        Integer a = Integer.valueOf("55"); // boxing
        System.out.println(a.getClass());
        System.out.println(a.byteValue());

        Integer cd = 55; // autoboxing
        int c = cd; // unboxing
    }
}

