package fileHandling.BufferNamedClasses;
import java.io.BufferedReader;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class creatingFile {

    public static void main(String[] args) throws IOException {
        File fileName = new File("pubg.txt");

        try{
            if(fileName.exists()){
                System.out.println("File already exists. Please use that file......");
            } else{
                if(fileName.createNewFile()){
                    System.out.println("New file created.....");
                } else{
                    System.out.println("File creation failed.....");
                    return;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
