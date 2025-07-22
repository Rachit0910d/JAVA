package fileHandling.BufferNamedClasses;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class readingFile {
    public static void main(String[] args) {
        try(BufferedReader bw = new BufferedReader(new FileReader("pubg.txt"))){
            Scanner sc = new Scanner(bw);
            String line;
            while((line = bw.readLine()) != null){
                System.out.println(line);
            }
        } catch(FileNotFoundException e){
            System.out.println("File Not Found");
        } catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
