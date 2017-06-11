package com.suganthan;

public class Main {


    static {
        System.out.println("Static block 3");
    }
    {
        System.out.println("Instance block");
    }

    static {
        System.out.println("Static block");
    }
    static {
        System.out.println("Static block 1");
    }
    static {
        System.out.println("Static block 2");
    }
    public static void main(String[] args) {

    }
}
