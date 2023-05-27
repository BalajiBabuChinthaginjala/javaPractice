package kiku;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ConvertingIntoXml {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        JAXBContext jaxbContext = JAXBContext.newInstance(Students.class);
        Marshaller marshallerObj = jaxbContext.createMarshaller();
        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        Students students = new Students();
        Student student;
        do {
            student = getStudent(sc);
            if (student != null) {
                students.getStudents().add(student);
            }
        } while (student != null);
        System.out.println("enter sub :1.maths,2.telugu,3.physics");
        int sub=sc.nextInt();
        students.setAverage(students.studentsAverage(sub));
        marshallerObj.marshal(students, new FileOutputStream("D:\\Test\\XalanTest\\student.xml"));
    }

    private static Student getStudent(Scanner sc) {
        Student student = new Student();
        System.out.println("enter student Id(enter -1 to stop)");
        student.setId(sc.nextInt());
        if (student.getId() <= 0) return null;
        System.out.println("enter student Name");
        student.setName(sc.next());
        System.out.println("enter student math Score");
        student.setMaths(sc.nextInt());
        System.out.println("enter student physics Score");
        student.setPhysics(sc.nextInt());
        System.out.println("enter student Telugu Score");
        student.setTelugu(sc.nextInt());
        student.setAverage(student.average());
        return student;
    }
}

