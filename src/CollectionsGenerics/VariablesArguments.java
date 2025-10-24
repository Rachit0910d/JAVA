package CollectionsGenerics;

public class VariablesArguments {
    public static void main(String[] args) {
        System.out.println(sum(4, 5, 4546));
        System.out.println(sum(2, 3, 4, 56, 66, 77, 8, 7656, 77, 665, 8678, 86, 678));
        System.out.println(sum(3,4));
    }

    static int sum(int a, int b, int... c){
        int Sum = a + b;
        for (int i : c) {
            Sum += i;
        }
        return Sum;
    }
}
