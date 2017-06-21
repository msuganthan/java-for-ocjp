package com.suganthan;

public class Main {

    public static void main(String[] args) {
	    Thread thread1 = new MyThread();
	    Thread thread2 = new MyThread();
	    thread1.start();
	    thread2.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for(int i = 0; i< 10; i++) {
            try {
                System.out.println("Interation "+i);
                synchronized (this) {
                    this.wait();
                    this.notify();
                }

            } catch (InterruptedException e) {
                System.out.println(e.getCause());
            }

        }
    }
}
