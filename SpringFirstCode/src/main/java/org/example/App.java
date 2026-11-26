package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =new ClassPathXmlApplicationContext("springconfig.xml");
        System.out.println( "Hello World!" );
//
//        Student s1=new Student();
//        Student s1;

//        s1.show();
//        Student student= context.getBean(Student.class);  // used only one object bean
//        Student student1=(Student) context.getBean("s1");

//        student.show();

            Teacher teacher=context.getBean(Teacher.class,"t1");

        teacher.papperCorrection();
//        context.getBean("p1");


    }
}
