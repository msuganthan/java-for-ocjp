package com.suganthan;

/**
 * Created by msuganthan on 24/6/17.
 */
public class CharLiteralTest {
    public static void main(String[] args) {
        char ch = 'a';
        char ch1 = 97;
        char ch2 = 0777;
        char ch3 = 0X99;
        char ch4 = 65535;
        /*char ch5 = 65536;*/
        char ch5 = '\u0006';
        char ch6 = '\n';
        System.out.println(ch+", "+ch1+", "+ch2+", "+ch3+", "+ch4+", "+ch5+", "+ch6);
    }
}
