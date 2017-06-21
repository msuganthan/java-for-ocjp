package com.suganthan;

/**
 * Created by msuganthan on 21/6/17.
 */
public class DaemonThreadTest {
    public static void main(String[] args) {
        MyThread20 myThread20 = new MyThread20();
        myThread20.setDaemon(true);
        myThread20.start();
        System.out.println("Main thread");
    }
}

class MyThread20 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}

        }
    }
}
