package com.yonyou.day5.Homeworkmorning;

import java.util.Scanner;

/**
 * ����һ��ѧ���࣬�����������Ա������������Ժ�һ�����ҽ��ܵķ���������һ��ѧ�����飬���鵱�е�ÿ��Ԫ����һ��ѧ����Ķ���
 * ����һ������ѧ�������飬���������һ��������Ϊ�������ڷ����ڱ���������������ַ���������ѧ������Ϣ�����ڿ���̨��ӡѧ����Ϣ��
 */
public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������ѧ��������");
        int num = scanner.nextInt();
        Student[] students = new Student[num];
        String[] names = new String[num];
        for (int i=0;i<num;i++){

            System.out.println("�������"+(i+1)+"��ѧ��������");
            String name = scanner.next();
            System.out.println("�������"+(i+1)+"��ѧ��������");
            int age = scanner.nextInt();
            System.out.println("�������"+(i+1)+"��ѧ�����Ա�");
            char sex = scanner.next().charAt(0);
            Student student = new Student(name,age,sex);
            students[i]=student;
            names[i]=name;
        }
        System.out.println("��������Ҫ���ҵ�ѧ������");
        String findName = scanner.next();
        for (int i=0;i<num;i++){
            if (findName.equals(students[i].getName())){
                String introduce = students[i].introduce();
                System.out.println(introduce);
                return;
            }
        }


    }
}
class Student{
    private String name;
    private int age;
    private char sex;

    public Student() {
    }

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String introduce(){
        String introduce ="��Һã�����"+name+"���ҵ��Ա���"+sex+",�ҽ���"+age+"���ˣ�";
        return introduce;
    }
}
