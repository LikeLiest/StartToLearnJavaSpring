package com.example.spring_introduction.Autowired.AutowiredOther;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "ApplicationContextsForAutowired/applicationContextForAutowired.xml");

        try {
            Person person = context.getBean("personBean",Person.class);
            person.callYourPet();
        } catch (Exception e) {
            e.printStackTrace();
        }



        context.close();
    }
}
