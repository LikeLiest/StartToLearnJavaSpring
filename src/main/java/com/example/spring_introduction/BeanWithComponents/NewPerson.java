//package com.example.spring_introduction.BeanWithComponents;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
//
//import static java.lang.System.*;
//
//@Component("newMyPerson")
//public class NewPerson {
//    final private Cat cat;
//    final private Dog dog;
//
//    @Autowired
//    public NewPerson(@Qualifier("myCatty") final Cat cat,
//                     @Qualifier("myDoggie") final Dog dog) {
//        this.cat = cat;
//        this.dog = dog;
//    }
//
//    protected void callYourPet() {
//        out.println("Hello, my pet");
//        cat.say();
//        dog.say();
//    }
//}
