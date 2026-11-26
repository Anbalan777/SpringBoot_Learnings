package org.example.config;


import org.example.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
public class MyConfiguration {

//    @Bean(name="s1")
    @Bean
    @Scope("prototype")// Multiple object creation using the getbean method
//    @Scope("singleton")// single object creation using the getbean method
    public Student student( @Qualifier("pencil") Writer writer)
    {
        Student st=new Student();
        st.setName("Karan");
        st.setRollno(777);
        st.setWriter(writer);
        return st;
    }
    @Bean
    public Pen pen()
    {
        return new Pen();
    }
       @Bean
       @Primary
    public Pencil pencil()
    {
        return new Pencil();
    }
       @Bean
    public Sketch sketch()
    {
        return new Sketch();
    }

}
