package StringLearning;

import java.util.ArrayList;

public class Comparison {
    public static void main(String[] args) {

        String name1 = "Rachit"; // name1 and name2 are pointing to a same object in string pool
        String name2 = "Rachit";
//        String name3 = name2;

//        System.out.println(name1 == name2); // == try to compare the objects
//        System.out.println(name1 == name3);

//        String a = new String("Rachit"); // a and b are pointing to two different objects in string pool
//        String b = new String("Rachit");
//        System.out.println(a==b);

//        System.out.println(name1.equals(name2)); // .equals() compare the value only not the object's references
//        System.out.println(a.equals(b));

//        System.out.println(name1.charAt(4));
//        System.out.println(name1.length());

        System.out.println('a' + 'b');
        System.out.println("a" + "b");
//        System.out.println(new Integer(56) +""+ new ArrayList<>());
    }

}
