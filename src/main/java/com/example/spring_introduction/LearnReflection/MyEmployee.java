package com.example.spring_introduction.LearnReflection;

import static java.lang.System.*;

public class MyEmployee {
    public int id;
    public String name;
    public String department;

    private double salary = 100.000;

    public MyEmployee() {
    }

    public MyEmployee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public MyEmployee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    private void changeDepartment(String newDepartment) {
        this.department = newDepartment;
        out.println("New Department is set");
    }

    @Override
    public String toString() {
        return "MyEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

//    public void increaseSalary() {
//        salary *= 2;
//    }
}
