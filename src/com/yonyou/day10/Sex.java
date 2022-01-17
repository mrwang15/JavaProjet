package com.yonyou.day10;

/**
 * @Author Íõ¼ÑÅô
 * @Date 2022/1/8 10:35
 * @Description
 */
public enum  Sex {
    NAN("ÄÐ"),NV("Å®");
    private String sex;

    Sex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return sex;
    }
}
