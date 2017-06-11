package com.suganthan;

/**
 * Created by msuganthan on 11/6/17.
 */
public class OverridingScopeTest {
}

class Person5 {
    public Object m1() {
        System.out.println("Person method");
        return null;
    }
}

class Employee5 extends Person5 {
    /*@Override
    String m1() {
        System.out.println("Employee method");
        return null;
    }*/
}

