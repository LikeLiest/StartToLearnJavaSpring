package com.example.spring_introduction.AnnotationsValue;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextForAnnotationsValue.xml");

       try {
           Person person = context.getBean("personBean", Person.class);
           person.callYourPet();


           out.println(person.getAge());
           out.println(person.getSurname());

           context.close();
       } catch (Exception e) {
           e.printStackTrace();
       }



    }
}
