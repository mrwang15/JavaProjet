package com.yonyou.day2.homework.afternoon;

/*
1、使用for循环打印1到100之间的数字之和
 */
public class Homework1 {
    public static void main(String[] args) {
        int sum=0 ;
        for(int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println("1到100之和为"+sum);
    }
}
