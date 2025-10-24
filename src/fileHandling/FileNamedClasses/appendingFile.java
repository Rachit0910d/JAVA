package fileHandling.FileNamedClasses;

import java.io.*;
import java.io.IOException;

public class appendingFile {
    public static void main(String[] args) {
        String fileName = "Rachit.txt";
        try(FileWriter file = new FileWriter(fileName,true)){
            file.write("New line h jra dhyaan se");
            System.out.println("Appended successfully.");
        } catch(IOException e){
            System.out.println("AN error occurred.");
            e.printStackTrace();
        }
    }
}
