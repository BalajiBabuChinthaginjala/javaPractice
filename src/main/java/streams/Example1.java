package streams;

import kiku.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student("Balaji", 1, 68, 55, 40);
        Student student2 = new Student("Prasanth", 2, 77, 70, 30);
        Student student3 = new Student("Goutham", 3, 90, 80, 60);
        Student student4 = new Student("Goutham", 3, 90, 80, 60);
        List<String> names=new ArrayList<>();
        names.add("balaji");
        names.add("goutham");
        names.add("prasanth");
        names.add("raj kumar");
        names.add("rakesh");
        names.add("dasaradh");

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        System.out.println(studentList.stream().count());
        studentList.stream().forEach(s -> System.out.println(s));
        System.out.println("------------------------------------");
        studentList.stream().limit(1).forEach(student -> System.out.println(student));
        System.out.println("--------------------------");
        studentList.stream().filter(s -> s.getTelugu() > 75).forEach(student -> System.out.println(student));
        System.out.println("--------------------------");
        System.out.println(studentList.stream().filter(student -> student.getMaths() > 70).count());
        System.out.println("--------------------------");
        studentList.stream().filter(student -> student.getMaths() > 70).limit(1).forEach(student -> System.out.println(student));
        System.out.println("--------------------------");
        List<Student> graterThan70Marks = studentList.stream().filter(student -> student.getMaths() > 70).collect(Collectors.toList());
        System.out.println(graterThan70Marks);
        List<Student> s = studentList.stream().collect(Collectors.toList());
        System.out.println(s);
        List<Student> s1 = studentList.stream().sorted(Comparator.comparingInt(Student::getMaths).reversed()).collect(Collectors.toList());
        s1.forEach(student -> System.out.println(student));
        System.out.println("-----------------------");
        studentList.stream().sorted(Comparator.comparingInt(Student::getPhysics)).forEach(student -> System.out.println(student));
        System.out.println("----------------------");
        Set<Student> studentset = studentList.stream().collect(Collectors.toSet());
        studentset.forEach(student -> System.out.println(student));
        studentList.stream().forEach(student -> System.out.println(student));

        System.out.println(names.stream().count());
        names.stream().sorted(Comparator.reverseOrder()).forEach(name->System.out.println(name));
        List<String> namesReversOrder = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        namesReversOrder.stream().forEach(name -> System.out.println(name));
        names.stream().forEach(name -> System.out.println(name));

    }

}
