package com.suganthan;

/**
 * Created by msuganthan on 11/6/17.
 */
public class OverridingTest3 {
}

class Person4 {
    Object m1() {
        return null;
    }

    void m2() {

    }
}

abstract class Employee4 extends Person4 {
    @Override
    abstract String m1();

    @Override
    final void m2() {

    }
}
