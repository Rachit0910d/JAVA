package CollectionsGenerics.CollectionsLibrary;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> first = new ArrayList<>();

        // initialisation
        for (int i = 0; i < 3; i++) {
            first.add(new ArrayList<>());
        }

        System.out.println("Add elements bro : ");
        // add elements
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                first.get(i).add(sc.nextInt());
            }
        }
        System.out.println(first);
    }
}
