package com.suganthan;

public class ArithmeticOperatorTest {

    //Keep this chain BSILFD
    //(C)
    public static void main(String[] args) {
        byte a = -127;
        short b = 1127;
        System.out.println(a + b);//1000

        char c = 'a';
        char c1 = 'b';
        System.out.println(c+c1); //195 max(int, type of a, type of b)

        long l = 12L;
        double d = 10.0;
        System.out.println(l+d); //22.0 max(int, type of a, type of b)

        float f = 10.0f;
        System.out.println(f+l); //22.0 max(int, type of a, type of b)

        System.out.println(c + d); //107.0 max(int, type of a, type of b)

        //System.out.println(10/0); //will cause arithmetic exception
        //System.out.println(0/0); //will cause arithmetic exception
        System.out.println(10/0.0); //will return Infinity
        System.out.println(10.0/0); //will return Infinity
        System.out.println(-10.0/0); //will return negative Infinity
        System.out.println(0.0/0); //will return NaN
        System.out.println(-0.0/0); //will return NaN

        System.out.println(10 < Float.NaN); //false
        System.out.println(10 <= Float.NaN); //false
        System.out.println(10 > Float.NaN); //false
        System.out.println(10 >= Float.NaN); //false
        System.out.println(10 == Float.NaN); //false
        System.out.println(Float.NaN == Float.NaN); //false

        System.out.println(10 != Float.NaN); //true
        System.out.println(Float.NaN != Float.NaN); //true

        //Java implements the IEEE-754 floating point standard which guarantees that any comparison
        // against NaN will return false (except != which returns true)
    }
}
