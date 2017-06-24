package com.suganthan;

/**
 * Created by msuganthan on 24/6/17.
 */
public class FloatingPointLiteralTest {
    public static void main(String[] args) {
        double d2 = 0123.456; //This is not octal, it is decimal(let me check why it is decimal)
        /*double d4 = 0X123.456;*/
        /*System.out.println(d2+" "+d4);*/
        double d3 = 0xFace; //this is hexa
        double d4 = 07123;//this is octal
        double d5 = 0789.0; //this is decimal
        System.out.println(d3+", "+d4+", "+d5);

        //exponential
        double d6 = 1.2e3;
        /*float f1 = 1.2e3;*/ //not possible
        float f1 = 1.2e3f;
        System.out.println(d6+", "+f1);

        /*int x = 10.0;*/
    }
}
