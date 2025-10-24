package fileHandling.FileNamedClasses;

import java.io.File;
import java.io.IOException;

public class CreatingFile {
    public static void main(String[] args) {
        File firstFile = new File("rachit.txt");
        try{
            if(firstFile.createNewFile()){
                System.out.println("File created : "+firstFile.getName());
            } else{
                System.out.println("File already exists.");
            }
        } catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
