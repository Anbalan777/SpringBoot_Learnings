package org.example;

public class Teacher {
    String name;
    String dept;
    int age;
    private Pen pen;

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setname called...");
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setAge called...");
        this.age = age;
    }
    public void papperCorrection()
    {
        pen.write();
    }

}
