package fileHandling.BufferNamedClasses;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;

public class appendingFile {
    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("pubg.txt", true))){
            bw.write("\nI think only god know what it is??");
            System.out.println("Appending successfully.");
        } catch(FileNotFoundException e){
            System.out.println("File not found.");
        } catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
