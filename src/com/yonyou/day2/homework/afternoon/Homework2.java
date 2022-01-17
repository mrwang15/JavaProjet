package com.yonyou.day2.homework.afternoon;

import java.util.Scanner;

/*
    2、使用循环实现登录的功能，要求输入正确的用户名和密码（用户名和密码均为
    admin）如果一次性登录成功就提示欢迎信息，否则就提示“用户名或者密码错误”并再次
    提示重新输入，用户三次输入均不正确则退出程序。
 */
public class Homework2 {
    public static void main(String[] args) {

       register();
        }
    public static void register(){
        Scanner scanner = new Scanner(System.in);
        int n=3;
        boolean register=false;
        int a =n;
        int i;
        for(i=0;i<3&&!register;i++) {
            System.out.print("请输入账号:");
            String account = scanner.next();
            System.out.println("请输入密码:");
            String password = scanner.next();
            n--;
            if ("admin".equals(account) && "admin".equals(password)) {
                System.out.println("登录成功");
                break;
            } else {
                if (n != 0) {
                    System.out.println("你还有" + n + "次机会，别说我没提醒你");
                } else {
                    System.out.println("输错次数达到" + a+ "次，你的卡没了");
                    break;
                }


            }
        }
    }
}
