package fileHandling.FileNamedClasses;
import java.io.FileWriter;
import java.io.IOException;

public class writingFile {
    public static void main(String[] args){
        try (FileWriter file = new FileWriter("Rachit.txt");) {
            file.write("Hello Rachit! This is a file writing example in JAVA.");
            file.close();
            System.out.println("Successfully wrote to the file.");
        } catch(IOException e){
            System.out.println("An error occurred.");
        }
    }
}
