package fileHandling.FileNamedClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readingFile {
    public static void main(String[] args) {
        try{
            File file = new File("Rachit.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();

        } catch(FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
