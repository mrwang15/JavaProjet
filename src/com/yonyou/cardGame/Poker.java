package com.yonyou.cardGame;


import javax.smartcardio.Card;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

/**
 * @Author 王佳鹏
 * @Date 2022/1/6 10:58
 * @Description
 *  扑克类
 */
public class Poker {
    Car[] cars = new Car[52];

    Poker(){
            for(int i=0;i<cars.length;) {
                for (CardRank card1 : EnumSet.range(CardRank.A, CardRank.K)) {
                    for (CardColor card : EnumSet.range(CardColor.Heart, CardColor.Black)) {
                        cars[i]=new Car();
                        cars[i].setDecor(card.getColor());
                        cars[i].setNum(card1.getNum());
                        i++;
                    }
                }
        }
    }

    /**
     * 洗牌功能
     */
    public Object[] shuffle() {

        List list = Arrays.asList(cars);
        Collections.shuffle(list);
        Object[] strArray = list.toArray();
        return strArray;
    }

    /**
     * Get方法:获取这一副扑克牌
     * @return
     */
    public Car[] getCars() {
        return cars;
    }


}
