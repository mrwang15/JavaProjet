package com.yonyou.cardGame;

/**
 * @Author ������
 * @Date 2022/1/6 10:45
 * @Description
 *      ֽ����
 */
public class Car {
    //ֽ�ƵĻ�ɫ
    private String decor;
    //ֽ�Ƶĵ���
    private String num;

    public Car(String decor, String num) {
        this.decor = decor;
        this.num = num;
    }

    public Car() {
    }

    public String getDecor() {
        return decor;
    }

    public void setDecor(String decor) {
        this.decor = decor;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return
                decor +  num  ;
    }
}
