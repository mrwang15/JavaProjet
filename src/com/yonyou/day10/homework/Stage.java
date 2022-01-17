package com.yonyou.day10.homework;

/**
 * @Author 王佳鹏
 * @Date 2022/1/8 16:42
 * @Description
 *
 *  L1：初级java工程师、L2：中级java工程师、L3：高级java工程师
 */
public enum Stage {
    L1("初级java工程师"),L2("初级java工程师"),L3("高级java工程师");
    private String stage;

    Stage(String stage) {
        this.stage = stage;
    }

    public String getStage() {
        return stage;
    }

    @Override
    public String toString() {
        return  stage ;
    }
}
