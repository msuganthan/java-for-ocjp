package com.suganthan;

/**
 * Created by msuganthan on 11/6/17.
 */
public class OverridingTest2 {
}

abstract class Person3 {
    abstract Object m1();
}

class Employee3 extends Person3 {
    @Override
    Object m1() {
        return null;
    }
}
