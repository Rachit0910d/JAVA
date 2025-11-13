package fileHandling.FileNamedClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readingFile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("Rachit.txt"))) {
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
        } catch(FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
