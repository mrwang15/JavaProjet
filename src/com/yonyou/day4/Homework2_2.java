package com.yonyou.day4;

import java.util.Objects;
import java.util.Scanner;

/**
 * 
 * 2、模拟实现用户密码管理：输入旧的用户名和密码，如果正确，方有权限更新；从键盘获取新的密码，进行更新
 */
public class Homework2_2 {
    public static void main(String[] args) {
        for (int i=1;i<=3;i++) {
            System.out.println("请输入你的姓名");
            Scanner scanner = new Scanner(System.in);
            String user = scanner.next();
            System.out.println("请输入你的密码");
            String password = scanner.next();
            User user1 = new User(user, password);
            User admin = new User("admin", "123456");
            if (admin.equals(user1)) {
                System.out.println("登录成功");
                System.out.println("请输入新的用户名");
                String newName = scanner.next();
                System.out.println("请输入新的密码");
                String newPasswoed = scanner.next();
                System.out.println("请再输入一遍新的密码");
                String newPasswoed2 = scanner.next();
                if (!newPasswoed.equals(newPasswoed2)) {
                    System.out.println("两次输入的密码不一致，操作终止");
                    return;
                }
                admin.setUser(newName);
                admin.setPassword(newPasswoed);
                System.out.println("修改成功，，，新的用户名为" + admin.getUser() + "新的密码为*******");
                return;
            } else {
                if(i<3){
                System.out.println("输入的用户名或密码有误，请重新输入:");
                }
            }
        }
        System.out.println("输入错误超过三次，账号被锁定");
    }
}

class User{
    private String user;
    private String password;

    public User() {
    }

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user1 = (User) o;
        return Objects.equals(user, user1.user) &&
                Objects.equals(password, user1.password);
    }
}
