package com.example.spring_introduction.LearnReflection.Ex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static java.lang.System.*;

public class Calculator {
    void sum(int a, int b) {
        int result = a + b;
        out.println("Результат суммы: " + a + " и " + b + " = " + result);
    }

    void subraction(int a, int b) {
        int result = a - b;
        out.println("Результат разницы:  " + a + " и " + b + " = " + result);
    }

    void multiple(int a, int b) {
        int result = a * b;
        out.println("Результат умножения: " + a + " и " + b + " = " + result);
    }

    void divide(int a, int b) {
        int result = a / b;
        out.println("Результат деления:  " + a + " и " + b + " = " + result);
    }
}


class TestCalculator {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(
                new FileReader("/Users/rasimzakirov/IdeaProjects/LearnSpringAndHibernate/" +
                        "src/main/java/com/example/spring_introduction/LearnReflection/Ex/test100.txt"))) {

            String methodName = reader.readLine();
            String firstArgument = reader.readLine();
            String secondArgument = reader.readLine();


            Calculator calculator = new Calculator();
            Class cl = calculator.getClass();
            Method method = null;

            Method[] methods = cl.getDeclaredMethods();

            for(Method testMethod : methods) {
                if (testMethod.getName().equals(methodName)) {
                    method = testMethod;
                }
            }

            method.invoke(calculator,
                    Integer.parseInt(firstArgument),
                    Integer.parseInt(secondArgument)
            );

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}