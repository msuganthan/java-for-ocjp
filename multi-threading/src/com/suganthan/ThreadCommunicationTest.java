package com.suganthan;

/**
 * Created by msuganthan on 18/6/17.
 */
public class ThreadCommunicationTest {

    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        threadA.start();
        //Sleep is not a good candidate here
        //join is also not recommended - it is okay for small problem and if you are waiting for
        //some updation
        System.out.println("Total"+threadA.total);
    }
}

class ThreadA extends Thread {
    int total = 0;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            total += i;
        }
    }
}
