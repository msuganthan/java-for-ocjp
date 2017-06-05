package com.suganthan;

/**
 * Created by msuganthan on 4/6/17.
 */
public class BitwiseOperatorTest {

    public static void main(String[] args) {
        System.out.println(~4);
        //0 0000...00100
        //1 1111...11011
        //the last bit is signed and it is negative number so we need to find the 2's complement
        //which is
        //1 0000...00100
        //             1
        //==============
        //1 0000...00101
        //-5
        System.out.println("Bitwise complement of -4=:"+~-4);
        //1 0000...00100 four
        //1 1111...11011 2's complement
        //             1 + 1
        //1 1111...11100
        //0 0000...00011 //negate
        System.out.println("Bitwise complement of -5=:"+~-5);
        //1 00000...00101
        //1 11111...11010 //2's complement
        //              1
        //================
        //1 11111...11011
        //0 00000...00100
        //4
    }
}
