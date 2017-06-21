package com.suganthan;

/**
 * Created by msuganthan on 17/6/17.
 */
public class SynchronizationTest {
    public static void main(String[] args) {
        /*Display display = new Display();
        String name = "Dhoni";
        MyThread18 myThread18 = new MyThread18(display, name);
        MyThread18 myThread118 = new MyThread18(display, "Yuvraj");
        MyThread18 myThread128 = new MyThread18(display, "Kohli");
        MyThread18 myThread138 = new MyThread18(display, "Raina");
        myThread18.start();
        myThread118.start();
        myThread128.start();
        myThread138.start();*/

        //This will also lead to unexpected result
        Display display = new Display();
        Display display1 = new Display();
        MyThread18 myThread18 = new MyThread18(display, "Dhoni");
        MyThread18 myThread118 = new MyThread18(display1, "Yuvraj");
        myThread18.start();
        myThread118.start();
        //Because thread are operating on different java objects.
        //If multiple threads are operating on same java object, then synchronization is required
        //If multiple threads are operating on multiple java object, then synchronization is not
        //required

        //If we convert synchronized method as static synchronized method then it will again
        //works normally, because it is class level lock
    }
}

class MyThread18 extends Thread {

    Display display;
    String name;

    MyThread18(Display display, String name) {
        this.display = display;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            display.wish(name);
        } catch (InterruptedException e) {
            System.out.println(e.getCause());
        }
    }
}

class Display {
    //public void wish(String name) throws InterruptedException {
    //public synchronized void wish(String name) throws InterruptedException {
    public static synchronized void wish(String name) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.print("Good Morning: ");
            Thread.sleep(2000);
            System.out.println(name);
        }
    }
}
