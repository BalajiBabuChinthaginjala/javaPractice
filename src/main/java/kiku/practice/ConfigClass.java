package kiku.practice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigClass {
    @XmlAttribute
    String wordDirection;


    @XmlAttribute(name = "numOfFirstWords")
    int numberOfFirstWords;
    @XmlAttribute(name = "numOfLastWords")
    int numberOfLastWords;
    @XmlAttribute(name = "type")
    String type;


    @XmlAttribute(name = "path")
    String fileName;

    @XmlElement(name = "Summarize")
    SummarizeClass summarize;


    public ConfigClass() {
    }

    public ConfigClass(String wordDirection, int numberOfWords, int numberOfLastWords, int firstLetterOnly, int incrementalPositions, SummarizeClass summarize) {
        this.wordDirection = wordDirection;
        this.numberOfFirstWords = numberOfWords;
        this.numberOfLastWords = numberOfLastWords;
        this.summarize = summarize;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getWordDirection() {
        return wordDirection;
    }

    public void setWordDirection(String wordDirection) {
        this.wordDirection = wordDirection;
    }

    public int getNumberOfFirstWords() {
        return numberOfFirstWords;
    }

    public void setNumberOfFirstWords(int numberOfFirstWords) {
        this.numberOfFirstWords = numberOfFirstWords;
    }

    public int getNumberOfLastWords() {
        return numberOfLastWords;
    }

    public void setNumberOfLastWords(int numberOfLastWords) {
        this.numberOfLastWords = numberOfLastWords;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public SummarizeClass getSummarize() {
        return summarize;
    }

    public void setSummarize(SummarizeClass summarize) {
        this.summarize = summarize;
    }
}