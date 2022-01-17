package com.yonyou.day11.homework.homework6;

import sun.dc.pr.PRError;

import java.io.Serializable;

/**
 * @Author 王佳鹏
 * @Date 2022/1/10 16:31
 * @Description
 *      6、	编写一个泛型接口，该接口输出特定类型的信息。
 *      编写班级类办公室类分别实现该接口。
 *      然后再编写Teacher类和Student类。
 *      班级类实现接口时的泛型为Student类型，
 *      而办公室类实现接口时的泛型为Teacher类型。
 *      显示老师的信息为“老师Xxx在备课”，显示学生信息时为“同学Xxx在学习”。
 */
public class Homework6 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("王");
        BanGongShi banGongShi = new BanGongShi();
        System.out.println(banGongShi.print(teacher));
        Student student = new Student("卤狗蛋");
        BanJi banJi = new BanJi();
        System.out.println( banJi.print(student));

    }
}

interface ClassS<T> {
    String print(T t);
}

class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class BanJi implements ClassS<Student>{

    @Override
    public String print(Student student) {
        return "学生"+student.getName()+"正在上课";
    }
}

class BanGongShi implements  ClassS<Teacher>{

    @Override
    public String print(Teacher teacher) {
       return "老师"+teacher.getName()+"正在上课";
    }
}