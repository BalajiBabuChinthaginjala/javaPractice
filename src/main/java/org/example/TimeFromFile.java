package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

public class TimeFromFile {
    public static void main(String[] args) {

        String fileName = "D:\\KSM_DATA\\KSM_content\\content4\\rodINC000000059758.html";

        try {

            Path file = Paths.get(fileName);

            BasicFileAttributes attr =
                    Files.readAttributes(file, BasicFileAttributes.class);
            Instant date=attr.creationTime().toInstant();


            String date1= Date.from(attr.creationTime().toInstant()).toString();
            LocalDate currentDate
                    = LocalDate.parse(date1);
            System.out.println("creationTime: " +date);
            System.out.println("creationTime: " +date1);
//            System.out.println("creationTime: " +date1.getTime());
//            System.out.println("creationMonth: " +date1.getMonth());
//            System.out.println("creationDate: " +date1.getDate());
//            System.out.println("creationDate: " +date1.getYear());
//            System.out.println("creationDate: " +date1.getDay());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
