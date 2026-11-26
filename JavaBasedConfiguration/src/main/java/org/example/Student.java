package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("Raja")
    private String name;
    private int rollno;

    @Autowired

    @Qualifier("pen") // Qualifier higher priority  than primary
    private Writer writer;

    public  Student()
    {
        System.out.println("Student class Constructor");
    }
    public void show()
    {
        System.out.println("In Student Method");
    }




    public void  writeexam()
    {
        writer.write();

        System.out.println(this.name);
        System.out.println(this.rollno);
    }
    //----------------------------------------------------------------------------------------------

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

//    @Autowired
//    public void setWriter( Writer writer) {
//        this.writer = writer;
//    }

    public Student(String name, int rollno,@Qualifier("Pen") Writer writer) {
        this.name = name;
        this.rollno = rollno;
        this.writer = writer;

    }
}
