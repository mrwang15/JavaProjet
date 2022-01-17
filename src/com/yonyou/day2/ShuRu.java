package com.yonyou.day2;


import java.util.Scanner;

public class ShuRu {
    public static void main(String[] args) {
        System.out.print("输入你的姓名");
        Scanner scanner= new Scanner(System.in);
        String name = scanner.next();
        System.out.println("你的姓名是"+name);
        System.out.print("输入你的年龄");
        int age = scanner.nextInt();
        System.out.println("你的年龄是"+age);
        System.out.print("输入一个字符");
        char c = scanner.next().charAt(0);
        System.out.println("你输入的字符是"+c);
    }
}
