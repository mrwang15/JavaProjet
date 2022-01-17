package com.yonyou.cardGame;

/**
 * @Author 王佳鹏
 * @Date 2022/1/6 10:45
 * @Description
 *      纸牌类
 */
public class Car {
    //纸牌的花色
    private String decor;
    //纸牌的点数
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
