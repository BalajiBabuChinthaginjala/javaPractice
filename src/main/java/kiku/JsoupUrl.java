package kiku;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
public class JsoupUrl {
        public static void main(String[] args) throws IOException {
            String url = "https://knova.konicaminolta.com/knowledgecentral/viewdocument.do?noCount=true&externalId=PSKM_BT2310906JP&sliceId=1&cmd=&ViewedDocsListHelper=com.kanisa.apps.common.BaseViewedDocsListHelperImpl&micrositeID=";
            Document document = Jsoup.connect(url).get();
            System.out.println(document.title());
        }

}
