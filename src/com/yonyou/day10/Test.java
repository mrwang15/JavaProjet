package com.yonyou.day10;

/**
 * @Author ������
 * @Date 2022/1/8 10:26
 * @Description
 */
public enum Test {

    CHUN("����"),XIA("����"),QIU("����"),DONG("����");
    private  String name;

    Test(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  name ;
    }
}
