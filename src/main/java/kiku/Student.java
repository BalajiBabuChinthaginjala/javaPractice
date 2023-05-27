package kiku;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;


@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
    private String name;
    @XmlAttribute(name = "id")
    private int id;
    private int maths;
    private int telugu;
    private int physics;

    private int average;

    public void setAverage(int average) {
        this.average = average;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getTelugu() {
        return telugu;
    }

    public void setTelugu(int telugu) {
        this.telugu = telugu;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }
    public int getAverage(){
        return getAverage();
    }
    public int average(){
        int average=( getMaths()+getPhysics()+getTelugu())/3;
        return average;
    }
    public int getMarks(int sub){
         if(sub == 1){
             return getMaths();
         }
         if(sub==2){
             return getPhysics();
         }
         if(sub==3){
             return getTelugu();
         }
         return 0;
    }
}
