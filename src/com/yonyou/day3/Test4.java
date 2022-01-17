package com.yonyou.day3;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String next = scanner.nextLine();
//        System.out.println(next);

        String a= "abc";
        String b= a+"b";        //b有几个对象？？？？b abcbb
        String c="abcb";
        StringBuffer stringBuffer= new StringBuffer("abc");

        System.out.println(b==c);
    }
}
