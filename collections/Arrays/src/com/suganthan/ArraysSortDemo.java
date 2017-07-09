package com.suganthan;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by msuganthan on 8/7/17.
 */
public class ArraysSortDemo {
    public static void main(String[] args) {
        int[] a = {10, 5, 20, 11, 6};
        System.out.println("Primitive Array before sorting");
        for (int a1: a) {
            System.out.println(a1);
        }
        System.out.println("Primitive Array after sorting");
        Arrays.sort(a);
        for (int a1:a) {
            System.out.println(a1);
        }
        String[] b = {"A", "Z", "B"};
        System.out.println("Object Array before sorting");
        for (String b1: b) {
            System.out.println(b1);
        }
        System.out.println("Object Array after sorting");
        Arrays.sort(b);
        for (String b1:b) {
            System.out.println(b1);
        }
        System.out.println("Object Array after sorting with my comparator");
        Arrays.sort(b, new MyNewComparator());
        for (String b1:b) {
            System.out.println(b1);
        }
    }
}

class MyNewComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        return s2.compareTo(s1);
    }
}
