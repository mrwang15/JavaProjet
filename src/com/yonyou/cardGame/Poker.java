package com.yonyou.cardGame;


import javax.smartcardio.Card;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

/**
 * @Author ������
 * @Date 2022/1/6 10:58
 * @Description
 *  �˿���
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
     * ϴ�ƹ���
     */
    public Object[] shuffle() {

        List list = Arrays.asList(cars);
        Collections.shuffle(list);
        Object[] strArray = list.toArray();
        return strArray;
    }

    /**
     * Get����:��ȡ��һ���˿���
     * @return
     */
    public Car[] getCars() {
        return cars;
    }


}
