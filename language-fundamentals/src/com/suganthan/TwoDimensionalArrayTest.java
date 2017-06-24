package com.suganthan;

/**
 * Created by msuganthan on 23/6/17.
 */
public class TwoDimensionalArrayTest {
    public static void main(String[] args) {
        int[][] x;
        int [][]x1;
        int x2[][];
        int[] []x3;
        int[] x4[];
        int x6[][];

        //array of arrays
        x = new int[5][];
        x[0] = new int[1];
        x[1] = new int[2];
        x[2] = new int[3];
        x[3] = new int[4];
        x[4] = new int[5];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(" * ");
            }
            System.out.println("");

        }

        x = new int[][] {
            { 0,1,2 },
            { 3,4,5,6,7 }
        };

        /*int[][] x7;
        x7 = {{1, 2},{3, 4}};*/

        System.out.println(new int[]{1,2});

        int[][] y = x;

    }
}
