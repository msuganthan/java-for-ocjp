package com.suganthan;

/**
 * Created by msuganthan on 17/6/17.
 */
public class InterruptedExceptionTest {
    public static void main(String[] args) {
        MyThread17 myThread17 = new MyThread17();
        myThread17.start();
        myThread17.interrupt(); //Main thread interrupts child thread
        System.out.println("End of main");

    }
}

class MyThread17 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("I am lazy Thread");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(" I got interrupted");
        }
    }
}
