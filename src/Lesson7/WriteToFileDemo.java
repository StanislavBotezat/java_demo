package Lesson7;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileDemo {
    public static void main(String[] args) throws IOException {
        FileWriter myWriter = new FileWriter("filename.txt" );
        myWriter.write("Files in java might be tricky!");
        myWriter.close();
        System.out.println("Succesfully wrote to file");

    }
}
