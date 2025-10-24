package Inheritance.PracticeChallenge1;

public class TestClass extends LibraryItem {

    public static void main(String[] args) {
        LibraryItem testCase1 = new LibraryItem();
        testCase1.setAuthor("Robert Downey Junior");
        testCase1.setItemID("Iron123");
        testCase1.setTitle("IronMan");

        System.out.println(testCase1.getTitle()+"\n"+testCase1.getAuthor()+"\n"+testCase1.getItemID()+"\n");

        Magazine testCase2 = new Magazine();


    }



}
