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
    boolean FirstLetterOnly;
    @XmlElement(name = "IncrementalPositions")
    int IncrementalPositions;

    public boolean getFirstLetterOnly() {
        return FirstLetterOnly;
    }

    public void setFirstLetterOnly(boolean firstLetterOnly) {
        FirstLetterOnly = firstLetterOnly;
    }

    public int getIncrementalPositions() {
        return IncrementalPositions;
    }

    public void setIncrementalPositions(int incrementalPositions) {
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