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
     * ������
     * @return ���
     */
    public double qk(double fine){
        double balance = user.getBalance();
        balance+=fine;
        user.setBalance(balance);
        return balance;
    }

    /**
     * ȡ�����
     * @param fine
     * @return
     */
    public double ck(double fine){
        double balance = user.getBalance();
        if (fine>balance){
            System.out.println("���㣡������");
            return balance;
        }else {
            balance-=fine;
            user.setBalance(balance);
            return balance;
        }
    }

    public void yanzhen(){
        for (int i=1;i<=3;i++) {
            System.out.println("�������������");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();
            System.out.println("�������������");
            String password = scanner.next();
             setUser(new User(name,password,5000));
            User admin = new User("admin", "123456");
            if (admin.equals(user)) {
                System.out.println("��¼�ɹ�");
                System.out.println("������������еĲ�����1��ʾȡ�2��ʾ���");
                while (true) {
                    int cz = scanner.nextInt();
                    if (cz == 1) {
                        System.out.println("���������ȡ����");
                        Double fine = scanner.nextDouble();
                        double ck = ck(fine);
                        System.out.println("�����˻����Ϊ" + ck);
                        return;
                    } else if (cz == 2) {
                        System.out.println("��������Ĵ����");
                        Double fine = scanner.nextDouble();
                        double qk = qk(fine);
                        System.out.println("�����˻����Ϊ" + qk);
                        return;
                    } else {
                        System.out.println("�����������������");
                    }
                }
            } else {
                if(i<3){
                    System.out.println("������û�����������������������:");
                }
            }
        }
        System.out.println("������󳬹����Σ��˺ű�����");
    }

}
