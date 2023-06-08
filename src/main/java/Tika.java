import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.sax.BodyContentHandler;

import java.io.File;
import java.io.FileInputStream;

public class Tika {
    public static void main(String[] args) throws Exception {
        FileInputStream fStream
                = new FileInputStream(new File("D:\\KSM_DATA\\KSM_ALL_FILE_TYPES\\KSM_ALL_FILE_TYPES\\KSM_All_file_Types\\rodINC000000056012.html"));
        Metadata metadata = new Metadata();
        ParseContext parseContext = new ParseContext();
        BodyContentHandler handler = new BodyContentHandler();
        AutoDetectParser autoDetectParser = new AutoDetectParser();
        autoDetectParser.parse(fStream, handler, metadata, parseContext);
        System.out.println(handler);

    }
}
