package com.suganthan;

/**
 * Created by msuganthan on 24/6/17.
 */
public class LocalVariableTest {
    static int[] xArray;
    public static void main(String[] args) {
        int x;
        /*System.out.println(x);*/ //will create issue
        System.out.println("Hello World");
        /*private int x = 10;		//CE
        public int xx = 10;		//CE
        protected int xxx = 10;		//CE
        static int xxxx = 10;		//CE
        transient int xxxxx = 10;		//CE
        volatile int xxxxxx = 10;		//CE*/
        final int xxxxxxx = 10;		//valid
        LocalVariableTest test = new LocalVariableTest();
        System.out.println(test.xArray);
    }
}
