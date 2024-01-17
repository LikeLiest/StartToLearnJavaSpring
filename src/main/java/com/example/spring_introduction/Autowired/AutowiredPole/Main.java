package com.example.spring_introduction.Autowired.AutowiredPole;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "ApplicationContextsForAutowired/applicationContextForAutowiredForPole.xml");

        try {
            PersonPole person = context.getBean("personBeanPole", PersonPole.class);
            person.callYourPet();
        } catch (Exception e) {
            e.printStackTrace();
        }


        context.close();
    }
}
