package com.suganthan;

/**
 * Created by msuganthan on 11/6/17.
 */
public class MethodOverloadingTest1 {
    public static void main(String[] args) {
        new MethodOverloadingTest1().m1(1); //auto-promotion without m1 int
    }

    public void m1(int i) {
        System.out.println("Method m1 int"+i);
    }

    public void m1(double l) {
        System.out.println("Method m1: "+ l);
    }
}
