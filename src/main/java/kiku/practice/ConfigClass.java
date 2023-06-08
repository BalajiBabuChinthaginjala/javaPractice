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
    String numberOfFirstWords;
    @XmlAttribute(name = "numOfLastWords")
    String numberOfLastWords;
    @XmlAttribute(name = "type")
    String type;

    @XmlElement(name = "Summarize")
    SummarizeClass summarize;


    public ConfigClass() {
    }

    public ConfigClass(String wordDirection, String numberOfWords, String numberOfLastWords, String firstLetterOnly, String incrementalPositions, SummarizeClass summarize) {
        this.wordDirection = wordDirection;
        this.numberOfFirstWords = numberOfWords;
        this.numberOfLastWords = numberOfLastWords;
        this.summarize = summarize;
    }

    public String getWordDirection() {
        return wordDirection;
    }

    public void setWordDirection(String wordDirection) {
        this.wordDirection = wordDirection;
    }

    public String getNumberOfFirstWords() {
        return numberOfFirstWords;
    }

    public void setNumberOfFirstWords(String numberOfFirstWords) {
        this.numberOfFirstWords = numberOfFirstWords;
    }

    public String getNumberOfLastWords() {
        return numberOfLastWords;
    }

    public void setNumberOfLastWords(String numberOfLastWords) {
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