package com.yonyou.cardGame;

/**
 * @Author ������
 * @Date 2022/1/6 10:54
 * @Description
 *  ��ɫö����
 */
public enum CardColor {

    Heart("����"),Diamond("����"),Club("÷��"),Black("����");
    private String Color;
    private CardColor(String Color) {
        this.Color=Color;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String Color) {
        this.Color=Color;
    }
}
