package fileHandling.BufferNamedClasses;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;

public class writingFile {

    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("pubg.txt"))){
            bw.write("Hello again! you know what it is? ");
            System.out.println("Written successfully.");
        } catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
