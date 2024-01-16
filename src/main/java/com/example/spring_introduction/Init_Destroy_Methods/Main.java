package com.example.spring_introduction.Init_Destroy_Methods;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "applicationContextFor_Init_Destroy_Methods.xml");

        Cat myCattie  = context.getBean("myPet", Cat.class);
        myCattie.say();

        out.println("----------------------------------------------------------------------------");

        Cat yourCattie = context.getBean("myPet", Cat.class);
        yourCattie.say();

// Если закомментировать этот метод, то destroy-method в .xml - не сработает
        context.close();
    }
}
