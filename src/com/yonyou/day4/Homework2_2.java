package com.yonyou.day4;

import java.util.Objects;
import java.util.Scanner;

/**
 * 
 * 2��ģ��ʵ���û������������ɵ��û��������룬�����ȷ������Ȩ�޸��£��Ӽ��̻�ȡ�µ����룬���и���
 */
public class Homework2_2 {
    public static void main(String[] args) {
        for (int i=1;i<=3;i++) {
            System.out.println("�������������");
            Scanner scanner = new Scanner(System.in);
            String user = scanner.next();
            System.out.println("�������������");
            String password = scanner.next();
            User user1 = new User(user, password);
            User admin = new User("admin", "123456");
            if (admin.equals(user1)) {
                System.out.println("��¼�ɹ�");
                System.out.println("�������µ��û���");
                String newName = scanner.next();
                System.out.println("�������µ�����");
                String newPasswoed = scanner.next();
                System.out.println("��������һ���µ�����");
                String newPasswoed2 = scanner.next();
                if (!newPasswoed.equals(newPasswoed2)) {
                    System.out.println("������������벻һ�£�������ֹ");
                    return;
                }
                admin.setUser(newName);
                admin.setPassword(newPasswoed);
                System.out.println("�޸ĳɹ��������µ��û���Ϊ" + admin.getUser() + "�µ�����Ϊ*******");
                return;
            } else {
                if(i<3){
                System.out.println("������û�����������������������:");
                }
            }
        }
        System.out.println("������󳬹����Σ��˺ű�����");
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
