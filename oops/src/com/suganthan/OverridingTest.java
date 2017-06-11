package com.suganthan;

/**
 * Created by msuganthan on 11/6/17.
 */
public class OverridingTest {
    public static void main(String[] args) {
        Person1 person1 = new Employee1();
        person1.m1(); //employee method
    }
}

class Person1 {
    Object m1() {
        System.out.println("Person method");
        return null;
    }
}

class Employee1 extends Person1 {
    @Override
    String m1() {
        System.out.println("Employee method");
        return null;
    }
}

