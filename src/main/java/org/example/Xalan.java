package org.example;

import java.nio.file.Path;
import java.nio.file.Paths;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Xalan {

    public static void main(String[] args) throws TransformerException {

        StreamSource xlsStreamSource = new StreamSource(Paths.get(
                ".\\src\\main\\resources\\test.xslt")
                .toAbsolutePath().toFile());

        StreamSource xmlStreamSource = new StreamSource(Paths
                .get("D:\\Test\\XalanTest\\student.xml")
                .toAbsolutePath().toFile());

        TransformerFactory transformerFactory = TransformerFactory.newInstance(
                "org.apache.xalan.processor.TransformerFactoryImpl", null);

        Path pathToHtmlFile = Paths.get("D:\\Test\\XalanTest\\student.html");
        StreamResult result = new StreamResult(pathToHtmlFile.toFile());

        Transformer transformer = transformerFactory.newTransformer(xlsStreamSource);
        transformer.transform(xmlStreamSource, result);
    }

}
