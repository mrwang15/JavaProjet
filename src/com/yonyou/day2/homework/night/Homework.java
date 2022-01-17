package com.yonyou.day2.homework.night;

import java.math.BigDecimal;

/*本金10000元存入银行，年利率是千分之三，
    每过1年，将本金和利息相加作为新的本金。
    计算5年后，获得的本金是多少？*/
public class Homework {
    static String name;
    String anme;
    public static void main(String[] args) {
        BigDecimal benJing = new BigDecimal(10000);
        BigDecimal liLv = new BigDecimal(0.003);
        Homework homework = new Homework();
        for (int i=0;i<5;i++){
            benJing = homework.price(benJing,liLv);
        }
        System.out.println(benJing);
    }
    public   BigDecimal price(BigDecimal benJin,BigDecimal liLv){
        BigDecimal newBeiJin=benJin.multiply(liLv.add(BigDecimal.valueOf(1)));
        return newBeiJin;
    }
}
