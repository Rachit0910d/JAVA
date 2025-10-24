package Inheritance.PracticeChallenge2;

public class TestClass {


    public static void main(String[] args) {

        ArrayOperations testCase1 = new ArrayOperations(new int[]{1,2,7,3,4,45,5});

        ArrayOperations.Statistics test = testCase1.new Statistics();

        System.out.println(test.mean());
        System.out.println(test.median());
    }
}
