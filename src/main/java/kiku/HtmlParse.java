package kiku;

import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.html.HtmlParser;
import org.apache.tika.sax.ToTextContentHandler;
import org.xml.sax.ContentHandler;

import java.io.FileInputStream;
import java.io.InputStream;

public class HtmlParse {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("D:\\KSM_DATA\\KSM_ALL_FILE_TYPES\\KSM_ALL_FILE_TYPES\\KSM_All_file_Types\\rodINC000000026912.html");
            HtmlParser parser = new HtmlParser();
            ContentHandler contentHandler = new ToTextContentHandler();
            Metadata metadata=new Metadata();
            ParseContext context=new ParseContext();
            parser.parse(inputStream, contentHandler, metadata, context);
            String extractedText = contentHandler.toString();
            System.out.println(extractedText);
            System.out.println(metadata.get("PRESS 1250"));
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}