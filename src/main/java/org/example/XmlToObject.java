package org.example;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;


public class XmlToObject {
    public static void main(String[] args) {

        try {

            File file = new File("C:\\Users\\Admin\\IdeaProjects\\xmlParser\\src\\main\\java\\org\\example\\input.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Questions.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Questions que = (Questions) jaxbUnmarshaller.unmarshal(file);

            System.out.println(que.getQuestion());
            System.out.println("Questions:");
            List<Question> list = que.getQuestion();
            for (Question question : list) {
                System.out.println(question.getId() + " " + question.getQuestionname());
            for(Answer ans:question.getAnswers()){
                System.out.println(ans.getAnswername()+"  " +
                        ""+ans.getSub());
            }
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}

