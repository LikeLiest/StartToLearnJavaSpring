package com.example.spring_introduction.LearnReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
//        Это процесс исследования данных о программе во время ее выполнения
//        Class class
//        Примитивные типы классы это объекты Class'а


        try {
//            Class myEmployee = Class.forName("com.example.spring_introduction.LearnReflection.MyEmployee");
//
//            Field field = myEmployee.getField("id");
//            out.println("Type of id field = " + field.getType());
//
//            out.println("------------------------------------------------------------------------------------------");
//
//            Field[] fields = myEmployee.getFields();
//            for(Field testField : fields){
//                out.println("Type of " + testField.getName() + " = " + testField.getType());
//            }
//
//            out.println("------------------------------------------------------------------------------------------");
//
//            Field[] allFields = myEmployee.getDeclaredFields();
//
//            for (Field testField : allFields) {
//                out.println("Type of " + testField.getName() + " = " + testField.getType());
//            }
//
//            out.println("------------------------------------------------------------------------------------------");
//
//            Method method = myEmployee.getMethod("increaseSalary");
//            out.println("Return type of method increaseSalary = " +
//                    method.getReturnType() + " , parameter types = " +
//                    Arrays.toString(method.getParameterTypes()));
//
//            out.println("------------------------------------------------------------------------------------------");
//
//            Method method1 = myEmployee.getMethod("setSalary", double.class);
//            out.println("Return type of method increaseSalary = " +
//                    method1.getReturnType() + " , parameter types = " +
//                    Arrays.toString(method1.getParameterTypes()));
//
//            out.println("------------------------------------------------------------------------------------------");
//
//            Method[] allMethods = myEmployee.getDeclaredMethods();
//            for (Method testMethod : allMethods) {
//                out.println("Name of method = " + testMethod.getName() + ", "
//                        + "Return type = " + testMethod.getReturnType()
//                        + " , parameter types = " + Arrays.toString(testMethod.getParameterTypes()));
//            }
//
//
//            out.println("------------------------------------------------------------------------------------------");
//
//            Method[] allMethods2 = myEmployee.getDeclaredMethods();
//            for (Method testMethod : allMethods2) {
//                if (Modifier.isPrivate(method.getModifiers())) {
//                    out.println("Name of method = " + testMethod.getName() + ", "
//                            + "Return type = " + testMethod.getReturnType()
//                            + " , parameter types = " + Arrays.toString(testMethod.getParameterTypes()));
//                }
//            }
//
//            out.println("------------------------------------------------------------------------------------------");
//            Constructor constructor1 = myEmployee.getConstructor();
//            out.println("Constructor has " + constructor1.getParameterCount() +
//                    " parameters, their types are: " + Arrays.toString(constructor1.getParameterTypes())
//
//            );
//
//            Constructor constructor2 = myEmployee.getConstructor(int.class,String.class,String.class);
//            out.println("Constructor has " + constructor2.getParameterCount() +
//                    " parameters, their types are: " + Arrays.toString(constructor2.getParameterTypes())
//            );
//
//            out.println("------------------------------------------------------------------------------------------");
//
//            Constructor[] constructors = myEmployee.getConstructors();
//            for (Constructor constructor : constructors) {
//                out.println(
//                        "Constructor " + constructor.getName() + " has " + constructor.getParameterCount() +
//                        " parameters, their types are: " + Arrays.toString(constructor.getParameterTypes())
//                );
//            }

            out.println("------------------------------------------------------------------------------------------");

            MyEmployee myEmployee1 = new MyEmployee(10,"Ivan","IT");

            Field field1 = myEmployee1.getClass().getDeclaredField("salary");
            field1.setAccessible(true);

            double salaryValue = (double) field1.get(myEmployee1);
            out.println(salaryValue);

            field1.set(myEmployee1, 200.000);
            out.println(myEmployee1);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
