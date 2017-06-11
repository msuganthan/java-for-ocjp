package com.suganthan;

/**
 * Created by msuganthan on 11/6/17.
 */
public class MethodOverloadingTest2 {
    public static void main(String[] args) {
        //new MethodOverloadingTest2().m1(null); this is not allowd
        //new MethodOverloadingTest2().m1(10, 10); this will end in ambigious method call
        MethodOverloadingTest2 methodOverloadingTest2 = new MethodOverloadingTest2();
        methodOverloadingTest2.m2(); //varargs will be invoked
        methodOverloadingTest2.m2(10, 10); //varags will be invoked
        methodOverloadingTest2.m2(10); //corresponding method will be invoked
    }

    public void m1(String str) {}
    public void m1(StringBuffer stringBuffer) {}
    public void m1(float fl, int i1) {}
    public void m1(int i1, float f1) {}

    public void m2(int i1) {}
    public void m2(int... is) {}
}
