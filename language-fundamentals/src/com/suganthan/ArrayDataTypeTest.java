package com.suganthan;

/**
 * Created by msuganthan on 24/6/17.
 */
public class ArrayDataTypeTest {
    public static void main(String[] args) {
        byte b = 127;
        char c = 'a';
        short s = 100;
        int i = 100;
        int[] xByte = new int[b];
        int[] xChar = new int[c];
        int[] xShort = new int[s];
        int[] xInt = new int[i];
        System.out.println(xByte.length);
        System.out.println(xChar.length);
        System.out.println(xShort.length);
        System.out.println(xInt.length);

    }
}
