package com.yonyou.day2.homework.morning;

import java.util.Scanner;

/*
作业1：输入两个数字，再输入一个字符串表示运算符，根据输入的运算符进行对应的计算。最后输出计算
结果。
要求：写两个答案，分别使用if版本和switch版本。

*/
public class Homework1 {
    public static void main(String[] args) {
        Integer num=null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int one = scanner.nextInt();
        System.out.println("请输入第二个数字");
        int two = scanner.nextInt();
        System.out.println("请输入运算符");
        char count = scanner.next().charAt(0);
        switch(count){
            case '+' : num=one+two;
            break;
            case '-' : num=one-two;
            break;
            case '*' : num=one*two;
            break;
            case '/' :if(two==0){
                System.out.println("算式不正确");
            }else num=one/two;
            break;
            case '%':num=one%two;
            break;
            default:
                System.out.println("我还没学习这个计算");
        }
        if (num != null) {
            System.out.println("结果是"+num);
        }

    }
}
