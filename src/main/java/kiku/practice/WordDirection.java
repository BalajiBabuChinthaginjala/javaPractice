package kiku.practice;

import com.google.gson.Gson;
import net.sourceforge.tess4j.Word;
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
        WordDirection wordDirection = new WordDirection();
        System.out.println(wordDirection.storingData("C:\\Users\\Admin\\AppData\\Roaming\\JetBrains\\IdeaIC2023.1\\scratches\\scratch_5.xml"));
        wordDirection.convertingToJson("C:\\Users\\Admin\\AppData\\Roaming\\JetBrains\\IdeaIC2023.1\\scratches\\scratch_5.xml");
    }

    public void convertingToJson(String xmlFileName) throws TikaException, IOException, SAXException {

        XmlToJava xmlToJava = new XmlToJava();
        CustomConfigClass customConfigClass = new CustomConfigClass();
        CustomConfigClass customConfigClass1 = (CustomConfigClass) xmlToJava.xmlToJava(xmlFileName, customConfigClass.getClass());
        JavaToJson javaToJson = new JavaToJson();
        String fileName = customConfigClass1.getConfig().getFileName();
        ReadingData readingData = new ReadingData();
        String requiredData = readingData.readingData(fileName);
        if (Objects.equals("forward", customConfigClass1.getConfig().getWordDirection())) {
            javaToJson.setWordDirection("Forward Direction --->" + forwardDirection(requiredData) + "\n");
            javaToJson.setNumOfFirstWords("Number of First Words --->" + numberOfFirstWords(customConfigClass1.getConfig().getNumberOfFirstWords(), requiredData) + "\n");
            javaToJson.setNumOfLastWords("Number of Last Words --->" + numberOfLastWords(customConfigClass1.getConfig().getNumberOfLastWords(), requiredData) + "\n");
            javaToJson.setType(customConfigClass1.getConfig().getType());
            javaToJson.setPath(fileName);
            if (Objects.equals("yes", customConfigClass1.getConfig().getSummarize().getSummarize())) {
                if ( customConfigClass1.getConfig().getSummarize().getFirstLetterOnly()) {
                    javaToJson.setFirstLetterOnly("First Letter of each word --->" + firstLetterOfEachWord(requiredData) + "\n");
                }
                javaToJson.setIncrementalPositions("Incremental Position --->" + incrementalPositions(requiredData, customConfigClass1.getConfig().getSummarize().getIncrementalPositions()) + "\n");
            }
        } else if (Objects.equals("reverse", customConfigClass1.getConfig().getWordDirection())) {
            javaToJson.setWordDirection("Reverse Direction --->" + reverseCharacter(requiredData) + "\n");
            javaToJson.setNumOfFirstWords("Number of First Words --->" + numberOfFirstWords(customConfigClass1.getConfig().getNumberOfFirstWords(), requiredData) + "\n");
            javaToJson.setNumOfLastWords("Number of Last Words --->" + numberOfLastWords(customConfigClass1.getConfig().getNumberOfLastWords(), requiredData) + "\n");
            javaToJson.setType(customConfigClass1.getConfig().getType());
            javaToJson.setPath(fileName);
            if (Objects.equals("yes", customConfigClass1.getConfig().getSummarize().getSummarize())) {
                if (Objects.equals("true", customConfigClass1.getConfig().getSummarize().getFirstLetterOnly())) {
                    javaToJson.setFirstLetterOnly("First Letter of each word --->" + firstLetterOfEachWord(requiredData) + "\n");
                }
                javaToJson.setIncrementalPositions("Incremental Position --->" + incrementalPositions(requiredData, customConfigClass1.getConfig().getSummarize().getIncrementalPositions()) + "\n");
            }
        }
        System.out.println(new Gson().toJson(javaToJson));

    }

    public String storingData(String xmlFileName) throws TikaException, IOException, SAXException {
        List<String> finalData = new ArrayList<>();
        XmlToJava xmlToJava = new XmlToJava();
        CustomConfigClass customConfigClass = new CustomConfigClass();
        CustomConfigClass customConfigClass1 = (CustomConfigClass) xmlToJava.xmlToJava(xmlFileName, customConfigClass.getClass());
        String wordDirect = customConfigClass1.getConfig().getWordDirection();
        int numOfFirstWords = customConfigClass1.getConfig().getNumberOfFirstWords();
        int numOfLastWords = customConfigClass1.getConfig().getNumberOfLastWords();
        String fileName = customConfigClass1.getConfig().getFileName();
        String summarize = customConfigClass1.getConfig().getSummarize().getSummarize();
        boolean firstLetterOnly = customConfigClass1.getConfig().getSummarize().getFirstLetterOnly();
        int incrementalPositions = customConfigClass1.getConfig().getSummarize().getIncrementalPositions();
        String type = customConfigClass1.getConfig().getType();
        ReadingData readingData = new ReadingData();
        String requiredData = readingData.readingData(fileName);

        if (Objects.equals("forward", wordDirect)) {
            finalData.add("Forward Direction --->" + forwardDirection(requiredData) + "\n");
            finalData.add("Number of First Words --->" + numberOfFirstWords(numOfFirstWords, requiredData) + "\n");
            finalData.add("Number of Last Words --->" + numberOfLastWords(numOfLastWords, requiredData) + "\n");
            if (Objects.equals("yes", summarize)) {
                if (Objects.equals("true", firstLetterOnly)) {
                    finalData.add("First Letter of each word --->" + firstLetterOfEachWord(requiredData) + "\n");
                }
                finalData.add("Incremental Position --->" + incrementalPositions(requiredData, incrementalPositions) + "\n");
            }
        } else if (Objects.equals("reverse", wordDirect) && (Objects.equals("char", type))) {
            finalData.add("Only Characters were reversed --->" + reverseCharacter(requiredData) + "\n");
            finalData.add("Number of First Words --->" + numberOfFirstWords(numOfFirstWords, requiredData) + "\n");
            finalData.add("Number of Last Words --->" + numberOfLastWords(numOfLastWords, requiredData) + "\n");
            if (Objects.equals("yes", summarize)) {
                if (Objects.equals("true", firstLetterOnly)) {
                    finalData.add("First Letter of each word --->" + firstLetterOfEachWord(requiredData) + "\n");
                }
                finalData.add("Incremental Position --->" + incrementalPositions(requiredData, incrementalPositions) + "\n");
            }
        }
        IOUtils.write(finalData.toString(), new FileOutputStream("E:\\Practice\\prashant.txt"));
        return finalData.toString();

    }

    public String forwardDirection(String data) {
        String nWords = "";
        String[] listOfWords = data.split("\\s+");
        for (int i = 0; i < listOfWords.length; i++) {
            nWords += " " + listOfWords[i];
        }
        return nWords.trim();
    }

    public String numberOfFirstWords(int numberOfWords, String data) {
        String nWords = "";
        String[] listOfWords = data.split("\\s+");
        for (int i = 0; i < numberOfWords; i++) {
            nWords += " " + listOfWords[i];
        }
        return nWords.trim();
    }

    public String numberOfLastWords(int numberOfWords, String data) {
        String reversed = reverseDirection(data);
        String reversedOrder = "";
        String[] listOfLastWords = reversed.split("\\s+");
        for (int j = 0; j < numberOfWords; j++) {
            reversedOrder += " " + listOfLastWords[j];
        }
        return reversedOrder.trim();
    }


    public String reverseDirection(String data) {
        String noOfWords = forwardDirection(data);
        String fromLast = lastWords(noOfWords);
        return fromLast.trim();

    }

    public String lastWords(String last) {
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


    public String reverseWord(String s) {
        int x = s.indexOf(" ");
        if (x == -1)
            return s;
        return reverseWord(s.substring(x + 1)) + " " + s.substring(0, x);
    }

    public String reverseCharacter(String data) {
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

    public String reverseWords(String data) {
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

    public String firstLetterOfEachWord(String data) {
        String[] listOfWords = data.split("\\s+");
        String firstLetter = "";
        for (int i = 0; i < listOfWords.length; i++) {
            String nWords = listOfWords[i].trim();
            if (nWords.length() != 0) {
                char ch = nWords.charAt(0);
                firstLetter += ch + " ";
            }
        }
        return firstLetter.trim();
    }

    public String incrementalPositions(String data, int maxIncrementalPosition) {
        String[] listOfWords = (data.split("\\s+"));
        String output = "";
        int incrementPosition = 0;
        for (int i = 0; i < listOfWords.length; i++) {
            String word = listOfWords[i].trim();
            if (word.length() > incrementPosition) {
                char ch = word.charAt(incrementPosition);
                output += ch + " ";
            } else {
                char lastChar = word.charAt(word.length() - 1);
                output += lastChar + " ";
            }
            incrementPosition++;
            if (incrementPosition == maxIncrementalPosition) {
                incrementPosition = 0;
            }
        }
        return output.trim();
    }
}
