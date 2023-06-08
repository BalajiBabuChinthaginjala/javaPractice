package kiku;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.Charset;

public class GFG {

    public static void main(String[] args) throws IOException {
        getData();
    }
    public static void getData() throws IOException {

           System.out.println(IOUtils.toString( new FileInputStream(
                    "D:\\KSM_DATA\\KSM_ALL_FILE_TYPES\\KSM_ALL_FILE_TYPES\\KSM_All_file_Types\\rodINC000000026912.html"), Charset.defaultCharset()));
    }
}