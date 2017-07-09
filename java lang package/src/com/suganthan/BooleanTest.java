package com.suganthan;

/**
 * Created by msuganthan on 25/6/17.
 */
public class BooleanTest {
    public static void main(String[] args) {
        Boolean bool = new Boolean(true);
        Boolean bool1 = new Boolean(false);
        Boolean bool2 = new Boolean("true");
        Boolean bool3 = new Boolean("TRUE");
        Boolean bool4 = new Boolean("True");
        Boolean bool5 = new Boolean("suganthan");
        System.out.println(bool+", "+bool1+", "+bool2+", "+bool3+", "+bool4+", "+bool5);

    }
}
