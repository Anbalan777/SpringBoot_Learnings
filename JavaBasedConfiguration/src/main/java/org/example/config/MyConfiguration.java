package org.example.config;


import org.example.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
public class MyConfiguration {

//    @Bean(name="s1")
    @Bean
    @Scope("prototype")
    public Student student()
    {
        return new Student();
    }
}
