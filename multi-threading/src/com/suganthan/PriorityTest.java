package com.suganthan;

/**
 * Created by msuganthan on 17/6/17.
 */
public class PriorityTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        //Thread.currentThread().setPriority(15); illegalArgumentException
        Thread.currentThread().setPriority(7);
        System.out.println(Thread.currentThread().getPriority());
    }
}
