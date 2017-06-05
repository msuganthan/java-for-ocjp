package com.suganthan;

/**
 * Created by msuganthan on 4/6/17.
 */
public class AssignmentOperatorTest {
    public static void main(String[] args) {
        int a = 10; //simple assignment
        int b , c, d = 20; //will initialize only d, int b = c = d = 10; is not allowed
        b = c = d= 30; //Chained assignment
        System.out.println("a=: "+a+ ", b=: "+b+", c=: "+c+", d=: "+d);

        b += 10; //compound assignment
        System.out.println("b=: "+b);

        //Possible compound operator
        b = 4;
        b &= 5; //is equivalent to a &= b; is equivalent to a = a & b i.e. b = b & 10
        // 00000000 00000000 00000000 00000100
        // 00000000 00000000 00000000 00000101
        // ===================================
        // 00000000 00000000 00000000 00000100
        //because
        //0 & 0 = 0
        //0 & 1 = 0
        //1 & 0 = 0
        //1 & 1 = 1
        System.out.println("b after &=: "+b); // this will be four

        b = 5;
        b |= 5;
        // 00000000 00000000 00000000 00000101
        // 00000000 00000000 00000000 00000101
        // ===================================
        // 00000000 00000000 00000000 00000101
        //0 & 0 = 0
        //0 & 1 = 1
        //1 & 0 = 1
        //1 & 1 = 1
        System.out.println("b after |=: "+b); //this will be five

        b = 4;
        b ^= 5;
        //0 & 0 = 0
        //0 & 1 = 1
        //1 & 0 = 1
        //1 & 1 = 0
        // 00000000 00000000 00000000 00000100
        // 00000000 00000000 00000000 00000101
        // ===================================
        // 00000000 00000000 00000000 00000001
        System.out.println("b after ^=: "+b); //this will be one

        //signed left shift
        b = 12;
        System.out.println("Integer value of b before =:"+b);
        System.out.println("Integer.toBinaryString(11):= "+Integer.toBinaryString(b));
        System.out.println("Signed right shift of Integer.toBinaryString(12):= "+Integer.toBinaryString(b >>= 2));
        System.out.println("Integer value of b after =:"+b);

        b = 12;
        System.out.println("Integer value of b before =:"+b);
        System.out.println("Integer.toBinaryString(11):= "+Integer.toBinaryString(b));
        System.out.println("Signed left shift of Integer.toBinaryString(12):= "+Integer.toBinaryString(b <<= 2));
        System.out.println("Integer value of b after =:"+b);

        b = 12;
        System.out.println("Integer value of b before =:"+b);
        System.out.println("Integer.toBinaryString(11):= "+Integer.toBinaryString(b));
        System.out.println("Signed signed right shift of Integer.toBinaryString(12):= "+Integer.toBinaryString(b >>>= 2));
        System.out.println("Integer value of b after =:"+b);

        //you will possibly lose some value
        int i = 1;
        i += 1.5;
        System.out.println("i=: "+i);
    }
}
