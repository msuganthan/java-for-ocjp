package com.suganthan;

/**
 * Created by msuganthan on 23/6/17.
 */
public class SingleDimensionalArrayTest {
    public static void main(String[] args) {
        int[] x;
        int []x1;
        int x2[];

        int[] a,b; //a & b are one dimension
        int[] a1[],b1; //a two dimension, b one dimension
        int[] a2[], b2[]; //a & b are two dimension
        int[] []a3, b3; //a & b are two dimension
        int[] []a4, b4[]; //a two dimension, b three dimension
        //int[] []a5,[]b5;

        x = new int[] {1, 2, 3};
        char[] chars = {'a','b','c'};
        int[] b5 = x;
        /*int[] b6 = chars;*/

        char c = 'a';
        int aa = c;

        System.out.println("b5 elements");
        for (int i = 0; i < b5.length; i++) {
            System.out.println(b5[i]);
        }
        int[] b6 = {4,5,6};
        x = b6;
        b6 = x;
        System.out.println("b6 elements **");
        for (int i = 0; i < b6.length; i++) {
            System.out.println(b6[i]);
        }

        System.out.println("x elements **");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

        /*int[][] b7 = new int[4][4];
        b7 = b6;*/
    }
}
