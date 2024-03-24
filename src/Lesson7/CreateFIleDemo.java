package Lesson7;

import java.io.IOException;
import java.io.File;
public class CreateFIleDemo {
    public static void main(String[] args) throws IOException {
        File myFile = new File("filename.txt");
        if (myFile.createNewFile()){
            System.out.println("File created: "+myFile.getName());
    }else{
        System.out.println("File already exists.");
        }
    }
}
