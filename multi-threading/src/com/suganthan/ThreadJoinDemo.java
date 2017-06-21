package com.suganthan;

/**
 * Created by msuganthan on 17/6/17.
 */
public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread15 mythread15 = new MyThread15();
        mythread15.start();
        //mythread15.join();
        mythread15.join(10000);
        for (int i = 0; i < 10; i++) {
            System.out.println("Rama Thread");
        }
    }
}

class MyThread15 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Sita Thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        }
    }
}