package com.yonyou.day7.homework2;

/**
 * @Author ������
 * @Date 2022/1/4 18:50
 * @Description
 * 2.  ʹ�ýӿ���ɣ��������ʦ�Ȼ��д���룬Ҳ�ὲҵ��
 *    ��д����Ĺ���д��һ���ӿڡ���ҵ��д����һ���ӿ�
 */
public class homework2 {
    public static void main(String[] args) {
        IT pengge = new IT("pengge");
        pengge.speak();
        pengge.write();
    }
}

interface Write{
    void write();
}
interface  Speak{
    void speak();
}

class IT implements Write,Speak{
    private String name;

    public IT(String name) {
        this.name = name;
    }

    public IT() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void write() {
        System.out.println("�ܹ�ʦ"+name+"��д����");
    }

    @Override
    public void speak() {
        System.out.println("�ܹ�ʦ"+name+"�ὲ�߼�");
    }
}
