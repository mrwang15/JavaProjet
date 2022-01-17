package com.yonyou.day3.homework.morning;

public class Homework1 {
    public static void main(String[] args) {
        prin(8);
    }
    public static void prin(int len){
        for (int i=1;i<=len;i++) {
            for (int j = len-i; j>0; j--) {
                System.out.print(" ");
            }
            for (int j=0;j<i*2-1;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
