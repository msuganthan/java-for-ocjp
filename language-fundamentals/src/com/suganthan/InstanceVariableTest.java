package com.suganthan;

/**
 * Created by msuganthan on 24/6/17.
 */
public class InstanceVariableTest {
    int x = 0;
    public static void main(String[] args) {
        /*System.out.println(x);*///Not possible
    }

    public void instanceMethod() {
        System.out.println(x);//possible
    }
 }
