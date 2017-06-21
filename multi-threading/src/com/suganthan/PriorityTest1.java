package com.suganthan;

/**
 * Created by msuganthan on 17/6/17.
 */
public class PriorityTest1 {
    public static void main(String[] args) {
        System.out.println("Parent priority"+Thread.currentThread().getPriority());
        MyThread13 myThread13 = new MyThread13();
        myThread13.setPriority(10);
        myThread13.start();
        for(int i=0; i< 10; i++) {
            System.out.println("Parent "+i);
        }
    }
}

class MyThread13 extends Thread {
    @Override
    public void run() {
        System.out.println("child priority"+Thread.currentThread().getPriority());
        for(int i=0; i< 10; i++) {
            System.out.println("Child "+i);
        }
    }
}