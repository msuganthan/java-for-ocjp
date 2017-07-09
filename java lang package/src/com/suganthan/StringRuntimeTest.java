package com.suganthan;

/**
 * Created by msuganthan on 25/6/17.
 */
public class StringRuntimeTest {
    public static void main(String[] args) {
        String s1 = "suganthan";
        String s2 = "suganthan";
        String s3 = s1.toUpperCase();
        String s4 = s2.toUpperCase();
        String s5 = s3.toLowerCase();
        String s6 = s1.toLowerCase();
        String s7 = s2.toLowerCase();
        String s8 = s4.toLowerCase();
        System.out.print("s1 : "+s1+ " == s2 : "+s2+ " ==> ");
        System.out.println(s1 == s2); //true

        System.out.print("s1 : "+s1+ " == s5 : "+s5+ " ==> ");
        System.out.println(s1 == s5); //false

        System.out.print("s1 : "+s1+ " == s6 : "+s6+ " ==> ");
        System.out.println(s1 == s6); //true

        System.out.print("s2 : "+s2+ " == s7 : "+s7+ " ==> ");
        System.out.println(s2 == s7); //true

        System.out.print("s2 : "+s2+ " == s8 : "+s8+ " ==> ");
        System.out.println(s2 == s8); //false

        System.out.print("s1 : "+s1+ " == s8 : "+s8+ " ==> ");
        System.out.println(s1 == s8); //false
    }
}
