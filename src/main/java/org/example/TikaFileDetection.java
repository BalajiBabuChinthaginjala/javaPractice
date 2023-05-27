package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import net.sourceforge.tess4j.Tesseract;
import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.ocr.TesseractOCRConfig;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;


public class TikaFileDetection {
    public static void main(String[] args) throws IOException, TikaException, SAXException {
        String path = "D:\\KSM_DATA\\KSM_ALL_FILE_TYPES\\KSM_ALL_FILE_TYPES\\KSM_All_file_Types\\KMX Web Designer's Guide 1.1.pdf";
        BodyContentHandler handler = new BodyContentHandler();
        Metadata metadata = new Metadata();
        FileInputStream html = new FileInputStream(new File(path));
        ParseContext pContext = new ParseContext();

        PDFParser pdfParser = new PDFParser();
        pdfParser.getPDFParserConfig().setExtractAnnotationText(false);
        pdfParser.getPDFParserConfig().setEnableAutoSpace(true);
        pdfParser.getPDFParserConfig().setExtractBookmarksText(false);
        pdfParser.getPDFParserConfig().setExtractFontNames(false);
        pdfParser.getPDFParserConfig().setExtractMarkedContent(false);
        pdfParser.getPDFParserConfig().setExtractActions(true);
        pdfParser.getPDFParserConfig().setOcrStrategy("ocr_only");
        pdfParser.parse(html, handler, metadata, pContext);
        System.out.println(handler);

    }
}
