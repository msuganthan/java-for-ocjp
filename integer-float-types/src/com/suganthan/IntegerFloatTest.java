package com.suganthan;

public class IntegerFloatTest {

    public static void main(String[] args) {
	    byte b1 = (byte) 200L;
	    byte b2 = (byte) 200.8; //long can be case to byte, if it is over 127, it loses its most significant(leftmost) bits
	    int i1 = (int) 888.8; //double can cast to int, it just loses the digits after decimal
	    long l1 = (byte) 200; //cast is not necessary, because long can store a byte
        System.out.println("b1 : "+b1+" b2 : "+b2+" i1 : "+i1+" l1 : "+l1);

        System.out.println('a'+'b');
        System.out.println((char) ('a'+'b'));

        double r, pi, a;
        r = 9.8;
        pi = 3.14;
        a = pi * r * r;
        System.out.println("area "+ a);
    }
}
