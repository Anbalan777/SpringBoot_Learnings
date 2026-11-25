package org.example;

public class Teacher {
    String name;
    String dept;
    int age;
    private Writer writer;

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public void papperCorrection()
    {
        writer.write();
    }

}
