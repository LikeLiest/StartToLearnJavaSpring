package com.example.spring_introduction.Bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
//      Никогда не удаляй com.example ...

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        Pet pet = context.getBean("myPet", Pet.class);
//        pet.say();

// ------------------------------------------------------------------------------------------------------------------------
//        Если без спринга
/*        Pet pet = new Dog();
        Person person = new Person(pet);

        person.callYourPet();
*/

//        Со спрингом

/*      DI делает объекты нашего приложения слабо зависимыми друг от друга

        Способы внедрения зависимостей:
        * С помощью конструктора
        * С помощью сеттеров
        * Autowiring - ?
*/

        Person person = context.getBean("myPerson",Person.class);

        person.callYourPet();
        out.println(person.getSurname());
        out.println(person.getAge());



        context.close();
    }
}

