package com.example.spring_introduction.AnnotationsXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "applicationContextForAnnotationsValue.xml");

        try {
            Dog myDog = context.getBean("myNewDoggie", Dog.class);
            Dog yourDog = context.getBean("myNewDoggie", Dog.class);


            out.println(myDog.equals(yourDog));
            context.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
