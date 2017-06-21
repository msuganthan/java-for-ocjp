package com.suganthan;

/**
 * Created by msuganthan on 18/6/17.
 */
public class SynchronizedBlockTest {

    public static void main(String[] args) {
        Display02 display01 = new Display02();
        Display02 display02 = new Display02();
        MyThread01 myThread01 = new MyThread01(display01, "Dhoni");
        //MyThread01 myThread02 = new MyThread01(display01, "Yuvraj");
        MyThread01 myThread02 = new MyThread01(display02, "Yuvraj"); //irregular output
        myThread01.start();
        myThread02.start();
    }
}

class Display02 {
    public void wish(String name) {
        synchronized (Display02.class) { //class level
        //synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.print("Good Morning :");
                try {
                    Thread.sleep(2000);
                }
                catch (InterruptedException e) {

                }
                System.out.println(name);
            }
        }

    }
}

class MyThread01 extends Thread {
    Display02 display;
    String name;
    MyThread01(Display02 display, String name) {
        this.display = display;
        this.name = name;
    }

    @Override
    public void run() {
        display.wish(name);
    }
}