package com.suganthan;

/**
 * Created by msuganthan on 5/6/17.
 */
public class TypeCastingTest {
    public static void main(String[] args) {
        int a = 'a';
        double d = 10;
        System.out.println(a);
        System.out.println(d);

        int x = 130;
        byte b = (byte)x;

        x = (int)d;
        System.out.println(x);
    }
}
