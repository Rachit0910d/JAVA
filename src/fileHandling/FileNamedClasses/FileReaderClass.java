package fileHandling.FileNamedClasses;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    public static void main(String[] args) {
        try(FileReader file = new FileReader("Rachit.txt")){
            int ch;
            while((ch = file.read()) != -1){
                System.out.print((char)ch);
            }
        } catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
