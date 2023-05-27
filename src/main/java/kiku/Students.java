package kiku;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "Students")
public class Students {
    int average;


    private List<Student> students = new ArrayList<>();


    public Students() {
    }

    @XmlElement(name = "Student")
    public List<Student> getStudents() {
        return students;
    }


    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public int studentsAverage(int sub) {
        int total = 0;
        for (int i = 0; i < getStudents().size(); i++) {
            int marks = students.get(i).getMarks(sub);
            total += marks;
        }
        return total / students.size();
    }
}
