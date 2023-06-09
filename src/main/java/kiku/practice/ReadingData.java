package kiku.practice;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingData {
    public static void main(String[] args) throws TikaException, IOException, SAXException {
        ReadingData readingData = new ReadingData();
        System.out.println(readingData.readingData("D:\\KSM_DATA\\KSM_ALL_FILE_TYPES\\KSM_ALL_FILE_TYPES\\KSM_All_file_Types\\rodINC000000056012.html"));
    }

    public  String readingData(String fileName) throws IOException, TikaException, SAXException {

        FileInputStream fStream
                = new FileInputStream(new File(fileName));
        Metadata metadata = new Metadata();
        ParseContext parseContext = new ParseContext();
        BodyContentHandler handler = new BodyContentHandler();
        AutoDetectParser autoDetectParser = new AutoDetectParser();
        autoDetectParser.parse(fStream, handler, metadata, parseContext);
        return handler.toString().trim();
    }

}
