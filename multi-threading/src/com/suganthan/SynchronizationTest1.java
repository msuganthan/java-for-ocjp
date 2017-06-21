package com.suganthan;

/**
 * Created by msuganthan on 18/6/17.
 */
public class SynchronizationTest1 {
    public static void main(String[] args) {
        Display01 display01 = new Display01();
        IntThread intThread = new IntThread(display01);
        CharThread charThread = new CharThread(display01);
        intThread.start();
        charThread.start();
    }
}

class IntThread extends Thread {
    Display01 display01;
    IntThread(Display01 display01) {
        this.display01 = display01;
    }
    @Override
    public void run() {
        display01.displayN();
    }
}

class CharThread extends Thread {
    Display01 display01;
    CharThread(Display01 display01) {
        this.display01 = display01;
    }
    @Override
    public void run() {
        display01.displayC();
    }
}

class Display01 {
    public synchronized void displayN() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
    public synchronized void displayC() {
        for (int i = 65; i < 75; i++) {
            System.out.println((char)i);
        }
    }

}