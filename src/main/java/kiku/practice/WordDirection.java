package kiku.practice;

import org.apache.commons.io.IOUtils;
import org.apache.tika.exception.TikaException;
import org.xml.sax.SAXException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class WordDirection {


    public static void main(String[] args) throws TikaException, IOException, SAXException {
        storingData();
    }

    public static void storingData() throws TikaException, IOException, SAXException {
        List<String> finalData = new ArrayList<>();
        ReadingData readingData = new ReadingData();
        String requiredData = readingData.readingData("D:\\KSM_DATA\\KSM_ALL_FILE_TYPES\\KSM_ALL_FILE_TYPES\\KSM_All_file_Types\\rodINC000000056012.html");
        XmlToJava xmlToJava = new XmlToJava();
        CustomConfigClass customConfigClass = new CustomConfigClass();
        CustomConfigClass customConfigClass1 = (CustomConfigClass) xmlToJava.xmlToJava("C:\\Users\\Admin\\AppData\\Roaming\\JetBrains\\IdeaIC2023.1\\scratches\\scratch_5.xml", customConfigClass.getClass());
        String wordDirect = customConfigClass1.getConfig().getWordDirection();
        String numOfFirstWords = customConfigClass1.getConfig().getNumberOfFirstWords();
        String numOfLastWords = customConfigClass1.getConfig().getNumberOfLastWords();
        String summarize = customConfigClass1.getConfig().getSummarize().getSummarize();
        String firstLetterOnly = customConfigClass1.getConfig().getSummarize().getFirstLetterOnly();
        String incrementalPositions = customConfigClass1.getConfig().getSummarize().getIncrementalPositions();
        String type = customConfigClass1.getConfig().getType();
        if (Objects.equals("forward", wordDirect)) {
            finalData.add("Forward Direction --->" + forwardDirection(requiredData) + "\n");
            finalData.add("Number of First Words --->" + numberOfFirstWords(Integer.parseInt(numOfFirstWords), requiredData) + "\n");
            finalData.add("Number of Last Words --->" + numberOfLastWords(Integer.parseInt(numOfLastWords), requiredData) + "\n");
            if (Objects.equals("yes", summarize)) {
                if (Objects.equals("true", firstLetterOnly)) {
                    finalData.add("First Letter of each word --->" + firstLetterOfEachWord(requiredData) + "\n");
                }
                finalData.add("Incremental Position --->" + incrementalPositions(requiredData, Integer.parseInt(incrementalPositions)) + "\n");
            }
        } else if (Objects.equals("reverse", wordDirect) && (Objects.equals("char", type))) {
            finalData.add("Only Characters were reversed --->" + reverseCharacter(requiredData) + "\n");
            finalData.add("Number of First Words --->" + numberOfFirstWords(Integer.parseInt(numOfFirstWords), requiredData) + "\n");
            finalData.add("Number of Last Words --->" + numberOfLastWords(Integer.parseInt(numOfLastWords), requiredData) + "\n");
//            if (Objects.equals("char", type)) {
//                finalData.add("Only Characters were reversed --->" + reverseCharacter(requiredData) + "\n");
//            }
//            else if (Objects.equals("word", type)) {
//                finalData.add("Only Characters were reversed --->" + reverseWords(requiredData) + "\n");
//            }
            if (Objects.equals("yes", summarize)) {
                if (Objects.equals("true", firstLetterOnly)) {
                    finalData.add("First Letter of each word --->" + firstLetterOfEachWord(requiredData) + "\n");
                }
                finalData.add("Incremental Position --->" + incrementalPositions(requiredData, Integer.parseInt(incrementalPositions)) + "\n");
            }
        }
        IOUtils.write(finalData.toString(), new FileOutputStream("E:\\Practice\\prashant.txt"));
    }


    public static String forwardDirection(String data) {
        String nWords = "";
        String[] listOfWords = data.split("\\s+");
        for (int i = 0; i < listOfWords.length; i++) {
            nWords += " " + listOfWords[i];
        }
        return nWords.trim();
    }

    public static String numberOfFirstWords(int numberOfWords, String data) {
        String nWords = "";
        String[] listOfWords = data.split("\\s+");
        for (int i = 0; i < numberOfWords; i++) {
            nWords += " " + listOfWords[i];
        }
        return nWords.trim();
    }

    public static String numberOfLastWords(int numberOfWords, String data) {
        String reversed = reverseDirection(data);
        String reversedOrder = "";
        String[] listOfLastWords = reversed.split("\\s+");
        for (int j = 0; j < numberOfWords; j++) {
            reversedOrder += " " + listOfLastWords[j];
        }
        return reversedOrder;
    }


    public static String reverseDirection(String data) {
        String noOfWords = forwardDirection(data);
        String fromLast = lastWords(noOfWords);
        return fromLast;

    }

    public static String lastWords(String last) {
        int x = last.indexOf(" ");
        if (x == -1)
            return last;
        String reversedOrder = "";
        String reversed = reverseWord(last.substring(x + 1)) + " " + last.substring(0, x);
        String[] listOf = reversed.split("\\s+");
        for (int i = 0; i < listOf.length; i++) {
            reversedOrder += " " + listOf[i];
        }
        return reversedOrder;
    }


    public static String reverseWord(String s) {
        int x = s.indexOf(" ");
        if (x == -1)
            return s;
        return reverseWord(s.substring(x + 1)) + " " + s.substring(0, x);
    }

    public static String reverseCharacter(String data) {
        String nWords = forwardDirection(data);
        String words[] = nWords.split("\\s");
        String reverseWord1 = "";
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord1 += sb + " ";
        }
        String rev = reverseWord(reverseWord1);
        return rev.trim();
    }

    public static String reverseWords(String data) {
        String reversedOrder = reverseDirection(data);
        String words[] = reversedOrder.split("\\s");
        String reverseWord1 = "";
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord1 += sb + " ";
        }
        String rev = reverseWord(reverseWord1);
        return rev.trim();
    }

    public static String firstLetterOfEachWord(String data) {
        String[] listOfWords = data.split("\\s+");
        String firstLetter = "";
        for (int i = 0; i < listOfWords.length; i++) {
            String nWords = listOfWords[i].trim();
            if (nWords.length() != 0) {
                char ch = nWords.charAt(0);
                firstLetter += ch + " ";
            }
        }
        return firstLetter;
    }

    public static String incrementalPositions(String data, int incrementNumber) {
        String[] listOfWords = data.split("\\s+");
        String output = "";
        int j = 0;
        for (int i = 1; i < listOfWords.length; i++) {
            String nWords = listOfWords[i].trim();
            if (nWords.length() > j) {
                char ch = nWords.charAt(j);
                output += ch + " ";
                j++;
            } else {
                char lastChar = nWords.charAt(nWords.length() - 1);
                output += lastChar + " ";
                j++;
            }
            if (j == incrementNumber) {
                j = 0;
            }
        }
        return output;
    }
}
