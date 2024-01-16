package com.example.spring_introduction.Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "applicationsContextForAnnotations.xml");

        Cat myCat = context.getBean("cat", Cat.class);

        dog myDog = context.getBean("dog", dog.class);

        myCat.say();
        myDog.say();

        context.close();
    }
}
