package com.suganthan;

/**
 * Created by msuganthan on 25/6/17.
 */
public class StringTest {
    public static void main(String[] args) {
        String s5 = "Suganthan";
        String s6 = "Suganthan";
        String s7 = new String("Suganthan");
        System.out.println(s5 == s6); //true
        System.out.println(s5 == s7); //false

        String s1 = "suganthan";
        String s2 = s1.toUpperCase();
        String s3 = s1.toLowerCase();
        System.out.println(s1 == s2); //false
        System.out.println(s1 == s3); //true

        String s4 = s2.toLowerCase();
        System.out.println(s1 == s4); //false
    }
}
