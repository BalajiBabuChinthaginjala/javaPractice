import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ImageParser {
    public static void main(String[] args) throws TesseractException, IOException, TikaException, SAXException {
        String path="D:\\KSM_DATA\\KSM_content\\content4\\funny-quotes-mitch-hedberg.jpg";
        Path filepath = Paths.get(path);
        String mimetype = Files.probeContentType(filepath);
        if (mimetype != null && mimetype.split("/")[0].equals("image")) {
          System.out.println( crakImage(path));
        }else {
            System.out.println(parsingHtml(path));
        }
    }
    public static String parsingHtml(String fileName) throws IOException, SAXException, TikaException {
        BodyContentHandler handler = new BodyContentHandler();
        Metadata metadata = new Metadata();
        FileInputStream html = new FileInputStream(new File(fileName));
        ParseContext pContext = new ParseContext();
        AutoDetectParser parser = new AutoDetectParser();
        parser.parse(html, handler, metadata, pContext);
        String data = handler.toString();
        return data;
    }

    public static String crakImage(String filePath) throws TesseractException {
        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath("F:\\Tess4J-3.4.8-src\\Tess4J\\tessdata");
        String text = tesseract.doOCR(new File(filePath));
        return text;
    }
}
