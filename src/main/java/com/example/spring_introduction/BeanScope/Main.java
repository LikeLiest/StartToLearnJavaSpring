package com.example.spring_introduction.BeanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextForBeanScope.xml");

        try {
            Dog myDog = context.getBean("myPet", Dog.class);
            myDog.setName("Belka");

            Dog yourDog = context.getBean("myPet", Dog.class);
            yourDog.setName("Strelka");


            out.println(myDog.getName());
            out.println(yourDog.getName());



            out.println(myDog.equals(yourDog));
        } catch (Exception e) {
            e.printStackTrace();
        }


        /*
            singletone - дефолтный scope.
            1) Такой бин создается сразу после прочтения Spring Container-ом конфиг файла
            2) Является общим для всех, кто запросит его у Spring Container-а
            3) Подходит для stateless объектов
            4) Оба переменные ссылаются на один объека.
            5) Singletone - может иметь только один объект у каждого класса
        */


        /*
            Prototype
            1) Такой бин создается только после обращения к Spring Container'у с помощью метода getBean
            2) Для каждого такого обращения создается новый бин в Spring Container-е
            3) Подходит для stateful объектов

         */



        /*
            "Stateful object" (объект с состоянием) - это термин, который используется в программировании
            для описания объекта, который хранит свое состояние между вызовами методов.
            В контексте объектно-ориентированных языков программирования,
            таких как Java, состояние объекта обычно определяется значениями его полей (переменных экземпляра).
        */

        context.close();
    }
}
