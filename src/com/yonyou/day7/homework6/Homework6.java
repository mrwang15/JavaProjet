package com.yonyou.day7.homework6;

/**
 * @Author 王佳鹏
 * @Date 2022/1/4 19:41
 * @Description
 * 6.  抽象类能否实现接口？抽象类能否继承非抽象类？请编码举例
 */
public class Homework6 {
}

interface JieKou{
    void writ();
}

abstract class Chou extends B implements JieKou{

}

class B{
    public void b(){
        System.out.println("卤狗蛋是个"+getClass().getName());
    }
}
