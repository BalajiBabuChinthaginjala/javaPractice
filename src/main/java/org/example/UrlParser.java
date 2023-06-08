package org.example;

import java.net.*;
import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class UrlParser {
    public static void main(String[] args) throws Exception {

        URL aURL = new URL("https://knova.konicaminolta.com/knowledgecentral/viewdocument.do?noCount=true&externalId=PSKM_BT2310906JP&sliceId=1&cmd=&ViewedDocsListHelper=com.kanisa.apps.common.BaseViewedDocsListHelperImpl&micrositeID=");
        URL bURL = new URL("https://knova.konicaminolta.com/knowledgecentral/DocViewWindow.html#!docviewwidget;documentId=PSKM_BT2312220JP;widgetId=PreviewPane;fullscreen=false;popup=fals");
        URL cURL = new URL("https://knova.konicaminolta.com/knowledgecentral/externalviewdocument.do?externalId=PSKM_BT2311503JP");
        System.out.println(aURL.getQuery());
        System.out.println(bURL.getQuery());
        System.out.println(bURL.getRef());
        System.out.println(splitQuery(aURL));
        System.out.println(splitQuery(bURL));
        System.out.println(splitQuery(cURL));

    }

    public static String splitQuery(URL url) throws UnsupportedEncodingException {
        Map<String, String> query_pairs = new LinkedHashMap<String, String>();
        String id = null;
        if (url.getQuery() != null) {
            String query = url.getQuery();
            String[] pairs = query.split("&");
            for (String pair : pairs) {
                int idx = pair.indexOf("=");
                query_pairs.put(URLDecoder.decode(pair.substring(0, idx), "UTF-8"), URLDecoder.decode(pair.substring(idx + 1), "UTF-8"));
            }
        } else {
            String ref = url.getRef();
            String[] pairs = ref.split(";");
            for (String pair : pairs) {
                int idx = pair.indexOf("=");
                if (pair.contains("documentId")) {
                    query_pairs.put(URLDecoder.decode(pair.substring(0, idx), "UTF-8"), URLDecoder.decode(pair.substring(idx + 1), "UTF-8"));
                }
            }
        }
        if (query_pairs.containsKey("externalId")) {
            id = query_pairs.get("externalId");
        } else {
            id = query_pairs.get("documentId");
        }
        return id;
    }

}
