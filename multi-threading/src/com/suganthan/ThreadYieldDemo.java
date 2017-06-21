package com.suganthan;

/**
 * Created by msuganthan on 17/6/17.
 */
public class ThreadYieldDemo {
    public static void main(String[] args) {
        Mythread14 mythread14 = new Mythread14();
        mythread14.start();
        for (int i = 0; i< 10; i++ ){
            System.out.println("Parent method"+ i);
            Thread.yield();
        }
    }
}

class Mythread14 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i< 10; i++ ){
            System.out.println("Child method"+ i);

        }
    }
}