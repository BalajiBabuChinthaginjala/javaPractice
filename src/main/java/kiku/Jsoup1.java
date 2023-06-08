package kiku;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Jsoup1 {

    public static void main(String[] args) throws IOException {
//        gettag();
    getTagOrAttribute("D:\\KSM_DATA\\KSM_ALL_FILE_TYPES\\KSM_ALL_FILE_TYPES\\KSM_All_file_Types\\rodINC000000026912.html","title");
    }

    private static void gettag() throws IOException {
        Document doc = Jsoup.parse(new File("D:\\KSM_DATA\\KSM_ALL_FILE_TYPES\\KSM_ALL_FILE_TYPES\\KSM_All_file_Types\\rodINC000000026912.html"), "utf-8");
        Elements elements = doc.getAllElements();
        for (Element element : elements) {
            if (element.attributes().size() > 0) {
                System.out.println(element.attributes().asList().get(0).getValue());
            }
            System.out.println(element.text());
        }
    }

    public static String getTagOrAttribute(String filepath, String tagName) throws IOException {
        Document doc = Jsoup.parse(new File(filepath), "utf-8");
        Elements elements = doc.getAllElements();
        for (Element element : elements) {
            if (element.tagName().equals(tagName)) {
                return element.text();
            }
        }
        for (Element element : elements) {
            Attributes attributes = element.attributes();
            for (Attribute attribute : attributes) {
                if (attribute.getKey().equals(tagName)) {
                    Element attributeElement = new Element(Tag.valueOf(tagName), doc.baseUri());
                    attributeElement.text(attribute.getValue());
                    return attributeElement.text();
                }
            }
        }
        return null;
    }
}

