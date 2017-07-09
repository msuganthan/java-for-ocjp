package com.suganthan;

/**
 * Created by msuganthan on 25/6/17.
 */
public class WrapperClassTest {
    public static void main(String[] args) {
        Integer integer = Integer.valueOf(10);
        Integer integer1 = Integer.valueOf("10");
        Integer integer2 = Integer.valueOf("10", 2);

        Float flt = Float.valueOf(10.5f);
        Float flt1 = Float.valueOf("10.5f");

        System.out.println(flt+", "+flt1);

        int int1 = integer1;
        float f1 = flt;
    }
}
