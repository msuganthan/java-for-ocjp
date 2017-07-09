package com.suganthan;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by msuganthan on 8/7/17.
 */
public class ArraysSearchDemoe {
    public static void main(String[] args) {
        int[] a = {10, 5, 20, 11, 6};
        Arrays.sort(a); //by natural sorting order
        System.out.println(Arrays.binarySearch(a, 6)); //1
        System.out.println(Arrays.binarySearch(a, 14));// -5??? //This is insertion point i.e 5, 6, 10, 11, 20 (-1, -2, -3, -4, -5, -6)

        String[] b = {"A", "Z", "B"};
        Arrays.sort(b);
        System.out.println(Arrays.binarySearch(b, "Z")); //2
        System.out.println(Arrays.binarySearch(b, "S")); //S will come after Z so the insertion point is -3

        String[] c = {"A", "Z", "B"};
        MyNewComparator1 comparator1 = new MyNewComparator1();
        Arrays.sort(c, comparator1); //Z, B, A
        System.out.println(Arrays.binarySearch(c, "Z", comparator1)); //0
        System.out.println(Arrays.binarySearch(c, "S", comparator1)); //-2 based on insertion point
        System.out.println(Arrays.binarySearch(c, "N", comparator1)); //Unpredicable result we can expect

    }
}
class MyNewComparator1 implements Comparator<String> {
    public int compare(String s1, String s2) {
        return s2.compareTo(s1);
    }
}