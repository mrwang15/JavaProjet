package com.yonyou.day10.homework;

/**
 * @Author ������
 * @Date 2022/1/8 16:42
 * @Description
 *
 *  L1������java����ʦ��L2���м�java����ʦ��L3���߼�java����ʦ
 */
public enum Stage {
    L1("����java����ʦ"),L2("����java����ʦ"),L3("�߼�java����ʦ");
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
