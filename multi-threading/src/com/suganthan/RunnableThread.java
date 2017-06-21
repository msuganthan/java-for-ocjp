package com.suganthan;

/**
 * Created by msuganthan on 14/6/17.
 */
public class RunnableThread {
    public static void main(String[] args) {
        MyThread11 myThread11 = new MyThread11();
        Thread thread1 = new Thread();
        Thread thread2 = new Thread("name");
        Thread thread3 = new Thread(myThread11);
        Thread thread4 = new Thread(myThread11, "name");
        Thread thread5 = new Thread(new ThreadGroup("A"), "name");
        Thread thread6 = new Thread(new ThreadGroup("A"), myThread11);
        Thread thread7 = new Thread(new ThreadGroup("A"), myThread11, "name");
        Thread thread8 = new Thread(new ThreadGroup("A"), myThread11, "name", 5);
        thread1.start(); //new thread will be created
        //myThread11.start(); is not allowed

    }
}

class MyThread11 implements Runnable {
    public void run() {

    }
}
