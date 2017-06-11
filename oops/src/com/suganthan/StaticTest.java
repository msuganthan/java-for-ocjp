package com.suganthan;

/**
 * Created by msuganthan on 10/6/17.
 */
public class StaticTest {

        /*1*/static int i = 10;/*7*/
    /*2*/static {
            m1();/*8*/
            System.out.println("First static block");/*10*/
        }
    /*3*/public static void main(String[] args) {
            m1();/*13*/
            System.out.println("Main method");/*15*/
        }
    /*4*/public static void m1() {
            System.out.println("Method m1: "+j);/*9, *//*14*/ //Read indirect
        }
    /*5*/static {
            System.out.println("Second static method");/*11*/
        }
    /*6*/static int j = 20;/*12*/

}
