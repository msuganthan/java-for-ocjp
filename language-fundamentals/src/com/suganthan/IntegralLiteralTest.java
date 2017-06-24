package com.suganthan;

/**
 * Created by msuganthan on 24/6/17.
 */
public class IntegralLiteralTest {
    public static void main(String[] args) {
        /*Decimal Literals(0-9)
        Octal Literals(0-7)
        Hexa Literals(0-9, A-F, a-f)*/
        int x = 10;
        int x1 = 0777;
        /*int x2 = 0789; octal invalid*/
        int x3 = 0Xface;
        int x4 = 0xFACE;
        int x5 = 0xBEEF;
        /*int x6 = 0xBEER; hexa invalid*/
        System.out.println(x +", "+x1+", "+x3+", "+x4+", "+x5);
        /*
         * Programmers having the choice of specify the number in decimal, hexa or in octal
         * but JVM print that in decimal
         */
        /*byte b = (byte)130;
        System.out.println(b);*/

        /*int i = 10l; not possible*/
    }
}
