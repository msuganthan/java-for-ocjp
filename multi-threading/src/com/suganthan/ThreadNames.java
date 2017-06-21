package com.suganthan;

/**
 * Created by msuganthan on 15/6/17.
 */
public class ThreadNames {

    public static void main(String[] args) {
        MyThread12 myThread12 = new MyThread12();
        myThread12.start();
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        thread.setName("Suganthan's thread");
        System.out.println(thread.getName());
    }
}

class MyThread12 extends Thread {
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        thread.setName("Suganthan's thread magic");
        System.out.println(thread.getName());
    }
}
