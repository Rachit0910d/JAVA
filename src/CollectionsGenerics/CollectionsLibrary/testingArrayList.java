package CollectionsGenerics.CollectionsLibrary;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class testingArrayList {
    public static void main(String[] args) {
        List<String> firstList = new ArrayList<>();
        firstList.add("Rachit");
        firstList.add("Saini");

        System.out.println(firstList.get(0));
        for (String s : firstList) {    // first loop method
            System.out.print(s + " ");
        }
        System.out.println();

        firstList.forEach(System.out::println);   // second loop method

        Iterator<String> it = firstList.iterator();   // third loop method
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
