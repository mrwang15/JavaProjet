package com.yonyou.day2.homework.morning;

import java.util.Scanner;

/*
    作业3：输入一个年龄，根据不同的年龄段可以做不同的事，做出对应的输出
    0~2岁，还离不开妈妈呢
    3~6岁，幼稚园阶段
    7~12岁，小学阶段
    13~18岁，中学生
    19~22岁，大学阶段
    23~25岁，再多一个选择（考研？工作？谈恋爱？)
*/
public class Homework3 {
    public static void main(String[] args) {
        System.out.println("请输入你的年龄");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age<=0){
            System.out.println("乖乖在肚子里呆着");
        }else if(age<=2){
            System.out.println("好好跟着你妈，别乱跑");
        }else if(age<=6){
            System.out.println("听说你是幼儿园扛把子？？");
        }else if(age<=12){
            System.out.println("好好上小学");
        }else if(age<=18){
            System.out.println("好好上中学");
        }else if(age<=22){
            System.out.println("美好的大学生活开始了");
        }else if(age<=25){
            System.out.println("你想考研？工作？谈恋爱？请输入你的选择：");
            String XuanZe = scanner.next();
            switch (XuanZe){
                case "考研":
                    System.out.println("加油，好好学习");
                    break;
                case"工作":
                    System.out.println("好好干活，早日收购公司");
                    break;
                case"谈恋爱":
                    System.out.println("早生贵子");
                    break;
                default:
                    System.out.println("你想啃老？？？？？");
            }

        }else {
            System.out.println("该入土了");
        }
    }
}
