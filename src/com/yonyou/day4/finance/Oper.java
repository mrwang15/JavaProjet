package com.yonyou.day4.finance;

import java.util.Objects;
import java.util.Scanner;

public class Oper {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.yanzhen();
    }
}

class User{
    private String name;
    private String password;
    private double balance;

    public User() {
    }

    public User(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return  Objects.equals(name, user.name) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password, balance);
    }
}


class Bank{
    private User user;

    public Bank() {
    }

    public Bank(User user) {

        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    /**
     * 存款操作
     * @return 余额
     */
    public double qk(double fine){
        double balance = user.getBalance();
        balance+=fine;
        user.setBalance(balance);
        return balance;
    }

    /**
     * 取款操作
     * @param fine
     * @return
     */
    public double ck(double fine){
        double balance = user.getBalance();
        if (fine>balance){
            System.out.println("余额不足！！！！");
            return balance;
        }else {
            balance-=fine;
            user.setBalance(balance);
            return balance;
        }
    }

    public void yanzhen(){
        for (int i=1;i<=3;i++) {
            System.out.println("请输入你的姓名");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();
            System.out.println("请输入你的密码");
            String password = scanner.next();
             setUser(new User(name,password,5000));
            User admin = new User("admin", "123456");
            if (admin.equals(user)) {
                System.out.println("登录成功");
                System.out.println("请输入你想进行的操作，1表示取款，2表示存款");
                while (true) {
                    int cz = scanner.nextInt();
                    if (cz == 1) {
                        System.out.println("请输入你的取款金额");
                        Double fine = scanner.nextDouble();
                        double ck = ck(fine);
                        System.out.println("您的账户余额为" + ck);
                        return;
                    } else if (cz == 2) {
                        System.out.println("请输入你的存款金额");
                        Double fine = scanner.nextDouble();
                        double qk = qk(fine);
                        System.out.println("您的账户余额为" + qk);
                        return;
                    } else {
                        System.out.println("输入错误，请重新输入");
                    }
                }
            } else {
                if(i<3){
                    System.out.println("输入的用户名或密码有误，请重新输入:");
                }
            }
        }
        System.out.println("输入错误超过三次，账号被锁定");
    }

}
