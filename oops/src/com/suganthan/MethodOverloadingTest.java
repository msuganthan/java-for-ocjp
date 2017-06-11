package com.suganthan;

/**
 * Created by msuganthan on 11/6/17.
 */
public class MethodOverloadingTest {
    public static void main(String[] args) {
        OverloadingTest overloadingTest = new OverloadingTest();
        overloadingTest.m1(null);
    }
}

class OverloadingTest {
    public void m1(String str) {
        System.out.println("String method");
    }
    public void m1(Object obj) {
        System.out.println("Method method");
    }
 }
