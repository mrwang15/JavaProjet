package com.yonyou.day7.homework4;

import java.util.Scanner;

/**
 * @Author 王佳鹏
 * @Date 2022/1/4 19:23
 * @Description
 *
 *  4.  某班级举办乐器(Instrument)大赛，学生可以选择不同的乐器进行演奏，使用多态模拟演奏过程。
 *   假如有钢琴(Piano)、小提琴(Violin)、萨克斯乐器(Sachs)
 *   用户在控制台输入一个数字，1表示钢琴、2表示小提琴、3表示萨克斯，获取相应的乐器之后进行演奏
 */
public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("请输入数字：，1表示钢琴、2表示小提琴、3表示萨克斯");
        int anInt = scanner.nextInt();
        Play play = new Play();
        play.play(anInt);
    }
}


class Piano extends Instrument{
    @Override
    public void play() {
        System.out.println("钢琴在演奏");
    }
}

class Violin extends Instrument{

    @Override
    public void play() {
        System.out.println("小提琴在演奏");
    }
}

class Sachs extends Instrument{


    @Override
    public void play() {
        System.out.println("萨克斯在演奏");
    }
}

class Instrument{
    public void play(){
        System.out.println("演奏");
    }
}

class Play{
    private  Instrument instrument;

    public Play(Instrument instrument) {
        this.instrument = instrument;
    }

    public Play() {
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void play(Integer integer){
        if (integer==1){
            instrument =new Piano();
        }else if (integer==2){
            instrument = new Violin();

        }else if (integer==3){
            instrument = new Sachs();
        }
        instrument.play();
    }
}