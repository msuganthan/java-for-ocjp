package com.suganthan;

/**
 * Created by msuganthan on 18/6/17.
 */
public class ThreadCommunicationReWrittenTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadB threadB = new ThreadB();
        threadB.start();
        //Thread.sleep(1000) -- this will spoil the whole thing
        synchronized (threadB) { //or I can't call wait
            System.out.println("Main thread trying to call wait method");
            threadB.wait(); //threadB.wait(10000);
        }
        System.out.println("Main thread got notification");
        System.out.println("total ==> "+threadB.total);
    }
}

class ThreadB extends Thread {
    int total = 0;
    @Override
    public void run() {
        synchronized (this) { //or i can't call notify
            System.out.println("Child thread starts notification");
            for (int i = 0; i < 100; i++) {
                total += i;
            }
            System.out.println("Child thread trying to give notification");
            this.notify();
        }

    }
}