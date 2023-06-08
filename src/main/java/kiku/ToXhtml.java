package kiku;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.xml.XMLParser;
import org.apache.tika.sax.BodyContentHandler;
import org.apache.tika.sax.ToXMLContentHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ToXhtml {
    public static void main(String[] args) throws TikaException, IOException, SAXException {
        parseToHTML();
    }
    public static void parseToHTML() throws IOException, SAXException, TikaException {
        BodyContentHandler handler = new BodyContentHandler(-1);
        Metadata metadata = new Metadata();
        File inFile = new File("D:\\KSM_DATA\\KSM_ALL_FILE_TYPES\\KSM_ALL_FILE_TYPES\\KSM_All_file_Types\\rodINC000000026912.html");
        FileInputStream inputstream = new FileInputStream(inFile);
        ParseContext pcontext = new ParseContext();

        AutoDetectParser xmlparser = new AutoDetectParser();
        xmlparser.parse(inputstream, handler, metadata, pcontext);

        System.out.println("Metadata of the document:");
        String[] metadataNames = metadata.names();//Now we have all the metadata tags here

        for(String name : metadataNames) {
            if (name == "title  "){ //here you can check if the tag names are the particular ones you need and do what you want with them
                System.out.println(name + ": " + metadata.get(name));
            }
        }
    }
}
