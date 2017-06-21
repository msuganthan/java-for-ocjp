package com.suganthan;

/**
 * Created by msuganthan on 21/6/17.
 */
public class DeadLockDemo extends Thread {
    A a = new A();
    B b = new B();
    public void execute() {
        a.m1(b);
    }

    @Override
    public void run() {
        b.m1(a);
    }

    public static void main(String[] args) {
        DeadLockDemo deadLockDemo = new DeadLockDemo();
        deadLockDemo.start();
        deadLockDemo.execute();
    }
}

class A {
    public synchronized void m1(B b) {
        System.out.println("Calling A's method m1 with B object");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {}
        b.m2();
    }
    public synchronized void m2() {
        System.out.println("Calling for A's m2 method");
    }
}
class B {
    public synchronized void m1(A a) {
        System.out.println("Calling B's method m1 with A object");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {}
        a.m2();
    }
    public synchronized void m2() {
        System.out.println("Calling for B's m2 method");
    }
}
