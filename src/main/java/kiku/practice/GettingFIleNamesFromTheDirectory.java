package kiku.practice;

import java.io.File;
import java.io.IOException;

public class GettingFIleNamesFromTheDirectory {

    public static void main(String args[]) throws IOException {
        File directoryPath = new File("E:\\xmlFiles");
        File filesList[] = directoryPath.listFiles();
        for (File file : filesList) {
            System.out.println("File path: " + file.getAbsolutePath());
        }
    }
}
