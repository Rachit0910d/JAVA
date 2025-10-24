package Polymorphism.MethodAndConstructor.Overloading;

public class MethodAndConstructorOverloading {
    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }

    public static String sum(String str1, String str2){
        return str1.concat(str2);
    }


    public static void main(String[] args) {

        System.out.println(sum("hello ", "rachit"));
        System.out.println(sum(1,2,3,4));
        System.out.println(sum(1,3));
    }

}
