package com.example.spring_introduction.Autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "applicationContextForAutowired.xml");

        try {
            Person person = context.getBean("personBean",Person.class);
            person.callYourPet();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        Cat myCat = context.getBean("catBean", Cat.class);
//        myCat.say();



        context.close();
    }
}
