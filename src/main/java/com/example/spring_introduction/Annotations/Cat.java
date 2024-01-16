package com.example.spring_introduction.Annotations;

import com.example.spring_introduction.Bean.Pet;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static java.lang.System.*;

@Component
@Scope("prototype")
public class Cat implements Pet {
    public Cat() {
        out.println("Cat bean is created");
    }

    @Override
    public void say() {
        out.println("Meow-meow");
    }
}


 /*
    Если к аннотации @Component не прописать bean id,
    то бину будет назначен дефолтный id.
    Дефолтный bean id получается из имени класса,
    заменяя его первую заглавную букву на прописную


    @Component(catBean) -> catBean
    class Cat {}


    @Component -> cat
    class Cat {}
*/
