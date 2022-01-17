package com.yonyou.day2;

import java.util.Scanner;

public class WhileTest2 {
    public static void main(String[] args) {
        int i=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的名字");
        String name = scanner.next();
        boolean tire =true;
        while(tire){
            System.out.println(name+"跑了"+(++i)+"圈了");
            System.out.println("你累不累，累了说y，不累说n");
            char c = scanner.next().charAt(0);
            if (c=='y'){
                System.out.println(name+"累死了，吃席");
                break;
            }
        }
    }
}
