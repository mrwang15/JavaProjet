package com.yonyou.cardGame;

/**
 * @Author ������
 * @Date 2022/1/6 10:52
 * @Description
 *  ����ö����
 */
public enum CardRank {
    A("A"),Two("2"),Three("3"),Four("4"),Five("5"),Six("6"),
    Seven("7"),Eight("8"),Nine("9"),Ten("10"),J("J"),Q("Q"),K("K");


    private CardRank(String Num) {
        this.Num=Num;
    }

    private String Num;
    public String getNum(){
        return Num;
    }
    public void setNum(String Num) {
        this.Num=Num;
    }
}
