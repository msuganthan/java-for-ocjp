package com.suganthan;

/**
 * Created by msuganthan on 5/6/17.
 */
public class IncreDecreOperatorTest {
    public static void main(String[] args) {
        char a = 'a';
        System.out.println("char : "+ ++a); //b

        double d = 10.5;
        System.out.println("double : "+ ++d); //11.5

        boolean b = true;
        //System.out.println(++b); Compile time error
    }
}
