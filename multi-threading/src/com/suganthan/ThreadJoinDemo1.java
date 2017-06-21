package com.suganthan;

/**
 * Created by msuganthan on 17/6/17.
 */
public class ThreadJoinDemo1 {
    public static void main(String[] args) {
        MyThread16.thread = Thread.currentThread();
        MyThread16 myThread16 = new MyThread16();
        myThread16.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        }
    }
}

class MyThread16 extends Thread {
    static Thread thread;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Sita Thread");
            try {
                thread.join();
            } catch (InterruptedException e) {}
        }
    }
}

//If main method calls joins method on child and child thread call join on main thread, then it is
//a deadlock sitution
