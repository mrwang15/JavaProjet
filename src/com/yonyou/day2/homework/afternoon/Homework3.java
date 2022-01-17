package com.yonyou.day2.homework.afternoon;

import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {
        System.out.println("请输入一个数字");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Table(count);
    }
    public static void Table(int count){
        int count1=count;
        for (int i=0;i<=count;i++){
            System.out.println(i+"+"+count1+"="+(i+count1));
            count1--;
        }
    }
}
