package com.yonyou.day11.homework.homework6;

import sun.dc.pr.PRError;

import java.io.Serializable;

/**
 * @Author ������
 * @Date 2022/1/10 16:31
 * @Description
 *      6��	��дһ�����ͽӿڣ��ýӿ�����ض����͵���Ϣ��
 *      ��д�༶��칫����ֱ�ʵ�ָýӿڡ�
 *      Ȼ���ٱ�дTeacher���Student�ࡣ
 *      �༶��ʵ�ֽӿ�ʱ�ķ���ΪStudent���ͣ�
 *      ���칫����ʵ�ֽӿ�ʱ�ķ���ΪTeacher���͡�
 *      ��ʾ��ʦ����ϢΪ����ʦXxx�ڱ��Ρ�����ʾѧ����ϢʱΪ��ͬѧXxx��ѧϰ����
 */
public class Homework6 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("��");
        BanGongShi banGongShi = new BanGongShi();
        System.out.println(banGongShi.print(teacher));
        Student student = new Student("±����");
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
        return "ѧ��"+student.getName()+"�����Ͽ�";
    }
}

class BanGongShi implements  ClassS<Teacher>{

    @Override
    public String print(Teacher teacher) {
       return "��ʦ"+teacher.getName()+"�����Ͽ�";
    }
}