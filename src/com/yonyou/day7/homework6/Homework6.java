package com.yonyou.day7.homework6;

/**
 * @Author ������
 * @Date 2022/1/4 19:41
 * @Description
 * 6.  �������ܷ�ʵ�ֽӿڣ��������ܷ�̳зǳ����ࣿ��������
 */
public class Homework6 {
}

interface JieKou{
    void writ();
}

abstract class Chou extends B implements JieKou{

}

class B{
    public void b(){
        System.out.println("±�����Ǹ�"+getClass().getName());
    }
}
