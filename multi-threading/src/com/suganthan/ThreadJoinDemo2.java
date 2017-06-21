package com.suganthan;

/**
 * Created by msuganthan on 17/6/17.
 */
public class ThreadJoinDemo2 {
    public static void main(String[] args) throws InterruptedException{
        Thread.currentThread().join();
        System.out.println("Main Thread");
    }
}
