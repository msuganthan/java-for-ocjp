package com.suganthan;

/**
 * Created by msuganthan on 24/6/17.
 */
public class StaticVariableTest {
    static int x = 100;
    int xx = 10;
    public static void main(String[] args) {
        StaticVariableTest test = new StaticVariableTest();
        test.x = 999;
        test.xx = 888;
        StaticVariableTest test1 = new StaticVariableTest();
        System.out.println(test1.x +" , "+test1.xx); //999 , 10
    }
}
        //Execution
        /*1. Start JVM
        2. Create and start main Thread
        3. Locate Test.class file
        4. Load Test.class		-> static variable creation
        5. Execute main() method
        6. Unload Test.class		-> static variable destruction
        7. Terminate main Thread
        8. Shutdown JVM*/