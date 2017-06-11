package com.suganthan;

/**
 * Created by msuganthan on 11/6/17.
 */
public class OverridingTest1 {
}

class Person2 {
    final Object m1() {
        System.out.println("Person method");
        return null;
    }
}

class Employee2 extends Person2 {
    /*@Override
    Object m1() {
        System.out.println("Employee method");
        return null;
    }*/ //not allowed
}