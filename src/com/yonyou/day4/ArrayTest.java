package com.yonyou.day4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] ints = {23,25,14,3,4,9,455,85};
       Arrays.sort(ints);
        int i = Arrays.binarySearch(ints, 3);
        System.out.println(i);
        System.out.println(Arrays.toString(ints));
    }
}
