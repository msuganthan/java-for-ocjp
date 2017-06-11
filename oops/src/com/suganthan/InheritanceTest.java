package com.suganthan;

/**
 * Created by msuganthan on 10/6/17.
 */
public class InheritanceTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.personMethod();
        person = new Employee();
        person.personMethod();
        //person.employeeMethod();//this is not possible
        Employee employee = new Employee();
        //employee = new Person(); this is not allowed
    }
}

class Person {
    void personMethod() {
        System.out.println("Parent class person method");
    }
}

class Employee extends Person{
    void personMethod() {
        System.out.println("Child class person method");
    }
    void employeeMethod() {
        System.out.println("Child class employee method");
    }
}