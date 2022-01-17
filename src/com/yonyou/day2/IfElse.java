package com.yonyou.day2;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("你的名字是:");
        String name = scanner.next();
        System.out.println("你的分数是:");
        double grade = scanner.nextDouble();
        if (grade>=90){
            System.out.println(name+"很优秀啊");
        }else if (grade>=75){
            System.out.println(name+"是良好的");
        }else if(grade>=60){
            System.out.println(name+"及格了");
        }else {
            System.out.println(name+"重修吧");
        }
    }
}
