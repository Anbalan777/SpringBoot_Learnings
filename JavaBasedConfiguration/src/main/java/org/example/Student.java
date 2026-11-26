package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Student {
    private String name;
    private int rollno;


    private Writer writer;

    public  Student()
    {
        System.out.println("Student class Constructor");
    }
    public void show()
    {
        System.out.println("In Student Method");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }
    public void  writeexam()
    {
        writer.write();
    }
}
