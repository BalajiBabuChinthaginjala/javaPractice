package kiku.practice;

import org.apache.tika.exception.TikaException;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;

public class XmlToJava {
    public static void main(String[] args) throws TikaException, IOException, SAXException, InterruptedException {
        XmlToJava jaxbParser = new XmlToJava();
        CustomConfigClass customConfigClass = (CustomConfigClass) jaxbParser.xmlToJava("C:\\Users\\Admin\\AppData\\Roaming\\JetBrains\\IdeaIC2023.1\\scratches\\scratch_5.xml", CustomConfigClass.class);
        customConfigClass.getConfig().getWordDirection();
        customConfigClass.getConfig().getNumberOfFirstWords();
        customConfigClass.getConfig().getSummarize().getSummarize();
        customConfigClass.getConfig().getNumberOfLastWords();
        customConfigClass.getConfig().getSummarize().getFirstLetterOnly();
        customConfigClass.getConfig().getSummarize().getIncrementalPositions();
    }

    public Object xmlToJava(String fileName, Class clazz) {
        try {
            File file = new File(fileName);
            JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return (Object) unmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}