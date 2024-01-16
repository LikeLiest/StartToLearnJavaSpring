package com.example.spring_introduction.BeanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextForBeanScope.xml");

        try {
            Dog myDog = context.getBean("myPet", Dog.class);
            Dog yourDog = context.getBean("myPet", Dog.class);

            out.println(myDog == yourDog);
        } catch (Exception e) {
            e.printStackTrace();
        }





        /*
            singletone - дефолтный scope.
            1) Такой бин создатеся сразу после прочтения Spring Container-ом конфиг файла
            2) Является общим для всех, кто запросит его у Spring Container-а
            3) Подходит для stateless объектов
        */

        context.close();
    }
}
