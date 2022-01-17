package com.yonyou.day3.homework.morning;


public class Homework3 {
    public static void main(String[] args) {
        int a =1; int b=1;
        for (int i=0;i<10;i++){
            System.out.print(a+"  "+b+"   ");
           a+=b;
           b+=a;
        }
    }
}
