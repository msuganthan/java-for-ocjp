package com.suganthan;

public class StringStringBufferTest {

    public static void main(String[] args) {
	// write your code here
        String s = new String("Suganthan");
        s.concat("Madhavan");
        System.out.println(s); //Suganthan

        StringBuffer sb = new StringBuffer("Suganthan");
        sb.append("Madhavan");
        System.out.println(sb); //Suganthan Madhavan




    }
}
