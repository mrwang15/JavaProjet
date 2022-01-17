package com.yonyou.day10.homework.homework1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.awt.windows.WPrinterJob;

/**
 * @Author 王佳鹏
 * @Date 2022/1/8 19:54
 * @Description
 *      1.	创建week枚举，包含MONDAY、TUESDAY、WEDNESDAY、THURSDAY、FRIDAY、SATURDAY、SUNDAY每个枚举项包含一个中文的名称。
 *      创建测试类，在测试类当中创建枚举项的对象，通过switch判断枚举项的值并做相应的输出，
 *      例如星期一就输出“今天吃白菜”。星期二就输出“今年吃菠菜”，
 *      星期三“今天吃萝卜”，星期四“今天吃豆腐”，
 *      星期五“今年吃土豆”，
 *      星期六“今天改善一下吃条鱼”
 *      星期日“今年下馆子”。
 */
public class Homework1 {
    public static void main(String[] args) {
        Week week=Week.MONDAY;
        System.out.println(week);
        switch ( week){
            case MONDAY:
                System.out.println();
                break;
        }

    }

}

enum Week{
    MONDAY("今天吃白菜"),TUESDAY("今天吃菠菜"),WEDNESDAY("今天吃萝卜") ,
    THURSDAY("今天吃豆腐"),FRIDAY("今年吃土豆"),
    SATURDAY("今天改善一下吃条鱼"),SUNDAY("今年下馆子");

    private String name;

    Week(String name) {
        this.name = name;
    }


}