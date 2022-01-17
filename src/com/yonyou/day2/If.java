package com.yonyou.day2;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的姓名");
        String name = scanner.next();
        System.out.println("请输入你的分数");
        Double score = scanner.nextDouble();
        if (score>90){
            System.out.println("奖励给"+name+"一个苹果13");
        }else {
            System.out.println(name+"给老师买一个苹果13");
        }


    }
}
