package com.yonyou.day5.Homeworkmorning;

import java.util.Scanner;

/**
 * 创建一个学生类，包含姓名、性别、年龄三个属性和一个自我介绍的方法。创建一个学生数组，数组当中的每个元素是一个学生类的对象。
 * 创建一个查找学生的数组，该数组接收一个姓名作为参数，在方法内遍历数组根据姓名字符串查找这学生的信息并且在控制台打印学生信息。
 */
public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的总数");
        int num = scanner.nextInt();
        Student[] students = new Student[num];
        String[] names = new String[num];
        for (int i=0;i<num;i++){

            System.out.println("请输入第"+(i+1)+"个学生的姓名");
            String name = scanner.next();
            System.out.println("请输入第"+(i+1)+"个学生的年龄");
            int age = scanner.nextInt();
            System.out.println("请输入第"+(i+1)+"个学生的性别");
            char sex = scanner.next().charAt(0);
            Student student = new Student(name,age,sex);
            students[i]=student;
            names[i]=name;
        }
        System.out.println("请输入想要查找的学生姓名");
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
        String introduce ="大家好，我是"+name+"，我的性别是"+sex+",我今年"+age+"岁了，";
        return introduce;
    }
}
