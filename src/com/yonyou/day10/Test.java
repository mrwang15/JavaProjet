package com.yonyou.day10;

/**
 * @Author 王佳鹏
 * @Date 2022/1/8 10:26
 * @Description
 */
public enum Test {

    CHUN("春天"),XIA("夏天"),QIU("秋天"),DONG("冬天");
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
