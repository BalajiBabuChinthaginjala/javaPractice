package kiku.practice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class SummarizeClass {
    @XmlAttribute
    String summarize;
    @XmlElement(name = "FirstLetterOnly")
    String FirstLetterOnly;
    @XmlElement(name = "IncrementalPositions")
    String IncrementalPositions;

    public String getFirstLetterOnly() {
        return FirstLetterOnly;
    }

    public void setFirstLetterOnly(String firstLetterOnly) {
        FirstLetterOnly = firstLetterOnly;
    }

    public String getIncrementalPositions() {
        return IncrementalPositions;
    }

    public void setIncrementalPositions(String incrementalPositions) {
        IncrementalPositions = incrementalPositions;
    }

    public SummarizeClass(String summarize) {
        this.summarize = summarize;
    }

    public SummarizeClass() {
    }

    public String getSummarize() {
        return summarize;
    }

    public void setSummarize(String summarize) {
        this.summarize = summarize;
    }
}