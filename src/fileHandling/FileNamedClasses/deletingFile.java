package fileHandling.FileNamedClasses;

import java.io.File;

public class deletingFile {
    public static void main(String[] args) {
        File file = new File("Rachit.txt");
        if(file.delete()){
            System.out.println("Deleted the file : "+file.getName());
        } else{
            System.out.println("Failed to delete the file.");
        }
    }
}
