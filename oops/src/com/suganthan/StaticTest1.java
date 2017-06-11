package com.suganthan;

/**
 * Created by msuganthan on 10/6/17.
 */
public class StaticTest1 {

    static int i = 10;
    static {
        m1();
        System.out.println("Inside static block read - direct"+i); //direct read
    }
    public static void m1() {
        System.out.println("Inside static method read - indirect"+i); //indirect read
    }

    public static void main(String[] agrs) {

    }
}
