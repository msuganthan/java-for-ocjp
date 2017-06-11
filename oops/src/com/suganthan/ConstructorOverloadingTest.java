package com.suganthan;

import java.io.IOException;

/**
 * Created by msuganthan on 11/6/17.
 */
public class ConstructorOverloadingTest {
    public static void main(String[] args) {
        new Base();
        new Base(10);
        new Base(10l);//auto-promotion during overloading
        new Base(10.5f);//auto-promotion during overloading
        new Base(10.0d);
    }
}

abstract class abstractBase {
    abstractBase(){}
}
class Base {
    Base() {
        //this(10); compiler would not allow recursive construtor invocation
    }
    Base(int i) {
        this();
    }
    Base(double d) {}
}

class Base1 {
    /*Base1() throws IOException{}*/
}
class Child1 extends Base1 {
    //Child1() {super();} not allowed
}