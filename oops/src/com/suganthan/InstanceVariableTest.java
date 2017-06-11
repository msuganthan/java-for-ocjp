package com.suganthan;

/**
 * Created by msuganthan on 10/6/17.
 */
public class InstanceVariableTest {

    int i = 20;
    {
        m1();
        System.out.println("First Instance block");
    }

    InstanceVariableTest() {
        System.out.println("Constructor execution");
    }
    public static void main(String[] args) {
        System.out.println("Main method");
        new InstanceVariableTest();
    }

    public void m1() {
        System.out.println("from method m1 "+ j);
    }
    {
        System.out.println("Second instance block");
    }
    int j = 10;
}
