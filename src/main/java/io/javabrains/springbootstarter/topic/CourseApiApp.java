package io.javabrains.springbootstarter.topic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class CourseApiApp {
    public static void main(String[] args){
        SpringApplication.run(CourseApiApp.class,args);

    }
}
