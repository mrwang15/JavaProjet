package com.yonyou.cardGame;

/**
 * @Author 王佳鹏
 * @Date 2022/1/6 10:54
 * @Description
 *  花色枚举类
 */
public enum CardColor {

    Heart("黑桃"),Diamond("红桃"),Club("梅花"),Black("方块");
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
