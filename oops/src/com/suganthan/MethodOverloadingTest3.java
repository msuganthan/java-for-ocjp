package com.suganthan;

/**
 * Created by msuganthan on 11/6/17.
 */
public class MethodOverloadingTest3 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        MethodOverloadingTest3 methodOverloadingTest3 = new MethodOverloadingTest3();
        methodOverloadingTest3.m1(animal); //animal method will be called
        animal = new Lion();
        methodOverloadingTest3.m1(animal); //animal method will be called
        Lion lion = new Lion();
        methodOverloadingTest3.m1(lion); //lion method will be called
    }

    public void m1(Animal animal) {
        System.out.println("Animal method");
    }
    public void m1(Lion lion) {
        System.out.println("Lion method");
    }
}

class Animal {}
class Lion extends Animal {}
