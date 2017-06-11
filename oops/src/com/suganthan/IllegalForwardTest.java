package com.suganthan;

/**
 * Created by msuganthan on 10/6/17.
 */
public class IllegalForwardTest {
    static {
        m1();
        //System.out.println("Inside static block: "+ j); //illegal forward
    }

    public static void m1() {
        System.out.println("Inside static block: "+ j);
    }

    static int j = 10;

    public static void main(String[] agrs) {

    }
}
