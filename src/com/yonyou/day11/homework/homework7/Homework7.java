package com.yonyou.day11.homework.homework7;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ������
 * @Date 2022/1/10 17:20
 * @Description
 *      ͨ���
 */
public class Homework7 {
    public static void main(String[] args) {
        List<? extends Person> list1 = new ArrayList<>();   //ָ���Ͻ�
        List<? super Person> list2 = new ArrayList<>();     //ָ���½�
        List< Person> list3 = new ArrayList<>();
        List< Animal> list4 = new ArrayList<>();
        List< Student> list5 = new ArrayList<>();

        list1=list3;
        list1=list5;
       // list1=list4;        //���뱨��

        list2=list3;
        list2= list4;
      //  list2=list5;        //���뱨��
    }
}
class Animal{

}
class  Person extends Animal{

}

class Student extends Person{

}
