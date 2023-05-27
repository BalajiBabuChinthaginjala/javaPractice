package org.example;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
@XmlRootElement
public class Questions {
    private List<Question> question;

    public Questions() {
    }

    public Questions(List<Question> question) {
        this.question = question;
    }

    public List<Question> getQuestion() {
        return question;
    }

    public void setQuestion(List<Question> question) {
        this.question = question;
    }
}
