package com.suganthan;

/**
 * Created by msuganthan on 25/6/17.
 */
public class FinalTest {
    public static void main(String[] args) {
        final StringBuffer buffer = new StringBuffer("suganthan");
        buffer.append("engineer");
        System.out.println(buffer);

        String str = new String("Suganthan");
        str.concat("engineer");
        System.out.println(str);

    }
}