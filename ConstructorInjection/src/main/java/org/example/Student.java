package org.example;

public class Student {
    private String name;
    private int age;
    private Writer writer= new Pencil();

    public Student(String name, int age, Writer writer) {
        this.name = name;
        this.age = age;
        this.writer = writer;
    }

    public void writeexam()
    {
        writer.write();
    }

}
