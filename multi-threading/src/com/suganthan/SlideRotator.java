package com.suganthan;

/**
 * Created by msuganthan on 17/6/17.
 */
public class SlideRotator {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i < 5; i++) {
            System.out.println("Slide "+i);
            Thread.sleep(2000);
        }
    }
}
