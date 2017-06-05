package com.suganthan;

/**
 * Created by msuganthan on 4/6/17.
 */
public class AssignmentOperatorTest1 {
    public static void main(String[] args) {
        int a, b, c, d;
        a = b = c = d = 20;

        a += b -= c *= d /= 2;

        //d = 20 / 2 = 10
        //c = 20 * 10 = 200
        //b = 20 - 200 = -180
        //a = 20 + (-180) = -160
        System.out.println("a=: "+a+ ", b=: "+b+", c=: "+c+", d=: "+d);
    }
}
